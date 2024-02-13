package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class PlaceOrderTest {
	WebDriver driver;
	HomePage homePage;
	SearchResultPage resultPage;
	ShoppingCartPage cartPage;
	CheckOutPage checkoutPage;
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver=TestBase.getDriver();
		homePage=new HomePage(driver);
		resultPage=new SearchResultPage(driver);
		cartPage=new ShoppingCartPage(driver);
		checkoutPage=new CheckOutPage(driver);
	}
	@BeforeTest
	public void setup() {
		TestBase.openUrl("http://danube-webshop.herokuapp.com/");
	}
  @Test(priority=1)
  public void addToCartTest() {
	  homePage.searchItem("Parry Hotter");
	  resultPage.viewItemDetail();
	  resultPage.addToCart();
	  boolean checkCart=cartPage.isItemAdded();
	  Assert.assertTrue(checkCart);
  }
  @Test(priority=2)
  public void checkoutTest() {
	  cartPage.addCoupon();
	  cartPage.doCheckout();
  }
  @Test(priority=3)
  public void orderConfirmTest() {
	  checkoutPage.filling(driver);
	  boolean check=driver.findElement(By.id("order-confirmation")).isDisplayed();
	  Assert.assertTrue(check);
  }
  
}
