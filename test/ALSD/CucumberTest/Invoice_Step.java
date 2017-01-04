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

public class Invoice_Step {
	
	WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	@Given("^Open browser and open the application of triplicate uniform invoice$") 
	public void StartTUIApplication(){

		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://140.124.181.126:9001/#/others/invoice"); 
		//driver.get("http://localhost:9001/");
	}

	@When("^I enter the CorrectData into the form of triplicate uniform invoice$")
	public void EnterDataToTUI(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("TUI_itemName")).clear();
		driver.findElement(By.id("TUI_itemName")).sendKeys(dataList.get("itemName"));
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("TUI_itemDollar")).clear();
		driver.findElement(By.id("TUI_itemDollar")).sendKeys(dataList.get("itemDollar"));
		TimeUnit.SECONDS.sleep(1);
		
		driver.findElement(By.id("companyid")).sendKeys(dataList.get("companyId"));
		driver.findElement(By.id("dateInput")).clear();
		driver.findElement(By.id("dateInput")).sendKeys(dataList.get("date"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement textbox = driver.findElement(By.id("companyName"));
		wait.until(ExpectedConditions.attributeContains(textbox, "value", dataList.get("companyName")));
		TimeUnit.SECONDS.sleep(1);
		
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
		
		TimeUnit.SECONDS.sleep(1);
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
		
	
		TimeUnit.SECONDS.sleep(1);
        driver.quit();
	
		
	}
	
	
	//Scenario: Enter Wrong companyId format
	
	@When("^I enter the wrong format Data into companyId input$")
	public void EnterDataToWrongIdUI(Map<String, String> dataList) throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("companyid")).sendKeys(dataList.get("companyId"));
	}
	
	@Then("^isCompanyIdError message show$")
	public void isCompanyIdErrorMmessageShow(Map<String, String> dataList) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("is-company-id-error-message")));
		
		TimeUnit.SECONDS.sleep(1);
		assertEquals(dataList.get("displayShow"), driver.findElement(By.id("is-company-id-error-message")).getCssValue("display"));
        
        driver.quit();	
	}
	
	//Scenario: When_HasNotEntercompanyIdInTriplicateUniform_Expect_InvoicePreviewDontShow
//		@Given("^Open browser and open the application of triplicate uniform invoice$") 
		
		@When("^I Has not enter companyId into comaonyId input$")
		public void HasNotEntercompanyIdFormatInTriplicateUniformI(Map<String, String> dataList) throws InterruptedException {
			TimeUnit.SECONDS.sleep(1);
			driver.findElement(By.id("TUI_itemName")).clear();
			driver.findElement(By.id("TUI_itemName")).sendKeys(dataList.get("itemName"));
			TimeUnit.SECONDS.sleep(1);
			driver.findElement(By.id("TUI_itemDollar")).clear();
			driver.findElement(By.id("TUI_itemDollar")).sendKeys(dataList.get("itemDollar"));
			TimeUnit.SECONDS.sleep(1);
			
			driver.findElement(By.id("dateInput")).clear();
			driver.findElement(By.id("dateInput")).sendKeys(dataList.get("date"));
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.id("button-preview")).click();
		}
		
		@Then("^Invoice Preview don't show and companyId,companyName input color to red$")
		public void InvoicePreviewDontShowAndcompanyIdCompanyNameInputColorToRed(Map<String, String> dataList) throws Throwable {
			
			TimeUnit.SECONDS.sleep(5);
			assertEquals(dataList.get("visibility"), driver.findElement(By.id("invoice-result")).getCssValue("visibility"));
			assertEquals(dataList.get("companyIdColor"), driver.findElement(By.id("companyid")).getCssValue("border-color"));
			assertEquals(dataList.get("companyNameColor"), driver.findElement(By.id("companyName")).getCssValue("border-color"));
         
            driver.quit();
	        
		}
		
		//Scenario: When_HasNotEnterItemDollarInTriplicateUniform_Expect_InvoicePreviewDontShow
				//@Given("^Open browser and open the application of triplicate uniform invoice$") 
				
				@When("^I Has not enter ItemDollar into companyId input$")
				public void HasNotEnterItemDollarInTriplicateUniformI(Map<String, String> dataList) throws InterruptedException {
					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("TUI_itemName")).clear();
					driver.findElement(By.id("TUI_itemName")).sendKeys(dataList.get("itemName"));
					TimeUnit.SECONDS.sleep(1);
					
					
					driver.findElement(By.id("companyid")).sendKeys(dataList.get("companyId"));
					driver.findElement(By.id("dateInput")).clear();
					driver.findElement(By.id("dateInput")).sendKeys(dataList.get("date"));
					
					WebDriverWait wait = new WebDriverWait(driver, 5);
					WebElement textbox = driver.findElement(By.id("companyName"));
					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("button-preview")).click();
				}
				
				@Then("^Invoice Preview don't show and TUI_itemDollar,totalDollar,salesDollar input color to red$")
				public void InvoicePreviewDontShowTUIItemDollarTotalDollarSalesDollarInputToRed (Map<String, String> dataList) throws Throwable {

					try
			        {
						TimeUnit.SECONDS.sleep(1);
						assertEquals(dataList.get("visibility"), driver.findElement(By.id("invoice-result")).getCssValue("visibility"));
						WebDriverWait wait = new WebDriverWait(driver, 5);
						assertEquals(dataList.get("TUI_itemDollarColor"), driver.findElement(By.id("TUI_itemDollar")).getCssValue("border-color"));
						assertEquals(dataList.get("totalDollarColor"), driver.findElement(By.id("total-dollar")).getCssValue("border-color"));
						assertEquals(dataList.get("salesDollarColor"), driver.findElement(By.id("sales-dollar")).getCssValue("border-color"));
			         }
			        finally {
			            driver.quit();
			        }
				}
				
