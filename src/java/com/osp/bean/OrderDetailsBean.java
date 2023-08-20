package com.osp.bean;

public class OrderDetailsBean {

    private int did;
    private int orderid;
    private int productid;
    private int quantity;

    public OrderDetailsBean() {
        
    }

    public OrderDetailsBean(int did, int orderid, int productid, int quantity) {
        this.did = did;
        this.orderid = orderid;
        this.productid = productid;
        this.quantity = quantity;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
