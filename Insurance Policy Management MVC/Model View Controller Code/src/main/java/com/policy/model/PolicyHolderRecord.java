package com.policy.model;
import javax.persistence.*;

//Class for the entity that is policy holder record
@Entity
public class PolicyHolderRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyNumber;
    private String customer;
    private String appliedDate;
    private String status;
    private String startDate;
    private String endDate;
    private String premium;
    private String otherDetails;
    private String agent;

    public PolicyHolderRecord() {

    }
    public PolicyHolderRecord(String policyNumber, String customer, String appliedDate, String status, String startDate, String endDate, String premium, String otherDetails, String agent){
        this.policyNumber = policyNumber;
        this.customer = customer;
        this.appliedDate = appliedDate;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.premium = premium;
        this.otherDetails = otherDetails;
        this.agent = agent;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getPremium() {
        return premium;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgent() {
        return agent;
    }
}
