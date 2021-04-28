package com.upgrad.backendet.model;

import javax.persistence.*;

@Entity
@Table(name = "userInfo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String age;
    private String email;
    private String address;
    private String phoneNumber;

    public User(Integer id, String name, String age, String email, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public User(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


