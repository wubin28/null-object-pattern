package com.wubinben.refactoring;

public class App {
    Site site;
    Customer customer;

    public App(Site site) {
        this.site = site;
        this.customer = site.getCustomer();
    }

    public BillingPlan getPlan(Customer customer) {
        BillingPlan plan;
        if (customer.isNull()) {
            plan = BillingPlan.basic();
        } else {
            plan = customer.getPlan();
        }
        return plan;
    }

    public String getCustomerName(Customer customer) {
        return customer.getName();
    }

    public int getWeeksDelinquent(Customer customer) {
        int weeksDelinquent;
        if (customer.isNull()) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }
        return weeksDelinquent;
    }
}
