package oving1;

public class Account {
    double balance = 0.0;
    double interestRate = 0.0;

    public void deposit(double deposit) {
        if (deposit > 0 ) {
            balance += deposit;
        }
    }

    public void addInterest() {
        double interest = balance*(interestRate / 100);
        balance += interest;
    }

    public double getBalance() {
        return balance;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double newInterestRate) {
        interestRate = newInterestRate;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Du har " + balance + ", så mange penger.";
    }



    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getBalance());
    }
}
