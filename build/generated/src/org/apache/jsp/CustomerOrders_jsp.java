package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import com.osp.bean.CategoryBean;
import com.osp.bean.ProductsBean;
import com.osp.bean.OrderDetailsBean;
import com.osp.bean.OrdersBean;
import com.osp.dao.CategoryDao;
import com.osp.dao.ProductsDao;
import com.osp.dao.OrderDetailsDao;
import java.util.ArrayList;
import com.osp.dao.OrdersDao;
import com.osp.dao.CustomersDao;
import com.osp.bean.CustomersBean;

public final class CustomerOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Customerheader.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Orders </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            #my-orders {\n");
      out.write("\n");
      out.write("                padding: 80px 20%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #my-orders h1{\n");
      out.write("                text-align: left;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            .ordertable {\n");
      out.write("\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ordertable th {\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #363636;\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ordertable td {\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("                padding:5px 10px;\n");
      out.write("                background-color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: 1px solid #949393;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ordertable td img {\n");
      out.write("                width: 100px;\n");
      out.write("                height: 100px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ordertable tr:nth-child(even) {\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a img {\n");
      out.write("                filter: grayscale(100%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover img {\n");
      out.write("                filter: grayscale(0%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .datacnt{\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                height: 500px;\n");
      out.write("                overflow-y: auto; \n");
      out.write("                padding: 10px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
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
      out.write("         \n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("  ");


            if (session.getAttribute("customerid") == null) {
                response.sendRedirect("CustomerLoginRegister.jsp");

            }

        
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        int customerid=(Integer) session.getAttribute("customerid");
                       CustomersDao cdt = new CustomersDao();
                        CustomersBean cbt = cdt.findbyCustomerid(customerid);
                    
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
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <section id=\"my-orders\">\n");
      out.write("                <div class=\"datacnt\" >\n");
      out.write("                    <h1> Thank you for Your Order, ");
      out.print(cbt.getCustomername());
      out.write(" !</h1>\n");
      out.write("                    <table class=\"ordertable\" style=\"margin-top:2px\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th> Sno </th>\n");
      out.write("                                <th> Product</th>\n");
      out.write("                                <th>Order Date</th>\n");
      out.write("                                <th>Quantity </th>\n");
      out.write("                                <th> Price</th>\n");
      out.write("                                <th>Total Amount</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody style=\"text-align:center\">\n");
      out.write("\n");
      out.write("                            ");


                                OrdersDao od = new OrdersDao();
                                ArrayList<OrdersBean> al = od.FindallOrdersBYCustomers(cbt.getCustomerid());

                                OrderDetailsDao k = new OrderDetailsDao();
                                ProductsDao pd = new ProductsDao();
                                CategoryDao cd = new CategoryDao();
                                int count = 1;
                                double amount = 0;
                                for (OrdersBean o : al) {

                                    OrderDetailsBean z = k.findbyOrderid(o.getOrderid());

                                    ProductsBean pb = pd.findbyProductid(z.getProductid());

                            
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( count);
      out.write(" </td>\n");
      out.write("                                <td><img src=\"Images/");
      out.print(pb.getImgname());
      out.write("\" alt=\"\" srcset=\"\"></td>\n");
      out.write("                                <td id=\"date\">");
      out.print(o.getOrderdate());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(z.getQuantity());
      out.write("</td>\n");
      out.write("                                <td><i class=\"fas fa-rupee-sign\" style=\"margin-right: 2px\"></i>");
      out.print(pb.getProductprice());
      out.write(" </td>\n");
      out.write("                                ");
 double price = z.getQuantity() * pb.getProductprice();
      out.write("\n");
      out.write("                                <td><i class=\"fas fa-rupee-sign\" style=\"margin-right: 2px\"></i>");
      out.print(price);
      out.write(" </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                    count++;
                                    amount += price;

                                }
                                double tax = (amount * 18) / 100;
                                amount = amount + tax;

                                DecimalFormat df = new DecimalFormat("#.##");
                                String formattedValue = df.format(amount);
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"6\" style=\"font-size: 18px; padding: 10px\"> Total Amount <span style=\"margin-right:20px\"><i class=\"fas fa-rupee-sign\" style=\"margin-right: 2px; margin-left: 20px\"></i>");
      out.print( formattedValue);
      out.write("</span></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
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
