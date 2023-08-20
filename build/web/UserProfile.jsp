<%-- 
    Document   : UserProfile
    Created on : Apr 19, 2023, 2:42:20 PM
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
        <title>Profile</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>
    <body>
        <%@include file="Osuheader.jsp" %>
        <div class="account_page_profile" style="margin-top: 5%">
            <div class="items">
                <h1> Profile</h1>
                <div class="mincontainer">
                    
                    <a href="UserProfileEdit.jsp?cid=<%=cbs.getCustomerid()%>">Edit <i class="fas fa-user-edit"></i></a>
                    <table>
                        <tr class="tablesitems">
                            <td><label for="">Name</label> </td>
                            <td><%=cbs.getCustomername()%></td>
                        </tr>
                        <tr>
                            <td><label for="">Email</label> </td>
                            <td><%=cbs.getEmail()%></td>
                        </tr>
                        <tr>
                            <td><label for="">Mobile</label> </td>
                            <td><%=cbs.getMobile()%></td>
                        </tr>
                        <tr>
                            <td><label for="">Address</label> </td>
                            <td><%=cbs.getAddress()%></td>
                        </tr>
                        <tr>
                            <td><label for="">Username</label> </td>
                            <td><%=cbs.getUsername()%></td>
                        </tr>
                        <tr>
                            <td><label for="">Password</label> </td>
                            <td><input type="password" id="password" value="<%=cbs.getPassword()%>" readonly/>
                                <button id="showHideBtn" onclick="PasswordVisibility()"><i class="fas fa-eye-slash"></i></button>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <%@include file="Osufooter.jsp" %>
        <script>

            function PasswordVisibility() {
                var passwordField = document.getElementById('password');
                var showHideBtn = document.getElementById('showHideBtn');
                if (passwordField.type === 'password') {
                    passwordField.type = 'text';
                    showHideBtn.innerHTML = '<i class="fas fa-eye"></i>';
                } else {
                    passwordField.type = 'password';
                    showHideBtn.innerHTML = '<i class="fas fa-eye-slash"></i>';
                }
            }


           
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
