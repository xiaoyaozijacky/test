package com.elashoot.webservice.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elashoot.webservice.service.EmailService;
import com.elashoot.webservice.vo.EmailVO;
import com.elashoot.webservice.vo.ProductVO;

/**
 * 测试一下122提交的
 * */
@Controller
@RequestMapping("/product")
public class ProductController{
    @Autowired
    private EmailService emailService;

    /**
     * @description: get the best (minimum) price for the product
     * @author savage
     * @date 2016/05/14
     * 
     * @return：ProductVO
     */
    @RequestMapping("/search")
    @ResponseBody
    public ProductVO search(String name){
        Logger.getLogger(this.getClass()).info("request parameter:" + name);
        ProductVO vo = new ProductVO();
        vo.setProductName("iPad Mini");
        vo.setBestPrice(150.00);
        vo.setCurrency("CAD");
        vo.setLocation("Walmart");
        return vo;
    }

    /**
     * @description: get the best (minimum) price for the product
     * @author savage
     * @date 2016/05/14
     * 
     * @return：ProductVO
     */
    @RequestMapping("/alert")
    @ResponseBody
    public void alert(EmailVO email){
        Logger.getLogger(this.getClass()).info("request parameter:" + email);
        int status = emailService.sendEmail(email);
        Logger.getLogger(this.getClass()).info("alert result" + status);
    }
}
