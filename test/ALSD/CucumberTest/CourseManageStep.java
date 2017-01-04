package ALSD.CucumberTest;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CourseManageStep {
	
	WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	@Given("^Open course management application$") 
	public void StartCourseManagementApplication() throws IOException{
		
		if(OS.indexOf("win") >= 0){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://140.124.181.129:8080/courseManage/#/courseInfo/create");
	}
	
	@When("I input correct value into form of create course$")
	public void InputCorrectValueToCM(Map<String, String> dataList) throws InterruptedException {
		driver.close();

	}
	
	@Then("^I click AddCourse Button and get successful message$")
	public void ClickAddCourseButton(Map<String, String> dataList) throws Throwable {
	    
		
	}
	
	

	
}