package Subscriptions;

public class FlexibleSubscription extends Subscription {

    public FlexibleSubscription() {
        currentDebt = monthlyFee;
    }

    public void sendNotification(){
        if (quota <= 0) {
            currentDebt += exceededPrice;
        }else {
            quota--;
        }
    }
}
