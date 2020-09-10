package Subscriptions;

public class FixedSmsSubscription extends FixedSubscription {

    public FixedSmsSubscription() {
        initialQuota = 1000;
        quota = initialQuota;
        monthlyFee = 20;
        currentDebt = monthlyFee;
    }
}
