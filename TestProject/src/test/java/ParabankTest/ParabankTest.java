package ParabankTest;

import Application.Models.Credentials;
import Application.Models.Transaction;
import Application.Pages.ParaBankApplicationPage;
import Application.Services.Webservices;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParabankTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception{
        Webservices.resetParaBankApp();
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void transferFundsTest1(){
        ParaBankApplicationPage applicationPage=new ParaBankApplicationPage(driver);
        applicationPage.loginPage.login(new Credentials());
        applicationPage.accountServicesPage.transferFundsClick();
        applicationPage.transferFundsPage.transferFunds(new Transaction(100,12345,12456));
        applicationPage.transferFundsPage.verifyMessage();

    }

    @Test
    public void transferFundsTest2(){
        ParaBankApplicationPage applicationPage=new ParaBankApplicationPage(driver);
        applicationPage.loginPage.login(new Credentials());
        applicationPage.accountServicesPage.transferFundsClick();
        applicationPage.transferFundsPage.transferFunds(new Transaction(500,12456,12567));
        applicationPage.transferFundsPage.verifyMessage();

    }

    @Test
    public void transferFundsTest3(){
        ParaBankApplicationPage applicationPage=new ParaBankApplicationPage(driver);
        applicationPage.loginPage.login(new Credentials());
        applicationPage.accountServicesPage.transferFundsClick();
        applicationPage.transferFundsPage.transferFunds(new Transaction(1000000,12345 ,12456));
        applicationPage.transferFundsPage.verifyMessage();
    }

}
