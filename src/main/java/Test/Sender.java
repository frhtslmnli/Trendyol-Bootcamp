package Test;

import Data.MessageDTO;

import java.util.*;

public class Sender{

    private final List<Channel> channels;

    public Sender(List<Channel> channels) {
        this.channels = channels;
    }

    public void Send(MessageDTO messageDTO) {
        for (Channel channel : this.channels) {
            channel.Send(messageDTO);
        }
    }

}
