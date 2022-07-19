package Application.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
 public WebDriver driver;

 public AbstractPage(WebDriver driver){
  this.driver=driver;
 }

 public WebElement findElement(By by){

  WebDriverWait wait = new WebDriverWait(driver, 5);
  return wait.until(ExpectedConditions.presenceOfElementLocated(by));
 }

 public WebElement findSelectOptions(By by, By options){
  WebDriverWait wait = new WebDriverWait(driver, 5);
  return wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by,options));
 }

 //clicks an element
 public void click(By by)
 {
  findElement(by).click();
 }

 //sends keys
 public void sendKeys(By by,String value)
 {
  findElement(by).sendKeys(value);
 }

 //selects from dropdown
 public void selectFromDropdown(By by,String value)
 {
  var select=new Select(findElement(by));
  select.selectByVisibleText(value);
 }

 //navigates to url
 public void navigateToUrl(String url)
 {
  driver.navigate().to(url);
 }

 public void quitBrowser()
 {
  driver.quit();
 }
}
