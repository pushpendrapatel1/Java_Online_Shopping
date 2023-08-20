<%-- 
    Document   : Customerhome
    Created on : Apr 15, 2023, 12:37:45 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.dao.ProductsDao"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>

    <body>
        <%@include file="Customerheaderhome.jsp" %>

        <!--------------------- featured category ----------->

        <div class="categories">
            <div class="small_container">
                <%
                    CategoryBean cb = new CategoryBean();
                    CategoryDao cd = new CategoryDao();
                %>


                <div class="row">

                    <%
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
                    %>
                    <div class="col_3">
                        <a href="CategoryWiseProducts.jsp?catid=<%=cb1.getCategoryid() %>">
                            <img src="Images/<%=p.getImgname()%>" alt="">
                            <div class="image-overlay">
                                <span class="overlay-text"><%=cb1.getCategoryname()%></span>
                            </div>
                        </a>
                    </div>
                    <%  if (count == 1) {
                                break;
                            }
                        } %>


                    <%

                        ArrayList<ProductsBean> al2 = pd.FindallProductByCategory(2);

                        for (ProductsBean p1 : al2) {
                            CategoryBean cb2 = cd.findbyCategoryid(p1.getCategoryid());
                    %>


                    <div class="col_3">
                        <a href="CategoryWiseProducts.jsp?catid=<%=cb2.getCategoryid() %>">
                            <img src="Images/<%=p1.getImgname()%>" alt="">
                            <div class="image-overlay">
                                <span class="overlay-text"><%=cb2.getCategoryname()%> </span>
                            </div>
                        </a>
                    </div>
                    <%  if (count == 1) {
                                  break;
                              }
                          } %>       

                    <%

                        ArrayList<ProductsBean> al3 = pd.FindallProductByCategory(10);

                        for (ProductsBean p2 : al3) {
                            CategoryBean cb3 = cd.findbyCategoryid(p2.getCategoryid());
                    %>


                    <div class="col_3">
                          <a href="CategoryWiseProducts.jsp?catid=<%=cb3.getCategoryid()%>">
                            <img src="Images/<%=p2.getImgname()%>" alt="">
                            <div class="image-overlay">
                                <span class="overlay-text"><%=cb3.getCategoryname()%> </span>
                            </div>
                        </a>
                    </div>
                    <%  if (count == 1) {
                                  break;
                              }
                          } %>       

                </div>



            </div>
        </div>
        <!--  -->





        <!--------------------- featured category ----------->

        <div class="small_container">

            <%
                // when the product of the fashion is add ed then the categoryof the this is shound be chaged by mobile to fashion
            %>
            <h2 class="title">Fashion  Products</h2>
            <div class="row">

                <%
                    ArrayList<ProductsBean> pl = pd.FindallProductByCategory(3);
                    int countproduct = 0;
                    for (ProductsBean pl1 : pl) {
                %>
                <form action="CartItemsAddBYhome" class="col_4">
                    <img src="Images/<%=pl1.getImgname()%>" alt="" srcset="">
                    <h4><%=pl1.getProductname()%></h4>
                    <p><i class="fas fa-rupee-sign"></i><%=pl1.getProductprice()%></p>
                    <input type="hidden" name="productid" value="<%=pl1.getProductid()%>">

                    <input type="submit" class="buybtn" value="Add to Cart ">
                </form>
                <%
                        if (countproduct == 3) {
                            break;
                        }
                        countproduct++;
                    }
                %>


            </div>



            <h2 class="title">Latest Products</h2>
            <div class="row">

                <%
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
                %>
                <form action="CartItemsAddBYhome" class="col_4">
                    <img src="Images/<%=lstp.getImgname()%>" alt="" srcset="">
                    <h4> <%=lstp.getProductname()%></h4>
                    <p><i class="fas fa-rupee-sign"></i><%=lstp.getProductprice()%></p>
                    <input type="hidden" name="productid" value="<%=lstp.getProductid()%>">

                    <input type="submit" class="buybtn" value="Add to Cart ">
                </form>


                <%
                                innerloop++;
                            }

                            outerloop++;

                        }

                    }


                %>





            </div>
        </div>


        <%@include file="CustomerFooter.jsp" %>
        <script src="customerlogin.js"></script>
    </body>
</html>
