
package com.osp.bean;

public class ProductsBean {
     private int  productid  ;
       private int  categoryid  ;
         private String productname ;
         private double productprice ;
         private int   stockinhand;
         private String  productdescription;
         private String imgname;

    public ProductsBean() {
    }

    public ProductsBean(int productid, int categoryid, String productname, double productprice, int stockinhand, String productdescription, String imgname) {
        this.productid = productid;
        this.categoryid = categoryid;
        this.productname = productname;
        this.productprice = productprice;
        this.stockinhand = stockinhand;
        this.productdescription = productdescription;
        this.imgname = imgname;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    public int getStockinhand() {
        return stockinhand;
    }

    public void setStockinhand(int stockinhand) {
        this.stockinhand = stockinhand;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    
         
         
}

