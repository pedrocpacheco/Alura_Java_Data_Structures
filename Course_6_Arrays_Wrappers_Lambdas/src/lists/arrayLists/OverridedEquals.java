package arrayLists;

import java.util.ArrayList;

import Accounts.Account;

public class OverridedEquals {
    public static void main(String[] args) {
        
        ArrayList<Account> accountsList = new ArrayList<Account>();

        // Creating Accounts With Same Infos
        Account ac1 = new Account(10, 22);
        Account ac2 = new Account(10, 22);

        // Adding Account 1 to The accountList
        accountsList.add(ac1);

        // Comparing 2 diff accounts with the same info
        boolean sameInfo = accountsList.contains(ac2);

        if(sameInfo)
            System.out.println("There is a Acconut with same info.");
        else
            System.out.println("There is not a account with same info.");
        
        // I changed the .contais in a Account obj, so, it dont compares the reference
        // And only the info of the account. So, if I have 2 dif accounts with the same info
        // It still shows true

    }
}
