package Data;

import Subscriptions.*;

public class Company {

    private String name;
    private Subscription smsSubs;
    private Subscription emailSubs;

    public Company(String name, Subscription smsSubs, Subscription emailSubs) {
        this.name = name;
        this.smsSubs = smsSubs;
        this.emailSubs = emailSubs;
    }

    public void emailSendNotification() {
         emailSubs.sendNotification();
     }

    public void smsSendNotification() {
        smsSubs.sendNotification();
    }

    public Subscription getEmailSubs() {
        return emailSubs;
    }

    public final void setEmailSubs(Subscription emailSubs) {
        this.emailSubs = emailSubs;
    }

    public Subscription getSmsSubs() {
        return smsSubs;
    }

    public final void setSmsSubs(Subscription smsSubs) {
       this.smsSubs = smsSubs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
