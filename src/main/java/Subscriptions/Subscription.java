package Subscriptions;

public abstract class Subscription {

    protected int initialQuota;
    protected int quota;
    protected double monthlyFee;
    protected double exceededPrice;
    protected double currentDebt;
    protected boolean isInBlacklist = false;

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getExceededPrice() {
        return exceededPrice;
    }

    public void setExceededPrice(double exceededPrice) {
        this.exceededPrice = exceededPrice;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }

    public void setCurrentDebt(double currentDebt) {
        this.currentDebt = currentDebt;
    }

    public boolean isInBlacklist() {
        return isInBlacklist;
    }

    public void setInBlacklist(boolean inBlacklist) {
        isInBlacklist = inBlacklist;
    }

    public abstract void sendNotification();

    @Override
    public String toString() {
        String text = " * initialQuota: " + initialQuota +
                ", currentQuota: " + quota +
                ", currentDebt: " + currentDebt +
                ", monthyFee: " + monthlyFee +
                ", exceededPrice: " + exceededPrice ;
        return  text;
    }
}
