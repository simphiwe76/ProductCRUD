package com.example.demo.customer;

import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long customerID;
    private  String name;
    private  String surname;
    private  String gender;
    private  String custType;

    public Customer() {
    }

    public Customer(Long customerID, String name, String surname, String gender, String custType) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.custType = custType;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", custType='" + custType + '\'' +
                '}';
    }

}
