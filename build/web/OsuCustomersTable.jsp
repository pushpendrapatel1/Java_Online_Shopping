<%-- 
    Document   : OsuCustomersTable
    Created on : Apr 28, 2023, 11:55:22 AM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <html>
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Customers Data</title>
            <link rel="stylesheet" href="StyleOsuProductheader3.css">
            <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        </head>
        <body>
            <%@include file="Osuheader.jsp" %>
            <div class="small_container">
                <div class="row_2">
                    <h2>Master</h2>
                    <div  class="categoryselector">
                        <a href="Osucategorytable.jsp">Category</a>
                        <a href="OsuProducttable.jsp">Products</a>
                        <a href="OsuCustomersTable.jsp">Customer</a>
                    </div>
                </div>
                <div class="row">
                    <h2>Customers Details</h2>
                    <div class="min_row">
                        <span  id="msgbox" style="color: green ; font-size: 18px"></span>
                    </div>
                    <div class="tablemincnt">
                        <table class="table1">


                            <thead>
                                <tr>
                                    <th>Sno </th>
                                    <th>Name</th>
                                    <th> Email</th>
                                    <th>Phone</th>
                                    <th>Address </th>

                                    <th>Delete </th>
                                </tr>
                            </thead>
                            <tbody>

                                <%
                                    CustomersDao cd = new CustomersDao();
                                    ArrayList<CustomersBean> x = cd.FindallCustomers();
                                    int count = 1;
                                    for (CustomersBean a : x) {
                                %>
                                <tr>
                                    <td><%=count%></td>
                                    <td><%=a.getCustomername()%></td>
                                    <td><%=a.getEmail()%></td>
                                    <td><%=a.getMobile()%></td>
                                    <td><%=a.getAddress()%></td>

                                    <td><a href="CustomerDeleteController?cid=<%=a.getCustomerid()%>" id="deleteicon"  onclick="return confirm('Are you sure you want to delete this Customer?');"><i class="fas fa-trash"></i></a></td>
                                </tr>

                                <% count++;
                                    }%>




                            </tbody>
                        </table>
                    </div>
                </div>                                                             
            </div>
        </div>
        <%@include file="Osufooter.jsp" %>
        <script>
            
             <% if (request.getAttribute("customermessage") != null) {%>
        let msg = document.getElementById("msgbox");
        msg.innerHTML = "<%= request.getAttribute("customermessage")%>";
        setTimeout(() => {
            msg.remove();
        }, 3000);
        <% }%>
            
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
    </body>
</html>

</body>
</html>
