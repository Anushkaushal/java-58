package Unit3;

public class Bank {
    private int balance = 1000000000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Not Enough Balance");
        }

        else{
            balance = amount;
            System.out.println("Withdrawl sucessfull , Remaining Balance");
        }
    }
}
