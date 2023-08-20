<%-- 
    Document   : Invoice
    Created on : Apr 25, 2023, 11:49:53 AM
    Author     : AR WorkStation
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page import="com.osp.dao.ProductsDao"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Invoice</title>
        <link rel="stylesheet" href="Styleinvoice.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>

    <body>

        <div class="main-content">
            <div class="invoice-container">
                <div class="top">
                    <div class="top-left">
                        <img src="Images/logo7.png" alt="">
                    </div>
                    <div class="top-right">
                        <h1 class="main">Invoice</h1>
                        <span class="code" id="random-number"></span>
                        <div class="date" id="date_show"> 25 Dec 2015</div>

                    </div>
                </div>
                <div class="bill-box">
                    <div class="left">
                        <div class="text-m">Bill from: </div>
                        <div class="title">Online Shop</div>
                        <div class="addr">724858945</div>
                        <div class="addr"> Mata madir bhopal 44006</div>
                    </div>
                    <div class="right">
                        
                         <% if (session.getAttribute("customerid") == "null") {
                            response.sendRedirect("CustomerLoginRegister.jsp");
                        }
                        int customerid = (Integer) session.getAttribute("customerid");
                        CustomersDao cdt = new CustomersDao();
                        CustomersBean cbt = cdt.findbyCustomerid(customerid);
                    %>
                    
                        
                        <div class="text-m">Bill TO:</div>
                        <div class="title"> <%=cbt.getCustomername() %></div>
                        <div class="addr"><%=cbt.getEmail() %></div>
                        <div class="addr"><%=cbt.getMobile() %></div>
                        <div class="addr"> <%=cbt.getAddress() %> </div>
                    </div>
                </div>

                <%
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
                %>


                <div class="table-bill">
                    <table class="table-service">
                        <thead>

                        <th>Name</th>
                        <th >Quantity</th>
                        <th>Price </th>
                        <th class="cost">Cost</th>
                        </thead>
                        <tbody>
                            <%
                                double subtotal = 0;
                                int index = 0;
                                int count = 1;
                                for (Map.Entry<Integer, Integer> entry : productQuantities.entrySet()) {
                                    int productId = entry.getKey();
                                    int quantity = entry.getValue();
                                    ProductsDao pd = new ProductsDao();
                                    ProductsBean pb = pd.findbyProductid(productId);
                            %>
                            <tr>
                                <td class="name"> <%=pb.getProductname()%> </td>
                                <td><%= quantity%></td>
                                <td> <%=pb.getProductprice()%></td>
                                <td class="cost"><%=(quantity * pb.getProductprice())%> </td>
                            </tr>
                            <%
                                    subtotal += quantity * pb.getProductprice();
                                    index++;
                                }
                            %>
                        </tbody>
                        <tfoot>
                            <tr class="total total1">
                                <td colspan="2"> </td>
                                <td>SubTotal</td>
                                <td class="number"><%=subtotal%></td>
                            </tr>
                            <tr class="total">
                                <td colspan="2"> </td>
                                <td>Tax(18%)</td>
                                <td class="number"><%=((subtotal * 18) / 100)%></td>
                            </tr>
                            <tr class="finalprice">
                                <td colspan="2"> </td>
                                <td>Total</td>
                                <%
                                double amount=((subtotal * 18) / 100) + subtotal;
                                  DecimalFormat df = new DecimalFormat("#.##");
                                String formattedValue = df.format(amount);
                                %>
                                <td class="number"><i class="fas fa-rupee-sign"></i><%=formattedValue %></td>
                            </tr>
                        </tfoot>
                    </table>
                </div>
                <div class="actions">
                    <button class="btn btn-main " onclick="window.print()"><a href=""> Print</a></button>

                     
                    
                    <form id="dateForm" action="OrderController" method="POST" >
                         <input type="hidden" id="dateInput" name="date">
                        <input type="hidden"  name="customerid" value="<%=cbt.getCustomerid() %>">
                        <button type="button" onclick="getcurrentdate()" class="btn btn-main"><span> Pay Now</span></button>
                    </form>
                </div>
                <div class="note">
                    <p>Thank You &#10084; for Shopping with us!</p>
                    <p> OnlineShopping.com</p>
                </div>
            </div>
        </div>
        <script>
            
            
            let date = new Date();
            let day = date.getDate();
            let month = date.getMonth() + 1;
            let year = date.getFullYear();
            let formattedDate = day + ' ' + getMonthName(month) + ' ' + year;
            document.getElementById('date_show').innerHTML = formattedDate;

            function getMonthName(month) {
                let monthNames = [
                    "Jan", "Feb", "Mar",
                    "Apr", "May", "Jun", "Jul",
                    "Aug", "Sep", "Oct",
                    "Nov", "Dec"
                ];
                return monthNames[month - 1];
            }

            //=============================
            let randomNumberElement = document.getElementById("random-number");

            let randomNumber = Math.floor(Math.random() * 900000) + 100000; // generates a random six-digit number

            randomNumberElement.innerText = "#" + randomNumber;
            
            // function to psss the date into servlet 
              function  getcurrentdate(){
               var currdate=new Date();
             
             var   DateString= currdate.toISOString().slice(0,10);
            
             document.getElementById("dateInput").value=DateString;
             document.getElementById("dateForm").submit();
           
           }
            
        </script>
    </body>

</html>
