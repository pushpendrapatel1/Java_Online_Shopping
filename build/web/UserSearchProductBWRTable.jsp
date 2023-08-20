<%-- 
    Document   : UserSearchProductBWRTable
    Created on : Apr 18, 2023, 9:05:47 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="com.osp.dao.ProductsDao"%>
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
        <title>Search Product</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>
    <style>
        .textform{
            text-align: center;
        }
    </style>
    <body>
        <%@include file="Osuheader.jsp" %>

        <div class="small_container_search">
            <div class="row_3">
                <h2>Search </h2>

                <div action="" class="categoryselector">

                    <a href="UsersearchcatTable.jsp">Category Wise</a>
                    <a href="UserSearchProductBwP.jsp">Products B/W Range</a>
                    <a href="OsuSearchCustomers.jsp">Customer Balance</a>
                </div>
            </div>
            <div class="rowsearch" style="margin-top:10%">
                <h2>Products Search</h2>
                <div class="formcntsearch formcnt2" style="margin-top:2%">
                    <form action="UserSearchProductBWRTable" method="post">
                        <label for="">Category</label>
                        <select name="catid" id="">
                            <%                                CategoryDao cd = new CategoryDao();
                                ArrayList<CategoryBean> al = cd.FindallCategory();
                                for (CategoryBean c : al) {
                            %>
                            <option value="<%=c.getCategoryid()%>"><%=c.getCategoryname()%></option>
                            <%}%>  
                        </select> 
                        <label for="">Price Range</label>
                        <input type="number" name="srange" class="textform" required>
                        <label for="">To</label>
                        <input type="number" name="erange" class="textform" required="">
                        <input type="submit" value="Show Products">
                    </form>
                </div>
                <div class="min_row">
                    <span  id="msgbox" style="color: green"></span>
                </div>
                <div class="tablemincnt">
                    <table class="table1">
                        <thead>
                            <tr>
                                <th>Sno </th>
                                <th>ProductName</th>
                                <th>Category Name</th>
                                <th>Price</th>
                                <th>View </th>
                                <th>Edit </th>
                                <th>Delete </th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
//      

                                int count = 1;
                                int catid = 0;
                                double srange = 0;
                                double erange = 0;
                                ArrayList<String> datalist = (ArrayList<String>) session.getAttribute("datalist");

                                if (datalist != null) {

                                     catid = Integer.parseInt(datalist.get(0));
                                    srange = Double.parseDouble(datalist.get(1));
                                     erange = Double.parseDouble(datalist.get(2));
                                }

                                else {
                                    catid = 0;
                                    srange = 0;
                                    erange = 0;
                                }
//                                }
                                ProductsDao pd = new ProductsDao();
                                ArrayList<ProductsBean> x = pd.FindallProductByRange(catid, srange, erange);
                                for (ProductsBean pb : x) {

                                    int cid = pb.getCategoryid();
                                    CategoryBean cb = cd.findbyCategoryid(cid);
                            %>
                            <tr>
                                <td><%=count%></td>
                                <td><%=pb.getProductname()%></td>
                                <td><%=cb.getCategoryname()%></td>
                                <td><i class="fas fa-rupee-sign" style="margin-right:2px"></i><%=pb.getProductprice()%></td>
                                <td><a href="OsuproductviewSearch.jsp?pid=<%=pb.getProductid()%>"><i class="fas fa-eye"></i></a> </td>
                                <td><a href="OsuProductupdateSearch.jsp?pid=<%=pb.getProductid()%>"><i class="fas fa-edit"></i></a></td>
                                <td><a href="ProductDeleteControllerSearch?pid=<%=pb.getProductid()%>" id="deleteicon" onclick="return confirm('Are you sure you want to delete this category?');"><i class="fas fa-trash"></i></a></td>
                            </tr>
                            <% count++;
                                }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%@include file="Osufooter.jsp" %>


        <script>
            var message = '<%= session.getAttribute("productmessage")%>';
            if (message != 'null') {
                var msgbox = document.getElementById('msgbox');
                msgbox.innerHTML = message;
                setTimeout(function () {
                    msgbox.innerHTML = '';
                }, 3000);
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

            var deleteIcon = document.getElementById('deleteicon');


            deleteIcon.addEventListener('click', function (event) {

                var confirmation = confirm('Are you sure you want to delete?');



            });

        </script>
    </body>
</html>


