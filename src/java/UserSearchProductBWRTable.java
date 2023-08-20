/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AR WorkStation
 */
public class UserSearchProductBWRTable extends HttpServlet {

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
            out.println("<title>Servlet UserSearchProductBWRTable</title>");
            out.println("</head>");
            out.println("<body>");
            int catid = Integer.parseInt(request.getParameter("catid"));
            double srange = Double.parseDouble(request.getParameter("srange"));
            double erange = Double.parseDouble(request.getParameter("erange"));
            out.println("<h1> " + catid + "</h1>");
            out.println("<h1> " + srange + "</h1>");
            out.println("<h1> " + erange + "</h1>");
            ArrayList<String> datalist = new ArrayList<String>();
            HttpSession hs = request.getSession();
          
            datalist.add(String.valueOf(catid));
            datalist.add(String.valueOf(srange));
            datalist.add(String.valueOf(erange));
            hs.setAttribute("datalist", datalist);
            
            response.sendRedirect("UserSearchProductBWRTable.jsp");
            out.println("<a href='jser.jsp'>view details</a>");

            // Retrieve the ArrayList from session
            out.println("<h1>Data stored in the array list </h1>");

            ArrayList<String> datalist2 = (ArrayList<String>) hs.getAttribute("datalist");

            // Check if the datalist is not null
            if (datalist2 != null) {
                // Retrieve the data from the datalist
                int catid2 = Integer.parseInt(datalist2.get(0));
                double srange2 = Double.parseDouble(datalist2.get(1));
                double erange2 = Double.parseDouble(datalist2.get(2));

                // Display the data in the JSP page
                out.println("<h1>" + catid2 + "</h1>");
                out.println("<h1>" + srange2 + "</h1>");
                out.println("<h1>" + erange2 + "</h1>");
            }

            out.println("<h1>Servlet UserSearchProductBWRTable at " + request.getContextPath() + "</h1>");
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
