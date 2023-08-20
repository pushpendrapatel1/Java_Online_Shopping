<%-- 
    Document   : jser
    Created on : May 2, 2023, 11:13:30 AM
    Author     : AR WorkStation
--%>

<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  
    <body>
        <%-- Retrieve the data from the datalist and display it --%>
        <%
            
            ArrayList<String> datalist = (ArrayList<String>) session.getAttribute("datalist");

          
            if(datalist != null) {
             
                int catid = Integer.parseInt(datalist.get(0));
                double srange = Double.parseDouble(datalist.get(1));
                double erange = Double.parseDouble(datalist.get(2));
        %>
        
        <h1>Category ID: <%= catid %></h1>
        <h1>Start Range: <%= srange %></h1>
        <h1>End Range: <%= erange %></h1>
        
        <%-- End if statement for checking if datalist is not null --%>
        <% } %>
    </body>
</html>
