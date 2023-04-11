package Accounts;

public class Account {
    int number;
    int agency;

   public Account(int number, int agency){
    this.number = number;
    this.agency = agency;
   } 

   @Override
   public boolean equals(Object ref){
    // Casting the Object ref to a Account ref
    Account accCompared = (Account) ref;

    // Seeing if this.info is different from that.info
    if(this.number != accCompared.number ||this.agency != accCompared.agency){
        return false;
    }
    return true;
   }
}
