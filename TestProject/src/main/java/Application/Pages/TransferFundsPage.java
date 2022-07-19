package Application.Pages;

import Application.Models.Transaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage extends AbstractPage{
    public TransferFundsPage(WebDriver driver ){
        super(driver);
    }

    public By amountTextBox=By.id("amount");
    public By fromAccountDropdown=By.id("fromAccountId");
    public By toAccountDropdown=By.id("toAccountId");
    public By transferButton=By.xpath("//input[@type='submit' and @value='Transfer']");
    public By successTransferMessage=By.xpath("//h1[text()='Transfer Complete!']");

    public void transferFunds(Transaction transaction){
        try {
            // Explicit wait for options to get populated
            findSelectOptions(fromAccountDropdown,By.tagName("option"));
            sendKeys(amountTextBox,String.valueOf(transaction.amount));
            // select option by Select class
            selectFromDropdown(fromAccountDropdown,String.valueOf(transaction.fromAccount));
            selectFromDropdown(toAccountDropdown,String.valueOf(transaction.toAccount));
        }
        catch(Exception e) {
            System.out.println("Options not available");
        }
        click(transferButton);
    }

    public Boolean verifyMessage()
    {
        findElement(successTransferMessage).isDisplayed();
        return true;
    }
}
