package ALSD.CucumberTest;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Certificate_Front_End_Step {
	
	WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	@Given("^Open browser and open certificate application$") 
	public void StartCertificateApplication() throws IOException{
		
		if(OS.indexOf("win") >= 0){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			FileUtils.deleteDirectory(new File("C:\\Download"));
			new File("C:\\Download").mkdirs();
		}
		else
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		 
		String downloadFilepath = "C:\\Download\\";
		//String downloadFilepath = "C:\\Program Files (x86)\\jenkins\\workspace\\ALSD2016_Test\\download";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);
//		driver = new ChromeDriver();
		
		driver.get("http://140.124.181.126:9000/Certification/");
//		driver.get("http://localhost:8080/Certification/");
	}

	@When("I enter the correct value into the form$")
	public void EnterCorrectValueToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}

	@Then("^I click enabled generate button and get a correct certificate$")
	public void ClickEnabledGenerateButton(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(2);
		CheckImage(dataList.get("imageName"));
	}
	
	@When("I enter the value with empty certificateId into the form$")
	public void EnterValueWithEmptyCertificateIdToCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
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
	
	@When("I enter empty value into the form$")
	public void EnterEmptyValueIntoCA(Map<String, String> dataList) throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
		InputValue(dataList);
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	@When("I click download button$")
	public void ClickDownloadButton() throws InterruptedException {
	
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonDownload")).click();
		
	}
	
	@Then("^The Image will not start to download$")
	public void CheckImageWillNotDownload(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(1);
		File file = new File(dataList.get("imagePath"));
		
		try{
			assertEquals(false, file.exists());
		}finally{
			driver.quit();
		}
		
	}
	
	@When("I click PDF download button$")
	public void ClickPDFDownloadButton() throws InterruptedException {
	
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonDownloadPDF")).click();
		
	}
	
	@Then("^The PDF file will not start to download$")
	public void CheckPDFFileWillNotDownload(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(1);
		File file = new File(dataList.get("filePath"));
		
		try{
			assertEquals(false, file.exists());
		}finally{
			driver.quit();
		}
		
	}
	
	@And("I click Generate Button$")
	public void ClickGenerateButton() throws InterruptedException {
	
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("buttonGenerate")).click();
		
	}
	
	@Then("^The image will start to download$")
	public void CheckImageWillDownload(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(1);
		File file = new File(dataList.get("filePath"));
		
		try{
			assertEquals(true, file.exists());
		}finally{
			driver.quit();
		}
		
	}
	
	@Then("^The PDF file will start to download$")
	public void CheckPDFFileWillDownload(Map<String, String> dataList) throws Throwable {
	    
		TimeUnit.SECONDS.sleep(1);
		File file = new File(dataList.get("filePath"));
		
		try{
			assertEquals(true, file.exists());
		}finally{
			driver.quit();
		}
		
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
	
	void CheckImage(String imageName){
		
		//check image is displayed
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someImg")));
		assertEquals(true, driver.findElement(By.id("someImg")).isDisplayed());

		String inputBase64BackgroundImage = driver.findElement(By.id("someImg")).getAttribute("src") ;

		try {
			BufferedImage  backgroundImage = ImageIO.read(new File("./image/" + imageName)); 
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
		}finally {
            driver.quit();
        }
	}
	
}