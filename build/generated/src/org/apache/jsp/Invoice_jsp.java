package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.osp.dao.ProductsDao;
import com.osp.bean.ProductsBean;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public final class Invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Invoice</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styleinvoice.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"invoice-container\">\n");
      out.write("                <div class=\"top\">\n");
      out.write("                    <div class=\"top-left\">\n");
      out.write("                        <img src=\"Images/logo7.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top-right\">\n");
      out.write("                        <h1 class=\"main\">Invoice</h1>\n");
      out.write("                        <span class=\"code\" id=\"random-number\"></span>\n");
      out.write("                        <div class=\"date\" id=\"date_show\"> 25 Dec 2015</div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bill-box\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <div class=\"text-m\">Bill from: </div>\n");
      out.write("                        <div class=\"title\">Online Shop</div>\n");
      out.write("                        <div class=\"addr\">724858945</div>\n");
      out.write("                        <div class=\"addr\"> Mata madir bhopal 44006</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <div class=\"text-m\">Bill TO:</div>\n");
      out.write("                        <div class=\"title\">Tom Jones</div>\n");
      out.write("                        <div class=\"addr\">Email</div>\n");
      out.write("                        <div class=\"addr\">Phone</div>\n");
      out.write("                        <div class=\"addr\">Seminary hill </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

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
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"table-bill\">\n");
      out.write("                    <table class=\"table-service\">\n");
      out.write("                        <thead>\n");
      out.write("\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th >Quantity</th>\n");
      out.write("                        <th>Price </th>\n");
      out.write("                        <th class=\"cost\">Cost</th>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                double subtotal = 0;
                                int index = 0;
                                int count = 1;
                                for (Map.Entry<Integer, Integer> entry : productQuantities.entrySet()) {
                                    int productId = entry.getKey();
                                    int quantity = entry.getValue();
                                    ProductsDao pd = new ProductsDao();
                                    ProductsBean pb = pd.findbyProductid(productId);
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"name\"> ");
      out.print(pb.getProductname());
      out.write(" </td>\n");
      out.write("                                <td>");
      out.print( quantity);
      out.write("</td>\n");
      out.write("                                <td> ");
      out.print(pb.getProductprice());
      out.write("</td>\n");
      out.write("                                <td class=\"cost\">");
      out.print((quantity * pb.getProductprice()));
      out.write(" </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                    subtotal += quantity * pb.getProductprice();
                                    index++;
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                        <tfoot>\n");
      out.write("                            <tr class=\"total total1\">\n");
      out.write("                                <td colspan=\"2\"> </td>\n");
      out.write("                                <td>SubTotal</td>\n");
      out.write("                                <td class=\"number\">");
      out.print(subtotal);
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"total\">\n");
      out.write("                                <td colspan=\"2\"> </td>\n");
      out.write("                                <td>Tax(18%)</td>\n");
      out.write("                                <td class=\"number\">");
      out.print(((subtotal * 18) / 100));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"finalprice\">\n");
      out.write("                                <td colspan=\"2\"> </td>\n");
      out.write("                                <td>Total</td>\n");
      out.write("                                <td class=\"number\"><i class=\"fas fa-rupee-sign\"></i>");
      out.print(((subtotal * 18) / 100) + subtotal);
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </tfoot>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"actions\">\n");
      out.write("                    <button class=\"btn btn-main \" onclick=\"window.print()\"><a href=\"\"> Print</a></button>\n");
      out.write("                    <button class=\"btn btn-main\"><a href=\"OrderController\"> Pay Now</a></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"note\">\n");
      out.write("                    <p>Thank You &#10084; for Shopping with us!</p>\n");
      out.write("                    <p> OnlineShopping.com</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            let date = new Date();\n");
      out.write("            let day = date.getDate();\n");
      out.write("            let month = date.getMonth() + 1;\n");
      out.write("            let year = date.getFullYear();\n");
      out.write("            let formattedDate = day + ' ' + getMonthName(month) + ' ' + year;\n");
      out.write("            document.getElementById('date_show').innerHTML = formattedDate;\n");
      out.write("\n");
      out.write("            function getMonthName(month) {\n");
      out.write("                let monthNames = [\n");
      out.write("                    \"Jan\", \"Feb\", \"Mar\",\n");
      out.write("                    \"Apr\", \"May\", \"Jun\", \"Jul\",\n");
      out.write("                    \"Aug\", \"Sep\", \"Oct\",\n");
      out.write("                    \"Nov\", \"Dec\"\n");
      out.write("                ];\n");
      out.write("                return monthNames[month - 1];\n");
      out.write("            }\n");
      out.write("\n");
      out.write("    //=============================\n");
      out.write("            let randomNumberElement = document.getElementById(\"random-number\");\n");
      out.write("\n");
      out.write("            let randomNumber = Math.floor(Math.random() * 900000) + 100000; // generates a random six-digit number\n");
      out.write("\n");
      out.write("            randomNumberElement.innerText = \"#\" + randomNumber;\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
