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

	@Given("^Open browser and start application$") 
	public void StartApplication(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://localhost:9091/#/others/invoice");
	}

	@When("^I enter the data into the invoice form$")
	public void EnterData(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("item-name")).clear();
		driver.findElement(By.id("item-name")).sendKeys(dataList.get("itemName"));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("item-dollar")).clear();
		driver.findElement(By.id("item-dollar")).sendKeys(dataList.get("itemDollar"));
		TimeUnit.SECONDS.sleep(1);
		
		driver.findElement(By.id("companyid")).sendKeys(dataList.get("componyId"));
		driver.findElement(By.id("dateInput")).clear();
		driver.findElement(By.id("dateInput")).sendKeys("2016 年 12 月 10 日");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement textbox = driver.findElement(By.id("companyName"));
		wait.until(ExpectedConditions.attributeContains(textbox, "value", "泰迪軟體科技有限公司"));
		driver.findElement(By.id("button-preview")).click();
		
	}

	@Then("^I click preview button and see the result$")
	public void ClickPreviewButton(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);

		assertEquals("一 O 五 年 十一、十二 月 份", driver.findElement(By.id("result_date")).getText());
		assertEquals("泰迪軟體科技有限公司", driver.findElement(By.id("result_company")).getText());
		
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
		
		String numberWord = driver.findElement(By.id("result_number_word_4")).getText() +
				driver.findElement(By.id("result_number_word_5")).getText() +
				driver.findElement(By.id("result_number_word_6")).getText() +
				driver.findElement(By.id("result_number_word_7")).getText() +
				driver.findElement(By.id("result_number_word_8")).getText() ;
		assertEquals(numberWord, "壹零零零參");
		driver.quit();
	}
}