<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login/Register</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        <style>
            .form_container .form1 {
                position: absolute;
                top: 150px;
                padding: 10px;
                width: 100%;
                transition: transform 0.5s;
            } 
        </style>
    </head>
    <body>
        <div class="container">
            <div class="navbar">
                <div class="logo"><img src="Images/logo7.png" alt="" >
                </div>




            </div>


        </div>


        <div class="account_page">
            <div class="containerinform">
                <div class="row">
                    <div class="col_2">
                        <img src="Images/logindemo.png" alt="" >
                    </div>
                    <div class="col_2">
                        <div class="form_container">
                            <div class="form_btn">
                                <span onclick="login()" >Login</span>
                                <span onclick="register()" >Register</span>
                                <hr id="indicator" >
                            </div>
                            <form action="UserLoginController" method="post" class="form1" id="loginform"> 
                                <input type="text" placeholder="Username" name="uname" required="">
                                <input type="passwrod" placeholder="Password" name="pass" required="">
                                <button type="Submit" class="btn ">Login</button>

                            </form>
                            <form action="UserRegistrationController" method="post" class="form2" onsubmit="return Validation();" name="f1" id="registerfrom">

                                <input type="text" placeholder="Name" name="name" required="">
                                <input type="email" placeholder="Email" name="email" required="">

                                <input type="number" placeholder="Mobile.NO" name="phone" required minlength="10" maxlength="10">

                                <input type="text" placeholder="Address" name="add" required="">

                                <input type="text" placeholder="Username" name="uname" required="">
                                <input type="passwrod" placeholder="Password" name="pass" required="">
                                <button type="Submit" class="btn ">Register</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="containerfooter">
            <div id="item-4">

                <div class="mincontainer">
                    <div class="usefullinks">
                        <h3>Officail Patners</h3>
                        <a href="">H&M</a>
                        <a href="">Puma</a>
                        <a href="">Samsung</a>
                        <a href="">Uniliver</a>
                    </div>
                    <div class="usefullinks">
                        <h3>UseFul Links</h3>
                        <a href="">About</a>
                        <a href="">contact</a>
                        <a href="">Shop</a>
                        <a href="">Become seller </a>
                    </div>
                    <div class="usefullinks">
                        <h3>Contact</h3>
                        <div class="contacticons ">
                            <a href=""><i class="fab fa-facebook-f"></i></a>
                            <a href=""><i class="fab fa-instagram"></i></i></a>
                            <a href=""><i class="fab fa-twitter"></i></a>
                            <a href=""><i class="fab fa-youtube"></i></a>
                        </div>
                        <div class="address">
                            <p><i class="fas fa-map-marker-alt"></i> Mata madir bhopal 44006</p>
                            <p><i class="fas fa-phone"></i>75489545678</p>
                            <p><i class="fas fa-envelope"></i>onlinestoe@gmail.com</p>
                        </div>
                    </div>
                </div>
                <p class="copyright_text">Copyright &copy; 2023 All Rights Reserved by Online Shopping Store
                </p>
            </div>

        </div>

    </body>


    <script>
        
        function Validation() {

   
    var phone = document.f1.phone.value;


 

    var phoneno = /^\d{10}$/;

    if (phone.match(phoneno))
    {
        return true;
    } else
    {
        alert("Not a valid Phone Number");
        document.f1.phone.value = "";
        document.f1.phone.focus();
        return false;
    }
}

        
        
        
       
        var loginform = document.getElementById("loginform");
        var registerform = document.getElementById("registerfrom");
        var indicator = document.getElementById("indicator");


        function register()
        {
            registerform.style.transform = "translateX(0px)"
            loginform.style.transform = "translateX(0px)"
            indicator.style.transform = "translateX(100px)"
        }
        function login()
        {
            registerform.style.transform = "translateX(400px)"
            loginform.style.transform = "translateX(-400px)"
            indicator.style.transform = "translateX(0px)"

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

</html>