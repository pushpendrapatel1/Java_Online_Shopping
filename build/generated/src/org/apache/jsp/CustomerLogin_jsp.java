package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/CustomersHeader.jsp");
    _jspx_dependants.add("/CustomerSidebar.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerLogin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleCustomerHeader.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("        <div class=\"items\" id=\"item-1\">\n");
      out.write("            <h2 id=\"searchbtn\"><form action=\"\">\n");
      out.write("                <input type=\"text\" placeholder=\"Enter a product Name\" name=\"\"><input type=\"submit\" value=\"&#128269;\"></i>\n");
      out.write("            </form> </h2>\n");
      out.write("            <div class=\"menu-bar \" >\n");
      out.write("                <ul>\n");
      out.write("                    <div>\n");
      out.write("                        <li class=\"logo\"><img src=\"Images/logo9.png\"></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar\">\n");
      out.write("                        <li><i class=\"fa fa-home\" aria-hidden=\"true\"></i><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><i class=\"fas fa-sign-in-alt\"></i></i></i><a href=\"#\">Login</a></li>\n");
      out.write("                        <li><i class=\"fas fa-user\"></i><a href=\"\">Register</a></li>\n");
      out.write("                        <li><i class=\"fas fa-phone\"></i><a href=\"\">Contact us</a></li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Client Sidebar</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomesidebar.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("            <div class=\"items\" id=\"item-2\">\n");
      out.write("                 <div class=\"sidemaster\">\n");
      out.write("                <h3>Category </h3>\n");
      out.write("                <div class=\"sidenavbar\">\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"\">Electronics</a></td>\n");
      out.write("                                <td><a href=\"\">Mobiles</a></td>\n");
      out.write("                                <td><a href=\"\">Games</a></td>\n");
      out.write("                                <td><a href=\"\">Furniture</a></td>\n");
      out.write("                                <td><a href=\"\">Fashion</a></td>\n");
      out.write("                                <td><a href=\"\">Vegetables</a></td>\n");
      out.write("                                <td><a href=\"\">Computers</a></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>Footer</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleFooter.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <div  id=\"item-4\">\n");
      out.write("\n");
      out.write("        <div class=\"mincontainerftr\">\n");
      out.write("            <div class=\"usefullinks\">\n");
      out.write("                <h3>Officail Patners</h3>\n");
      out.write("                <a href=\"\">H&M</a>\n");
      out.write("                <a href=\"\">Puma</a>\n");
      out.write("                <a href=\"\">Samsung</a>\n");
      out.write("                <a href=\"\">Uniliver</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"usefullinks\">\n");
      out.write("                <h3>UseFul Links</h3>\n");
      out.write("                <a href=\"\">About</a>\n");
      out.write("                <a href=\"\">contact</a>\n");
      out.write("                <a href=\"\">Shop</a>\n");
      out.write("                <a href=\"\">Become seller </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"usefullinks\" >\n");
      out.write("                <h3>Contact</h3>\n");
      out.write("                <div class=\"contacticons \">\n");
      out.write("                    <a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a href=\"\"><i class=\"fab fa-instagram\"></i></i></a>\n");
      out.write("                    <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                    <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"address\">\n");
      out.write("\n");
      out.write("                    <p><i class=\"fas fa-map-marker-alt\"></i> Mata madir bhopal 44006</p>\n");
      out.write("                    <p><i class=\"fas fa-phone\"></i>75489545678</p>\n");
      out.write("                    <p><i class=\"fas fa-envelope\"></i>onlinestoe@gmail.com</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <p class=\"copyright_text\">Copyright &copy; 2023 All Rights Reserved by <br> Online Shopping Store\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("            <div class=\"items\" id=\"item-3\">\n");
      out.write("                <h1>Login</h1>\n");
      out.write("                <div class=\"mincontainer\">\n");
      out.write("                    <form name=\"\" >\n");
      out.write("                        <table class=\"addproduct\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Username</td>\n");
      out.write("                                <td><input type=\"text\" name=\"username\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Password</td>\n");
      out.write("                                <td><input type=\"password\" name=\"password\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"buttons\">\n");
      out.write("                            <input type=\"submit\" value=\"Login\" class=\"btn\">\n");
      out.write("                            <input type=\"reset\" value=\"Reset\" class=\"btn\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"userimg\">\n");
      out.write("                            <a href=\"registration.html\" ><img src=\"images/users1.png\" alt=\"\" srcset=\"\"></a>\n");
      out.write("                            <label for=\"New User\">New Customer</label>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
