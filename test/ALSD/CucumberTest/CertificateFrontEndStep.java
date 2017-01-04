package ALSD.CucumberTest;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

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
	public void StartCertificateApplication(){
		
		if(OS.indexOf("win") >= 0)
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		driver = new ChromeDriver();
//		driver.get("http://140.124.181.126:9090/Certification/");
		driver.get("http://localhost:9000/Certification/");
	}

	@When("I enter the correct value into the form$")
	public void EnterCorrectValueToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}

	@Then("^I click enabled generate button and get a correct certificate$")
	public void ClickEnabledGenerateButton() throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);
		//check image is displayed
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someImg")));
		assertEquals(true, driver.findElement(By.id("someImg")).isDisplayed());

		String inputBase64BackgroundImage = driver.findElement(By.id("someImg")).getAttribute("src") ;

		try {
			BufferedImage  backgroundImage = ImageIO.read(new File("./image/backgroundImage.png")); 
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        
	        /*Encode image to base64 string*/
	        try {
	            ImageIO.write(backgroundImage, "png", bos);
	            byte[] imageBytes = bos.toByteArray();
	            
	            String sampleBase64BackgroundImage = "data:image/png;base64," + Base64.getEncoder().encodeToString(imageBytes);
	            assertEquals(sampleBase64BackgroundImage, inputBase64BackgroundImage);
	            
	            bos.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
		}catch (IOException e) {
		    e.printStackTrace();
		}
			
		
		driver.quit();
	}
	
	@When("I enter the value with empty certificateId into the form$")
	public void EnterValueWithEmptyCertificateIdToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	@Then("^I can not click disabled generate button$")
	public void ClickDisabledGenerateButton() throws Throwable {
		try
        {
			TimeUnit.SECONDS.sleep(1);
			assertEquals(false, driver.findElement(By.id("buttonGenerate")).isEnabled());
         }
        finally {
            driver.quit();
        }
	}
	
	@When("I enter the value with empty student name into the form$")
	public void EnterValueWithEmptyStudentNameToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}

	@When("I enter the value with empty course date into the form$")
	public void EnterValueWithEmptyCourseDateToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	@When("I enter the value with empty course name into the form$")
	public void EnterValueWithEmptyCourseNameToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	@When("I enter the value with empty course duration into the form$")
	public void EnterValueWithEmptyCourseDurationToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	@When("I enter the value with empty certification date into the form$")
	public void EnterValueWithEmptyCertificationDateToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	void InputValue(Map<String, String> dataList) {
		
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
	}






}