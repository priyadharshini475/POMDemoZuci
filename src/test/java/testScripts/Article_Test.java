package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import base.TestBase;
//import commonUtils.Utility;
import pages.DeleteArticlePage;
import pages.LoginPageArticle;
import pages.NewArticlePageTest;
import pages.UpdateArticle;

public class Article_Test {
	WebDriver driver;
	//ExtentReports extentReports;
	//ExtentSparkReporter spark;
	//ExtentTest extentTest;
	LoginPageArticle loginPage;
	NewArticlePageTest newArticlePage;
	UpdateArticle updateArticle;
	DeleteArticlePage deleteArticle;
	public Article_Test() {
		TestBase.initDriver();
		driver=TestBase.getDriver();
		loginPage=new LoginPageArticle(driver);
		newArticlePage=new NewArticlePageTest(driver);
		updateArticle=new UpdateArticle(driver);
		deleteArticle=new DeleteArticlePage(driver);
	}
//	@BeforeTest
//	public void setupExtent() {
//		extentReports=new ExtentReports();
//		spark=new ExtentSparkReporter("test-output/Sparkreport.html")
//				   .viewConfigurer()
//				   .viewOrder()
//				   .as(new ViewName[] {
//						 ViewName.DASHBOARD,
//						 ViewName.TEST,
//						 ViewName.AUTHOR,
//						 ViewName.DEVICE,
//						 ViewName.LOG
//				   }).apply();
//	    extentReports.attachReporter(spark);
//	}

	
	@BeforeTest
	public void setup() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
	}
	@Test(priority=1)
	public void loginTest() {
		//extentTest=extentReports.createTest("Login Page Test");
		loginPage.loginTest("priyadharshini475507@gmail.com","abcd1234");
	}
	@Test(priority=2)
	public void newArticle() {
		//extentTest=extentReports.createTest("New Article Page Test");
		newArticlePage.newArticle();
	}
	@Test(priority=3)
	public void update_Article() {
		//extentTest=extentReports.createTest("Update Article Page Test");
		updateArticle.update(driver);
	}
	@Test(priority=4)
	public void delete_Article() {
		//extentTest=extentReports.createTest("Delete Article Page Test");
		deleteArticle.deleteArticle();
	}
//	 @AfterMethod
//	  public void teardown(ITestResult result) {
//		  extentTest.assignAuthor("Priyadharshini - AutomationTester1")
//		  .assignCategory("Smoke Test")
//		  .assignDevice(System.getProperty("os.name"))
//		  .assignDevice(System.getProperty("os.version"));
//		  
//		  if(ITestResult.FAILURE==result.getStatus()) {
//			  extentTest.log(Status.FAIL,result.getThrowable().getMessage());
//			  String strPath=Utility.getScreenshotPath(driver);
//			  
//			  extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(strPath).build());
//		  }
//		  else if(ITestResult.SKIP==result.getStatus()) {
//			  extentTest.log(Status.SKIP,result.getThrowable().getMessage());
//		  }
//		//  driver.close();
//	  }
//	 @AfterTest
//	   public void finishExtent() {
//		  extentReports.flush();
//	  }
}

