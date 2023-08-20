/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.osp.bean.CustomersBean;
import com.osp.dao.CustomersDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AR WorkStation
 */
public class UserLoginController extends HttpServlet {

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
            out.println("<title>Servlet UserLoginController</title>");
            out.println("</head>");
            out.println("<body>");
              HttpSession hs = request.getSession();
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");

            CustomersDao cd = new CustomersDao();
          
           int x = cd.loginCustomer(uname, pass);
            int z = cd.loginUsers(uname, pass);
            if (x > 0 ) {
                CustomersBean a = cd.AuthenticateCustomer(uname, pass);
                int customerid = a.getCustomerid();
                hs.setAttribute("customerid", customerid);
                response.sendRedirect("Customerhome.jsp");
//        request.getRequestDispatcher("Customerhome.jsp").forward(request, response); 

            } else if ( z > 0) {

                CustomersBean a = cd.Authenticateusers(uname, pass);
                int useridlogin = a.getCustomerid();
                hs.setAttribute("useridlogin", useridlogin);
                response.sendRedirect("OsuProducttable.jsp");
            }
            out.println("<h1>Servlet UserLoginController at " + request.getContextPath() + "</h1>");
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
