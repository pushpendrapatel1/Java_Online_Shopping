package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.osp.dao.CategoryDao;
import com.osp.bean.CategoryBean;

public final class Osucategorytable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Osuheader.jsp");
    _jspx_dependants.add("/Osufooter.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Category Details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleOsuProductheader2.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Products</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleOsuProductheader2.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <h4>Welcome pushpendra  Patel</h4>\n");
      out.write("                <ul id=\"MenuItems\">\n");
      out.write("                    <li><a href=\"\">Master</a></li>\n");
      out.write("                    <li><a href=\"\">Search</a></li>\n");
      out.write("                    <li><a href=\"\">Report</a></li>\n");
      out.write("                    <li><a href=\"\">Profile</a></li>\n");
      out.write("                    <li><a href=\"\">Account</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("           \n");
      out.write("            <span class=\"menu_icon\" onclick=\"menutoggle()\"> <i class=\"fas fa-bars\"></i></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div class=\"small_container\">\n");
      out.write("            <div class=\"row_2\">\n");
      out.write("                <h2>Master </h2>\n");
      out.write("\n");
      out.write("                <div action=\"\" class=\"categoryselector\">\n");
      out.write("                    <a href=\"\">Category</a>\n");
      out.write("                    <a href=\"\">Products</a>\n");
      out.write("                    <a href=\"\">Customer</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <h2>Category Details</h2>\n");
      out.write("                <div class=\"min_row\">\n");
      out.write("                    <a href=\"Osuaddcategory.jsp\"  style=\"color: blue ; font-size: 19px\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i> Add Category</a>\n");
      out.write("                    <span id=\"msgbox\" style=\"color: green; font-size: 18px \" ></span>\n");
      out.write("                </div>\n");
      out.write(" <div class=\"tablemincnt\">\n");
      out.write("                <table class=\"table1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Sno </th>\n");
      out.write("\n");
      out.write("                            <th>Category Name</th>\n");
      out.write("                            <th>Category Details</th>\n");
      out.write("\n");
      out.write("                            <th>Edit </th>\n");
      out.write("                            <th>Delete </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    ");


                        CategoryBean cb = new CategoryBean();

                        CategoryDao cd = new CategoryDao();
                        ArrayList<CategoryBean> al = cd.FindallCategory();
                        int count = 1;
                        for (CategoryBean a : al) {

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getCategoryname());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getCategorydetails());
      out.write("</td>\n");
      out.write("                            <td><a href=\"Osucategoryupdate.jsp?cid=");
      out.print(a.getCategoryid());
      out.write("\"><i class=\"fas fa-edit\"></i></a></td>\n");
      out.write("                            <td><a href=\"CategoryDeleteController?cid=");
      out.print(a.getCategoryid());
      out.write("\" id=\"deleteicon\" onclick=\"return confirm('Are you sure you want to delete this category?');\"><i class=\"fas fa-trash\"></i></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");
 count++;
                               } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write(" </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Products</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleOsuProductheader2.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("  \n");
      out.write("<div class=\"containerfooter\">\n");
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
      out.write("    </div>");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        ");
 if (request.getAttribute("message") != null) {
      out.write("\n");
      out.write("        let msg = document.getElementById(\"msgbox\");\n");
      out.write("        msg.innerHTML = \"");
      out.print( request.getAttribute("message"));
      out.write("\";\n");
      out.write("        setTimeout(() => {\n");
      out.write("            msg.remove();\n");
      out.write("        }, 3000);\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
