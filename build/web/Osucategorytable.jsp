<%-- 
    Document   : Osucategorytable
    Created on : Apr 14, 2023, 7:10:36 PM
    Author     : AR WorkStation
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Category Details</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>
    <body>
        <%@include file="Osuheader.jsp" %>
        <div class="small_container">
            <div class="row_2">
                <h2>Master </h2>

                <div action="" class="categoryselector">
                    <a href="Osucategorytable.jsp">Category</a>
                    <a href="OsuProducttable.jsp">Products</a>
                    <a href="OsuCustomersTable.jsp">Customer</a>


                </div>
            </div>
            <div class="row">

                <h2>Category Details</h2>
                <div class="min_row">
                    <a href="Osuaddcategory.jsp"  style="color: blue ; font-size: 19px"><i class="fa fa-plus" aria-hidden="true"></i> Add Category</a>
                    <span id="msgbox" style="color: green; font-size: 18px " ></span>
                </div>
 <div class="tablemincnt">
                <table class="table1">
                    <thead>
                        <tr>
                            <th>Sno </th>

                            <th>Category Name</th>
                            <th>Category Details</th>

                            <th>Edit </th>
                            <th>Delete </th>
                        </tr>
                    </thead>

                    <%

                        CategoryBean cb = new CategoryBean();

                        CategoryDao cd = new CategoryDao();
                        ArrayList<CategoryBean> al = cd.FindallCategory();
                        int count = 1;
                        for (CategoryBean a : al) {

                    %>


                    <tbody>
                        <tr>
                            <td><%=count%></td>
                            <td><%=a.getCategoryname()%></td>
                            <td><%=a.getCategorydetails()%></td>
                            <td><a href="Osucategoryupdate.jsp?cid=<%=a.getCategoryid()%>"><i class="fas fa-edit"></i></a></td>
                            <td><a href="CategoryDeleteController?cid=<%=a.getCategoryid()%>" id="deleteicon" onclick="return confirm('Are you sure you want to delete this category?');"><i class="fas fa-trash"></i></a></td>

                        </tr>

                        <% count++;
                               } %>


                    </tbody>
                </table>
 </div>
            </div>
        </div>


    </div>

    <%@include file="Osufooter.jsp" %>

    <script>
        <% if (request.getAttribute("message") != null) {%>
        let msg = document.getElementById("msgbox");
        msg.innerHTML = "<%= request.getAttribute("message")%>";
        setTimeout(() => {
            msg.remove();
        }, 3000);
        <% }%>
    </script>
</body>
</html>
