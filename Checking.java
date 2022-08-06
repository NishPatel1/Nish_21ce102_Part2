import java.util.*;

public class Checking extends Account{
    private double overdrawmlimit = getBalance()/10;
    private double totalbalance = getBalance() + overdrawmlimit;

    Checking() {}

    Checking(int id, double balance, double annualInterestRate, Date dateCreated)
    {
        super(id, balance, annualInterestRate, dateCreated);
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "The Account number is " + getId() + "\nThe balance in the Account is " + getBalance() + "\nThe annual interest rate is " + getAnnualInterestRate() + "\nThe date of creation of the Account is " + getDateCreated() + "\nThe over drawn limit is " + overdrawmlimit;
    }

    @Override
    public double withdraw(double a)
    {
        if(a<overdrawmlimit)
        {
            overdrawmlimit-=a;
            return overdrawmlimit;
        }
        else 
        {
            a-=overdrawmlimit;
            System.out.println("Your over drawn limit is over.");
            super.withdraw(a);
        }
        return getBalance();
    } 
}
