package SalesForceAutomation.com.automation;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
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
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
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
		@Test(priority=3)
		public static void testCase4B() {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"ykdeepth","upassword");
			
			WebElement rememberMe = driver.findElement(By.xpath("//input[@id='rememberUn']"));
			selectCheckBox(rememberMe,"click on remember me");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			
			
		}
		@Test(priority=5)
		public static void testCase5() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(4000);
			WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav']"));
			click(userMenu,"usermenu");
			
		}
//		@Test(priority=6) //Pending
//		public static void testCase6() {
//			CreateTestScriptReport("testCase3");
//			launchURL();
//			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
//			loginPage.click();
//			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
//			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
//			
//			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//			enterText(password,"Ykdeepthi024*","upassword");
//			
//			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
//			click(login,"loginpage");
//		}
		@Test(priority=7) 
		public static void testCase8() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(4000);
			WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav']"));
			click(userMenu,"usermenu");
			Thread.sleep(4000);
			WebElement developerConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
			click(developerConsole,"DeveloperConsole");
			
			 String originalHandle = driver.getWindowHandle();

			    for(String handle : driver.getWindowHandles()) {
			        if (!handle.equals(originalHandle)) {
			            driver.switchTo().window(handle);
			            driver.close();
			        }
			    }
		}
		@Test(priority=8) 
		public static void testCase9() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(4000);
			WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav']"));
			click(userMenu,"usermenu");
			Thread.sleep(4000);
			WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			click(logoutButton,"logoutpage");
		}
		@Test(priority=9) 
		public static void testCase10() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(4000);
			WebElement accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
			click(accounts,"Accountpage");
			Thread.sleep(4000);
			WebElement newButton = driver.findElement(By.xpath("//input[@name='new']"));
			click(newButton,"NewButton");
		}
		@Test(priority=10) 
		public static void testCase11() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(4000);
			WebElement accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
			click(accounts,"Accountpage");
			Thread.sleep(4000);
			WebElement createnewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			click(createnewView,"CreateView");
			Thread.sleep(4000);
			WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(viewName,"abcd","ViewName");
			Thread.sleep(4000);
			WebElement saveButton = driver.findElement(By.xpath("//input[@class='btn primary']"));
			click(saveButton,"SaveButton");
		}
//		@Test(priority=11) 
//		public static void testCase12() throws InterruptedException {
//			CreateTestScriptReport("testCase3");
//			launchURL();
//			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
//			loginPage.click();
//			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
//			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
//			
//			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//			enterText(password,"Ykdeepthi024*","upassword");
//			
//			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
//			click(login,"loginpage");
//			Thread.sleep(4000);
//			WebElement accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
//			click(accounts,"Accountspage");
//			
//			WebElement viewdropdown = driver.findElement(By.xpath("//select[@id='fcf']"));
//			Select select = new Select(viewdropdown);
//			select.selectByVisibleText("abcd");
//			Thread.sleep(3000);
//			WebElement editButton = driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));
//			click(editButton,"EditButton");
//			Thread.sleep(3000);
//			WebElement viewName = driver.findElement(By.id("fname"));
//			viewName.clear();
//			Thread.sleep(3000);
//			WebElement newViewName = driver.findElement(By.id("fname"));
//			enterText(newViewName,"efgh","NewViewName");
//			Thread.sleep(3000);
//			WebElement field = driver.findElement(By.xpath("//select[@id='fcol1']"));
//			Select select1 = new Select(field);
//			select1.selectByVisibleText("Account Name");
//			Thread.sleep(3000);
//			WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']//option[contains(text(),'contains')]"));
//			click(operator,"Operator");
//			Thread.sleep(3000);
//			WebElement value = driver.findElement(By.id("fval1"));
//			enterText(value,"a","ValueName");
//			Thread.sleep(3000);
//			WebElement availableField = driver.findElement(By.xpath("//select[@id='colselector_select_0']//option[contains(text(),'Last Activity')]"));
//			click(availableField,"FieldClick");
//			Thread.sleep(3000);
//			WebElement addButton = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
//			click(addButton,"AddButton");
//			Thread.sleep(3000);
//			WebElement saveButton = driver.findElement(By.xpath("//input[@class='btn primary']"));
//			click(saveButton,"SaveButton");
//		}
		@Test(priority=12) 
		public static void testCase13() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(3000);
			WebElement accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
			click(accounts,"Accountspage");
			Thread.sleep(3000);
			WebElement merge = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
			click(merge,"MergeClick");
			Thread.sleep(3000);
			WebElement accountName = driver.findElement(By.id("srch"));
			enterText(accountName,"efgh","AccountName");

			WebElement findAccount = driver.findElement(By.xpath("//input[@name='srchbutton']"));
			click(findAccount,"FindAccount");
		}
		@Test(priority=13) 
		public static void testCase14() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(3000);
			WebElement accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
			click(accounts,"Accountspage");
			Thread.sleep(3000);
			WebElement lastActivity = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
			click(lastActivity,"LastActivitypage");
			Thread.sleep(3000);
			WebElement from = driver.findElement(By.name("startDate"));
			from.sendKeys("7/15/2019");
			Thread.sleep(3000);
			WebElement to = driver.findElement(By.name("endDate"));
			to.sendKeys("7/15/2019");;
			Thread.sleep(3000);
			WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
			click(save,"Savepage");

		}
		@Test(priority=14) 
		public static void testCase15() throws InterruptedException {
			CreateTestScriptReport("testCase3");
			launchURL();
			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
			loginPage.click();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Ykdeepthi024*","upassword");
			
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			click(login,"loginpage");
			Thread.sleep(3000);
			WebElement opportunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
			click(opportunities,"Opportunities");
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='fcf']"));
			Select select = new Select(dropdown);  
			List<WebElement> options = select.getOptions();  
			for(WebElement we:options)  
			{  
			 System.out.println(we.getText());  
			}  
		}
//		@Test(priority=15) 
//		public static void testCase16() throws InterruptedException {
//			CreateTestScriptReport("testCase3");
//			launchURL();
//			WebElement loginPage = driver.findElement((By.xpath("//a[contains(text(),'Login')]")));
//			loginPage.click();
//			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
//			enterText(userName,"deepthi.krishnadeepthi-ozux@force.com","uName");
//			
//			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//			enterText(password,"Ykdeepthi024*","upassword");
//			
//			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
//			click(login,"loginpage");
//			Thread.sleep(3000);
//			WebElement opportunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
//			click(opportunities,"Opportunities");
//			Thread.sleep(3000);
//			WebElement newButton = driver.findElement(By.xpath("//input[@name='new']"));
//			click(newButton,"NewButton");
//			Thread.sleep(3000);
//			WebElement oppotunityName = driver.findElement(By.xpath("//input[@id='opp3']"));
//			enterText(oppotunityName,"Anju","OppotunityName");
//			Thread.sleep(3000);
//			WebElement accountName = driver.findElement(By.xpath("//input[@id='opp4']"));
//			enterText(accountName,"Manju","AccountName");
//			Thread.sleep(3000);
//			WebElement closeDate = driver.findElement(By.xpath("//td[contains(text(),'12')]"));
//			click(closeDate,"CloseDate");
//		}

	}


