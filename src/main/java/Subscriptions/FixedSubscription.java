package Subscriptions;

public class FixedSubscription extends Subscription{

    public FixedSubscription() {
        currentDebt = monthlyFee;
        exceededPrice = 0.0;
    }

    public void sendNotification(){
        if (quota <= 0) {
            quota = initialQuota;
            currentDebt += monthlyFee;
        }
        --quota;
    }
}
