package com.osp.dao;

import com.osp.bean.CategoryBean;
import com.osp.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryDao {

    static Connection con;

    // method to add Data
    public int addCategory(CategoryBean cb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "insert into category (categoryname,categorydetails)values('" + cb.getCategoryname() + "','" + cb.getCategorydetails() + "')";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to update data
    public int updateCategory(CategoryBean cb) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "update category set categoryname='" + cb.getCategoryname() + "',categorydetails='" + cb.getCategorydetails() + "' where categoryid='" + cb.getCategoryid() + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // method to delete data 
    public int deleteCategory(int cid) {
        int result = 0;
        con = ConnectionPool.connectDB();
        String sql = "delete from category where categoryid='" + cid + "'";
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }
    
    // method to find all data 
    public ArrayList<CategoryBean> FindallCategory(){
        con=ConnectionPool.connectDB();
        String sql="select * from category";
        ArrayList<CategoryBean> al=new ArrayList<CategoryBean>();
        try {
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                CategoryBean cb=new CategoryBean();
                cb.setCategoryid(rs.getInt("categoryid"));
                cb.setCategoryname(rs.getString("categoryname"));
                cb.setCategorydetails(rs.getString("categorydetails"));
                al.add(cb);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    // method to find the data by cateogoryid 
    public CategoryBean findbyCategoryid(int cid){
        con=ConnectionPool.connectDB();
        String sql="select * from category where categoryid='"+cid+"'";
        CategoryBean cb=new CategoryBean();
        try {
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
              
                cb.setCategoryid(rs.getInt("categoryid"));
                cb.setCategoryname(rs.getString("categoryname"));
                cb.setCategorydetails(rs.getString("categorydetails"));
               
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cb;        
    }
    
    
    // extra methdo 
    
    
     // method to find all the products by category id
    public TreeSet<CategoryBean> FindallProductBycatid() {
        con = ConnectionPool.connectDB();
        String sql = "select * from category ";
        TreeSet<CategoryBean> al = new TreeSet<CategoryBean>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
              CategoryBean cb=new CategoryBean();
                cb.setCategoryid(rs.getInt("categoryid"));
                cb.setCategoryname(rs.getString("categoryname"));
                cb.setCategorydetails(rs.getString("categorydetails"));
                al.add(cb);
               
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    
    public static void main(String[] args) {
        CategoryBean cb=new CategoryBean();
        CategoryDao cd=new CategoryDao();
        cb.setCategoryname("Mobile");
        cb.setCategorydetails("Tablets");
        cb.setCategoryid(3);
    
        CategoryBean a=cd.findbyCategoryid(2);
    }
}
