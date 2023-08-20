package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProductWiseSales_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Usersheader.jsp");
    _jspx_dependants.add("/ReportSidebar.jsp");
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
      out.write("        <title>product Wise Sales</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleProductReport.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("              ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     <title>Header</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Usersheader1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <div  id=\"item-1\">\n");
      out.write("            <h2>Welcome Pushpendra </h2>\n");
      out.write("            <div class=\"menu-bar \" >\n");
      out.write("                <ul>\n");
      out.write("                    <div>\n");
      out.write("                        <li class=\"logo\"><img class=\"decor\" src=\"Images/logo9.png\"></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar\">\n");
      out.write("                        <li><i class=\"fa fa-home\" aria-hidden=\"true\"></i><a href=\"#\">Master</a></li>\n");
      out.write("                        <li><i class=\"fas fa-search\"></i><a href=\"#\">Search</a></li>\n");
      out.write("                        <li><i class=\"fas fa-file-alt\"></i><a href=\"\">Report</a></li>\n");
      out.write("                        <li><i class=\"fa fa-user-alt\"></i><a href=\"\">Profile</a></li>\n");
      out.write("                        <li><i class=\"fas fa-sign-out-alt\"></i><a href=\"\">Logout</a></li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleSidebarMaster1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  id=\"item-2\">\n");
      out.write("            <div class=\"sidemaster\">\n");
      out.write("                <h3>Report </h3>\n");
      out.write("                <div class=\"sidenavbar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\"> Daily/Montly Sales </a></li>\n");
      out.write("                        <li><a href=\"\"> Category Wise Sales </a></li>\n");
      out.write("                        <li><a href=\"\">Product Wise Sales</a></li>\n");
      out.write("                        <li><a href=\"\"> Customer Wise Sales</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            ");
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
      out.write("                <h2>Product Sales Report</h2>\n");
      out.write("                <div class=\"mincontainer\">\n");
      out.write("                    <div class=\"formbetweenrange\">\n");
      out.write("                        <form action=\"\">\n");
      out.write("                            <table >\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><label for=\"\">Product </label></td>\n");
      out.write("                                    <td><select name=\"\" id=\"selectionproduct\">\n");
      out.write("                                            <option value=\"\">1</option>\n");
      out.write("                                            <option value=\"\">2</option>\n");
      out.write("                                            <option value=\"\">3</option>\n");
      out.write("                                            <option value=\"\">4</option>\n");
      out.write("                                            <option value=\"\">5</option>\n");
      out.write("                                        </select></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><label for=\"\">Date From</label></td>\n");
      out.write("                                    <td><input type=\"date\"></td>\n");
      out.write("                                    <td><label for=\"\"> To</label></td>\n");
      out.write("                                    <td><input type=\"date\"></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <td><input type=\"submit\" value=\"Show Report\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"product_table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Sr.no</th>\n");
      out.write("                                <th>Product Name</th>\n");
      out.write("                                <th>Category Name</th>\n");
      out.write("                                <th>Qty Sold </th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>SuB Total</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>1</td>\n");
      out.write("                                <td>S22</td>\n");
      out.write("                                <td>Mobile</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>1</td>\n");
      out.write("                                <td>S22</td>\n");
      out.write("                                <td>Mobile</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>1</td>\n");
      out.write("                                <td>S22</td>\n");
      out.write("                                <td>Mobile</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("                                <td>25000</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"6\" id=\"totalprice\"><label for=\"\">Total :</label><span>25000</span></td>\n");
      out.write("                            </tr>                       \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
