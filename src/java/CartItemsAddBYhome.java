/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AR WorkStation
 */
public class CartItemsAddBYhome extends HttpServlet {

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
            out.println("<title>Servlet CartItemsAddBYhome</title>");            
            out.println("</head>");
            out.println("<body>");
            
             HttpSession session = request.getSession();

            // Retrieve the CartData ArrayList from the session, or create a new one if it doesn't exist
            ArrayList<String> CartData = (ArrayList<String>) session.getAttribute("CartData");
            if (CartData == null) {
                CartData = new ArrayList<String>();
            }

            // Process the form submission
            String pid = request.getParameter("productid");
            if (pid != null) {
                CartData.add(pid);
            }
            String deleteIndex = request.getParameter("deleteIndex");
            if (deleteIndex != null) {
                String valueToDelete = deleteIndex;
                for (int i = CartData.size() - 1; i >= 0; i--) {
                    if (CartData.get(i).equals(valueToDelete)) {
                        CartData.remove(i);
                    }
                }
                RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerCart.jsp");
                dispatcher.forward(request, response);
            }

            // Store the CartData ArrayList back in the session
            session.setAttribute("CartData", CartData);

            // Get the RequestDispatcher object for the "view.jsp" page
            response.sendRedirect("Customerhome.jsp");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("CART.jsp");
//
            
            out.println("<h1>Servlet CartItemsAddBYhome at " + request.getContextPath() + "</h1>");
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
