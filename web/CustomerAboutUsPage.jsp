<%-- 
    Document   : CustomerAboutUsPage
    Created on : May 1, 2023, 2:38:28 AM
    Author     : AR WorkStation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title> About US</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
   
        <style>
            * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            font-family: poppins;
        }

        #about-section {
            width: 100%;
            height: auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 80px 12%;
        }

        .about_left img {
            width:450px;
            height: 450px;
            margin-right: 60px;
            border-radius: 10px;
         
        }

        .about-right {
            width: 54%;
        }

        .about-right ul li {
            display: flex;
            align-items: center;
        }

        .about-right h1 {
            color: #e74d06;
            font-size: 37px;
            margin-bottom: 5px;
        }

        .about-right p {
            color: #444;
            line-height: 26px;
            font-size: 17px;
        }

        .about-right .address {
            margin: 25px 0;
        }

        .about-right .address ul li {
            margin-bottom: 5px;
        }

        .address .address-logo {
            margin-right: 15px;
            color: #e74d06;

        }

        .address .saprater {
            margin: 0 35px;
        }

        .expertise{
            display: flex;
            flex-direction: column;
        }
        .expertisemin{
            margin-top: 2%;
            display: flex;
            flex-direction: row;
            justify-content: space-around;
            align-items: center;
            height: 100px;
           
            overflow: hidden;
        }

.expertise img{
height: auto;
width: 100px;
}
     
        .menu_icon {
            display: none;
        }

        @media only screen and (max-width: 768px) {
        #about-section {
            flex-direction: column;
            padding: 80px 5%;
        }
        .about_left img {
            width: 100%;
            height: auto;
            margin-right: 0;
            margin-bottom: 30px;
        }
        .about-right {
            width: 100%;
        }
        .about-right h1 {
            font-size: 30px;
        }
        .about-right p {
            font-size: 15px;
            line-height: 20px;
        }
        .expertisemin {
            margin-top: 5%;
            height: auto;
            flex-wrap: wrap;
        }
        .expertise img {
            margin-bottom: 10px;
        }
        .menu_icon {
            display: block;
            position: absolute;
            top: 20px;
            right: 20px;
            cursor: pointer;
        }
        .navbar {
            position: relative;
        }
        nav {
            display: none;
            position: absolute;
            top: 80px;
            right: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
        }
        nav h4 {
            font-size: 

20px;
padding: 10px;
margin: 0;
        }
    }
        </style>
    </head>

    <body>
        <%@include file="Customerheader.jsp" %>
        
        
        <section id="about-section">
        <!-- about left  -->
        <div class="about_left">
            <img src="Images/AbMain.jpg" alt="About Img" />
        </div>
        <!-- about right  -->
        <div class="about-right">

            <h1>About Us</h1>
            <p>Our passion for delighting customers drives us to constantly invent on their behalf. Working backward
                from customer needs, we’re constantly seeking to improve our services, add benefits and features, and
                invent new products. With this in mind, over the years 
             exclusive Onlineshopping products.
            </p>
            <div class="address">
                <ul>
                    <li>
                        <span class="address-logo">
                           <i class="fas fa-paper-plane"></i>
                        </span>
                        <p>Address</p>
                        <span class="saprater">:</span>
                        <p>Mata Mandir, Bhopal, India</p>
                    </li>
                    <li>
                        <span class="address-logo">
                           <i class="fas fa-phone"></i>
                        </span>
                        <p>Phone No</p>
                        <span class="saprater">:</span>
                        <p>+91 987-654-4321</p>
                    </li>
                    <li>
                        <span class="address-logo">
                            <i class="far fa-envelope"></i>
                        </span>
                        <p>Email ID</p>
                        <span class="saprater">:</span>
                        <p>onlineshopping@gmail.com</p>
                    </li>
                </ul>
            </div>
            <div class="expertise">
                <div>
                <h3>Partners </h3>
                </div>
                <div class="expertisemin">
             
            
              <div><img src="Images/Ablogo3.png" alt="" srcset=""></div>
            
              <div><img src="Images/Ablogo1.png" alt="" srcset=""></div>
              <div><img src="Images/Ablogo2.png" alt="" srcset=""></div>
              <div><img src="Images/Ablogo4.png" alt="" srcset=""></div>
          </div>
            </div>
        </div>
    </section>
   <%@include file="CustomerFooter.jsp" %>
        <script src="customerlogin.js"></script>

    </body>
</html>
