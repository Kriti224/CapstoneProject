package Application.Pages;

import Application.Models.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{
    public LoginPage(WebDriver driver )
    {
        super(driver);
    }

    public By userName= By.xpath("//input[@name='username']");
    public By password=By.xpath("//input[@name='password']");
    public By loginButton=By.xpath("//input[@value='Log In']");


    public void login(Credentials credentials){
        navigateToUrl("https://parabank.parasoft.com/parabank");
        sendKeys(userName,credentials.username);
        sendKeys(password,credentials.password);
        click(loginButton);
    }
}
