
package com.osp.bean;

public class CategoryBean {
    private int categoryid;
    private String categoryname;
    private String categorydetails;

    public CategoryBean() {
    }

    public CategoryBean(int categoryid, String categoryname, String categorydetails) {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.categorydetails = categorydetails;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getCategorydetails() {
        return categorydetails;
    }

    public void setCategorydetails(String categorydetails) {
        this.categorydetails = categorydetails;
    }
        
}

