package Subscriptions;

public class FixedEmailSubscription extends FixedSubscription {

    public FixedEmailSubscription() {
        initialQuota = 1000;
        quota = initialQuota;
        monthlyFee = 10;
    }
}
