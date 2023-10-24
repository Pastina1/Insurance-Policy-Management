package com.policy.model;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//Class for the Entity that is Customer
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private String contactNumber;
    @NotNull
    private String emailAddress;
    @NotNull
    private String sex;
    @NotNull
    private String dateOfBirth;
    @NotNull
    private String employmentStatus;
    @NotNull
    @Size(min=1, max=100)
    private String riskRate;
    @NotNull
    private String agent;

    public Customer(){

    }
    public Customer(String name, String address, String contactNumber, String emailAddress, String sex, String dateOfBirth, String employmentStatus, String riskRate, String agent){
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.employmentStatus = employmentStatus;
        this.riskRate = riskRate;
        this.agent = agent;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setRiskRate(String riskRate) {
        this.riskRate = riskRate;
    }

    public String getRiskRate() {
        return riskRate;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgent() {
        return agent;
    }


}
