package Accounts;

public class Account implements Comparable<Account>{
    private int number;
    private int agency;
    private double balance;
    private String owner;

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

   public int getNumber() {
       return number;
   }
   
   public int getAgency() {
       return agency;
   }

   public String getOwner() {
       return owner;
   }

   public double getBalance() {
       return balance;
   }

   public void setOwner(String owner) {
       this.owner = owner;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

@Override
public int compareTo(Account comparedAccount) {
    return Double.compare(this.balance, comparedAccount.balance);
}

}
