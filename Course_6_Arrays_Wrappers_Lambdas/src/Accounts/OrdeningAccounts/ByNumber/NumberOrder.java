package Accounts.OrdeningAccounts.ByNumber;

import java.util.ArrayList;
import java.util.List;

import Accounts.Account;
import Accounts.OrdeningAccounts.ByOwner.OwnerComparator;

public class NumberOrder {
    public static void main(String[] args) {
        // Creating Accoutns
        Account accountPedro = new Account(10, 28);
        Account accountLuane = new Account(8, 18);

        // Creating Accounts List
        List<Account> accountList = new ArrayList<Account>();
        accountList.add(accountPedro); // Pedro add to List
        accountList.add(accountLuane); // Luane added to List

        // Printing Accounts in a unSorted Order
        System.out.println("Printing UnSorted List:");
        for (Account account : accountList) {
            System.out.println("Number: " + account.getNumber() + " Agency: " + account.getAgency());
        }

        // Creating Our Comparator
        OwnerComparator accountComparator = new OwnerComparator();
        System.out.println();

        // Sorting the List by using our own Class and Method
        accountList.sort(accountComparator);

        // Printing Accounts in a Sorted Order
        System.out.println("Printing Sorted List:");
        for (Account account : accountList) {
            System.out.println("Number: " + account.getNumber() + " Agency: " + account.getAgency());
        }

    }
}
