package Subscriptions;

public class FlexibleSmsSubscription extends FlexibleSubscription {

    public FlexibleSmsSubscription() {

        initialQuota = 2000;
        quota = initialQuota;
        monthlyFee = 30;
        currentDebt = monthlyFee;
        exceededPrice = 0.1;
    }
}
