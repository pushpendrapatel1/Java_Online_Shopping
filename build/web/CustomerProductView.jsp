<%-- 
    Document   : CustomerProductView
    Created on : Apr 17, 2023, 9:58:19 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.dao.ProductsDao"%>
<%@page import="com.osp.bean.ProductsBean"%>
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
        <title>Products</title>
        <link rel="stylesheet" href="StyleCustomerALL.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    </head>

    <body>
        <%@include file="Customerheader.jsp" %>
      
            
         <div class="small_container">
        <div class="row row_2">
            <h2>All Product</h2>
            <form action="CategoryWiseProducts.jsp" class="categoryselector">
            <select name="catid" id="">
                <option value="74578">All Products</option>
                               
                            <%
                                CategoryBean cb = new CategoryBean();

                                CategoryDao cd = new CategoryDao();
                                ArrayList<CategoryBean> al = cd.FindallCategory();
                              
                                for (CategoryBean a : al) {

                                    
                            %> 
                                    <option value="<%=a.getCategoryid() %>"><%=a.getCategoryname() %></option>
                                 <%}%>  
               
            </select>
            <input type="submit" value="Show Product">
            </form>
        </div>
        <div class="row">
          <%
               ProductsBean pb = new ProductsBean();
       
        ProductsDao pd = new ProductsDao();
        ArrayList<ProductsBean> x=pd.FindallProduct();
        int count =0;
           for(ProductsBean p:x){
         %>
            <form action="CartItemsAdd" class="col_4">
                <img src="Images/<%=p.getImgname() %>" alt="" srcset="">
                <h4> <%=p.getProductname() %></h4>
                <p><i class="fas fa-rupee-sign"></i><%=p.getProductprice() %></p>
                <input type="hidden" name="productid" value="<%=p.getProductid()%>">
              
               <input type="submit" class="buybtn" value="Add to Cart ">
               
            </form>
           
           <% count++;  if(count>=40){break;}   }%>
           
           
            
        </div>


</div>


        <%@include file="CustomerFooter.jsp" %>
      
        <script>
             var message = '<%= request.getAttribute("productaddmessage")%>';
            if(message!='null'){
           alert("Product Added Sucessfully");
            }
            
            
            
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
        </script>
    </body>
</html>

