package Accounts.OrdeningAccounts.ByOwner;

import java.util.ArrayList;
import java.util.List;

import Accounts.Account;

public class OwnerOrder{
    public static void main(String[] args) {

        Account accountPedro = new Account(10, 28);
        accountPedro.setOwner("Pedro");
        Account accountLuane = new Account(8, 18);
        accountLuane.setOwner("Luane");

        List<Account> accountList = new ArrayList<Account>();
        accountList.add(accountPedro);
        accountList.add(accountLuane); 
        
        System.out.println("Printing UnSorted List:");
        for (Account account : accountList) {
            System.out.println("Name: " + account.getOwner() + "Number: " + account.getNumber() + " Agency: " + account.getAgency());
        }

        OwnerComparator accountComparator = new OwnerComparator();
        System.out.println();

        accountList.sort(accountComparator);

        System.out.println("Printing Sorted List:");
        for (Account account : accountList) {
            System.out.println("Number: " + account.getNumber() + " Agency: " + account.getAgency());
        }

    }
}
