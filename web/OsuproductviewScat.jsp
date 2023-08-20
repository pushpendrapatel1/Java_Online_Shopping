<%-- 
    Document   : OsuproductviewScat
    Created on : Apr 29, 2023, 11:36:14 PM
    Author     : AR WorkStation
--%>


<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="com.osp.dao.ProductsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<title>Products View</title>
<link rel="stylesheet" href="StyleOsuproductview2.css">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">


</head>

<style>
    .row_3{
        box-shadow: 0 0 20px 2px rgba(0, 0, 0, 0.1);
        padding: 25px;
        margin-top: 10px;
    }
</style>


<body>

    <div class="container">
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









    <div class="small_container">
        <div class="row_3">
            <h2>Search </h2>

            <div action="" class="categoryselector">

                <a href="UsersearchcatTable.jsp">Cateogory Wise</a>
                <a href="UserSearchProductBWRTable.jsp">Products B/W Range</a>
                <a href="OsuSearchCustomers.jsp">Customer Balance</a>
            </div>
        </div>
        <div class="row">
              <%
                            int pid = Integer.parseInt(request.getParameter("pid"));
                            ProductsDao pd = new ProductsDao();
                            ProductsBean p = pd.findbyProductid(pid);
                            session.setAttribute("categoryid", p.getCategoryid());
                        %>


            <div class="background">
                <div class="mincontanierview">
                    <a href="UsersearchcatTable.jsp"><i class="fas fa-long-arrow-alt-left"></i></a>

                    <div class="product-view">
                      
                        <div class="product-image-container">
                            <img class="product-image" src="Images/<%=p.getImgname()%>" alt="Product Image">
                        </div>
                        <div class="product-details">
                            <h1 class="product-title"><%=p.getProductname()%></h1>

                            <%
                                int cid = p.getCategoryid();
                                CategoryDao cd = new CategoryDao();
                                CategoryBean cb = cd.findbyCategoryid(cid);
                            %>
                            <p class="product-category"> Category <%=cb.getCategoryname()%></p>
                            <p class="product-price"><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=p.getProductprice()%></p>
                            <p class="product-stock">In Stock: <%=p.getStockinhand()%></p>

                        </div>
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