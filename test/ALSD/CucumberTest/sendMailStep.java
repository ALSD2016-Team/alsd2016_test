package ALSD.CucumberTest;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sendMailStep {
	
	WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	//Scenario: Preview email content 
	@Given("^Enter sendMail application and select course$") 
	public void StartSendMailApp(Map<String, String> dataList) throws InterruptedException {
		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/sendMail/#/");
		
		driver.findElement(By.id("courseCheckbox")).sendKeys(dataList.get("courseName"));
		
		driver.findElement(By.id("ccCheckbox_0")).click();
		driver.findElement(By.id("ccCheckbox_1")).click();
		driver.findElement(By.id("ccCheckbox_2")).click();
	}

	@When("^I click generate button$")
	public void ClickGenerateBtn() throws InterruptedException {
		driver.findElement(By.id("preview_submit")).click();	
	}

	@Then("^I can preview the email content$")
	public void PreviewEmailContent(Map<String, String> dataList) throws Throwable {
		TimeUnit.MILLISECONDS.sleep(500);
		driver.findElement(By.id("inpRec_Name")).sendKeys(dataList.get("studnetName"));
		assertEquals(dataList.get("mailContent"), driver.findElement(By.name("previewBox")).getAttribute("value") );
		TimeUnit.SECONDS.sleep(1);
		driver.quit();
	}
	
	//Scenario: Send email to student
	@Given("^Enter sendMail application after check mail content was right$") 
	public void StartSendMailAppTwice(Map<String, String> dataList) throws InterruptedException {
		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/sendMail/#/");
		
		driver.findElement(By.id("courseCheckbox")).sendKeys(dataList.get("courseName"));
		
		driver.findElement(By.id("ccCheckbox_0")).click();
		driver.findElement(By.id("ccCheckbox_1")).click();
		driver.findElement(By.id("ccCheckbox_2")).click();
		driver.findElement(By.id("preview_submit")).click();
	}
	@When("^I click send button and check to send$")
	public void ClickSendBtn() throws InterruptedException {
		driver.findElement(By.id("send_submit")).click();
		driver.switchTo().alert().accept();
	}

	@Then("^I will get successful message on alert$")
	public void CheckSucMsg(Map<String, String> dataList) throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		assertEquals(dataList.get("alertMsg") , driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();
	}
	
	//Scenario: Send email select no course
	@Given("^Enter sendMail application and do not select course name$") 
	public void StartSendMailAppSelectNoCourse() throws InterruptedException {
		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/sendMail/#/");
	}
	@When("^I click generate button and send button$")
	public void ClickGenerateBtnandSendBtn() throws InterruptedException {
		driver.findElement(By.id("preview_submit")).click();
		driver.findElement(By.id("send_submit")).click();
	}

	@Then("^It will be disabled$")
	public void CheckDisabled(Map<String, String> dataList) throws Throwable {
		assertEquals(dataList.get("disabled") , driver.findElement(By.id("preview_submit")).getAttribute("disabled"));
		assertEquals(dataList.get("disabled") , driver.findElement(By.id("send_submit")).getAttribute("disabled"));
		
		driver.quit();
	}
	
	//Scenario: Send email app Select course but select no student
	@Given("^Enter sendMail application and select course name and uncheck student$") 
	public void StartSendMailAppSelectNoStudent(Map<String, String> dataList) throws InterruptedException {
		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/sendMail/#/");
		
		driver.findElement(By.id("courseCheckbox")).sendKeys(dataList.get("courseName"));
		
		driver.findElement(By.id("ccCheckbox_0")).click();
		driver.findElement(By.id("ccCheckbox_1")).click();
		driver.findElement(By.id("ccCheckbox_2")).click();
		driver.findElement(By.name("checkbox_name")).click();
		driver.findElement(By.id("preview_submit")).click();
	}
	@When("^I click send mail button$")
	public void ClickSendButton() throws InterruptedException {
		driver.findElement(By.id("send_submit")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.switchTo().alert().accept();
	}

	@Then("^It will tell me should choose student$")
	public void CheckAlert(Map<String, String> dataList) throws Throwable {
		assertEquals(dataList.get("alertMsg") , driver.switchTo().alert().getText());
		TimeUnit.SECONDS.sleep(1);
		driver.switchTo().alert().accept();
		
		driver.quit();
	}
}