package com.elashoot.webservice.vo;

public class EmailVO{
    private String productName;
    private String email;

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "[" + "productName = " + productName + ",email = " + email + "]";
    }
}
