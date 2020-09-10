package Language;

public class Turkish implements Language {

    @Override
    public void printIsInBlacklist() {
        System.out.println("Kara listede olduğunuz için gönderim yapamazsınız.");
    }
}
