package com.osp.dao;

import com.osp.bean.OrderDetailsBean;
import static com.osp.dao.OrdersDao.con;
import com.osp.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDetailsDao {

    static Connection con;

    // method to add Data
    public int addDetails(OrderDetailsBean ob) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "insert into orderdetails (orderid,productid,quantity)values('" + ob.getOrderid() + "','" + ob.getProductid() + "','" + ob.getQuantity() + "')";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to update data
    public int updateDetails(OrderDetailsBean ob) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "update orderdetails set orderid='" + ob.getOrderid() + "',productid='" + ob.getProductid() + "',quantity='" + ob.getQuantity() + "' where did='" + ob.getDid() + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to delete data 
    public int deleteDetails(int did) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from orderdetails where did='" + did + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }
    
    public int deleteDetailsBYcid(int oid) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from orderdetails where orderid='" + oid + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    // method to find all data 
    public ArrayList<OrderDetailsBean> FindallDetails() {
        con = ConnectionPool.connectDB();
        String sql = "select * from orderdetails ";
        ArrayList<OrderDetailsBean> al = new ArrayList<OrderDetailsBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrderDetailsBean ob = new OrderDetailsBean();
                ob.setDid(rs.getInt("did"));
                ob.setOrderid(rs.getInt("orderid"));
                ob.setProductid(rs.getInt("productid"));
                ob.setQuantity(rs.getInt("quantity"));
                al.add(ob);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<OrderDetailsBean> FindallDetailsBYproductid(int pid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from orderdetails where productid='"+pid+"';";
        ArrayList<OrderDetailsBean> al = new ArrayList<OrderDetailsBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrderDetailsBean ob = new OrderDetailsBean();
                ob.setDid(rs.getInt("did"));
                ob.setOrderid(rs.getInt("orderid"));
                ob.setProductid(rs.getInt("productid"));
                ob.setQuantity(rs.getInt("quantity"));
                al.add(ob);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    // method to find the data by Did 
    public OrderDetailsBean findbyDid(int did) {
        con = ConnectionPool.connectDB();
        String sql = "select * from orderdetails where did='" + did + "'";
        OrderDetailsBean ob = new OrderDetailsBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                ob.setDid(rs.getInt("did"));
                ob.setOrderid(rs.getInt("orderid"));
                ob.setProductid(rs.getInt("productid"));
                ob.setQuantity(rs.getInt("quantity"));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob;
    }
    
     public OrderDetailsBean findbyProductid(int pid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from orderdetails where productid='" + pid + "'";
        OrderDetailsBean ob = new OrderDetailsBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                ob.setDid(rs.getInt("did"));
                ob.setOrderid(rs.getInt("orderid"));
                ob.setProductid(rs.getInt("productid"));
                ob.setQuantity(rs.getInt("quantity"));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob;
    }
    
    
    public OrderDetailsBean findbyOrderid(int orderid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from orderdetails where orderid='" + orderid + "'";
        OrderDetailsBean ob = new OrderDetailsBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                ob.setDid(rs.getInt("did"));
                ob.setOrderid(rs.getInt("orderid"));
                ob.setProductid(rs.getInt("productid"));
                ob.setQuantity(rs.getInt("quantity"));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob;
    }

    
    public int getlastdid() {
        con = ConnectionPool.connectDB();
        int lastOrderId = 0;
        String sql = "SELECT MAX(orderid) AS lastOrderId FROM orderdetails";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                lastOrderId = rs.getInt("lastOrderId");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastOrderId;
    }

    public static void main(String[] args) {
        OrderDetailsBean ob = new OrderDetailsBean();
        OrderDetailsDao od = new OrderDetailsDao();
        ob.setOrderid(1);
        ob.setProductid(3);
        ob.setQuantity(3);
     //   ob.setDid(3);
      int x = od.getlastdid();
        System.out.println((x>0)? "Sucess"+x : "Failed" );


//       OrderDetailsBean a = od.findbyOrderid(4);
//       if(a.getOrderid()==0){
//           System.out.println("Thers is no value");
//       }
//       else{
//           System.out.println("Thers is value");
//       }

//        ArrayList<OrderDetailsBean> x=od.FindallDetails();
//        System.out.print("" + a.getDid());
//        System.out.print("\t" + a.getOrderid());
//        System.out.print("\t" + a.getProductid());
//        System.out.print("\t" + a.getQuantity());
//        System.out.println("");




    }
}
