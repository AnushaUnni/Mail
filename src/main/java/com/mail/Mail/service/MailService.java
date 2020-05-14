package com.mail.Mail.service;

import com.mail.Mail.bean.SubscriberBean;
import com.mail.Mail.bean.SubscriberResponse;
import com.mail.Mail.entities.Subscriber;
import com.mail.Mail.repositories.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MailService {

    @Autowired
    SubscriberRepository subscriberRepository;

    public SubscriberResponse createSubscriber(SubscriberBean subscriberBean) throws Exception {
        try{
            SubscriberResponse response = new SubscriberResponse();
            Subscriber emailIdSubscriber = subscriberRepository.findByEmailId(subscriberBean.getEmailid());
            if(Objects.nonNull(emailIdSubscriber)){
               response.setId(emailIdSubscriber.getId());
               response.setIsUserAlreadyExists("Yes");
            }
            else{
                Subscriber subscriber = createSubscriberEntity(subscriberBean);
                response.setId(subscriber.getId());
                response.setEmailid(subscriber.getEmailId());
                response.setFirstName(subscriber.getFirstName());
                response.setLastName(subscriber.getLastName());
                response.setIsUserAlreadyExists("No");
            }

            return response;
        }
        catch(Exception e){
            throw new Exception(e);
        }
    }

    private Subscriber createSubscriberEntity(SubscriberBean subscriberBean) {
        Subscriber subscriber = new Subscriber();
        subscriber.setEmailId(subscriberBean.getEmailid());
        subscriber.setFirstName(subscriberBean.getFirstName());
        subscriber.setLastName(subscriberBean.getLastName());
        subscriberRepository.save(subscriber);
        return subscriber;
    }
}
