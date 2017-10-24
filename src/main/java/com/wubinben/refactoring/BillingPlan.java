package com.wubinben.refactoring;

public class BillingPlan {
    private final String description;

    public BillingPlan(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static BillingPlan basic() {
        return new BillingPlan("basic");
    }
}
