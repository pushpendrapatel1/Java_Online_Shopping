/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


let MenuItems = document.getElementById("MenuItems");
    MenuItems.style.maxHeight = "0px";

    function menutoggle() {
        if (MenuItems.style.maxHeight == "0px") {
            MenuItems.style.maxHeight = "200px";
        }
        else {
            MenuItems.style.maxHeight = "0px";
        }
    }



    var loginform=document.getElementById("loginform");
    var registerform=document.getElementById("registerfrom");
    var indicator=document.getElementById("indicator");

    
    function register()
    {
        registerform.style.transform="translateX(0px)"
        loginform.style.transform="translateX(0px)"
        indicator.style.transform="translateX(100px)"
    }
    function login()
    {
        registerform.style.transform="translateX(400px)"
        loginform.style.transform="translateX(-400px)"
        indicator.style.transform="translateX(0px)"
       
    }
    
      var message = '<%= request.getAttribute("customerName") %>';
                           if(message !=null){
   
     registerform.style.transform="translateX(400px)"
        loginform.style.transform="translateX(-400px)"
        indicator.style.transform="translateX(0px)"
                           }
    
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