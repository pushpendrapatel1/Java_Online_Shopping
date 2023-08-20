<%-- 
    Document   : CustomerLoginRegister
    Created on : Apr 15, 2023, 12:32:43 PM
    Author     : AR WorkStation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
       
    </head>
    <body>
        <div class="container2">
        <div class="navbar">
            <div class="logo"><img src="Images/logo7.png" alt="" srcset="">
            </div>
            <nav>
               
              <ul id="MenuItems">
                  
                </ul>
            </nav>
            <span class="menu_icon" onclick="menutoggle()"> <i class="fas fa-bars"></i></span>
        </div>
    </div>    
       <script>
                           var message = '<%= request.getAttribute("customerName") %>';
                           if(message !=null){
    var msgbox = document.getElementById('customername');
                           }
    </script>
        <div class="account_page">
            <div class="containerinform">
                <div class="row">
                    <div class="col_2">
                        <img src="Images/logindemo.png" alt="" srcset="">
                    </div>
                    <div class="col_2">
                        <div class="form_container">
                            <div class="form_btn">
                                <span  onclick="login()" >Login</span>
                                <span onclick="register()" >Register</span>
                                <hr id="indicator" >
                            </div>
                            <form action="CustomerLoginController" method="post" class="form1" id="loginform"> 
                                <input type="text" placeholder="Username" name="uname">
                                <input type="password" placeholder="Password" name="pass">
                                <button type="Submit" class="btn ">Login</button>
                               
                            </form>
                            <form action="CustomerRegisterController" method="post" class="form2"  id="registerfrom">

                                <input type="text" placeholder="Name" name="name" required="">
                                <input type="email" placeholder="Email" name="email" required="">

                                <input type="number" placeholder="Mobile.NO" name="phone" required minlength="10" maxlength="10">

                                <input type="text" placeholder="Address" name="add" required="">

                                <input type="text" placeholder="Username" name="uname" required="">
                                <input type="passwrod" placeholder="Password" name="pass" required="">
                                <button type="submit" class="btn ">Register</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="CustomerFooter.jsp" %>
        <script src="customerlogin.js"></script>
          </body>
</html>
