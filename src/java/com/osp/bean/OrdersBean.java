
package com.osp.bean;

public class OrdersBean {
    private int orderid;
    private String orderdate;
    private int customerid;
    private double orderamount;
    private String paymentreceived;

    public OrdersBean() {
    }

    public OrdersBean(int orderid, String orderdate, int customerid, double orderamount, String paymentreceived) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.customerid = customerid;
        this.orderamount = orderamount;
        this.paymentreceived = paymentreceived;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public double getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(double orderamount) {
        this.orderamount = orderamount;
    }

    public String getPaymentreceived() {
        return paymentreceived;
    }

    public void setPaymentreceived(String paymentreceived) {
        this.paymentreceived = paymentreceived;
    }
        
}

