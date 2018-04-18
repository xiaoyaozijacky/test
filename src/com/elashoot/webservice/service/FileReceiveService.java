package com.elashoot.webservice.service;

import com.elashoot.webservice.vo.EmailVO;

public interface FileReceiveService{
    /**
     * @return status 0:success 1:failure
     * */
    public int sendEmail(EmailVO email);
}
