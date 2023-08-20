package com.osp.dao;

import com.osp.bean.CategoryBean;
import com.osp.bean.ProductsBean;
import com.osp.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductsDao {

    static Connection con;

    // method to add Data
    public int addProduct(ProductsBean pb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "insert into products (categoryid,productname,productprice,stockinhand,imgname) values('" + pb.getCategoryid() + "','" + pb.getProductname() + "','" + pb.getProductprice() + "','" + pb.getStockinhand() + "','" + pb.getImgname() + "')";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to update data
    public int updateProducts(ProductsBean pb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "update products set categoryid='" + pb.getCategoryid() + "',productname='" + pb.getProductname() + "',productprice='" + pb.getProductprice() + "',stockinhand='" + pb.getStockinhand() + "',imgname='" + pb.getImgname() + "' where productid='" + pb.getProductid() + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public int updateProductStock(ProductsBean pb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "update products set stockinhand= '" + pb.getStockinhand() +"' where productid='" + pb.getProductid() + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to delete data 
    public int deleteProduct(int productid) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from products where productid='" + productid + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    // method to find all data 
    public ArrayList<ProductsBean> FindallProduct() {
        con = ConnectionPool.connectDB();
        String sql = "select * from products ";
        ArrayList<ProductsBean> al = new ArrayList<ProductsBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductsBean pb = new ProductsBean();
                pb.setProductid(rs.getInt("productid"));
                pb.setCategoryid(rs.getInt("categoryid"));
                pb.setProductname(rs.getString("productname"));
                pb.setProductprice(rs.getDouble("productprice"));
                pb.setStockinhand(rs.getInt("stockinhand"));
                pb.setImgname(rs.getString("imgname"));
                al.add(pb);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
  
    // method to find all the products by category id
    public ArrayList<ProductsBean> FindallProductByCategory(int catid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from products where categoryid ='" + catid + "' ";
        ArrayList<ProductsBean> al = new ArrayList<ProductsBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductsBean pb = new ProductsBean();
                pb.setProductid(rs.getInt("productid"));
                pb.setCategoryid(rs.getInt("categoryid"));
                pb.setProductname(rs.getString("productname"));
                pb.setProductprice(rs.getDouble("productprice"));
                pb.setStockinhand(rs.getInt("stockinhand"));
                pb.setImgname(rs.getString("imgname"));
                al.add(pb);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public ArrayList<ProductsBean> FindallProductByRange(int catid, double srange, double erange) {
        con = ConnectionPool.connectDB();
        String sql = "select * from products where categoryid = '" + catid + "' and productprice between '" + srange + "' AND '" + erange + "'";
        ArrayList<ProductsBean> al = new ArrayList<ProductsBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProductsBean pb = new ProductsBean();
                pb.setProductid(rs.getInt("productid"));
                pb.setCategoryid(rs.getInt("categoryid"));
                pb.setProductname(rs.getString("productname"));
                pb.setProductprice(rs.getDouble("productprice"));
                pb.setStockinhand(rs.getInt("stockinhand"));
                pb.setImgname(rs.getString("imgname"));
                al.add(pb);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    // method to find the data by productid 
    public ProductsBean findbyProductid(int productid) {
        con = ConnectionPool.connectDB();
        String sql = "select * from products where productid='" + productid + "'";
        ProductsBean pb = new ProductsBean();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                pb.setProductid(rs.getInt("productid"));
                pb.setCategoryid(rs.getInt("categoryid"));
                pb.setProductname(rs.getString("productname"));
                pb.setProductprice(rs.getDouble("productprice"));
                pb.setStockinhand(rs.getInt("stockinhand"));
                pb.setImgname(rs.getString("imgname"));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pb;
    }

    public static void main(String[] args) {
        ProductsBean pb = new ProductsBean();
        ProductsDao pd = new ProductsDao();
//        pb.setCategoryid(1);
//        pb.setProductname("Nokia phone");
//        pb.setProductprice(24000);
        pb.setStockinhand(8000);
//        pb.setProductdescription("best phone");
//        pb.setImgname("cosn2.jpg");
        pb.setProductid(43);
     int x=   pd.updateProductStock(pb);
        System.out.println((x>0)?"Sucess" :"Failed");
        ArrayList<ProductsBean> x2=pd.FindallProductByCategory(2);
      for(ProductsBean p:x2){

        System.out.print("" + p.getProductid());
        System.out.print("\t" + p.getCategoryid());
        System.out.print("\t" + p.getProductname());
        System.out.print("\t" + p.getProductprice());
        System.out.print("\t" + p.getStockinhand());
        System.out.print("\t" + p.getProductdescription());
        System.out.print("\t" + p.getImgname());

        System.out.println("");
            }
//        int count2=1;
//         for (int i = 10; i >= 1;i--) {
//            ArrayList<ProductsBean> al = pd.FindallProductBycatid(i);
//            if (al.isEmpty()) {
//                        } else {
//                int count=1;
//                for (ProductsBean p : al) {
//                    if(count==2){                        
//                        continue;
//                    }                   
//                    System.out.println(""+p.getProductname());                         
//                    count++;   
//                }
//                             count2++;                
//            }
//            if(count2>5){
//                break;
//            }
//                  }

//        CategoryDao cd = new CategoryDao();
//for (int i = 0; i <= 10; i++) {
//    ArrayList<ProductsBean> al = pd.FindallProductBycatid(i);
//    int count = 1;
//     int count2 = 1;
//    if (al.isEmpty()) {
//      
//        i++;
//        continue;
//    }
//    for (ProductsBean p : al) {
//        System.out.println("Product " + count);
//        System.out.println("ID: " + p.getProductid());
//        System.out.println("Catid: " + p.getCategoryid());
//        CategoryBean cb = cd.findbyCategoryid(p.getCategoryid());
//        System.out.println("Category Name: " + cb.getCategoryname());
//        System.out.println("Name: " + p.getProductname());
//        System.out.println("Price: " + p.getProductprice());
//        System.out.println("Stock: " + p.getStockinhand());
//        System.out.println("");
//     if(count==1){
//         break;
//     }  
//    }
// if(count2==1)  {
//     continue;
// } 
//}
    }

}
