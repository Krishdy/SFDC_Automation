package SalesForceAutomation.com.automation;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AutomationScript_Test extends ReusableMethods{

	//public static void main(String[] args) {
		//static WebDriver driver;
		//static ExtentReports report;
		//static ExtentTest logger;

//		public static void main(String[] args) throws InterruptedException {
//			launchURL();
//			testCase1();
//			testCase3();
//			ReusableMethods.report.endTest(logger);
//			ReusableMethods.report.flush();
//		}
		@AfterClass
		public static void logger() {
			ReusableMethods.report.endTest(logger);
			ReusableMethods.report.flush();
		}
		
		
		
		@Test(priority=1)
		public static void testCase1() throws InterruptedException {
			CreateTestScriptReport("testCase1");
			launchURL();
			Thread.sleep(4000);
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"kdeepthiyallappa-yu3k@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			driver.close();
		}
		@Test(priority=2)
		public static void testCase3() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"kdeepthiyallappa-yu3k@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"ykdeepthi024*","upassword");
			
			WebElement rememberMe = driver.findElement(By.xpath("//input[@id='rememberUn']"));
			selectCheckBox(rememberMe,"click on remember me");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			
			Thread.sleep(3000);
			
			WebElement menuName = driver.findElement(By.xpath("//div[@id='userNav']"));
			click(menuName,"userName on dashboard");
			Thread.sleep(3000);
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			click(logout, "logoutPage");
		}

	}


