package Test;

import Data.MessageDTO;

public class Email implements Channel {
    @Override
    public void Send(MessageDTO messageDTO) {
        System.out.println(" * Sending Email  " + messageDTO);
        messageDTO.emailSendNotification();
    }
}

