package chap09;

import java.util.Date;

/**
 * @Description 9.7
 * @Author 住京华
 * @Date 2022/10/16-下午 11:22
 */
public class Account {
    Date dateCreated;
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public static void main(String[] args) {
        Account temp = new Account(1122, 20000, 4.5 / 100);
        temp.withDraw(2500);
        temp.deposit(3000);
        System.out.print("The balance is " + temp.getBalance() + " The interest is " + temp.getMonthlyInterest() +
                " The data is " + temp.dateCreated);
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public void withDraw(double t) {
        setBalance(getBalance() - t);
    }

    public void deposit(double t) {
        setBalance(getBalance() + t);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
