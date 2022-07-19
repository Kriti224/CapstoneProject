package Application.Pages;

import org.openqa.selenium.WebDriver;

public class ParaBankApplicationPage {

 public LoginPage loginPage;
 public AccountServicesPage accountServicesPage;
 public TransferFundsPage transferFundsPage;

 public ParaBankApplicationPage(WebDriver driver){
  loginPage =new LoginPage(driver);
  accountServicesPage=new AccountServicesPage(driver);
  transferFundsPage=new TransferFundsPage(driver);
 }
}
