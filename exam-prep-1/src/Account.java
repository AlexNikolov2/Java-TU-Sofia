public class Account {
    private int balance;
    private String pin;
    private String accountNumber;

    public Account(int balance, String pin, String accountNumber) {
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public int deposit(int amount){
            return balance += amount;
    }

    public boolean checkPin(String testPin){
        return pin == testPin;
    }

    
}
