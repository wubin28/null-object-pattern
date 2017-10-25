package com.wubinben.refactoring;

public class Site {
    Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    Customer getCustomer() {
        return this.customer;
    }
}
