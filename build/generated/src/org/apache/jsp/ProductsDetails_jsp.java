package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.osp.bean.CategoryBean;
import com.osp.dao.CategoryDao;
import com.osp.bean.ProductsBean;
import java.util.ArrayList;
import com.osp.dao.ProductsDao;

public final class ProductsDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Usersheader.jsp");
    _jspx_dependants.add("/SidebarMaster.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleProductdetails.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     <title>Header</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"UsersHeader2.css\">\n");
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
      out.write("                        <li><i class=\"fa fa-home\" aria-hidden=\"true\"></i><a href=\"ProductDetails.jsp\">Master</a></li>\n");
      out.write("                        <li><i class=\"fas fa-search\"></i><a href=\"ProductSearch.jsp\">Search</a></li>\n");
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
      out.write("         <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleSidebarMaster2.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("        <div  id=\"item-2\">\n");
      out.write("            <div class=\"sidemaster\">\n");
      out.write("            <h3>Master </h3>\n");
      out.write("            <div class=\"sidenavbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"CategoryTable.jsp\">Category</a> </li>\n");
      out.write("                    <li><a href=\"ProductsDetails.jsp\">Product </a> </li>\n");
      out.write("                    <li><a href=\"CustomerView.jsp\">Customer</a> </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            <div class=\"items\" id=\"item-3\">\n");
      out.write("                <h1>Product Details</h1>\n");
      out.write("                <div class=\"mincontainer\">\n");
      out.write("                    <h3><a href=\"ProductAdd.jsp\"><i class=\"fas fa-plus\">Add Product</i></a></h3>\n");
      out.write("                    <span  id=\"msgbox\"></span>\n");
      out.write("                    <table class=\"product_table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Sr.no</th>\n");
      out.write("                                <th>Product Name</th>\n");
      out.write("                                <th>Category Name</th>\n");
      out.write("                                <th>Price </th>\n");
      out.write("                                <th>View</th>\n");
      out.write("                                <th>Edit</th>\n");
      out.write("                                <th>Delete</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                            ");

                                int count = 1;
                                ProductsDao pd = new ProductsDao();
                                ArrayList<ProductsBean> x = pd.FindallProduct();
                                for (ProductsBean pb : x) {

                                    int cid = pb.getCategoryid();
                                    CategoryDao cd = new CategoryDao();
                                    CategoryBean cb = cd.findbyCategoryid(cid);
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pb.getProductname());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(cb.getCategoryname());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pb.getProductprice());
      out.write("</td>\n");
      out.write("                                <td><a href=\"ProductView.jsp?pid=");
      out.print(pb.getProductid());
      out.write("\"><i class=\"fas fa-eye\"></i></a> </td>\n");
      out.write("                                <td><a href=\"OsuProductupdate.jsp?pid=");
      out.print(pb.getProductid());
      out.write("\"><i class=\"fas fa-edit\"></i></a></td>\n");
      out.write("                                <td><a href=\"ProductDeleteController?pid=");
      out.print(pb.getProductid());
      out.write("\" onclick=\"return confirm('Are you sure you want to delete this category?');\"><i class=\"fas fa-trash\"></i></a></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");
 count++;
                           }
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            ");
 if (request.getAttribute("productmessage") != null) {
      out.write("\n");
      out.write("            let msg = document.getElementById(\"msgbox\");\n");
      out.write("            msg.innerHTML = \"");
      out.print( request.getAttribute("productmessage"));
      out.write("\";\n");
      out.write("            setTimeout(() => {\n");
      out.write("                msg.remove();\n");
      out.write("            }, 3000);\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </script>      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
