import java.util.*;

public class TestCheAndSavAcc {
    public static void main(String[] args) {
        Date dateCreated = new Date("12/12/2012 12:12:12");
        Account Ac = new Account(12, 25000, 5, dateCreated);
        Checking CAc = new Checking(12, 25000, 5, dateCreated);
        Savings SAc = new Savings(12, 25000, 5, dateCreated);
        System.out.println("Account class toString method\n" + Ac);
        System.out.println("\nChecking class toString method\n" + CAc);
        System.out.println("\nSavings class toString method\n" + SAc);
    }
}
