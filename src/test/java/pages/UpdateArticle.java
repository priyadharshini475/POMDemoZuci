package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdateArticle {
    @FindBy(xpath="(//a[contains(text(),' Edit Article')])[1]")
    WebElement editBtn;
    
    @FindBy(xpath="//input[@placeholder='Article Title']")
    WebElement articleTitle;
    
    @FindBy(xpath="//input[@class='form-control ' and @name='description']")
    WebElement articleAbout;
    
    @FindBy(xpath="//textArea[@rows='8']")
    WebElement textArea;
    
     @FindBy(xpath="//input[@placeholder='Enter tags']")
    WebElement enterTags;
     
     @FindBy(xpath="//button[contains(text(),'Update Article')]")
     WebElement update_btn;
     
//     @FindBy(xpath="(//a[@href='#/'])[2]")
//     WebElement home_btn;
//      @FindBy(xpath="//img[@alt='Priyadharshini' and @class='user-pic']")
//      WebElement username;
//      
//      @FindBy(xpath="//a[@class='dropdown-item' and contains(@href, '#/profile')]")
//      WebElement profile;
      
//      @FindBy(xpath="//p[contains(text(),'Functional Testing-1 Details')]")
//      WebElement checkTitleBtn;
      
       @FindBy(xpath="//h1[contains(text(),'Unit Test1..')]")
       WebElement headerCheckBtn;
     
//     @FindBy(xpath="//button[@class='nav-link ']")
//     WebElement globalfeed;
     
     public  UpdateArticle(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
     }

	public void update(WebDriver driver) {
	         editBtn.click();
	    	 articleTitle.clear();
	    	 articleTitle.sendKeys("Unit Test1..");
	    	 articleAbout.clear();
	    	 articleAbout.sendKeys("About Unit Test1....");
	    	 textArea.clear();
	    	 textArea.sendKeys("Unit Testing-1 Details");
	    	  update_btn.click();
	    	  
//	    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//     	     wait.until(ExpectedConditions.elementToBeClickable(home_btn));
//	    	 home_btn.click();
	    //	 WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Articles not available.')]"));
	    //	 String check=ele.getText();
	   // 	  Assert.assertEquals("Articles not available.",check);
	    //	 globalfeed.click();
	    	// username.click();--
//	    	 Select select=new Select(profile);
//	    	 select.selectByVisibleText("Profile");
	    	// profile.click();--
	    	// System.out.println(checkTitleBtn.getText());
	    	  System.out.println("Updated Article Title-"+headerCheckBtn.getText());
	    	 Assert.assertEquals(headerCheckBtn.getText(),"Unit Test1..");
	    	 
	    	 }
//	public void navigateToHome(WebDriver driver) {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//  	     wait.until(ExpectedConditions.elementToBeClickable(home_btn));
//        home_btn.click();
//        globalfeed.click();
//	
//	}
}
