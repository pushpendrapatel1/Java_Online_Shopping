
package com.osp.bean;


public class CustomersBean {
    private int customerid;
    private String  customername;
    private String  address;
    private String type ;
    private String mobile  ;
    private String email ;
    private String username;
    private String password;

    public CustomersBean() {
    }

    public CustomersBean(int customerid, String customername, String address, String type, String mobile, String email, String username, String password) {
        this.customerid = customerid;
        this.customername = customername;
        this.address = address;
        this.type = type;
        this.mobile = mobile;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
}