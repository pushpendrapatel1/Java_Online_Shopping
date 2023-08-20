package com.osp.dao;

import com.osp.bean.CustomersBean;
import com.osp.bean.OrdersBean;
import com.osp.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomersDao {

    static Connection con;

    // method to add Data
    public int addCustomer(CustomersBean cb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "insert into customers (customername,address,type,mobile,email,username,password)values('" + cb.getCustomername() + "','" + cb.getAddress() + "','" + cb.getType() + "','" + cb.getMobile() + "','" + cb.getEmail() + "','" + cb.getUsername() + "','" + cb.getPassword() + "')";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to update data
    public int updatecustomers(CustomersBean cb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "update customers set  customername='" + cb.getCustomername() + "',address='" + cb.getAddress() + "',type='" + cb.getType() + "',mobile='" + cb.getMobile() + "',email='" + cb.getEmail() + "',username='" + cb.getUsername() + "',password='" + cb.getPassword() + "' where customerid='" + cb.getCustomerid() + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to delete data 
    public int deleteCustomer(int customerid) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from customers where  customerid='" + customerid + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    // method to find all data 
    public ArrayList<CustomersBean> FindallCategory() {
        con = ConnectionPool.connectDB();
        String sql = "select * from customers";
        ArrayList<CustomersBean> al = new ArrayList<CustomersBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CustomersBean cb = new CustomersBean();
                cb.setCustomerid(rs.getInt("customerid"));
                cb.setCustomername(rs.getString("customername"));
                cb.setAddress(rs.getString("address"));
                cb.setType(rs.getString("type"));
                cb.setMobile(rs.getString("mobile"));
                cb.setEmail(rs.getString("email"));
                cb.setUsername(rs.getString("username"));
                cb.setPassword(rs.getString("password"));
                al.add(cb);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    // method to find all data 
    public ArrayList<CustomersBean> FindallCustomers() {
        con = ConnectionPool.connectDB();
        String sql = "select * from customers where type = '" + "customer" + "' ";
        ArrayList<CustomersBean> al = new ArrayList<CustomersBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CustomersBean cb = new CustomersBean();
                cb.setCustomerid(rs.getInt("customerid"));
                cb.setCustomername(rs.getString("customername"));
                cb.setAddress(rs.getString("address"));
                cb.setType(rs.getString("type"));
                cb.setMobile(rs.getString("mobile"));
                cb.setEmail(rs.getString("email"));
                cb.setUsername(rs.getString("username"));
                cb.setPassword(rs.getString("password"));
                al.add(cb);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    // method to login 
    public int loginCustomer(String username, String password) {
        int x = 0;
        con = ConnectionPool.connectDB();
        String sql = "Select * from customers where username='" + username + "'and password='" + password + "' and type='Customer' ";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                x = rs.getInt("customerid");
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return x;
    }

    public int loginUsers(String username, String password) {
        int x = 0;
        con = ConnectionPool.connectDB();
        String sql = "Select * from customers where username='" + username + "'and password='" + password + "' and type='User' ";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                x = rs.getInt("customerid");
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return x;
    }

    // method to find the data by username and password
    public CustomersBean Authenticateusers(String username, String password) {
        con = ConnectionPool.connectDB();
        String sql = " select * from customers where type='User' and  username='" + username + "' and password='" + password + "'";
        CustomersBean cb = new CustomersBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cb.setCustomerid(rs.getInt("customerid"));
                cb.setCustomername(rs.getString("customername"));
                cb.setAddress(rs.getString("address"));
                cb.setType(rs.getString("type"));
                cb.setMobile(rs.getString("mobile"));
                cb.setEmail(rs.getString("email"));
                cb.setUsername(rs.getString("username"));
                cb.setPassword(rs.getString("password"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cb;
    }

    // method to find the data by username and password
    public CustomersBean AuthenticateCustomer(String username, String password) {
        con = ConnectionPool.connectDB();
        String sql = " select * from customers where type='Customer' and  username='" + username + "' and password='" + password + "'";
        CustomersBean cb = new CustomersBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cb.setCustomerid(rs.getInt("customerid"));
                cb.setCustomername(rs.getString("customername"));
                cb.setAddress(rs.getString("address"));
                cb.setType(rs.getString("type"));
                cb.setMobile(rs.getString("mobile"));
                cb.setEmail(rs.getString("email"));
                cb.setUsername(rs.getString("username"));
                cb.setPassword(rs.getString("password"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cb;
    }

    // method to find the data by cateogoryid 
    public CustomersBean findbyCustomerid(int customerid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from customers where customerid='" + customerid + "'";
        CustomersBean cb = new CustomersBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                cb.setCustomerid(rs.getInt("customerid"));
                cb.setCustomername(rs.getString("customername"));
                cb.setAddress(rs.getString("address"));
                cb.setType(rs.getString("type"));
                cb.setMobile(rs.getString("mobile"));
                cb.setEmail(rs.getString("email"));
                cb.setUsername(rs.getString("username"));
                cb.setPassword(rs.getString("password"));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cb;
    }

    public static void main(String[] args) {

        CustomersDao cd = new CustomersDao();
        CustomersBean cb = new CustomersBean();
        cb.setCustomername("Kiran");
        cb.setAddress("india");
        cb.setType("User");
        cb.setMobile("4578459545");
        cb.setEmail("vivek@gmail.com");
        cb.setUsername("vivek123");
        cb.setPassword("123");
        cb.setCustomerid(2);
        // 
        CustomersBean x = cd.Authenticateusers("push123", "1234");
        String username = "Push123";
        String password = "1234";
        
        int y = cd.loginCustomer(username, password);
        int z = cd.loginUsers(username, password);
       if(y>0 ){
           System.out.println("This is the customerid");
       }
        
        else if(z>0){
            System.out.println("Userid is runned");
        }
        System.out.println("name " + x.getCustomername());
//    int x=cd.addCustomer(cb);
//      if(x>0){
//          System.out.println(""+x);
//          System.out.println("Sucess");
//          
//      }
//      else{
//          System.out.println("Failedd");
//      }

//        OrdersDao od = new OrdersDao();
//        OrdersBean ob = new OrdersBean();
//        ArrayList<CustomersBean> x = cd.FindallCustomers();
//        int count=1;
//        for (CustomersBean a : x) {
//            double  amount= 0;
//            
//             int c2=0;
//            ArrayList<OrdersBean> y = od.FindallOrdersBYCustomers(a.getCustomerid());
//         
//            for (OrdersBean b : y ) {
//                 
//               amount +=b.getOrderamount();
//               
//               // System.out.println("Inner orders loop");
//            }
//            
//            if(amount >0){
//            System.out.println("Name :"+a.getCustomername());
//            System.out.println("Totsl Businned"+amount);
//                System.out.println("Counting  "+count);
//             count++;
//                continue;
//              
//            }
//            
//        
//        }
    }

}
