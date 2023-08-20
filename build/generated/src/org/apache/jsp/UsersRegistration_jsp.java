package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UsersRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title> Users Register </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleIndex.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"items\" id=\"item-1\">\n");
      out.write("                <div class=\"menu-bar \">\n");
      out.write("                    <ul>\n");
      out.write("                        <div>\n");
      out.write("                            <li class=\"logo\"><img src=\"logo9.png\"></li>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"navbar\">                      \n");
      out.write("                            <li><i class=\"fas fa-file-alt\"></i><a href=\"\">About us</a></li>\n");
      out.write("                            <li><i class=\"fas fa-sign-out-alt\"></i><a href=\"\">Register As Customer</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"items\" id=\"item-3\">\n");
      out.write("                <h1>Registration</h1>\n");
      out.write("                <div class=\"mincontainer\">\n");
      out.write("                    <form name=\"registration\" onsubmit=\"return validateForm()\">\n");
      out.write("                        <table class=\"addproduct\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"name\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Mobile</td>\n");
      out.write("                                <td><input type=\"text\" name=\"mobile\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Email</td>\n");
      out.write("                                <td><input type=\"text\" name=\"email\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Address</td>\n");
      out.write("                                <td><input type=\"text\" name=\"address\" required maxlength=\"30\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Username</td>\n");
      out.write("                                <td><input type=\"text\" name=\"username\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Password</td>\n");
      out.write("                                <td><input type=\"password\" name=\"password\" required></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td colspan=\"2\"><input type=\"hidden\" value=\"Users\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"buttons\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" value=\"Register\" class=\"btn\">\n");
      out.write("                            <input type=\"reset\" value=\"Reset\" class=\"btn\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"items\" id=\"item-4\">\n");
      out.write("                <div class=\"mincontainerftr\">\n");
      out.write("                    <div class=\"usefullinks\">\n");
      out.write("                        <h3>Officail Patners</h3>\n");
      out.write("                        <a href=\"\">H&M</a>\n");
      out.write("                        <a href=\"\">Puma</a>\n");
      out.write("                        <a href=\"\">Samsung</a>\n");
      out.write("                        <a href=\"\">Uniliver</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"usefullinks\">\n");
      out.write("                        <h3>UseFul Links</h3>\n");
      out.write("                        <a href=\"\">About</a>\n");
      out.write("                        <a href=\"\">contact</a>\n");
      out.write("                        <a href=\"\">Shop</a>\n");
      out.write("                        <a href=\"\">Become seller </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"usefullinks\" >\n");
      out.write("                        <h3>Contact</h3>\n");
      out.write("                        <div class=\"contacticons \">\n");
      out.write("                            <a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                            <a href=\"\"><i class=\"fab fa-instagram\"></i></i></a>\n");
      out.write("                            <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"address\">\n");
      out.write("                            <p><i class=\"fas fa-map-marker-alt\"></i> Mata madir bhopal 44006</p>\n");
      out.write("                            <p><i class=\"fas fa-phone\"></i>75489545678</p>\n");
      out.write("                            <p><i class=\"fas fa-envelope\"></i>onlinestoe@gmail.com</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"copyright_text\">Copyright &copy; 2023 All Rights Reserved by <br> Online Shopping Store\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <script src=\"CustomerRegistration.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html> ");
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
