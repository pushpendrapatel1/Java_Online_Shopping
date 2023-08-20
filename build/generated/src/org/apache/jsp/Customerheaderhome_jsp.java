package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customerheaderhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("     <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleCustomer.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write(" <div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                      <h4 id=\"customername\"></h4>\n");
      out.write("                    \n");
      out.write("                    <ul id=\"MenuItems\">\n");
      out.write("                        <li><a href=\"\">Home</a></li>\n");
      out.write("                        <li><a href=\"\">Produts</a></li>\n");
      out.write("                        <li><a href=\"\">About</a></li>\n");
      out.write("                        <li><a href=\"\">Contack</a></li>\n");
      out.write("                        <li><a href=\"\">Account</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <a href=\"\"><i class=\"fas fa-shopping-bag\"></i></a>\n");
      out.write("            <span class=\"menu_icon\" onclick=\"menutoggle()\"> <i class=\"fas fa-bars\" ></i></span>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("              \n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col_2\">\n");
      out.write("                    <h1>Give your Workout <br> A new Style </h1>\n");
      out.write("                    <p>Sucess isn't always about greatness . It's About consistency . <br> consistent hard work gain\n");
      out.write("                        sucess . Greatness will come .</p>\n");
      out.write("                    <a href=\"\" class=\"btn\">Explore Now &#8594;</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col_2\">\n");
      out.write("                    <img src=\"Images/phoneadd2.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                      <script>\n");
      out.write("                           var message = '");
      out.print( request.getAttribute("customerName") );
      out.write("';\n");
      out.write("                           if(message !=null){\n");
      out.write("    var msgbox = document.getElementById('customername');\n");
      out.write("                           }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
