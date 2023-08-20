<%-- 
    Document   : UserProfileEdit
    Created on : Apr 19, 2023, 2:56:05 PM
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
        <title>Profile edit</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>
    <body>
        <%@include file="Osuheader.jsp" %>
        
        <div class="account_page_profile" style="margin-top: 5%">

              <%
                  int cid=Integer.parseInt(request.getParameter("cid"));
                    CustomersDao cd=new CustomersDao();
                    CustomersBean cb=cd.findbyCustomerid(cid);
                    %>
            <div class="items">
                <h1> Update</h1>
                <div class="mincontainer_update ">
                    <form action="UserProfileUpdateController" >
                    <table>
                        <tr>
                            <input type="hidden" name="cid" value="<%=cb.getCustomerid()%>" required>
                        </tr>
                        <tr class="tablesitemsupdate">
                            <td><label for="">Name</label> </td>
                            <td><input type="text" name="name" value="<%=cb.getCustomername() %>" required></td>
                        </tr>

                        <tr>
                            <td><label for="">Email</label> </td>
                            <td><input type="email" name="email" value="<%=cb.getEmail() %>" required></td>
                        </tr>

                        <tr>
                            <td><label for="">Mobile</label> </td>
                            <td><input type="number" name="phone" minlength="10" maxlength="10" value="<%=cb.getMobile() %>" required></td>
                        </tr>

                        <tr>
                            <td><label for="">Address</label> </td>
                            <td><input type="text" name="add" value="<%=cb.getAddress() %>" required></td>
                        </tr>

                        <tr>
                            <td><label for="">Username</label> </td>
                            <td><input type="text" name="uname" value="<%=cb.getUsername() %>" required></td>
                        </tr>

                        <tr>
                            <td><label for="">Password</label> </td>
                            <td><input type="password" name="pass" value="<%=cb.getPassword() %>" required>

                            </td>
                        </tr>
                        <tr id="updatebtns">
                            <td colspan="2"><button type="submit">Update</button></td>

                        </tr>
                    </table>
                    </form>
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

        