package com.mail.Mail.controller;

import com.mail.Mail.bean.SubscriberBean;
import com.mail.Mail.bean.SubscriberResponse;
import com.mail.Mail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriber")
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping
    public ResponseEntity createSubscriber(@RequestBody SubscriberBean subscriberBean) throws Exception {
        SubscriberResponse response = mailService.createSubscriber(subscriberBean);
        return ResponseEntity.ok(response);
    }

}
