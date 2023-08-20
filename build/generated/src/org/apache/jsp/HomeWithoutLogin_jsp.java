package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.osp.dao.ProductsDao;
import com.osp.bean.ProductsBean;
import java.util.ArrayList;
import com.osp.dao.CategoryDao;
import com.osp.bean.CategoryBean;

public final class HomeWithoutLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleCustomerALL.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write(" <div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><img src=\"Images/logo7.png\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                      <h4 id=\"customername\"></h4>\n");
      out.write("                    \n");
      out.write("                    <ul id=\"MenuItems\">\n");
      out.write("                       <li><a href=\"Customerhome.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"CustomerProductView.jsp\">Products</a></li>\n");
      out.write("                            <li><a href=\"CustomerAboutUsPage.jsp\">About</a></li>\n");
      out.write("                            <li><a href=\"CustomerProfile.jsp\">Profile</a></li>\n");
      out.write("                            <li><a href=\"CustomerOrders.jsp\">Orders</a></li>\n");
      out.write("                            <li><a href=\"CustomerLoginRegister.jsp\">Logout</a></li>\n");
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
      out.write("\n");
      out.write("        <!--------------------- featured category ----------->\n");
      out.write("\n");
      out.write("        <div class=\"categories\">\n");
      out.write("            <div class=\"small_container\">\n");
      out.write("                ");

                    CategoryBean cb = new CategoryBean();
                    CategoryDao cd = new CategoryDao();
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    ");

                        ArrayList<CategoryBean> b = cd.FindallCategory();
                        int x = 0, y = 0, z = 0;
                        for (CategoryBean c : b) {
                            int a = c.getCategoryid();
                            if (a > 0 && x == 0) {
                                x = a;
                            } else if (a > 0 && x != a && y == 0) {
                                y = a;
                            } else if (a > 0 && x != y && y != a && z == 0) {
                                z = a;
                                break;
                            }
                        }
                        ProductsDao pd = new ProductsDao();
                        ArrayList<ProductsBean> al = pd.FindallProductByCategory(1);
                        int count = 1;
                        for (ProductsBean p : al) {
                            CategoryBean cb1 = cd.findbyCategoryid(p.getCategoryid());
                    
      out.write("\n");
      out.write("                    <div class=\"col_3\">\n");
      out.write("                        <a href=\"CategoryWiseProducts.jsp?catid=");
      out.print(cb1.getCategoryid() );
      out.write("\">\n");
      out.write("                            <img src=\"Images/");
      out.print(p.getImgname());
      out.write("\" alt=\"\">\n");
      out.write("                            <div class=\"image-overlay\">\n");
      out.write("                                <span class=\"overlay-text\">");
      out.print(cb1.getCategoryname());
      out.write("</span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    ");
  if (count == 1) {
                                break;
                            }
                        } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                        ArrayList<ProductsBean> al2 = pd.FindallProductByCategory(2);

                        for (ProductsBean p1 : al2) {
                            CategoryBean cb2 = cd.findbyCategoryid(p1.getCategoryid());
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col_3\">\n");
      out.write("                        <a href=\"CategoryWiseProducts.jsp?catid=");
      out.print(cb2.getCategoryid() );
      out.write("\">\n");
      out.write("                            <img src=\"Images/");
      out.print(p1.getImgname());
      out.write("\" alt=\"\">\n");
      out.write("                            <div class=\"image-overlay\">\n");
      out.write("                                <span class=\"overlay-text\">");
      out.print(cb2.getCategoryname());
      out.write(" </span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    ");
  if (count == 1) {
                                  break;
                              }
                          } 
      out.write("       \n");
      out.write("\n");
      out.write("                    ");


                        ArrayList<ProductsBean> al3 = pd.FindallProductByCategory(10);

                        for (ProductsBean p2 : al3) {
                            CategoryBean cb3 = cd.findbyCategoryid(p2.getCategoryid());
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col_3\">\n");
      out.write("                          <a href=\"CategoryWiseProducts.jsp?catid=");
      out.print(cb3.getCategoryid());
      out.write("\">\n");
      out.write("                            <img src=\"Images/");
      out.print(p2.getImgname());
      out.write("\" alt=\"\">\n");
      out.write("                            <div class=\"image-overlay\">\n");
      out.write("                                <span class=\"overlay-text\">");
      out.print(cb3.getCategoryname());
      out.write(" </span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    ");
  if (count == 1) {
                                  break;
                              }
                          } 
      out.write("       \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--------------------- featured category ----------->\n");
      out.write("\n");
      out.write("        <div class=\"small_container\">\n");
      out.write("\n");
      out.write("            ");

                // when the product of the fashion is add ed then the categoryof the this is shound be chaged by mobile to fashion
            
      out.write("\n");
      out.write("            <h2 class=\"title\">Fashion  Products</h2>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    ArrayList<ProductsBean> pl = pd.FindallProductByCategory(3);
                    int countproduct = 0;
                    for (ProductsBean pl1 : pl) {
                
      out.write("\n");
      out.write("                <form action=\"CartItemsAdd\" class=\"col_4\">\n");
      out.write("                    <img src=\"Images/");
      out.print(pl1.getImgname());
      out.write("\" alt=\"\" srcset=\"\">\n");
      out.write("                    <h4>");
      out.print(pl1.getProductname());
      out.write("</h4>\n");
      out.write("                    <p><i class=\"fas fa-rupee-sign\"></i>");
      out.print(pl1.getProductprice());
      out.write("</p>\n");
      out.write("                    <input type=\"hidden\" name=\"productid\" value=\"");
      out.print(pl1.getProductid());
      out.write("\">\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"buybtn\" value=\"Add to Cart \">\n");
      out.write("                </form>\n");
      out.write("                ");

                        if (countproduct == 3) {
                            break;
                        }
                        countproduct++;
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2 class=\"title\">Latest Products</h2>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    int outerloop = 1;
                    for (int i = 4; i >= 1; i--) {
                        ArrayList<ProductsBean> alp = pd.FindallProductByCategory(i);

                        if (al.isEmpty()) {
                            continue;
                        } else {
                            int innerloop = 1;
                            for (ProductsBean lstp : alp) {
                                if (innerloop == 2) {

                                    continue;
                                }
                
      out.write("\n");
      out.write("                <form action=\"CartItemsAdd\" class=\"col_4\">\n");
      out.write("                    <img src=\"Images/");
      out.print(lstp.getImgname());
      out.write("\" alt=\"\" srcset=\"\">\n");
      out.write("                    <h4> ");
      out.print(lstp.getProductname());
      out.write("</h4>\n");
      out.write("                    <p><i class=\"fas fa-rupee-sign\"></i>");
      out.print(lstp.getProductprice());
      out.write("</p>\n");
      out.write("                    <input type=\"hidden\" name=\"productid\" value=\"");
      out.print(lstp.getProductid());
      out.write("\">\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"buybtn\" value=\"Add to Cart \">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                                innerloop++;
                            }

                            outerloop++;

                        }

                    }


                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"containerfooter\">\n");
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
      out.write("        <script src=\"customerlogin.js\"></script>\n");
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
