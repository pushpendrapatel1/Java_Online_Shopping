<%-- 
    Document   : Customerheader
    Created on : Apr 15, 2023, 12:14:21 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.dao.CustomersDao"%>
<%@page import="com.osp.bean.CustomersBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">

        <style>
            .etcdata {
                margin-right: 30px;
                margin-top: 1.5%;

            }
            li a{
                margin-right: 10px;
            }
        </style>
    </head>

    <body>
         
      
        <div class="container">
            <div class="navbar">
                <div class="logo"><img src="Images/logo7.png" alt="" srcset="">
                </div>
                <nav>

                 
                    
  <%
        int customerid=0;
            if (session.getAttribute("customerid") == null) {
                response.sendRedirect("CustomerLoginRegister.jsp");

            }
            else{
               customerid=(Integer) session.getAttribute("customerid");
                         
            }

        %>

                    <%
                        CustomersDao cdt = new CustomersDao();
                        CustomersBean cbt = cdt.findbyCustomerid(customerid);
                    %>
                    <h4 id="customername">Welcome &nbsp; <%=cbt.getCustomername()%></h4>
                    <ul id="MenuItems">


                        <li><a href="Customerhome.jsp">Home</a></li>
                        <li><a href="CustomerProductView.jsp">Products</a></li>
                        <li><a href="CustomerAboutUsPage.jsp">About</a></li>
                        <li><a href="CustomerProfile.jsp">Profile</a></li>
                        <li><a href="CustomerOrders.jsp">Orders</a></li>
                        <li><a href="CustomerLoginRegister.jsp">Logout</a></li>

                    </ul>
                </nav>
                <a href="CustomerCart.jsp" class="etcdata"><i class="fas fa-shopping-bag"></i></a>
                <span class="menu_icon" onclick="menutoggle()"> <i class="fas fa-bars"></i></span>
            </div>
        </div>    
        <script>
            var message = '<%= request.getAttribute("customerName")%>';
            if (message != null) {
                var msgbox = document.getElementById('customername');
            }
        </script>
    </body>
</html>