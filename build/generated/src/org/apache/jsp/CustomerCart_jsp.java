package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.HashMap;
import java.util.HashMap;
import com.osp.dao.ProductsDao;
import com.osp.bean.ProductsBean;
import java.util.ArrayList;
import com.osp.dao.CustomersDao;
import com.osp.bean.CustomersBean;

public final class CustomerCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Customerheader.jsp");
    _jspx_dependants.add("/jser.jsp");
    _jspx_dependants.add("/CustomerFooter.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Customer Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .etcdata {\n");
      out.write("                margin-right: 30px;\n");
      out.write("                margin-top: 1.5%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            li a{\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("          ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            if (session.getAttribute("customerid") == null) {
                response.sendRedirect("CustomerLoginRegister.jsp");

            }

        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        int customerid=(Integer) session.getAttribute("customerid");
                       CustomersDao cdt = new CustomersDao();
                        CustomersBean cbt = cdt.findbyCustomerid(1);
                    
      out.write("\n");
      out.write("                    <h4 id=\"customername\">Welcome ");
      out.print(cbt.getCustomername());
      out.write("</h4>\n");
      out.write("                    <ul id=\"MenuItems\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li><a href=\"Customerhome.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"CustomerProductView.jsp\">Products</a></li>\n");
      out.write("                        <li><a href=\"CustomerAboutUsPage.jsp\">About</a></li>\n");
      out.write("                        <li><a href=\"CustomerProfile.jsp\">Profile</a></li>\n");
      out.write("                        <li><a href=\"CustomerOrders.jsp\">Orders</a></li>\n");
      out.write("                        <li><a href=\"CustomerLoginRegister.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <a href=\"CustomerCart.jsp\" class=\"etcdata\"><i class=\"fas fa-shopping-bag\"></i></a>\n");
      out.write("                <span class=\"menu_icon\" onclick=\"menutoggle()\"> <i class=\"fas fa-bars\"></i></span>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("        <script>\n");
      out.write("            var message = '");
      out.print( request.getAttribute("customerName"));
      out.write("';\n");
      out.write("            if (message != null) {\n");
      out.write("                var msgbox = document.getElementById('customername');\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"small_container cartpage\">\n");
      out.write("            <div class=\"mycartcnt\">\n");
      out.write("                <table>\n");
      out.write("                    <tr class=\"tableheading\">\n");
      out.write("                        <th>Product</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th>Subtotal</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                  ");

    Map<Integer, Integer> productQuantities = new HashMap<>();
    ArrayList<String> cartData = (ArrayList<String>) session.getAttribute("CartData");
    if (cartData != null) {
        for (int i = 0; i < cartData.size(); i++) {
            int productId = Integer.parseInt(cartData.get(i));
            if (productQuantities.containsKey(productId)) {
                // Increment the quantity if the product is already in the cart
                productQuantities.put(productId, productQuantities.get(productId) + 1);
            } else {
                // Add the product to the cart with a quantity of 1
                productQuantities.put(productId, 1);
            }
        }
    }
    double subtotal = 0;
    int index = 0;
    for (Map.Entry<Integer, Integer> entry : productQuantities.entrySet()) {
        int productId = entry.getKey();
        int quantity = entry.getValue();
        ProductsDao pd = new ProductsDao();
        ProductsBean pb = pd.findbyProductid(productId);

      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>\n");
      out.write("        <div class=\"cartinfo\">\n");
      out.write("            <img src=\"Images/");
      out.print(pb.getImgname());
      out.write("\" alt=\"\">\n");
      out.write("            <form action=\"CartItemsAdd\" method=\"post\"> \n");
      out.write("                <div class=\"cartiteminfo\">\n");
      out.write("                    <p>");
      out.print(pb.getProductname());
      out.write("</p>\n");
      out.write("                    <input type=\"hidden\" name=\"deleteIndex\" value=\"");
      out.print(pb.getProductid() );
      out.write("\">\n");
      out.write("                    <small><i class=\"fas fa-rupee-sign\"></i>");
      out.print(pb.getProductprice());
      out.write("</small>\n");
      out.write("                    <button type=\"submit\" class=\"removeitemc\"><i class=\"fas fa-times\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </td>\n");
      out.write("    <td>");
      out.print(quantity);
      out.write(" </td>\n");
      out.write("    <td><i class=\"fas fa-rupee-sign\"></i>");
      out.print((quantity * pb.getProductprice()));
      out.write("</td>\n");
      out.write("</tr>\n");

        subtotal += quantity * pb.getProductprice();
        index++;
    }

      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <div class=\"totalprice\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Subtotal</td>\n");
      out.write("                            <td><i class=\"fas fa-rupee-sign\"></i>");
      out.print(subtotal);
      out.write("</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Tax</td>\n");
      out.write("                            <td><i class=\"fas fa-rupee-sign\"></i>");
      out.print(((subtotal * 18) / 100));
      out.write("</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Total</td>\n");
      out.write("                            <td><i class=\"fas fa-rupee-sign\"></i>");
      out.print(((subtotal * 18) / 100) + subtotal);
      out.write("</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"Invoice.jsp\" id=\"buybtn_2\">Buy Now</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("       <head>\n");
      out.write("        \n");
      out.write("     <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
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
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <script src=\"customerlogin.js\"></script>\n");
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
