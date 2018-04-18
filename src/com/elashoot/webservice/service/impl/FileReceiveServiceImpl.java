package com.elashoot.webservice.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.elashoot.webservice.service.FileReceiveService;
import com.elashoot.webservice.vo.EmailVO;

@Service("/fileReceiveService")
public class FileReceiveServiceImpl implements FileReceiveService{
    /**
     * @return status 0:success 1:failure
     * */
    public int sendEmail(EmailVO email){
        Logger.getLogger(this.getClass()).info("email:" + email);
        return 0;
    }

}
