<%-- 
    Document   : OsuSearchCustomers
    Created on : Apr 28, 2023, 9:48:38 PM
    Author     : AR WorkStation
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="com.osp.bean.OrdersBean"%>
<%@page import="com.osp.dao.OrdersDao"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Customers Balance</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">

    </head>
    <style>
        .tabledata{
            padding: 10px;
            font-size: 17px;
        }
    </style>
    <body>
        <%@include file="Osuheader.jsp" %>





        <div class="small_container_search">
            <div class="row_3">
                <h2>Search </h2>

                <div action="" class="categoryselector">
                    <a href="UsersearchcatTable.jsp">Cateogory Wise</a>
                    <a href="UserSearchProductBWRTable.jsp">Products B/W Range</a>
                    <a href="OsuSearchCustomers.jsp">Customer Balance</a>

                </div>
            </div>

            <div class="rowsearch" style="margin-top :8%">
                <h2>Customer Balance</h2>



                <div class="tablemincnt">
                    <table class="table1">
                        <thead>
                            <tr>
                                <th>Sno </th>
                                <th>Name</th>
                                <th> Email</th>
                                <th>Phone</th>
                                <th>Total Business </th>


                            </tr>
                        </thead>
                        <tbody>

                            <%
                                CustomersDao cd = new CustomersDao();
                                OrdersDao od = new OrdersDao();
                                OrdersBean ob = new OrdersBean();
                                ArrayList<CustomersBean> x = cd.FindallCustomers();
                                int count = 1;
                                for (CustomersBean a : x) {
                                    double amount = 0;
                                    ArrayList<OrdersBean> y = od.FindallOrdersBYCustomers(a.getCustomerid());
                                    for (OrdersBean b : y) {
                                        amount += b.getOrderamount();
                                    }
                                    if (amount > 0) {
                            %>
                            <tr>
                                <td class="tabledata"><%= count%></td>
                                <td class="tabledata"><%= a.getCustomername()%></td>
                                <td class="tabledata"><%=a.getEmail()%></td>
                                <td class="tabledata" ><%=a.getMobile()%></td>
                                <td class="tabledata"  ><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=amount%></td>
                            </tr>
                            <%
                                        count++;
                                        continue;
                                    }
                                }
                            %>







                        </tbody>
                    </table>
                </div>
            </div>
        </div>






        <%@include file="Osufooter.jsp" %>


        <script>
            var message = '<%= request.getAttribute("productmessage")%>';
            var msgbox = document.getElementById('msgbox');
            msgbox.innerHTML = message;
            setTimeout(function () {
                msgbox.innerHTML = '';
            }, 3000);

            let MenuItems = document.getElementById("MenuItems");
            MenuItems.style.maxHeight = "0px";

            function menutoggle() {
                if (MenuItems.style.maxHeight == "0px") {
                    MenuItems.style.maxHeight = "200px";
                } else {
                    MenuItems.style.maxHeight = "0px";
                }
            }

            var deleteIcon = document.getElementById('deleteicon');


            deleteIcon.addEventListener('click', function (event) {

                var confirmation = confirm('Are you sure you want to delete?');



            });
        </script>
    </body>
</html>
