package com.osp.dao;

import com.osp.bean.CategoryBean;
import com.osp.bean.OrderDetailsBean;
import com.osp.bean.OrdersBean;
import com.osp.bean.ProductsBean;
import com.osp.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdersDao {

    static Connection con;

    // method to add Data
    public int addOrders(OrdersBean ob) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "insert into orders (orderdate,customerid,orderamount,paymentreceived)values('" + ob.getOrderdate() + "','" + ob.getCustomerid() + "','" + ob.getOrderamount() + "','" + ob.getPaymentreceived() + "')";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to update data
    public int updateOrders(OrdersBean ob) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "update orders set orderdate='" + ob.getOrderdate() + "',customerid='" + ob.getCustomerid() + "',orderamount='" + ob.getOrderamount() + "', paymentreceived='" + ob.getPaymentreceived() + "' where orderid='" + ob.getOrderid() + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int getLastOrderID() {
        con = ConnectionPool.connectDB();
        int lastOrderId = 0;
        String sql = "SELECT MAX(orderid) AS lastOrderId FROM orders";
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

    // method to delete data 
    public int deleteOrders(int orderid) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from orders where orderid='" + orderid + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }
     public int deleteOrdersBYcid(int cid) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from orders where customerid='" + cid + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    // method to find all data 
    public ArrayList<OrdersBean> FindallOrders() {
        con = ConnectionPool.connectDB();
        String sql = "select * from orders";
        ArrayList<OrdersBean> al = new ArrayList<OrdersBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrdersBean ob = new OrdersBean();
                ob.setOrderid(rs.getInt("orderid"));
                ob.setOrderdate(rs.getString("orderdate"));
                ob.setCustomerid(rs.getInt("customerid"));
                ob.setOrderamount(rs.getDouble("orderamount"));
                ob.setPaymentreceived(rs.getString("paymentreceived"));
                al.add(ob);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<OrdersBean> FindallOrdersBYCustomers(int userid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from orders where customerid='" + userid + "'";
        ArrayList<OrdersBean> al = new ArrayList<OrdersBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrdersBean ob = new OrdersBean();
                ob.setOrderid(rs.getInt("orderid"));
                ob.setOrderdate(rs.getString("orderdate"));
                ob.setCustomerid(rs.getInt("customerid"));
                ob.setOrderamount(rs.getDouble("orderamount"));
                ob.setPaymentreceived(rs.getString("paymentreceived"));
                al.add(ob);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    // method to find the data by cateogoryid 
    public OrdersBean findOrderid(int orderid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from orders where orderid='" + orderid + "'";
        OrdersBean ob = new OrdersBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ob.setOrderid(rs.getInt("orderid"));
                ob.setOrderdate(rs.getString("orderdate"));
                ob.setCustomerid(rs.getInt("customerid"));
                ob.setOrderamount(rs.getDouble("orderamount"));
                ob.setPaymentreceived(rs.getString("paymentreceived"));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ob;
    }

    public ArrayList<OrdersBean> FindAllCashBookDatewise(String sdate, String edate) {
        con = ConnectionPool.connectDB();
        String sql = "select  * from orders  where orderdate between '" + sdate + "' and '" + edate + "' ";
        ArrayList<OrdersBean> al = new ArrayList<OrdersBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrdersBean ob = new OrdersBean();
                ob.setOrderid(rs.getInt("orderid"));
                ob.setOrderdate(rs.getString("orderdate"));
                ob.setCustomerid(rs.getInt("customerid"));
                ob.setOrderamount(rs.getDouble("orderamount"));
                ob.setPaymentreceived(rs.getString("paymentreceived"));
                al.add(ob);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<OrdersBean> FindAllOrdersBYCustomer(String sdate, String edate, int cid) {
        con = ConnectionPool.connectDB();
        String sql = "select  * from orders  where orderdate between '" + sdate + "' and '" + edate + "' and customerid='" + cid + "' ";
        ArrayList<OrdersBean> al = new ArrayList<OrdersBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OrdersBean ob = new OrdersBean();
                ob.setOrderid(rs.getInt("orderid"));
                ob.setOrderdate(rs.getString("orderdate"));
                ob.setCustomerid(rs.getInt("customerid"));
                ob.setOrderamount(rs.getDouble("orderamount"));
                ob.setPaymentreceived(rs.getString("paymentreceived"));
                al.add(ob);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public static void main(String[] args) {
        OrdersBean ob = new OrdersBean();
        ob.setCustomerid(1);
        ob.setOrderdate("2021-02-03");
        ob.setOrderamount(25000);
        ob.setPaymentreceived("NO");
//        OrdersDao od = new OrdersDao();
//      int p=od.addOrders(ob);
//
////        System.out.println((p > 0) ? "Sucess " : "NO");
//        ArrayList<OrdersBean> al=od.FindallOrdersBYCustomers(7);
//        for (OrdersBean o : al) {
//
//            System.out.print(o.getOrderid());
//            System.out.print("\t" + o.getCustomerid());
//            System.out.print("\t" + o.getOrderdate());
//            System.out.print("\t" + o.getOrderamount());
//            System.out.print("\t" + o.getPaymentreceived());
//            System.out.println("");
//
//        }
//        
//        

//        
//        OrdersDao od = new OrdersDao();
//        ArrayList<OrdersBean> al = od.FindallOrders();
//        OrderDetailsDao k = new OrderDetailsDao();
//        int ic=0;
//        for (int i = 0; i < al.size(); i++) {
//            OrdersBean o = al.get(i);
//          int x=k.getlastdid();
//                OrderDetailsBean z = k.findbyOrderid(i);
//                if (x < o.getOrderid()) {
//
//                    OrderDetailsBean s = new OrderDetailsBean();
//                    s.setOrderid(o.getOrderid());
//                    s.setProductid(1);
//                    s.setQuantity(2);
//                    k.addDetails(s);
//                  
//                    System.out.println("Data Addeed");
//                    continue;
//                                 } else {
//                    System.out.println("Data not added id matched Added");
//                }
//                   ic++;
//
//            
//        }
//        OrdersDao od = new OrdersDao();
//        ArrayList<OrdersBean> al = od.FindallOrdersBYCustomers(7);
//// ArrayList<OrdersBean> al = od.FindAllOrdersBYCustomer("2002-02-02", "2024-02-02",5);
////        int catid = 7;
//        
//        OrderDetailsDao k = new OrderDetailsDao();
//        ProductsDao pd = new ProductsDao();
//        CategoryDao cd = new CategoryDao();
//        int count = 1;
//        double amount = 0;
//        for (OrdersBean o : al) {
//
////            OrderDetailsBean z = k.findbyOrderid(o.getOrderid());
//        //    OrderDetailsBean z = k.findbyProductid(11);
//            ArrayList<OrderDetailsBean> al2=k.FindallDetails();
//            for(OrderDetailsBean z:al2){
//            ProductsBean pb = pd.findbyProductid(z.getProductid());
//              if(catid==pb.getCategoryid()){
//            System.out.print("Count " + count);
//            System.out.print("\t Date " + o.getOrderdate());
//
//            System.out.print("\t Product name" + pb.getProductname());
//            CategoryBean cb = cd.findbyCategoryid(pb.getCategoryid());
//
//            System.out.print("\t Category name" + cb.getCategoryname());
//            System.out.print("\t Quantity" + z.getQuantity());
//            System.out.print("\t Price" + pb.getProductprice());
//            double price=z.getQuantity()*pb.getProductprice();
//            System.out.println("\t Subtotal \t" + price);
//            count++;
//            amount += price;
//         
//        }
//            }
//            break;
//        }
//       
//        System.out.println("-------------- Total   -------------");
//        System.out.println("  " + amount);
    
    
    
    
    OrdersDao od = new OrdersDao();
        ArrayList<OrdersBean> al = od.FindallOrdersBYCustomers(7);

        OrderDetailsDao k = new OrderDetailsDao();
        ProductsDao pd = new ProductsDao();
        CategoryDao cd = new CategoryDao();
        int count = 1;
        double amount = 0;
        for (OrdersBean o : al) {

//            OrderDetailsBean z = k.findbyOrderid(o.getOrderid());
        //    OrderDetailsBean z = k.findbyProductid(11);
           OrderDetailsBean al2=k.findbyOrderid(o.getOrderid());
            
            ProductsBean pb = pd.findbyProductid(al2.getProductid());
             
            System.out.print("Count " + count);
            System.out.print("\t Date " + o.getOrderdate());

            System.out.print("\t Product name" + pb.getProductname());
            CategoryBean cb = cd.findbyCategoryid(pb.getCategoryid());

            System.out.print("\t Category name" + cb.getCategoryname());
            System.out.print("\t Quantity" + al2.getQuantity());
            System.out.print("\t Price" + pb.getProductprice());
            double price=al2.getQuantity()*pb.getProductprice();
            System.out.println("\t Subtotal \t" + price);
            count++;
            amount += price;
         
        
            }
        
       

       
    
    
    
    }

}
