package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
  @FindBy(id="s-name")
  WebElement name;
  @FindBy(id="s-surname")
  WebElement surname;
  @FindBy(id="s-address")
  WebElement address;
  @FindBy(id="s-zipcode")
  WebElement zipcode;
  @FindBy(id="s-city")
  WebElement city;
  @FindBy(id="s-company")
  WebElement company;
  @FindBy(id="billing-different")
  WebElement checkbox;
  @FindBy(xpath="//button[text()='Buy']")
  WebElement buyBtn;
  
  public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

  public void filling(WebDriver driver) {
	  name.sendKeys("Priya");
	  surname.sendKeys("guna");
	  address.sendKeys("abc");
	  zipcode.sendKeys("9786");
	  city.sendKeys("Namakkal");
	  company.sendKeys("zuci");
	//  checkbox.click();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.elementToBeClickable(buyBtn));
	  buyBtn.click();
  }
}
