package com.makeindigitaal.coffeeshop.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "user")
public class user {
    @Id
    private Integer id;
    @Field(name = "email")
    private String email;
    @Field(name = "address")
    private String address;
    @Field (name = "name")
    private String name;
    @Field (name = "phone_number")
    private String phone; 
    @Field (name = "image_link")
    private String imaString;

    public user() {
    }



    public user(Integer id, String email, String address, String name, String phone, String imaString) {
        this.id = id;
        this.email = email;
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.imaString = imaString;
    }




    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "user [address=" + address + ", email=" + email + ", id=" + id + ", name=" + name + ", phone=" + phone
                + "]";
    }

    public String getImaString() {
        return imaString;
    }




    public void setImaString(String imaString) {
        this.imaString = imaString;
    }
    
}
