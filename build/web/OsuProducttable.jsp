

<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.bean.CategoryBean"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.dao.ProductsDao"%>
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
        <div class="small_container">
            <div class="row_2">
                <h2>Master</h2>
                <div  class="categoryselector">
                    <a href="Osucategorytable.jsp">Category</a>
                    <a href="OsuProducttable.jsp">Products</a>
                    <a href="OsuCustomersTable.jsp">Customer</a>
                </div>
            </div>
            <div class="row">
                <h2>Products Details</h2>
                <div class="min_row">
                    <a href="Osuaddproduct.jsp" style="color: blue ; font-size: 19px"><i class="fa fa-plus" aria-hidden="true"></i> Add Product</a>
                   
                    <span  id="msgbox" style="color: green; font-size: 18px "></span>
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
                                int count = 1;
                                ProductsDao pd = new ProductsDao();
                                ArrayList<ProductsBean> x = pd.FindallProduct();
                                for (ProductsBean pb : x) {

                                    int cid = pb.getCategoryid();
                                    CategoryDao cd = new CategoryDao();
                                    CategoryBean cb = cd.findbyCategoryid(cid);
                            %>
                            <tr>
                                <td><%=count%></td>
                                <td><%=pb.getProductname()%></td>
                                <td><%=cb.getCategoryname()%></td>
                                <td><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=pb.getProductprice()%></td>
                                <td><a href="Osuproductview.jsp?pid=<%=pb.getProductid()%>"><i class="fas fa-eye"></i></a> </td>
                                <td><a href="OsuProductupdate.jsp?pid=<%=pb.getProductid()%>"><i class="fas fa-edit"></i></a></td>
                                <td><a href="ProductDeleteController?pid=<%=pb.getProductid()%>" id="deleteicon" onclick="return confirm('Are you sure you want to delete this category?');"><i class="fas fa-trash"></i></a></td>
                            </tr>

                            <% count++;
                           }%>
                      
                           
                                                                              
                    </tbody>
                </table> 
                </div>
            </div>                                                             
        </div>
    </div>
    <%@include file="Osufooter.jsp" %>
    <script>    
        
        
         <% if (request.getAttribute("productmessage") != null) {%>
        let msg = document.getElementById("msgbox");
        msg.innerHTML = "<%= request.getAttribute("productmessage")%>";
        setTimeout(() => {
            msg.remove();
        }, 3000);
        <% }%>
        
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
