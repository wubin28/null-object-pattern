package com.wubinben.refactoring;

public class Customer {
    private String name;

    public Customer() {
        this("<no name>");
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public BillingPlan getPlan() {
        return new BillingPlan(this.name);
    }
    public PaymentHistory getHistory() {
        return new PaymentHistory();
    }

    public boolean isNull() {
        return false;
    }
}