//				Duplicate uniform invoice
				@Given("^Open browser and open the application of duplicate uniform invoice$")
				public void StartDUIApplication() throws InterruptedException{
					if(OS.indexOf("win") >= 0)
						System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
					else
						System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

					driver = new ChromeDriver();
					driver.get("http://140.124.181.126:9001/#/others/invoice");
//					driver.get("http://localhost:9001/");
					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("DUI_button")).click();
				}
				//	完整通過的測試
				@When("^I enter the data into the form of duplicate uniform invoice and I click preview button$")
				public void I_enter_the_data_into_the_form_of_duplicate_uniform_invoice_and_I_click_preview_button(Map<String, String> dataList) throws InterruptedException {

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

				@Then("^I will see the result of duplicate uniform invoice$")
				public void I_will_see_the_result_of_duplicate_uniform_invoice(Map<String, String> dataList) throws Throwable {

					TimeUnit.SECONDS.sleep(2);
					try {
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

					} finally {
						TimeUnit.SECONDS.sleep(1);
						driver.quit();
					}
				}

				//	CompanyName 未輸入
				@When("^I enter the data into the form of duplicate uniform invoice but company name field is empty and I click preview button$")
				public void I_enter_the_data_into_the_form_of_duplicate_uniform_invoice_but_company_name_field_is_empty_and_I_click_preview_button(Map<String, String> dataList) throws InterruptedException {

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("CompanyName")).clear();

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

				@Then("^I will see the result of duplicate uniform invoice and company name is empty$")
				public void I_will_see_the_result_of_duplicate_uniform_invoice_and_company_name_is_empty(Map<String, String> dataList) throws Throwable {

					TimeUnit.SECONDS.sleep(2);
					try {
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

					} finally {
						TimeUnit.SECONDS.sleep(1);
						driver.quit();
					}
				}

				//	itemDollar 未輸入
				@When("^I enter the data into the form of duplicate uniform invoice but item dollar field is empty and I click preview button$")
				public void I_enter_the_data_into_the_form_of_duplicate_uniform_invoice_but_item_dollar_field_is_empty_and_I_click_preview_button(Map<String, String> dataList) throws InterruptedException {

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("CompanyName")).clear();

					driver.findElement(By.id("DUI_itemName")).clear();
					driver.findElement(By.id("DUI_itemName")).sendKeys(dataList.get("itemName"));

					driver.findElement(By.id("DUI_itemNumber")).clear();
					driver.findElement(By.id("DUI_itemNumber")).sendKeys(dataList.get("itemNumber"));

					driver.findElement(By.id("DUI_itemDollar")).clear();

					driver.findElement(By.id("DUI_dateInput")).clear();
					driver.findElement(By.id("DUI_dateInput")).sendKeys(dataList.get("date"));

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("DUI_previewButton")).click();
				}

				@Then("^I will see error notification of item dollar field and total dollar field$")
				public void I_will_see_error_notification_of_item_dollar_field_and_total_dollar_field(Map<String, String> dataList) throws Throwable {

					TimeUnit.SECONDS.sleep(3);
					try {
						assertEquals(dataList.get("itemDollarColor"), driver.findElement(By.id("DUI_itemDollar")).getCssValue("border-color"));
						assertEquals(dataList.get("totalDollarColor"), driver.findElement(By.id("total-dollar")).getCssValue("border-color"));
					}
					finally {
						TimeUnit.SECONDS.sleep(1);
						driver.quit();
					}
				}

				//	itemName 未輸入
				@When("^I enter the data into the form of duplicate uniform invoice but item name field is empty and I click preview button$")
				public void I_enter_the_data_into_the_form_of_duplicate_uniform_invoice_but_item_name_field_is_empty_and_I_click_preview_button(Map<String, String> dataList) throws InterruptedException {

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("CompanyName")).clear();

					driver.findElement(By.id("DUI_itemName")).clear();

					driver.findElement(By.id("DUI_itemNumber")).clear();
					driver.findElement(By.id("DUI_itemNumber")).sendKeys(dataList.get("itemNumber"));

					driver.findElement(By.id("DUI_itemDollar")).clear();
					driver.findElement(By.id("DUI_itemDollar")).sendKeys(dataList.get("itemDollar"));

					driver.findElement(By.id("DUI_dateInput")).clear();
					driver.findElement(By.id("DUI_dateInput")).sendKeys(dataList.get("date"));

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("DUI_previewButton")).click();
				}

				@Then("^I will see error notification of item name field$")
				public void I_will_see_error_notification_of_item_name_field(Map<String, String> dataList) throws Throwable {

					TimeUnit.SECONDS.sleep(2);
					try {
						assertEquals(dataList.get("itemNameColor"), driver.findElement(By.id("DUI_itemName")).getCssValue("border-color"));
						}
					finally {
						TimeUnit.SECONDS.sleep(1);
						driver.quit();
					}
				}

				//	itemNumber 未輸入
				@When("^I enter the data into the form of duplicate uniform invoice but item number field is empty and I click preview button$")
				public void I_enter_the_data_into_the_form_of_duplicate_uniform_invoice_but_item_number_field_is_empty_and_I_click_preview_button(Map<String, String> dataList) throws InterruptedException {

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("CompanyName")).clear();

					driver.findElement(By.id("DUI_itemName")).clear();
					driver.findElement(By.id("DUI_itemName")).sendKeys(dataList.get("itemName"));

					driver.findElement(By.id("DUI_itemNumber")).clear();

					driver.findElement(By.id("DUI_itemDollar")).clear();
					driver.findElement(By.id("DUI_itemDollar")).sendKeys(dataList.get("itemDollar"));

					driver.findElement(By.id("DUI_dateInput")).clear();
					driver.findElement(By.id("DUI_dateInput")).sendKeys(dataList.get("date"));

					TimeUnit.SECONDS.sleep(1);
					driver.findElement(By.id("DUI_previewButton")).click();
				}

				@Then("^I will see error notification of item number field and total dollar field$")
				public void I_will_see_error_notification_of_item_number_field_and_total_dollar_field(Map<String, String> dataList) throws Throwable {

					TimeUnit.SECONDS.sleep(2);
					try {
						assertEquals(dataList.get("itemNumberColor"), driver.findElement(By.id("DUI_itemNumber")).getCssValue("border-color"));
						assertEquals(dataList.get("totalDollarColor"), driver.findElement(By.id("total-dollar")).getCssValue("border-color"));
					}
					finally {
						TimeUnit.SECONDS.sleep(1);
						driver.quit();
					}
				}
	
}