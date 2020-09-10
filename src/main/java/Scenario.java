import Test.*;
import Data.*;
import Subscriptions.*;
import java.util.*;

public class Scenario {
    public static void run(){

        Subscription smsSubs1 = new FixedSmsSubscription();
        Subscription smsSubs2= new FlexibleSmsSubscription();
        Subscription emailSubs1 = new FixedEmailSubscription();
        Subscription emailSubs2 = new FlexibleEmailSubscription();

        Company company1 = new Company("Trendyol",smsSubs1,emailSubs1);
        Company company2 = new Company("Google",smsSubs2,emailSubs2);

        User user1 = new User("Ferhat","Salmanlı");
        User user2 = new User("John","Doe");

        MessageDTO messageDTO1 = new MessageDTO(company1,user1,"Merhaba!");
        MessageDTO messageDTO2 = new MessageDTO(company2,user2,"Hello!");

        // First Scenario. Company sends both sms and email
        List<Channel> channelList = new ArrayList<>();
        channelList.add(new Email());
        channelList.add(new SMS());

        Sender sender = new Sender(channelList);

        if(!smsSubs1.isInBlacklist() && !emailSubs1.isInBlacklist()){
            for (int i = 0; i < 3; i++) {
                sender.Send(messageDTO1);
            }
        }
        System.out.println("\nEmail Charge: " + emailSubs1.toString());
        System.out.println("SMS Charge: " + smsSubs1.toString());

       //Second scenario. Company sends only Sms
        channelList.clear();
        channelList.add(new SMS());
        if(!smsSubs2.isInBlacklist()){
            for (int i = 0; i < 7; i++) {
                sender.Send(messageDTO2);
            }
        }

        System.out.println("\nEmail Charge: " + emailSubs2.toString());
        System.out.println("SMS Charge: " + smsSubs2.toString());

        //Third scenario. Company sends only email
        channelList.clear();
        channelList.add(new Email());

        if(!emailSubs2.isInBlacklist()){
            for (int i = 0; i < 5; i++) {
                sender.Send(messageDTO2);
            }
        }
        System.out.println("\nEmail Charge: " + emailSubs2.toString());
        System.out.println("SMS Charge: " + smsSubs2.toString());

        //Debt overdue
        smsSubs1.setInBlacklist(true);
        System.out.println("You haven't paid your bill for 2 months; your current debt is : " +
                ""+ smsSubs1.getCurrentDebt());

        payBill(smsSubs1);

        System.out.println("\n / / / SMS Charge: " + smsSubs1.toString());

    }

    public static void payBill(Subscription subscription){
        subscription.setCurrentDebt(0);
        subscription.setInBlacklist(false);
    }


}
