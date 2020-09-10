package Test;

import Data.Company;
import Data.MessageDTO;
import Data.User;
import Subscriptions.FixedEmailSubscription;
import Subscriptions.FixedSmsSubscription;
import Subscriptions.FlexibleEmailSubscription;
import Subscriptions.Subscription;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SenderTest {

    @Test
    public void it_should_throw_blacklist_exception() {
        //Given
        Subscription smsSubs = new FixedSmsSubscription();
        Subscription emailSubs = new FlexibleEmailSubscription();
        Company company = new Company("Trendyol",smsSubs,emailSubs);
        User user = new User("Ferhat","Salmanlı");
        MessageDTO messageDTO = new MessageDTO(company,user,"");
        smsSubs.setInBlacklist(true);

        //When
        boolean InBlacklist = smsSubs.getInBlacklist();

        //Then
        assertThat(InBlacklist).isInstanceOf(IsInBlacklistException.class);
    }

    @Test
    public void it_should_throw_empty_message_exception(){
        //Given
        Subscription smsSubs = new FixedEmailSubscription();
        Subscription emailSubs = new FlexibleEmailSubscription();
        Company company = new Company("Trendyol",smsSubs,emailSubs);
        User user = new User("Ferhat","Salmanlı");
        MessageDTO messageDTO = new MessageDTO(company,user,"");




        //When
        boolean messageIsEmpty = messageDTO.getMessage().isEmpty();

        //Then
        assertThat(messageIsEmpty).isInstanceOf(EmptyMessageException.class);

    }
}