package com.piyush0.bank.userServer.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection= "customer")
public class User {

    @Id
    private String _id;
    private String name;
    private String apellido;
    private Date birthday;
    private String gender;

    public User(String _id, String name, String apellido, Date birthday, String gender) {
        this._id = _id;
        this.name = name;
        this.apellido = apellido;
        this.birthday = birthday;
        this.gender = gender;
    }

    public User(String name, String apellido, Date birthday, String gender) {
        this.name = name;
        this.apellido = apellido;
        this.birthday = birthday;
        this.gender = gender;
    }

    public User() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}