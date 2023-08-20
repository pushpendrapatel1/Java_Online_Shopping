<%-- 
    Document   : CustomerProfile
    Created on : Apr 18, 2023, 12:11:11 AM
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
        <title> Profile</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>

    <body>
        <%@include file="Customerheader.jsp" %>

        <div class="account_page_profile" style="margin-top: 4%">
        
                       
        <div class="items">
            <h1> Profile</h1>
            <div class="mincontainer">
                <a href="CustomerProfileEdit.jsp?cid=<%=cbt.getCustomerid() %>">Edit <i class="fas fa-user-edit"></i></a>
              <table>
                <tr class="tablesitems">
                 
                    
                    <td><label for="">Name</label> </td>
                    <td><%=cbt.getCustomername() %></td>
                </tr>

                <tr>
                    <td><label for="">Email</label> </td>
                    <td><%=cbt.getEmail() %></td>
                </tr>

                <tr>
                    <td><label for="">Mobile</label> </td>
                    <td><%=cbt.getMobile() %></td>
                </tr>

                <tr>
                    <td><label for="">Address</label> </td>
                    <td><%=cbt.getAddress() %></td>
                </tr>

                <tr>
                    <td><label for="">Username</label> </td>
                    <td><%=cbt.getUsername() %></td>
                </tr>

                <tr>
                    <td><label for="">Password</label> </td>
                    <td><input type="password" id="password" value="<%=cbt.getPassword() %>" readonly/>
                         <button id="showHideBtn" onclick="PasswordVisibility()"><i class="fas fa-eye-slash"></i></button>
   
                    </td>
                </tr>


              </table>
              
                       
                  

            </div>
    </div>
    </div>
    <%@include file="CustomerFooter.jsp" %>
        <script src="customerlogin.js"></script>
        
    </body>
</html>
