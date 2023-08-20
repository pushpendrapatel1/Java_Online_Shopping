<%-- 
    Document   : OsuProductupdate
    Created on : Apr 14, 2023, 8:52:22 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="com.osp.dao.ProductsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Products Update</title>
        <link rel="stylesheet" href="StyleOsuProductUpdate2.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>

    <body>

        <div class=" container3">
            <div class="navbar">
                <div class="logo"><img src="Images/logo7.png" alt="" srcset="">
                </div>
                <nav>
                     <%
                        int customerid = 0;
                        if (session.getAttribute("useridlogin") == null) {
                            response.sendRedirect("CustomerLoginRegister.jsp");

                        } else {
                            customerid = (Integer) session.getAttribute("useridlogin");

                        }

                        CustomersDao cds = new CustomersDao();
                        CustomersBean cbs = cds.findbyCustomerid(customerid);
                    %>
                    <h4>Welcome  &nbsp; <%=cbs.getCustomername() %></h4>
                  
                    <ul id="MenuItems">

                        <li><a href="OsuProducttable.jsp">Master</a></li>
                        <li><a href="UsersearchcatTable.jsp">Search</a></li>
                        <li><a href="OsuReportCategory.jsp">Report</a></li>
                        <li><a href="UserProfile.jsp">Profile</a></li>
                        <li><a href="OSUREGISTRATION.jsp">Logout</a></li>

                    </ul>
                </nav>
                <a href=""><i class="fas fa-shopping-bag"></i></a>
                <span class="menu_icon" onclick="menutoggle()"> <i class="fas fa-bars"></i></span>




            </div>


        </div>


        <div class="account_page">
            <div class="container">
                <div class="row">
                    <div class="col_2">
                        <img src="Images/logindemo.png" alt="" srcset="">
                    </div>
                    <div class="col_2">
                        <div class="form_container">
                            <div class="form_btn">
                                <span >Update Product</span>


                            </div>

                            <form action="ProductUpdateController" method="post" enctype="multipart/form-data"  >


                                <table class="addproducttable">
                                    <%
                                        int pid = Integer.parseInt(request.getParameter("pid"));
                                        ProductsDao pd = new ProductsDao();
                                        ProductsBean p = pd.findbyProductid(pid);


                                    %>

                                    <tr>

                                        <td ><input type="hidden" name="pid" value="<%=p.getProductid()%>"></td>
                                    </tr>

                                    <tr>
                                        <td>Product Name</td>
                                        <td><input type="text" name="pname" value="<%=p.getProductname()%>" required></td>
                                    </tr>
                                    <tr>
                                        <td>Category</td>
                                        <td><select  name="cat" required>
                                                <%
                                                    int cid = p.getCategoryid();
                                                    CategoryDao cd = new CategoryDao();
                                                    ArrayList<CategoryBean> al = cd.FindallCategory();
                                                    for (CategoryBean c : al) {
                                                %>
                                                <option value="<%=c.getCategoryid()%>"><%=c.getCategoryname()%></option>
                                                <%}%>  
                                            </select></td>
                                    </tr>
                                    <tr>
                                        <td>Product Price</td>
                                        <td><input type="text" name="price" value="<%=p.getProductprice()%>" required></td>
                                    </tr>
                                    <tr>
                                        <td>Stock </td>
                                        <td><input type="text" name="stock" value="<%=p.getStockinhand()%>" required></td>
                                    </tr>
                                    <tr>

                                        <td ><input type="hidden" name="imgname" value="<%=p.getImgname()%>"></td>

                                    </tr>
                                    <tr>
                                        <td>Image</td>
                                        <td id="imgcntlocal">
                                            <img src="Images/<%=p.getImgname()%>" alt="" srcset="">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td><input type="file" name="imgfile" required="" ></td>
                                    </tr>


                                </table>
                                <div class="buttons">


                                    <button type="Submit" class="addbtn">Update</button>
                                    <button type="reset" class="clearbtn">Clear</button>
                                </div>

                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Footer of the page  -->

        <div class="containerfooter">
            <div id="item-4">

                <div class="mincontainer">
                    <div class="usefullinks">
                        <h3>Officail Patners</h3>
                        <a href="">H&M</a>
                        <a href="">Puma</a>
                        <a href="">Samsung</a>
                        <a href="">Uniliver</a>
                    </div>
                    <div class="usefullinks">
                        <h3>UseFul Links</h3>
                        <a href="">About</a>
                        <a href="">contact</a>
                        <a href="">Shop</a>
                        <a href="">Become seller </a>
                    </div>
                    <div class="usefullinks">
                        <h3>Contact</h3>
                        <div class="contacticons ">
                            <a href=""><i class="fab fa-facebook-f"></i></a>
                            <a href=""><i class="fab fa-instagram"></i></i></a>
                            <a href=""><i class="fab fa-twitter"></i></a>
                            <a href=""><i class="fab fa-youtube"></i></a>
                        </div>
                        <div class="address">

                            <p><i class="fas fa-map-marker-alt"></i> Mata madir bhopal 44006</p>
                            <p><i class="fas fa-phone"></i>75489545678</p>
                            <p><i class="fas fa-envelope"></i>onlinestoe@gmail.com</p>
                        </div>
                    </div>
                </div>

                <p class="copyright_text">Copyright &copy; 2023 All Rights Reserved by Online Shopping Store
                </p>
            </div>

        </div>

    </body>





    <script>
        let MenuItems = document.getElementById("MenuItems");
        MenuItems.style.maxHeight = "0px";

        function menutoggle() {
            if (MenuItems.style.maxHeight == "0px") {
                MenuItems.style.maxHeight = "200px";
            } else {
                MenuItems.style.maxHeight = "0px";
            }
        }




    </script>

</html>