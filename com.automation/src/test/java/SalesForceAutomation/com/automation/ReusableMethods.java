package SalesForceAutomation.com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReusableMethods {
	static WebDriver driver;
	static ExtentTest logger;
	static ExtentReports report = new ExtentReports("/Users/krishnayallappa/Desktop/ExtentReport/sample.html");
//		String path = "/Users/krishnayallappa/Desktop/ExtentReport/sample.html";
//		report = new ExtentReports(path);
		
	
	
	public static ExtentTest CreateTestScriptReport(String TestScriptName) {
		logger = report.startTest(TestScriptName);
		return logger;
	}


public static void initialize_driver() {
	System.setProperty("webdriver.chrome.driver", "/Users/krishnayallappa/Desktop/Tools/libs/drivers/chromedriver");
	driver = new ChromeDriver();
}
 public static void launchURL() {
	initialize_driver();
	driver.get("https://www.salesforce.com/");
	driver.manage().window().maximize();
	System.out.println("SalesForce Application Launched");
}
	
	/* Name of the method: enterText
	 * Brief Description: Enter text into the text box
	 * Arguments: obj- Web object, text--text to be entered, objName-- Name of the object
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	public static void enterText(WebElement obj, String text, String objName) {
		if(obj.isEnabled()) {
			obj.sendKeys(text);
			System.out.println("pass: " +text+"is entered in" +objName+"field");
			logger.log(LogStatus.PASS,text + "value is entered in" +objName+ "field");
		}else {
			System.out.println("Fail: "+objName+"field is not enable, please check this");
			logger.log(LogStatus.FAIL, text + objName + "field does not exist please check application");
		}
	}
	
	/* Name of the method: enterTextDisapled
	 * Brief Description: Enter text into the text box
	 * Arguments: obj- Web object, text--text to be entered, objName-- Name of the object
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	public static void enterTextDisapled(WebElement obj, String text, String objName) throws InterruptedException {
		if(obj.isDisplayed()) {
			Thread.sleep(4000);
			obj.sendKeys(text);
			System.out.println("pass: " +text+"is entered in" +objName+"field");
			logger.log(LogStatus.PASS,text + "value is entered in" +objName+ "field");
		}else {
			System.out.println("Fail: "+objName+"field is not enable, please check this");
			logger.log(LogStatus.FAIL, text + objName + "field does not exist please check application");
		}
	}
	
	/* Name of the method: clickButton
	 * Brief Description: Click on the object
	 * Arguments: obj- Web object, objName-- Name of the object
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	public static void click(WebElement obj, String objName) {
		if(obj.isEnabled()) {
			obj.click();
			System.out.println("Pass: "+objName+"click is done");
			logger.log(LogStatus.PASS, objName+ "button is clicked");
		}else {
			System.out.println("Fail: "+objName + "button is not displayed, please check the application");
			logger.log(LogStatus.FAIL, objName + "button is not displayed, please check the application");
		}
	}
	
	/* Name of the method: checkBox
	 * Brief Description: CheckBox the object
	 * Arguments: obj- Web object, objName-- Name of the object
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	public static void selectCheckBox(WebElement obj, String objName) {
		if(obj.isDisplayed()) {
			if(obj.isSelected()) {
				System.out.println("Pass: " +objName+ "is already selected");
			}else {
				obj.click();
				System.out.println("Pass: " +objName+ "is selected");
				logger.log(LogStatus.PASS, objName + "is selected");
			}
		}else {
			System.out.println("Fail: " +objName+ "is not present, please check the application");
			logger.log(LogStatus.FAIL, objName+ "is not present, please check the application");
		}
	}
	
	/* Name of the method: selectDropDown
	 * Brief Description: Select the DropDown list
	 * Arguments: obj- Web object, objName-- Name of the object
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	public static void selectDropDown(WebElement obj, String objName) {
		if(obj.isEnabled()) {
			if(obj.isSelected()) {
				System.out.println("Pass: " +objName+ "is already selected");
			}else {
				obj.click();
				System.out.println("Pass: " +objName+ "is selected");
				logger.log(LogStatus.PASS, objName + "is selected");
			}
		}
		else {
			System.out.println("Fail: " +objName+ "is not present, please check the application");
			logger.log(LogStatus.FAIL, objName+ "is not present, please check the application");
		}
	}
	
	/* Name of the method: validationTextMessage
	 * Brief Description: Validation Block
	 * Arguments: obj- Web object, String expectedName, String objName
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	
	public static void validateTextMessage(WebElement obj, String expectedName, String objName) {
		String actualMessage;
		if(obj.isEnabled()) {
			actualMessage = obj.getText();
			if(actualMessage.equals(expectedName)) {
				System.out.println("Pass..");
			}else {
				System.out.println("Fail..");
			}
			System.out.println("Pass: "+ objName +" is clicked ");
			logger.log(LogStatus.PASS, objName + "is selected");
		}else {
			System.out.println("Fail: " + objName + "is not present, please check the application");
			logger.log(LogStatus.FAIL, objName+ "is not present, please check the application");
		}
	}
	
	/* Name of the method: iFrame
	 * Brief Description: iFrame using WebElement
	 * Arguments: obj- Web object, WebDriver driver
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	
	public static void switchFrame(WebElement obj, WebDriver driver) {
		if(obj.isEnabled()) {
			driver.switchTo().frame(obj);
			System.out.println("Pass: "+obj+"Switch is performed");
			logger.log(LogStatus.PASS, "Switch to frame");
		}else {
			System.out.println("Fail: "+obj+"Switch is unable to performe");
			logger.log(LogStatus.FAIL, "Switch is unable to performe");
		}
	}
	
	/* Name of the method: Switch Frame id
	 * Brief Description: Frame id
	 * Arguments: obj- Web object, WebDriver driver
	 * Created by: Automation Team
	 * Creation Date : July 15 2019
	 * Last Modified : July 15 2019
	 * */
	public static void switchFrameid(WebElement obj, WebDriver driver) {
		if(obj.isEnabled()) {
			driver.switchTo().frame(obj);
			System.out.println("Pass: "+obj+"Switch is performed");
			logger.log(LogStatus.PASS, "Switch to frame");
		}else {
			System.out.println("Fail: "+obj+"Switch is unable to performe");
			logger.log(LogStatus.FAIL, "Switch is unable to performe");
		}
	}


}
