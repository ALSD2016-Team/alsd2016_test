package ALSD.CucumberTest;

import static org.junit.Assert.assertTrue;
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

public class InvoiceStep {
	
	WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	@Given("^Open browser and open the application of triplicate uniform invoice$") 
	public void StartTUIApplication(){

		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:9091/#/others/invoice");
	}

	@When("^I enter the data into the form of triplicate uniform invoice$")
	public void EnterDataToTUI(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("TUI_itemName")).clear();
		driver.findElement(By.id("TUI_itemName")).sendKeys(dataList.get("itemName"));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("TUI_itemDollar")).clear();
		driver.findElement(By.id("TUI_itemDollar")).sendKeys(dataList.get("itemDollar"));
		TimeUnit.SECONDS.sleep(1);
		
		driver.findElement(By.id("companyid")).sendKeys(dataList.get("componyId"));
		driver.findElement(By.id("dateInput")).clear();
		driver.findElement(By.id("dateInput")).sendKeys(dataList.get("date"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement textbox = driver.findElement(By.id("companyName"));
		wait.until(ExpectedConditions.attributeContains(textbox, "value", dataList.get("companyName")));
		driver.findElement(By.id("button-preview")).click();
		
	}

	@Then("^I click preview button and see the result of triplicate uniform invoice$")
	public void ClickTUIPreviewButton(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);
		
		assertEquals(dataList.get("date"), driver.findElement(By.id("result_date")).getText());
		assertEquals(dataList.get("companyName"), driver.findElement(By.id("result_company")).getText());
		
		String companyId = driver.findElement(By.id("result_compony_id_0")).getText() +
				driver.findElement(By.id("result_compony_id_1")).getText() + 
				driver.findElement(By.id("result_compony_id_2")).getText() + 
				driver.findElement(By.id("result_compony_id_3")).getText() + 
				driver.findElement(By.id("result_compony_id_4")).getText() +
				driver.findElement(By.id("result_compony_id_5")).getText() +
				driver.findElement(By.id("result_compony_id_6")).getText() +
				driver.findElement(By.id("result_compony_id_7")).getText() ;
		assertEquals(dataList.get("companyId"), companyId);
		
		assertEquals(dataList.get("year"), driver.findElement(By.id("result_year")).getText());
		assertEquals(dataList.get("month"), driver.findElement(By.id("result_month")).getText());
		assertEquals(dataList.get("day"), driver.findElement(By.id("result_day")).getText());
		assertEquals(dataList.get("itemName"), driver.findElement(By.id("result_item_name")).getText());
		assertEquals(dataList.get("itemCount"), driver.findElement(By.id("result_item_count")).getText());
		assertEquals(dataList.get("itemDollar"), driver.findElement(By.id("result_item_dollar")).getText());
		assertEquals(dataList.get("itemTotalDollar"), driver.findElement(By.id("result_item_total_dollar")).getText());
		assertEquals(dataList.get("salesDollar"), driver.findElement(By.id("result_sales_dollar")).getText());
		assertEquals(dataList.get("businessTax"), driver.findElement(By.id("result_business_tax")).getText());
		
		String numberWord = 
				driver.findElement(By.id("result_number_word_4")).getText() +
				driver.findElement(By.id("result_number_word_5")).getText() +
				driver.findElement(By.id("result_number_word_6")).getText() +
				driver.findElement(By.id("result_number_word_7")).getText() +
				driver.findElement(By.id("result_number_word_8")).getText() ;
		
		assertEquals(dataList.get("numberWord"), numberWord);
		driver.quit();
	}

	@Given("^Open browser and open the application of duplicate uniform invoice$") 
	public void StartDUIApplication() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("http://140.124.181.126:9091/#/others/invoice");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("DUI_button")).click();
	}
	
	@When("^I enter the data into the form of duplicate uniform invoice$")
	public void EnterDataToDUI(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("CompanyName")).clear();
		driver.findElement(By.id("CompanyName")).sendKeys(dataList.get("companyName"));

		driver.findElement(By.id("DUI_itemName")).clear();
		driver.findElement(By.id("DUI_itemName")).sendKeys(dataList.get("itemName"));

		driver.findElement(By.id("DUI_itemNumber")).clear();
		driver.findElement(By.id("DUI_itemNumber")).sendKeys(dataList.get("itemNumber"));

		driver.findElement(By.id("DUI_itemDollar")).clear();
		driver.findElement(By.id("DUI_itemDollar")).sendKeys(dataList.get("itemDollar"));

		driver.findElement(By.id("DUI_dateInput")).clear();
		driver.findElement(By.id("DUI_dateInput")).sendKeys(dataList.get("date"));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("DUI_previewButton")).click();
		
	}
	
	@When("^I click preview button and see the result of duplicate uniform invoice$")
	public void ClickDUIPreviewButton(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);
		
		assertEquals(dataList.get("date"), driver.findElement(By.id("DUI_result_date")).getText());
		assertEquals(dataList.get("companyName"), driver.findElement(By.id("DUI_result_companyName")).getText());

		assertEquals(dataList.get("year"), driver.findElement(By.id("DUI_result_year")).getText());
		assertEquals(dataList.get("month"), driver.findElement(By.id("DUI_result_month")).getText());
		assertEquals(dataList.get("day"), driver.findElement(By.id("DUI_result_day")).getText());
		assertEquals(dataList.get("itemName"), driver.findElement(By.id("DUI_result_itemName")).getText());
		assertEquals(dataList.get("itemNumber"), driver.findElement(By.id("DUI_result_itemNumber")).getText());
		assertEquals(dataList.get("itemDollar"), driver.findElement(By.id("DUI_result_itemDollar")).getText());
		assertEquals(dataList.get("itemTotalDollar"), driver.findElement(By.id("DUI_result_itemTotalDollar")).getText());
		assertEquals(dataList.get("totalDollar"), driver.findElement(By.id("DUI_result_totalDollar")).getText());
		
		String numberWord = 
				driver.findElement(By.id("DUI_result_numberWord_4")).getText() +
				driver.findElement(By.id("DUI_result_numberWord_5")).getText() +
				driver.findElement(By.id("DUI_result_numberWord_6")).getText() +
				driver.findElement(By.id("DUI_result_numberWord_7")).getText() +
				driver.findElement(By.id("DUI_result_numberWord_8")).getText() ;
		
		assertEquals(dataList.get("numberWord"), numberWord);
		driver.quit();
	}
}