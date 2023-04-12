package Accounts.OrdeningAccounts;

import java.util.Comparator;

import Accounts.Account;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account ac1, Account ac2) {
        if(ac1.getNumber() < ac2.getNumber()){
            return -1;
        }

        if(ac1.getNumber() > ac2.getNumber()){
            return 1;
        }
        
        return 0;
    } 
}
