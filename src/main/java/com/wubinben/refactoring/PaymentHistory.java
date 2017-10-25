package com.wubinben.refactoring;

public class PaymentHistory implements Nullable{
    private final int weeksDelinquentInLastYear;

    public PaymentHistory() {
        this(0);
    }

    public PaymentHistory(int weeksDelinquentInLastYear) {
        this.weeksDelinquentInLastYear = weeksDelinquentInLastYear;
    }

    int getWeeksDelinquentInLastYear() {
        return this.weeksDelinquentInLastYear;
    }

    static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }

    @Override
    public boolean isNull() {
        return false;
    }

    public static class NullPaymentHistory extends PaymentHistory {
        public int getWeeksDelinquentInLastYear() {
            return 0;
        }

        @Override
        public boolean isNull() {
            return true;
        }

    }
}
