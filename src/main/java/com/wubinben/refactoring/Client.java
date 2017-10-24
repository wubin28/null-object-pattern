package com.wubinben.refactoring;

public class Client {
    Site site;
    Customer customer;

    public Client(Site site) {
        this.site = site;
        this.customer = site.getCustomer();
    }

    public BillingPlan getPlan(Customer customer) {
        BillingPlan plan;
        if (customer == null) {
            plan = BillingPlan.basic();
        } else {
            plan = customer.getPlan();
        }
        return plan;
    }

    public String getCustomerName(Customer customer) {
        String customerName;
        if (customer == null) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }
        return customerName;
    }

    public int getWeeksDelinquent(Customer customer) {
        int weeksDelinquent;
        if (customer == null) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }
        return weeksDelinquent;
    }
}
