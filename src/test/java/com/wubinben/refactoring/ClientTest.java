package com.wubinben.refactoring;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ClientTest {
    @Test
    public void the_billing_plan_should_be_basic_if_the_customer_is_null() {
        Customer customer = null;
        Site site = new Site(customer);
        Client client = new Client(site);
        assertThat("basic", is(client.getPlan(null).getDescription()));
    }

    @Test
    public void the_billing_plan_should_be_the_name_of_customer_if_the_customer_is_not_null() {
        Customer customer = new Customer("Ben WU");
        Site site = new Site(customer);
        Client client = new Client(site);
        assertThat("Ben WU", is(client.getPlan(customer).getDescription()));
    }
}