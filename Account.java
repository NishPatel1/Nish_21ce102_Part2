/*
 * Created by:- Nish Patel
 * ID:- 21ce102
 * Aim:- Design a class named Account that contains:
 * •A private int data field namedid for the account (default 0).
 * •A private double data field named balance for the account (default 500₹).
 * •A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%). Assume all accounts have the same interest rate.
 * •A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
 * •A no-arg constructor that creates a default account.
 * •A constructor that creates an account with the specified id and initial balance.
 * •The accessor and mutator methods for id, balance, and annualInterestRate.
 * •The accessor method for dateCreated.
 * •A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
 * •A method named getMonthlyInterest() that returns the monthly interest.
 * •A method named withdraw that withdraws a specified amount from theaccount.
 * •A method named deposit that deposits aspecified amount to the account.
 */

import java.util.*;

public class Account {
    private int id=0;
    private double balance=500;
    private double annualInterestRate=7;
    private Date dateCreated= new Date();


    Account() {}

    Account(int id)
    {
        this.id = id;
    }

    Account(int id, double balance)
    {
        this(id);
        this.balance= balance;
    }

    Account(int id, double balance, double annualInterestRate, Date dateCreated)
    {
        this(id, balance);
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        return balance*(annualInterestRate/1200);
    }

    public double withdraw(double a)
    {
        balance-=a;
        return balance;
    } 

    public double deposit(double a)
    {
        balance+=a;
        return balance;
    }

    public void moneytransfer(Account Ac,double a)
    {
        withdraw(a);
        Ac.deposit(a);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "The Account number is " + getId() + "\nThe balance in the Account is " + getBalance() + "\nThe anuuual intersect rate is " + getAnnualInterestRate() + "\nThe data of creation of the account is " + getDateCreated();
    }
}
