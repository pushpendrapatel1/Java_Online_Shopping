package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.osp.bean.CategoryBean;
import com.osp.dao.CategoryDao;

public final class UserSearchCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Products</title>\n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"small_container_search\">\n");
      out.write("        <div class=\"row_3\">\n");
      out.write("            <h2>Search </h2>\n");
      out.write("\n");
      out.write("            <div action=\"\" class=\"categoryselector\">\n");
      out.write("                <a href=\"\">Cateogory Wise</a>\n");
      out.write("                <a href=\"\">Products B/W Range</a>\n");
      out.write("                <a href=\"\">Customer Balance</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"rowsearch\">\n");
      out.write("            <h2>Products Search</h2>\n");
      out.write("                    <div class=\"formcnt\">\n");
      out.write("                        <form action=\"\">\n");
      out.write("                        \n");
      out.write("                              <label for=\"\">Category</label>\n");
      out.write("                               <select name=\"catid\" id=\"\">\n");
      out.write("                                   ");
 
                                
                            CategoryDao cd = new CategoryDao();
                            ArrayList<CategoryBean> al = cd.FindallCategory();
                            for(CategoryBean c:al)
                            {
                                
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(c.getCategoryid() );
      out.write('"');
      out.write('>');
      out.print(c.getCategoryname() );
      out.write("</option>\n");
      out.write("                                 ");
}
      out.write("  \n");
      out.write("                               </select>  \n");
      out.write("                          <input type=\"submit\" value=\"Show Products\">\n");
      out.write("                        </form>\n");
      out.write("                        </div>          \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("         ");
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
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var message = '");
      out.print( request.getAttribute("productmessage") );
      out.write("';\n");
      out.write("    var msgbox = document.getElementById('msgbox');\n");
      out.write("    msgbox.innerHTML = message;\n");
      out.write("    setTimeout(function() {\n");
      out.write("        msgbox.innerHTML = '';\n");
      out.write("    }, 3000);\n");
      out.write("        \n");
      out.write("        let MenuItems = document.getElementById(\"MenuItems\");\n");
      out.write("        MenuItems.style.maxHeight = \"0px\";\n");
      out.write("\n");
      out.write("        function menutoggle() {\n");
      out.write("            if (MenuItems.style.maxHeight == \"0px\") {\n");
      out.write("                MenuItems.style.maxHeight = \"200px\";\n");
      out.write("            } else {\n");
      out.write("                MenuItems.style.maxHeight = \"0px\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       \n");
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
