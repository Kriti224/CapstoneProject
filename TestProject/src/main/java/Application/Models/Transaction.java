package Application.Models;

public class Transaction {
    public int amount;
    public int toAccount;
    public int fromAccount;

    public Transaction(int amount,int fromAccount,int toAccount){
        this.amount=amount;
        this.fromAccount=fromAccount;
        this.toAccount=toAccount;
    }
}
