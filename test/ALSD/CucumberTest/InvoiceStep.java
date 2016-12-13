package ALSD.CucumberTest;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvoiceStep {
	
	WebDriver driver;

	@Given("^Open browser and start application$") 
	public void StartApplication(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9091/#/others/invoice");
	}

	@When("^I enter the data into the invoice form$")
	public void EnterData(Map<String, String> dataList) {
		driver.findElement(By.id("companyid")).sendKeys("53909614");
		driver.findElement(By.id("total-dollar")).sendKeys("10000");
		driver.findElement(By.id("dateInput")).clear();
		driver.findElement(By.id("dateInput")).sendKeys("2016 年 12 月 10 日");
		
		WebDriverWait wait = new WebDriverWait(driver, 2);

		WebElement textbox = driver.findElement(By.id("companyName"));
		wait.until(ExpectedConditions.attributeContains(textbox, "value", "泰迪軟體科技有限公司"));
		driver.findElement(By.id("button-preview")).click();
		
	}

	@Then("^I click preview button and see the result$")
	public void ClickPreviewButton() throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);
		assertTrue(driver.findElement(By.id("invoice-result")).isDisplayed());
		driver.quit();
	}
}