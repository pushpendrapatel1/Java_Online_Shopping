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

/**
 *
 * @author AR WorkStation
 */
public class UserRegistrationController extends HttpServlet {

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
            out.println("<title>Servlet UserRegistrationController</title>");
            out.println("</head>");
            out.println("<body>");

            String name = request.getParameter("name");
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String add = request.getParameter("add");
            String phone = request.getParameter("phone");
            CustomersBean cb = new CustomersBean();
            cb.setCustomername(name);
            cb.setAddress(add);
            cb.setEmail(email);
            cb.setMobile(phone);
            cb.setType("User");
            cb.setPassword(pass);
            cb.setUsername(uname);
            CustomersDao cd = new CustomersDao();
            int x = cd.addCustomer(cb);

            if (x > 0) {
                  request.setAttribute("Register","Registered" );
              response.sendRedirect("OSUREGISTRATION.jsp");
            } else {

            //    request.getRequestDispatcher("OSUREGISTRATION.jsp").forward(request, response);
                response.sendRedirect("OSUREGISTRATION.jsp");
            }

            out.println("<h1>Servlet UserRegistrationController at " + request.getContextPath() + "</h1>");
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
