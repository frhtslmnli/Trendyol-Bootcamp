package Data;

public class MessageDTO  {
    private Company senderCompany;
    private User receiverUser;
    private String message;

    public MessageDTO(Company senderCompany, User receiverUser, String message) {
        this.senderCompany = senderCompany;
        this.receiverUser = receiverUser;
        this.message = message;
    }

    public Company getSenderCompany() {
        return senderCompany;
    }

    public void setSenderCompany(Company senderCompany) {
        this.senderCompany = senderCompany;
    }

    public User getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(User receiverUser) {
        this.receiverUser = receiverUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void emailSendNotification(){
        senderCompany.emailSendNotification();
    }

    public void smsSendNotification(){
        senderCompany.smsSendNotification();
    }

    @Override
    public String toString() {
        String text = "From: " +senderCompany.getName() +
                " To: " +  receiverUser.getName()  +
                " Message: " + message;

        return text;
    }
}
