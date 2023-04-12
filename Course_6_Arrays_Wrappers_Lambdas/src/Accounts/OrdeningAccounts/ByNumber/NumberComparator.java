package Accounts.OrdeningAccounts.ByNumber;

import java.util.Comparator;

import Accounts.Account;

public class NumberComparator implements Comparator<Account> {

    @Override
    public int compare(Account ac1, Account ac2) {
        // Smart Way to do The Number Comparation
        return Integer.compare(ac1.getNumber(), ac2.getNumber());
        
        // Half Way to do The Number Comparation
        // return ac1.getNumber() - ac2.getNumber();

        // Dumb Way to do The Number Comparation
        // if(ac1.getNumber() < ac2.getNumber()){
        //     return -1;
        // }

        // if(ac1.getNumber() > ac2.getNumber()){
        //     return 1;
        // }
        // return 0;
    } 
}
