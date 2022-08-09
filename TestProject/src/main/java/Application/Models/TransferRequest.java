package Application.Models;

public class TransferRequest {

    public int fromAccountId;
    public int toAccountId;
    public int amount;

    public TransferRequest(int fromAccountId,int toAccountId,int amount){
        this.fromAccountId=fromAccountId;
        this.toAccountId=toAccountId;
        this.amount=amount;
    }
}
