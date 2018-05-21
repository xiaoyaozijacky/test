package com.elashoot.webservice.vo;

/**
 * 这是一个修改邮件的类
 * 我加了点东西
 * zhende 
 * */
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
