package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomersHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Header</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleCustomerHeader.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"items\" id=\"item-1\">\n");
      out.write("            <h2 id=\"searchbtn\"><form action=\"\">\n");
      out.write("                <input type=\"text\" placeholder=\"Enter a product Name\" name=\"\"><input type=\"submit\" value=\"&#128269;\"></i>\n");
      out.write("            </form> </h2>\n");
      out.write("            <div class=\"menu-bar \" id=\"item-1\">\n");
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
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
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
