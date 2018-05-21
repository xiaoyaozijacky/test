package com.elashoot.webservice.vo;

import java.util.Date;

/**
 * 测试新的pojo在dev分支里修改
 * */
public class NewPOJO{
    private String id;
    private String name;
    private Date createDate;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getCreateDate(){
        return createDate;
    }

    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }
}
