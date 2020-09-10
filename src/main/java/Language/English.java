package Language;

public class English implements Language {
    @Override
    public void printIsInBlacklist() {
        System.out.println("You cannot send messages due to being on blaklist.");
    }
}
