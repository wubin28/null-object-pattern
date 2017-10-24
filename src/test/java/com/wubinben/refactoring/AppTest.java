package com.wubinben.refactoring;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppTest {
    @Test
    public void the_billing_plan_should_be_basic_if_the_customer_is_null() {
        Customer customer = new NullCustomer();
        Site site = new Site(customer);
        App app = new App(site);
        assertThat("basic", is(app.getPlan(customer).getDescription()));
    }

    @Test
    public void the_billing_plan_should_be_the_name_of_customer_if_the_customer_is_not_null() {
        Customer customer = new Customer("Ben WU");
        Site site = new Site(customer);
        App app = new App(site);
        assertThat("Ben WU", is(app.getPlan(customer).getDescription()));
    }
}