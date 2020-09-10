package Test;

import Data.MessageDTO;

public class SMS implements Channel{
    @Override
    public void Send(MessageDTO messageDTO) {
        System.out.println(" * Sending SMS,   Message: " + messageDTO);
        messageDTO.smsSendNotification();
    }
}
