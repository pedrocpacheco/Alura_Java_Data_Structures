package Accounts.OrdeningAccounts.ByDefault;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Accounts.Account;

public class BalanceOrder {
    public static void main(String[] args) {

        // The Default Comparation is by Balance

        Account accountPedro = new Account(10, 28);
        accountPedro.setOwner("Pedro");
        accountPedro.setBalance(2500.00);

        Account accountLuane = new Account(8, 18);
        accountLuane.setOwner("Luane");
        accountLuane.setBalance(1500.00);

        List<Account> accountList = new ArrayList<Account>();
        accountList.add(accountPedro);
        accountList.add(accountLuane); 

        accountList.sort(null); // A Way to Sort a List Using it's Object Type Only "compareTo"
        Collections.sort(accountList); // Another way to Sort by using the default sort
        
        System.out.println("Printing Default Sorted by Balance List:");
        for (Account account : accountList) {
            System.out.println("Name: " + account.getOwner() + " Balance: " + account.getBalance() + " Number: " + account.getNumber() + " Agency: " + account.getAgency());
        }

    }
}
