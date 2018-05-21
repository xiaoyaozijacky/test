package com.elashoot.webservice.vo;

/**
 * 产品类修改了
 * */
public class ProductVO{
    private String productName;
    private Double bestPrice;
    private String currency;
    private String location;

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public Double getBestPrice(){
        return bestPrice;
    }

    public void setBestPrice(Double bestPrice){
        this.bestPrice = bestPrice;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
