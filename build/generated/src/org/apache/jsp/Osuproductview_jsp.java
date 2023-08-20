package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Osuproductview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("<title>Products View</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"StyleOsuproductview.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t<div class=\"logo\"><img src=\"logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<h4>Welcome pushpendra  Patel</h4>\n");
      out.write("\t\t\t\t<ul id=\"MenuItems\">\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Products</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Contact</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Account</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<a href=\"\"><i class=\"fas fa-shopping-bag\"></i></a>\n");
      out.write("\t\t\t<span class=\"menu_icon\" onclick=\"menutoggle()\"> <i class=\"fas fa-bars\"></i></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"small_container\">\n");
      out.write("\t\t<div class=\"row_2\">\n");
      out.write("\t\t\t<h2>Master </h2>\n");
      out.write("\n");
      out.write("\t\t\t<div action=\"\" class=\"categoryselector\">\n");
      out.write("\t\t\t\t<a href=\"\">Cateogory</a>\n");
      out.write("\t\t\t\t<a href=\"\">Products</a>\n");
      out.write("\t\t\t\t<a href=\"\">Customer</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"background\">\n");
      out.write("\t\t\t\t<div class=\"mincontanierview\">\n");
      out.write("\t\t\t\t\t<a href=\"\"><i class=\"fas fa-long-arrow-alt-left\"></i></a>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"product-view\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"product-image-container\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"product-image\" src=\"images/img2.jpg\" alt=\"Product Image\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"product-details\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"product-title\">Product Name</h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"product-category\"> Category category name</p>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"product-price\">$99.99</p>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"product-stock\">In Stock: 5</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Footer of the page  -->\n");
      out.write("\n");
      out.write("\t<div class=\"containerfooter\">\n");
      out.write("\t\t<div id=\"item-4\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"mincontainer\">\n");
      out.write("\t\t\t\t<div class=\"usefullinks\">\n");
      out.write("\t\t\t\t\t<h3>Officail Patners</h3>\n");
      out.write("\t\t\t\t\t<a href=\"\">H&M</a>\n");
      out.write("\t\t\t\t\t<a href=\"\">Puma</a>\n");
      out.write("\t\t\t\t\t<a href=\"\">Samsung</a>\n");
      out.write("\t\t\t\t\t<a href=\"\">Uniliver</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"usefullinks\">\n");
      out.write("\t\t\t\t\t<h3>UseFul Links</h3>\n");
      out.write("\t\t\t\t\t<a href=\"\">About</a>\n");
      out.write("\t\t\t\t\t<a href=\"\">contact</a>\n");
      out.write("\t\t\t\t\t<a href=\"\">Shop</a>\n");
      out.write("\t\t\t\t\t<a href=\"\">Become seller </a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"usefullinks\">\n");
      out.write("\t\t\t\t\t<h3>Contact</h3>\n");
      out.write("\t\t\t\t\t<div class=\"contacticons \">\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fab fa-instagram\"></i></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"address\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<p><i class=\"fas fa-map-marker-alt\"></i> Mata madir bhopal 44006</p>\n");
      out.write("\t\t\t\t\t\t<p><i class=\"fas fa-phone\"></i>75489545678</p>\n");
      out.write("\t\t\t\t\t\t<p><i class=\"fas fa-envelope\"></i>onlinestoe@gmail.com</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"copyright_text\">Copyright &copy; 2023 All Rights Reserved by Online Shopping Store\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tlet MenuItems = document.getElementById(\"MenuItems\");\n");
      out.write("\tMenuItems.style.maxHeight = \"0px\";\n");
      out.write("\n");
      out.write("\tfunction menutoggle() {\n");
      out.write("\t\tif (MenuItems.style.maxHeight == \"0px\") {\n");
      out.write("\t\t\tMenuItems.style.maxHeight = \"200px\";\n");
      out.write("\t\t}\n");
      out.write("\t\telse {\n");
      out.write("\t\t\tMenuItems.style.maxHeight = \"0px\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
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
