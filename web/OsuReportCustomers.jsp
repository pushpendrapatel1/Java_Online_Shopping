<%-- 
    Document   : OsuReportCustomers
    Created on : Apr 28, 2023, 9:58:25 PM
    Author     : AR WorkStation
--%>

<%@page import="com.osp.bean.CategoryBean"%>
<%@page import="com.osp.bean.ProductsBean"%>
<%@page import="com.osp.bean.OrderDetailsBean"%>
<%@page import="com.osp.dao.ProductsDao"%>
<%@page import="com.osp.dao.CategoryDao"%>
<%@page import="com.osp.dao.OrderDetailsDao"%>
<%@page import="com.osp.bean.OrdersBean"%>
<%@page import="com.osp.dao.OrdersDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.osp.bean.CustomersBean"%>
<%@page import="com.osp.dao.CustomersDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Customers Report</title>
        <link rel="stylesheet" href="StyleOsuProductheader3.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        <style>
            .tabledatacs{
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <%@include file="Osuheader.jsp" %>




        <div class="small_container_search">
            <div class="row_3">
                <h2>Report </h2>

                <div action="" class="categoryselector">

                    <a href="OsuReportDaily.jsp"> Daily/Monthly Sales</a>
                    <a href="OsuReportCategory.jsp">Category Wise Sales</a>
                    <a href="OsuReportProducts.jsp">Products Wise Sales</a>
                    <a href="OsuReportCustomers.jsp">Customer Wise Sales</a>
                </div>
            </div>


            <div class="rowsearch" style="margin-top: 5%"   >
                <h2>Products Sales Report</h2>
                <div class="formcntsearch formcnt2" style="margin-top: 2%" >
                    <form action="" class="reportdata reportdata2" method="post" >
                        <div class="categoryformcnt">
                            <label for="">Customers</label>
                            <select name="catid" required="" >

                                <%                                    CustomersDao cdt = new CustomersDao();
                                    ArrayList<CustomersBean> x = cdt.FindallCustomers();
                                    for (CustomersBean c : x) {
                                %>
                                <option value="<%=c.getCustomerid()%>"><%=c.getCustomername()%></option>
                                <% }%>
                            </select>
                        </div>
                        <div>
                            <label for=""> Date From</label>
                            <input type="date" name="sdate" required="">
                            <label for="">To</label>
                            <input type="date" name="edate" required="">
                            <input type="submit" value="Show Report" >
                        </div>
                    </form>
                </div>


                <div class="tablemincnt">
                    <table class="table1">
                        <thead>
                            <tr>
                                <th>Sno </th>
                                <th>Date </th>
                                <th>ProductName</th>
                                <th>Category Name</th>
                                <th> Qty Sold</th>
                                <th>Price</th>
                                <th>Sub Total</th>

                            </tr>
                        </thead>
                        <tbody>
                            <%
                                //  int catid =Integer.parseInt( request.getParameter("cid"));

                                int catid = 0;
//                                
                                String id = request.getParameter("catid");
                                if (id != null && !id.isEmpty()) {
                                    catid = Integer.parseInt(id);
                                } else {
                                    catid = 0;
                                }
                                String sdate = request.getParameter("sdate");
                                String edate = request.getParameter("edate");

                                OrdersDao od = new OrdersDao();
                                ArrayList<OrdersBean> al = od.FindAllOrdersBYCustomer(sdate, edate, catid);
                                OrderDetailsDao k = new OrderDetailsDao();
                                ProductsDao pd = new ProductsDao();
                                CategoryDao cd = new CategoryDao();
                                int count = 1;
                                double amount = 0;
                                for (OrdersBean o : al) {

                                    OrderDetailsBean z = k.findbyOrderid(o.getOrderid());

                                    ProductsBean pb = pd.findbyProductid(z.getProductid());

                                    CategoryBean cb = cd.findbyCategoryid(pb.getCategoryid());


                            %>    


                            <tr>

                                <td class="tabledatacs"><%=count%></td>
                                <td class="tabledatacs"><%=o.getOrderdate()%></td>
                                <td class="tabledatacs"><%=pb.getProductname()%></td>
                                <td class="tabledatacs"><%=cb.getCategoryname()%></td>
                                <td class="tabledatacs"><%=z.getQuantity()%></td>
                                <td class="tabledatacs"><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=pb.getProductprice()%></td>
                                <td class="tabledatacs"><i class="fas fa-rupee-sign" style="margin-right: 2px"></i><%=o.getOrderamount()%></td>


                            </tr>


                            <%
                                    count++;
                                    amount += o.getOrderamount();
                                }
                            %>    



                        </tbody>

                        <tfoot>
                            <tr >
                                <td colspan="7">Total Sold <span ><i class="fas fa-rupee-sign" style="margin-right: 2px ; margin-left: 20px"></i><%=amount%></span></td>
                            </tr>
                        </tfoot>
                    </table>
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



