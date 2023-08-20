<%-- 
    Document   : CustomerCart
    Created on : Apr 18, 2023, 12:52:21 AM
    Author     : AR WorkStation
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.osp.dao.ProductsDao"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>My Cart </title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>

    <body>
        <%@include file="Customerheader.jsp" %>

        <div class="small_container cartpage">
            <div class="mycartcnt">
                <table>
                    <tr class="tableheading">
                        <th>Product</th>
                        <th>Quantity</th>
                        <th>Subtotal</th>
                    </tr>


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
    double subtotal = 0;
    int index = 0;
    for (Map.Entry<Integer, Integer> entry : productQuantities.entrySet()) {
        int productId = entry.getKey();
        int quantity = entry.getValue();
        ProductsDao pd = new ProductsDao();
        ProductsBean pb = pd.findbyProductid(productId);
%>
<tr>
    <td>
        <div class="cartinfo">
            <img src="Images/<%=pb.getImgname()%>" alt="">
            <form action="CartItemsAdd" method="post"> 
                <div class="cartiteminfo">
                    <p><%=pb.getProductname()%></p>
                    <input type="hidden" name="deleteIndex" value="<%=pb.getProductid() %>">
                    <small><i class="fas fa-rupee-sign"></i><%=pb.getProductprice()%></small>
                    <button type="submit" class="removeitemc"><i class="fas fa-times"></i></button>
                </div>
            </form>
        </div>
    </td>
    <td><%=quantity%> </td>
    <td><i class="fas fa-rupee-sign"></i><%=(quantity * pb.getProductprice())%></td>
</tr>
<%
        subtotal += quantity * pb.getProductprice();
        index++;
    }
%>

                </table>
                <div class="totalprice">
                    <table>
                        <tr>
                            <td>Subtotal</td>
                            <td><i class="fas fa-rupee-sign"></i><%=subtotal%></td>

                        </tr>
                        <tr>
                            <td>Tax</td>
                            <td><i class="fas fa-rupee-sign"></i><%=((subtotal * 18) / 100)%></td>

                        </tr>
                        <tr>
                            <td>Total</td>
                            
                            <%
                                    double amount=((subtotal * 18) / 100) + subtotal;
                                  DecimalFormat df = new DecimalFormat("#.##");
                                String formattedValue = df.format(amount);
                                %>
                            <td><i class="fas fa-rupee-sign"></i><%=formattedValue %></td>

                        </tr>
                    </table>
                </div>
                            <a href="Invoice.jsp?customerid=<%=cbt.getCustomerid() %>" id="buybtn_2">Buy Now</a>
            </div>

        </div>



        <%@include file="CustomerFooter.jsp" %>
        <script src="customerlogin.js"></script>

    </body>
</html>
