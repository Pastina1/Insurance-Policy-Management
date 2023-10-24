package com.policy.model;
import javax.persistence.*;

//Class for the entity that is Policy
@Entity
public class Policy {
    @Id
    //@GeneratedValue annotations to indicate that this field is primary key and its value is auto generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyNumber;
    private String policyType;
    private String agentList;
    private String policyDescription;

    public Policy() {

    }
    public Policy(String policyNumber, String policyType, String agentList, String policyDescription) {
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.agentList = agentList;
        this.policyDescription = policyDescription;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getPolicyNumber(){
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    public String getPolicyType(){
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getAgentList() {
        return agentList;
    }

    public void setAgentList(String agentList) {
        this.agentList = agentList;
    }

    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }
}
