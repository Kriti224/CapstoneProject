package Application.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountServicesPage extends AbstractPage{
    public AccountServicesPage(WebDriver driver )
    {
        super(driver);
    }

    public By transferFunds=By.xpath("//a[text()='Transfer Funds']");

    public void transferFundsClick(){
        click(transferFunds);
    }
}
