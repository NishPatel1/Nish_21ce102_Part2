import java.util.*;

public class Savings extends Account {

    Savings() {}

    Savings(int id, double balance, double annualInterestRate, Date dateCreated)
    {
        super(id, balance, annualInterestRate, dateCreated);
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "The Account number is " + getId() + "\nThe balance in the Account is " + getBalance() + "\nThe annual interest rate of the Account is " + getAnnualInterestRate() + "\nThe date of creation of the Account is " + getDateCreated();
    }
}
