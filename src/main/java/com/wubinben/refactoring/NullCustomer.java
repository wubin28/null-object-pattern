package com.wubinben.refactoring;

public class NullCustomer extends Customer {
    @Override
    public boolean isNull() {
        return true;
    }
}
