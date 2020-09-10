package Subscriptions;

public class FlexibleEmailSubscription extends FlexibleSubscription {

    public FlexibleEmailSubscription() {

        initialQuota = 2000;
        quota = initialQuota;
        monthlyFee = 7.5;
        currentDebt = monthlyFee;
        exceededPrice = 0.03;
    }
}
