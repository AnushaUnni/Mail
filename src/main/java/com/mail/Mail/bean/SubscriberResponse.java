package com.mail.Mail.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriberResponse {

    private Integer id;
    private String firstName;
    private String lastName;
    private String emailid;
    private String isUserAlreadyExists;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getIsUserAlreadyExists() {
        return isUserAlreadyExists;
    }

    public void setIsUserAlreadyExists(String isUserAlreadyExists) {
        this.isUserAlreadyExists = isUserAlreadyExists;
    }
}
