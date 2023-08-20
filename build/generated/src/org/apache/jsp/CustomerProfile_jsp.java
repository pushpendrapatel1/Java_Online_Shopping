package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.osp.bean.CustomersBean;
import com.osp.dao.CustomersDao;
import com.osp.dao.CustomersDao;
import com.osp.bean.CustomersBean;

public final class CustomerProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Customerheader.jsp");
    _jspx_dependants.add("/CustomerFooter.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Customer Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .etcdata {\n");
      out.write("                margin-right: 30px;\n");
      out.write("                margin-top: 1.5%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            li a{\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("\n");
      out.write("                    ");

                         int customerid=0;
                        if (session.getAttribute("customerid") == null) {
                            response.sendRedirect("CustomerLoginRegister.jsp");

                       
              customerid= (int) session.getAttribute("customerid");
                        }
         

      out.write("\n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                       CustomersDao cdt = new CustomersDao();
                        CustomersBean cbt = cdt.findbyCustomerid(customerid);
                    
      out.write("\n");
      out.write("                    <h4 id=\"customername\">Welcome ");
      out.print(cbt.getCustomername());
      out.write("</h4>\n");
      out.write("                    <ul id=\"MenuItems\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li><a href=\"Customerhome.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"CustomerProductView.jsp\">Products</a></li>\n");
      out.write("                        <li><a href=\"CustomerAboutUsPage.jsp\">About</a></li>\n");
      out.write("                        <li><a href=\"CustomerProfile.jsp\">Profile</a></li>\n");
      out.write("                        <li><a href=\"CustomerOrders.jsp\">Orders</a></li>\n");
      out.write("                        <li><a href=\"CustomerLoginRegister.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <a href=\"CustomerCart.jsp\" class=\"etcdata\"><i class=\"fas fa-shopping-bag\"></i></a>\n");
      out.write("                <span class=\"menu_icon\" onclick=\"menutoggle()\"> <i class=\"fas fa-bars\"></i></span>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("        <script>\n");
      out.write("            var message = '");
      out.print( request.getAttribute("customerName"));
      out.write("';\n");
      out.write("            if (message != null) {\n");
      out.write("                var msgbox = document.getElementById('customername');\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"account_page_profile\" style=\"margin-top: 4%\">\n");
      out.write("        \n");
      out.write("                       \n");
      out.write("        <div class=\"items\">\n");
      out.write("            <h1> Profile</h1>\n");
      out.write("            <div class=\"mincontainer\">\n");
      out.write("                <a href=\"CustomerProfileEdit.jsp?cid=");
      out.print(cbt.getCustomerid() );
      out.write("\">Edit <i class=\"fas fa-user-edit\"></i></a>\n");
      out.write("              <table>\n");
      out.write("                <tr class=\"tablesitems\">\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                    <td><label for=\"\">Name</label> </td>\n");
      out.write("                    <td>");
      out.print(cbt.getCustomername() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Email</label> </td>\n");
      out.write("                    <td>");
      out.print(cbt.getEmail() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Mobile</label> </td>\n");
      out.write("                    <td>");
      out.print(cbt.getMobile() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Address</label> </td>\n");
      out.write("                    <td>");
      out.print(cbt.getAddress() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Username</label> </td>\n");
      out.write("                    <td>");
      out.print(cbt.getUsername() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Password</label> </td>\n");
      out.write("                    <td><input type=\"password\" id=\"password\" value=\"");
      out.print(cbt.getPassword() );
      out.write("\" readonly/>\n");
      out.write("                         <button id=\"showHideBtn\" onclick=\"PasswordVisibility()\"><i class=\"fas fa-eye-slash\"></i></button>\n");
      out.write("   \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("              </table>\n");
      out.write("              \n");
      out.write("                       \n");
      out.write("                  \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("       <head>\n");
      out.write("        \n");
      out.write("     <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"containerfooter\">\n");
      out.write("        <div id=\"item-4\">\n");
      out.write("\n");
      out.write("            <div class=\"mincontainer\">\n");
      out.write("                <div class=\"usefullinks\">\n");
      out.write("                    <h3>Officail Patners</h3>\n");
      out.write("                    <a href=\"\">H&M</a>\n");
      out.write("                    <a href=\"\">Puma</a>\n");
      out.write("                    <a href=\"\">Samsung</a>\n");
      out.write("                    <a href=\"\">Uniliver</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"usefullinks\">\n");
      out.write("                    <h3>UseFul Links</h3>\n");
      out.write("                    <a href=\"\">About</a>\n");
      out.write("                    <a href=\"\">contact</a>\n");
      out.write("                    <a href=\"\">Shop</a>\n");
      out.write("                    <a href=\"\">Become seller </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"usefullinks\">\n");
      out.write("                    <h3>Contact</h3>\n");
      out.write("                    <div class=\"contacticons \">\n");
      out.write("                        <a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fab fa-instagram\"></i></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"address\">\n");
      out.write("\n");
      out.write("                        <p><i class=\"fas fa-map-marker-alt\"></i> Mata madir bhopal 44006</p>\n");
      out.write("                        <p><i class=\"fas fa-phone\"></i>75489545678</p>\n");
      out.write("                        <p><i class=\"fas fa-envelope\"></i>onlinestoe@gmail.com</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <p class=\"copyright_text\">Copyright &copy; 2023 All Rights Reserved by Online Shopping Store\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <script src=\"customerlogin.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
