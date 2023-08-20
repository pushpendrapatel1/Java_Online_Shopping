package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.osp.bean.CustomersBean;
import com.osp.dao.CustomersDao;
import java.util.ArrayList;
import com.osp.dao.CategoryDao;
import com.osp.bean.CategoryBean;
import com.osp.bean.ProductsBean;
import com.osp.dao.ProductsDao;

public final class OsuProductupdateScat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Products Update</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleOsuProductUpdate2.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container3\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                 ");

                        int customerid = 0;
                        if (session.getAttribute("useridlogin") == null) {
                            response.sendRedirect("CustomerLoginRegister.jsp");

                        } else {
                            customerid = (Integer) session.getAttribute("useridlogin");

                        }

                        CustomersDao cds = new CustomersDao();
                        CustomersBean cbs = cds.findbyCustomerid(customerid);
                    
      out.write("\n");
      out.write("                    <h4>Welcome  &nbsp; ");
      out.print(cbs.getCustomername() );
      out.write("</h4>\n");
      out.write("                <ul id=\"MenuItems\">\n");
      out.write("                  \n");
      out.write(" \t\t<li><a href=\"OsuProducttable.jsp\">Master</a></li>\n");
      out.write("                    <li><a href=\"UsersearchcatTable.jsp\">Search</a></li>\n");
      out.write("                    <li><a href=\"OsuReportCategory.jsp\">Report</a></li>\n");
      out.write("                    <li><a href=\"UserProfile.jsp\">Profile</a></li>\n");
      out.write("                    <li><a href=\"OSUREGISTRATION.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <a href=\"\"><i class=\"fas fa-shopping-bag\"></i></a>\n");
      out.write("            <span class=\"menu_icon\" onclick=\"menutoggle()\"> <i class=\"fas fa-bars\"></i></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <div class=\"account_page\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col_2\">\n");
      out.write("                    <img src=\"Images/logindemo.png\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col_2\">\n");
      out.write("                    <div class=\"form_container\">\n");
      out.write("                        <div class=\"form_btn\">\n");
      out.write("                            <span >Update Product</span>\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                      <form action=\"ProductUpdateControllerScat\" method=\"post\" enctype=\"multipart/form-data\"  >\n");
      out.write("                   \n");
      out.write("                            \n");
      out.write("                          <table class=\"addproducttable\">\n");
      out.write("                               ");

                                int pid = Integer.parseInt(request.getParameter("pid"));
                                ProductsDao pd = new ProductsDao();
                                ProductsBean p = pd.findbyProductid(pid);
                                

                            
      out.write("\n");
      out.write("                            \n");
      out.write("                              <tr>\n");
      out.write("                            \n");
      out.write("                           <td ><input type=\"hidden\" name=\"pid\" value=\"");
      out.print(p.getProductid() );
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Product Name</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"pname\" value=\"");
      out.print(p.getProductname() );
      out.write("\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Category</td>\n");
      out.write("                                    <td><select  name=\"cat\" required>\n");
      out.write("                                            ");
 
                                 int cid = p.getCategoryid();
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
      out.write("                                        </select></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Product Price</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"price\" value=\"");
      out.print(p.getProductprice() );
      out.write("\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Stock </td>\n");
      out.write("                                    <td><input type=\"text\" name=\"stock\" value=\"");
      out.print(p.getStockinhand() );
      out.write("\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                           \n");
      out.write("                           <td ><input type=\"hidden\" name=\"imgname\" value=\"");
      out.print(p.getImgname());
      out.write("\"></td>\n");
      out.write("                       \n");
      out.write("                        </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Image</td>\n");
      out.write("                                    <td id=\"imgcntlocal\">\n");
      out.write("                                        <img src=\"Images/");
      out.print(p.getImgname() );
      out.write("\" alt=\"\" srcset=\"\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td><input type=\"file\" name=\"imgfile\" required=\"\" ></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("        \n");
      out.write("                            </table>\n");
      out.write("                            <div class=\"buttons\">\n");
      out.write("        \n");
      out.write("                               \n");
      out.write("                                <button type=\"Submit\" class=\"addbtn\">Update</button>\n");
      out.write("                                <button type=\"reset\" class=\"clearbtn\">Clear</button>\n");
      out.write("                            </div>\n");
      out.write("                    \n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <!-- Footer of the page  -->\n");
      out.write("\n");
      out.write("    <div class=\"containerfooter\">\n");
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
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    let MenuItems = document.getElementById(\"MenuItems\");\n");
      out.write("    MenuItems.style.maxHeight = \"0px\";\n");
      out.write("\n");
      out.write("    function menutoggle() {\n");
      out.write("        if (MenuItems.style.maxHeight == \"0px\") {\n");
      out.write("            MenuItems.style.maxHeight = \"200px\";\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            MenuItems.style.maxHeight = \"0px\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
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
