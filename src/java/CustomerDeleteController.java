/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.osp.bean.CustomersBean;
import com.osp.bean.OrderDetailsBean;
import com.osp.bean.OrdersBean;
import com.osp.dao.CustomersDao;
import com.osp.dao.OrderDetailsDao;
import com.osp.dao.OrdersDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AR WorkStation
 */
public class CustomerDeleteController extends HttpServlet {

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
            out.println("<title>Servlet CustomerDeleteController</title>");            
            out.println("</head>");
            out.println("<body>");
            int customerid=Integer.parseInt(request.getParameter("cid"));
             OrdersBean ob = new OrdersBean();
             OrdersDao od=new OrdersDao();
             
             CustomersDao cd=new CustomersDao();
             CustomersBean cb=new CustomersBean();
             
             OrderDetailsBean odb = new OrderDetailsBean();
        OrderDetailsDao odd = new OrderDetailsDao();
        ArrayList<OrdersBean> al=od.FindallOrdersBYCustomers(customerid);
        ArrayList <Integer> ax=new ArrayList<Integer>();
        for (OrdersBean o : al) {          
            ax.add(o.getOrderid());
        }
        
        
       
        for(int i=0;i<ax.size();i++){
            odd.deleteDetailsBYcid(ax.get(i));
       
        }
        
        od.deleteOrdersBYcid(customerid);
        ax.removeAll(ax);
        int x=cd.deleteCustomer(customerid);
        String message = (x > 0) ? "Customer Deleted Successfully" : "  Failed";
            request.setAttribute("customermessage", message);
            if (x > 0) {
             //   response.sendRedirect("OsuProducttable.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("OsuCustomersTable.jsp");
                rd.forward(request, response);
            }
            out.println("<h1> Customer id "+customerid+ "</h1>");
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
