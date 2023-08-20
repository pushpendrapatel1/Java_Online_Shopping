package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OSUREGISTRATION_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login/Register</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomer.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("        <style>\n");
      out.write("            .form_container .form1 {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 150px;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                transition: transform 0.5s;\n");
      out.write("            } \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"account_page\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col_2\">\n");
      out.write("                        <img src=\"Images/logindemo.png\" alt=\"\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col_2\">\n");
      out.write("                        <div class=\"form_container\">\n");
      out.write("                            <div class=\"form_btn\">\n");
      out.write("                                <span onclick=\"login()\" >Login</span>\n");
      out.write("                                <span onclick=\"register()\" >Register</span>\n");
      out.write("                                <hr id=\"indicator\" >\n");
      out.write("                            </div>\n");
      out.write("                            <form action=\"UserLoginController\" method=\"post\" class=\"form1\" id=\"loginform\"> \n");
      out.write("                                <input type=\"text\" placeholder=\"Username\" name=\"uname\" required=\"\">\n");
      out.write("                                <input type=\"passwrod\" placeholder=\"Password\" name=\"pass\" required=\"\">\n");
      out.write("                                <button type=\"Submit\" class=\"btn \">Login</button>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                            <form action=\"UserRegistrationController\" method=\"post\" class=\"form2\" onsubmit=\"return Validation();\" name=\"f1\" id=\"registerfrom\">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" placeholder=\"Name\" name=\"name\" required=\"\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Email\" name=\"email\" required=\"\">\n");
      out.write("\n");
      out.write("                                <input type=\"number\" placeholder=\"Mobile.NO\" name=\"phone\" required minlength=\"10\" maxlength=\"10\">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" placeholder=\"Address\" name=\"add\" required=\"\">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" placeholder=\"Username\" name=\"uname\" required=\"\">\n");
      out.write("                                <input type=\"passwrod\" placeholder=\"Password\" name=\"pass\" required=\"\">\n");
      out.write("                                <button type=\"Submit\" class=\"btn \">Register</button>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"containerfooter\">\n");
      out.write("            <div id=\"item-4\">\n");
      out.write("\n");
      out.write("                <div class=\"mincontainer\">\n");
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
      out.write("                    <div class=\"usefullinks\">\n");
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
      out.write("                <p class=\"copyright_text\">Copyright &copy; 2023 All Rights Reserved by Online Shopping Store\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("        function Validation() {\n");
      out.write("\n");
      out.write("   \n");
      out.write("    var phone = document.f1.phone.value;\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("    var phoneno = /^\\d{10}$/;\n");
      out.write("\n");
      out.write("    if (phone.match(phoneno))\n");
      out.write("    {\n");
      out.write("        return true;\n");
      out.write("    } else\n");
      out.write("    {\n");
      out.write("        alert(\"Not a valid Phone Number\");\n");
      out.write("        document.f1.phone.value = \"\";\n");
      out.write("        document.f1.phone.focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        var message=\"");
      out.print(request.getAttribute("Register") );
      out.write("\"\n");
      out.write("        if(message !==null && message=''){\n");
      out.write("            registerform.style.transform = \"translateX(400px)\"\n");
      out.write("            loginform.style.transform = \"translateX(-400px)\"\n");
      out.write("            indicator.style.transform = \"translateX(0px)\"\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        var loginform = document.getElementById(\"loginform\");\n");
      out.write("        var registerform = document.getElementById(\"registerfrom\");\n");
      out.write("        var indicator = document.getElementById(\"indicator\");\n");
      out.write("\n");
      out.write("\n");
      out.write("        function register()\n");
      out.write("        {\n");
      out.write("            registerform.style.transform = \"translateX(0px)\"\n");
      out.write("            loginform.style.transform = \"translateX(0px)\"\n");
      out.write("            indicator.style.transform = \"translateX(100px)\"\n");
      out.write("        }\n");
      out.write("        function login()\n");
      out.write("        {\n");
      out.write("            registerform.style.transform = \"translateX(400px)\"\n");
      out.write("            loginform.style.transform = \"translateX(-400px)\"\n");
      out.write("            indicator.style.transform = \"translateX(0px)\"\n");
      out.write("\n");
      out.write("        }\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
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
