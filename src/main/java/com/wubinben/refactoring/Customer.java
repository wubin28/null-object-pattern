package com.wubinben.refactoring;

public class Customer implements Nullable {
    private String name;

    public Customer() {
        this("occupant");
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

    @Override
    public boolean isNull() {
        return false;
    }

    static Customer newNull() {
        return new NullCustomer();
    }

    public static class NullCustomer extends Customer {

        @Override
        public boolean isNull() {
            return true;
        }

        public String getName() {
            return super.name;
        }

        public BillingPlan getPlan() {
            return BillingPlan.basic();
        }
    }
}
