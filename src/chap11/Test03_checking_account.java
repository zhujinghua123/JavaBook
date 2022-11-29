package chap11;

public class Test03_checking_account extends Test03_Account {
    public double overDraftLimit = 0;

    public Test03_checking_account() {
    }

    public Test03_checking_account(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
}