package Accounts.OrdeningAccounts.ByOwner;

import java.util.Comparator;

import Accounts.Account;

public class OwnerComparator implements Comparator<Account> {

    @Override
    public int compare(Account ac1, Account ac2) {
       return ac1.getOwner().compareTo(ac2.getOwner());
    } 
}
