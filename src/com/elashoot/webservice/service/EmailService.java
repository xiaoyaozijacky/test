package com.elashoot.webservice.service;

import com.elashoot.webservice.vo.EmailVO;

//邮件服务 奇怪稍等
public interface EmailService{
    /**
     * @return status 0:success 1:failure
     * */
    public int sendEmail(EmailVO email);
}
