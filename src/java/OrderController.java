/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.osp.bean.OrderDetailsBean;
import com.osp.bean.OrdersBean;
import com.osp.bean.ProductsBean;
import com.osp.dao.OrderDetailsDao;
import com.osp.dao.OrdersDao;
import com.osp.dao.ProductsDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AR WorkStation
 */
public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OrderController</title>");
            out.println("</head>");
            out.println("<body>");
            String dateform = request.getParameter("date");
            int customerid = Integer.parseInt(request.getParameter("customerid"));
//            out.println("<h1>Date : " + dateform + "</h1>");
//            out.println("<h1>Customer ID : " + customerid + "</h1>");
            HttpSession hs = request.getSession();

            Map<Integer, Integer> productQuantities = new HashMap<>();
            ArrayList<String> cartData = (ArrayList<String>) hs.getAttribute("CartData");
            if (cartData != null) {
                for (int i = 0; i < cartData.size(); i++) {
                    int productId = Integer.parseInt(cartData.get(i));
                    if (productQuantities.containsKey(productId)) {
                        // Increment the quantity if the product is already in the cart
                        productQuantities.put(productId, productQuantities.get(productId) + 1);
                    } else {
                        // Add the product to the cart with a quantity of 1
                        productQuantities.put(productId, 1);
                    }
                }
            }

            double subtotal = 0;
            int index = 0;
            int count = 1;
            ArrayList<Integer> ProductIdTemp = new ArrayList<Integer>();
            ArrayList<Integer> quantitytemp = new ArrayList<Integer>();
            OrdersDao od = new OrdersDao();
            for (Map.Entry<Integer, Integer> entry : productQuantities.entrySet()) {
                int productId = entry.getKey();
                int quantity = entry.getValue();
                ProductsDao pd = new ProductsDao();
                ProductsBean p = pd.findbyProductid(productId);
                // method to add the data in order table
                double price = quantity * p.getProductprice();
                OrdersBean ob = new OrdersBean();
                ob.setCustomerid(customerid);
                ob.setOrderdate(dateform);
                ob.setOrderamount(price);
                ob.setPaymentreceived("Yes");
                od.addOrders(ob);
                OrderDetailsDao k = new OrderDetailsDao();
                OrderDetailsBean s = new OrderDetailsBean();
                int ic = od.getLastOrderID();
                s.setOrderid(ic);
                s.setProductid(p.getProductid());
                s.setQuantity(quantity);
                k.addDetails(s);
                // methos to update the stock in the prdut table
                int currstock = p.getStockinhand();
                int updatestock = currstock - quantity;
                ProductsBean ps = new ProductsBean();
                ps.setStockinhand(updatestock);
                ps.setProductid(p.getProductid());
                ProductsDao pds = new ProductsDao();
                pds.updateProductStock(ps);
                ProductIdTemp.add(p.getProductid());
                quantitytemp.add(quantity);
            }

            // loop for the ordersdetails table 
//            ArrayList<OrdersBean> al = od.FindallOrders();
//           
//            for (OrdersBean o : al) {
//                OrderDetailsBean ob = new OrderDetailsBean();
//                ob.setOrderid(o.getOrderid());
//                int pid = ProductIdTemp.get(ic);
//                ob.setProductid(pid);
//                int qty = quantitytemp.get(ic);
//                ob.setQuantity(qty);
//
//                OrderDetailsDao ord = new OrderDetailsDao();
//                ord.addDetails(ob);
//                ic++;
//
//            }
//            ArrayList<OrdersBean> al = od.FindallOrders();
//            
//            for (int i = 0; i < ic; i++) {
//                OrdersBean o = al.get(i);
//                int x = k.getlastdid();
//                OrderDetailsBean z = k.findbyOrderid(i);
//                if (x < o.getOrderid()) {
//                                    continue;
//                }
//            }
            // method to delete the ordered items from the arrray 
            for (int j = 0; j < ProductIdTemp.size(); j++) {
                int pid = ProductIdTemp.get(j);
                String deleteIndex = String.valueOf(pid);
                if (deleteIndex != null) {
                    String valueToDelete = deleteIndex;
                    for (int i = cartData.size() - 1; i >= 0; i--) {
                        if (cartData.get(i).equals(valueToDelete)) {
                            cartData.remove(i);
                        }
                    }

                }
            }

            ProductIdTemp.removeAll(ProductIdTemp);
            quantitytemp.removeAll(quantitytemp);
            response.sendRedirect("CustomerOrders.jsp");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
