/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.osp.bean.ProductsBean;
import com.osp.dao.ProductsDao;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author AR WorkStation
 */
@MultipartConfig
public class ProductUpdateController extends HttpServlet {

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
            out.println("<title>Servlet ProductUpdateController</title>");
            out.println("</head>");
            out.println("<body>");

          Part file = request.getPart("imgfile");
String imgfilename = file.getSubmittedFileName();
 
        // String upload = "C:/Users/AR WorkStation/Documents/NetBeansProjects/Onlineshopping/web/Images/" + imgfilename;
            String name = request.getParameter("pname");
//           
            
            int pid = Integer.parseInt(request.getParameter("pid"));
            int catid = Integer.parseInt(request.getParameter("cat"));
            int stock = Integer.parseInt(request.getParameter("stock"));
            double price = Double.parseDouble(request.getParameter("price"));
            String orgimg = request.getParameter("imgname");
           
            if((orgimg.equals(imgfilename))  ){
               
                ProductsBean pb = new ProductsBean();
            pb.setProductname(name);
            pb.setCategoryid(catid);
            pb.setProductprice(price);
            pb.setStockinhand(stock);
            pb.setImgname(orgimg);
            pb.setProductid(pid);
            ProductsDao pd = new ProductsDao();
            int x = pd.updateProducts(pb);
            String message = (x > 0) ? "Product Updated Successfully" : "Product update Failed";
            request.setAttribute("productmessage", message);
            RequestDispatcher rd = request.getRequestDispatcher("OsuProducttable.jsp");
            rd.forward(request, response);
            }
            
            
            else{
               
              String upload = "C:/Users/AR WorkStation/Documents/NetBeansProjects/Onlineshopping/web/Images/" + imgfilename;
              ProductsBean pb = new ProductsBean();
            pb.setProductname(name);
            pb.setCategoryid(catid);
            pb.setProductprice(price);
            pb.setStockinhand(stock);
            pb.setImgname(imgfilename);
            pb.setProductid(pid);
            ProductsDao pd = new ProductsDao();
            int x = pd.updateProducts(pb);
            String message = (x > 0) ? "Product Updated Successfully" : "Product update Failed";
            request.setAttribute("productmessage", message);
            RequestDispatcher rd = request.getRequestDispatcher("OsuProducttable.jsp");
            rd.forward(request, response);
           FileOutputStream fos = new FileOutputStream(upload);
            InputStream is = file.getInputStream();
            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
            fos.close();
            
            }
           
   
           


            out.println("<h1>Hello</h1>");
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
