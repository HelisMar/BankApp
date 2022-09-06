public class Account {
    
    private double balance;

    public Account() {
        balance = 0.0;
    }

    public void deposit (double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Kontol ei ole piisavalt vahendeid");
        }
    }

    public double getBalance() {
        return balance;
    }
}

