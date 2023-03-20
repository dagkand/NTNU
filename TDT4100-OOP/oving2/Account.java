package oving2;

public class Account {
    private double balance = 0.0;
    private double interestRate = 0.0;

    public Account(double balance, double interestRate) {
        if(balance<0 || interestRate<0){
            throw new IllegalArgumentException("Balansen eller rentefoten kan ikke være negativt.");
        }
        this.balance = balance;
        this.interestRate = interestRate;
        
        
    }

    public void deposit(double deposit) {
        if (deposit < 0 ) {
            throw new IllegalArgumentException("Kan ikke legge inn et negativt tall på konto");
        }
        this.balance += deposit;
    }

    public void addInterest() {
        double interest = balance*(interestRate / 100);
        this.balance += interest;
    }

    public double getBalance() {
        return balance;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double newInterestRate) {
        if(newInterestRate<0){
            throw new IllegalArgumentException("Renten kan ikke være negativt");
        }
        interestRate = newInterestRate;
    }

    public void withdraw(double withdraw) {
        if(withdraw<0){
            throw new IllegalArgumentException("Du kan ikke ta ut et negativt antall penger");
        }
        else if(withdraw>balance){
            throw new IllegalArgumentException("Kan ikke trekke fra mer enn du har på konto");

        }
        this.balance -= withdraw;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Du har " + balance + ", så mange penger.";
    }



    public static void main(String[] args) {
        Account account = new Account(0,0);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(50);
        System.out.println(account.getBalance());
        
    }
}
