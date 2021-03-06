package com.wubinben.refactoring;

public class App {
    Site site;
    Customer customer;

    public App(Site site) {
        this.site = site;
        this.customer = site.getCustomer();
    }

    public BillingPlan getPlan(Customer customer) {
        return customer.getPlan();
    }

    public String getCustomerName(Customer customer) {
        return customer.getName();
    }

    public int getWeeksDelinquent(Customer customer) {
        return customer.getHistory().getWeeksDelinquentInLastYear();
    }
}
