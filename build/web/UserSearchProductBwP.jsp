<%-- 
    Document   : UserSearchProductBwP
    Created on : Apr 18, 2023, 8:50:59 PM
    Author     : AR WorkStation
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Products</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>
    <body>
        <%@include file="Osuheader.jsp" %>
        <div class="small_container_search">
            <div class="row_3">
                <h2> Search </h2>
                <div action="" class="categoryselector">
                    <a href="UsersearchcatTable.jsp">Cateogory Wise</a>
                    <a href="UserSearchProductBwP.jsp">Products B/W Range</a>
                    <a href="OsuSearchCustomers.jsp">Customer Balance</a>
                </div>
            </div>
            <div class="rowsearch" style="margin-top: 10%">
                <h2>Products Search</h2>
                <div class="formcntsearch " style="margin-top: 5%   ">
                    <form action="UserSearchProductBWRTable.jsp">
                        <label for="">Category</label>
                        <select name="catid" id="">
                            <%
                                CategoryDao cd = new CategoryDao();
                                ArrayList<CategoryBean> al = cd.FindallCategory();
                                for (CategoryBean c : al) {
                            %>
                            <option value="<%=c.getCategoryid()%>"><%=c.getCategoryname()%></option>
                            <%}%>  
                        </select> 
                        <label for="">Price Range</label>
                        <input type="number" name="srange" style="text-align: center" required>
                        <label for="">To</label>
                        <input type="number" name="erange" style="text-align: center" required="">
                        <input type="submit" value="Show Products">
                    </form>
                </div>          
            </div>
        </div>
        <%@include file="Osufooter.jsp" %>
        <script>
        var message = '<%= request.getAttribute("productmessage")%>';
        var msgbox = document.getElementById('msgbox');
        msgbox.innerHTML = message;
        setTimeout(function () {
            msgbox.innerHTML = '';
        }, 3000);
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

