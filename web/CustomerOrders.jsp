<%-- 
    Document   : CustomerOrders
    Created on : May 1, 2023, 10:40:27 PM
    Author     : AR WorkStation
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="com.osp.bean.OrderDetailsBean"%>
<%@page import="com.osp.bean.OrdersBean"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.dao.ProductsDao"%>
<%@page import="com.osp.dao.OrderDetailsDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.dao.OrdersDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Orders </title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        <style>


            #my-orders {

                padding: 80px 20%;
                border-radius: 10px;

            }
            #my-orders h1{
                text-align: left;
                font-size: 25px;
            }
            .ordertable {

                width: 100%;
                margin-top: 20px;
                border-collapse: collapse;
                padding: 10px;
            }

            .ordertable th {
                text-align: center;
                padding: 10px;
                background-color: #363636;
                color: white;

            }

            .ordertable td {

                text-align: center;
                padding:5px 10px;
                background-color: white;
                font-weight: bold;
                border: 1px solid #949393;
            }

            .ordertable td img {
                width: 100px;
                height: 100px;
                margin-right: 10px;
                box-shadow: 0 0 5px 1px rgba(0, 0, 0, 0.2);
            }

            .ordertable tr:nth-child(even) {
                background-color: #f9f9f9;
            }

            a img {
                filter: grayscale(100%);
            }

            a:hover img {
                filter: grayscale(0%);
            }





            .datacnt{
                display: flex;
                flex-wrap: wrap;
                height: 500px;
                overflow-y: auto; 
                padding: 10px
            }

        </style>
    </head>

    <body>
        <%@include file="Customerheader.jsp" %>


        <main>
            <section id="my-orders">
                <div class="datacnt" >
                    <h1> Thank you for Your Order, <%=cbt.getCustomername()%> !</h1>
                    <table class="ordertable" style="margin-top:2px">
                        <thead>
                            <tr>
                                <th> Sno </th>
                                <th> Product</th>
                                <th>Order Date</th>
                                <th>Quantity </th>
                                <th> Price</th>
                                <th>Total Amount</th>


                            </tr>
                        </thead>
                        <tbody style="text-align:center">

                            <%

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

                            %>    



                            <tr>
                                <td><%= count%> </td>
                                <td><img src="Images/<%=pb.getImgname()%>" alt="" srcset=""></td>
                                <td id="date"><%=o.getOrderdate()%></td>
                                <td><%=z.getQuantity()%></td>
                                <td><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=pb.getProductprice()%> </td>
                                <% double price = z.getQuantity() * pb.getProductprice();%>
                                <td><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=price%> </td>

                            </tr>


                            <%
                                    count++;
                                    amount += price;

                                }
                                double tax = (amount * 18) / 100;
                                amount = amount + tax;

                                DecimalFormat df = new DecimalFormat("#.##");
                                String formattedValue = df.format(amount);
                            %>

                            <tr>
                                <td colspan="6" style="font-size: 18px; padding: 10px"> Total Amount <span style="margin-right:20px"><i class="fas fa-rupee-sign" style="margin-right: 2px; margin-left: 20px"></i><%= formattedValue%></span></td>


                            </tr>

                        </tbody>
                    </table>
                </div>
            </section>



        </main>
        <%@include file="CustomerFooter.jsp" %>
        <script src="customerlogin.js"></script>

    </body>
</html>
