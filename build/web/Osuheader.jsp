<%-- 
    Document   : Osuheader
    Created on : Apr 14, 2023, 6:53:06 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Products</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">

    </head>

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

                <span class="menu_icon" onclick="menutoggle()"> <i class="fas fa-bars"></i></span>
            </div>
        </div>





