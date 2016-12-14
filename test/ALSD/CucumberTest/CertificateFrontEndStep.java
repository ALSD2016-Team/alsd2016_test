package ALSD.CucumberTest;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CertificateFrontEndStep {
	
	WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	@Given("^Open browser and open certificate application$") 
	public void StartTUIApplication(){

		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/SLM2016/");
	}

	@When("^I enter the data into the form of certificate generator$")
	public void EnterDataToTUI(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("certificationId")).clear();
		driver.findElement(By.id("certificationId")).sendKeys(dataList.get("certificationId"));
		driver.findElement(By.id("studentName")).clear();
		driver.findElement(By.id("studentName")).sendKeys(dataList.get("studentName"));
		driver.findElement(By.id("courceDate")).clear();
		driver.findElement(By.id("courceDate")).sendKeys(dataList.get("courceDate"));
		driver.findElement(By.id("courceName")).clear();
		driver.findElement(By.id("courceName")).sendKeys(dataList.get("courceName"));
		driver.findElement(By.id("courceDuration")).clear();
		driver.findElement(By.id("courceDuration")).sendKeys(dataList.get("courceDuration"));
		driver.findElement(By.id("certificationDate")).clear();
		driver.findElement(By.id("certificationDate")).sendKeys(dataList.get("certificationDate"));
		
		TimeUnit.SECONDS.sleep(1);

		driver.findElement(By.id("buttonGenerate")).click();
		
	}

	@Then("^I click generate button and see the result of certificate generator$")
	public void ClickTUIPreviewButton(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);
		//check image is displayed
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someImg")));
		assertEquals(true, driver.findElement(By.id("someImg")).isDisplayed());
		
		driver.quit();
	}

}