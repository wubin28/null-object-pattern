package com.wubinben.refactoring;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppTest {
    @Test
    public void the_billing_plan_should_be_basic_if_the_customer_is_null() {
        Customer customer = Customer.newNull();
        Site site = new Site(customer);
        App app = new App(site);
        assertThat(app.getPlan(customer).getDescription(), is("basic"));
    }

    @Test
    public void the_billing_plan_should_be_the_name_of_customer_if_the_customer_is_not_null() {
        Customer customer = new Customer("Ben WU");
        Site site = new Site(customer);
        App app = new App(site);
        assertThat(app.getPlan(customer).getDescription(), is("Ben WU"));
    }

    @Test
    public void the_customer_name_should_be_occupant_if_the_customer_is_null() {
        Customer customer = Customer.newNull();
        Site site = new Site(customer);
        App app = new App(site);
        assertThat(app.getCustomerName(customer), is("occupant"));
    }

    @Test
    public void the_customer_name_should_be_right_if_the_customer_is_not_null() {
        Customer customer = new Customer("Ben WU");
        Site site = new Site(customer);
        App app = new App(site);
        assertThat(app.getCustomerName(customer), is("Ben WU"));
    }

    @Test
    public void the_delinquent_should_be_0_if_the_customer_is_null() {
        Customer customer = Customer.newNull();
        Site site = new Site(customer);
        App app = new App(site);
        assertThat(app.getWeeksDelinquent(customer), is(0));
    }
}