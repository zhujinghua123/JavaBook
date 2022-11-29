package chap10;

import java.util.Date;

public class Test7_Account {
    // �ĸ�˽��������
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    // �޲ι��췽��
    public Test7_Account() {
    }

    // �вι��췽��
    public Test7_Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // id balance annualInterestRate��setter��getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // dateCreated�ķ���������
    public Date getDateCreated() {
        return dateCreated;
    }

    // getMonthlyInterestRate����
    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    // getMonthlyInterest����
    public double getMonthlyInterest() {
        return annualInterestRate * balance / 1200;
    }

    // withDraw����
    public void withDraw(double num) {
        if (num <= balance) balance -= num;
    }

    // deposit����
    public void deposit(double num) {
        balance += num;
    }
}
