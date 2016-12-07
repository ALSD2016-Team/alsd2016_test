package ALSD.CucumberTest;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Map;

import javax.imageio.ImageIO;

import org.json.JSONObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CertificateStep {
	
	JSONObject sampleJsonObject ;
	JSONObject inputJsonObject ;
	
	JSONObject sampleImageObject ;
	JSONObject inputImageObject ;
	
	String sampleBase64BackgroundImage = null;
	String inputBase64BackgroundImage = null;
	
	
	@Given("^I prepare courseInfo and studentsInfo for generate certificates$") 
	public void PrepareData(Map<String, String> dataList)  {
		
		System.out.print(dataList.get("courseName"));
		/*Prepare students info*/
//		try {
//			
//			sampleJsonObject = new JSONObject(studentsInfo);
//			inputJsonObject = new JSONObject(studentsInfo);	
//	
//		} catch(Exception e){
//		    System.err.println("Error: " + e.getMessage());
//		}
//		
//		/*check data*/
//		assertEquals(sampleJsonObject.toString(), inputJsonObject.toString());
		
	}

	@When("^I send data to backend$") 
	public void SendData() {
		
//		String url = "140.138.xxx.xxx/getCertificates" ;
//		/*Send background picture by API*/
//		JSONObject response = null;
//		try{
//			HttpConnection connection = new HttpConnection() ;
//			response = connection.Post(url, inputJsonObject);
//		} catch (IOException e) {
//            e.printStackTrace();
//        }
//		
//		inputCertificates = response.getString("certificates");
//	    assertEquals("Success", response.getString("status"));
	}

	@Then("^I get \"([^\"]*)\"$")
	public void GetCertificates(String certificates, String res)  {

		/*check certificates*/
//		try{
//			sampleImageObject = new JSONObject(res);
//			inputImageObject = new JSONObject(res);
//			
//		} catch(Exception e){
//			System.err.println("Error: " + e.getMessage());
//		}
//	    
//	    assertEquals(sampleImageObject.toString(), inputImageObject.toString());
	}
	
	@Given("^I prepare \"([^\"]*)\" for upload backgound$")
	public void PrepareImage(String arg, String json) {
		/*Prepare background picture*/
		try {
			BufferedImage  backgroundImage = ImageIO.read(new File("./image/backgroundImage.png")); 
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        
	        /*Encode image to base64 string*/
	        try {
	            ImageIO.write(backgroundImage, "png", bos);
	            byte[] imageBytes = bos.toByteArray();
	            
	            String base64String = Base64.getEncoder().encodeToString(imageBytes);
	            sampleBase64BackgroundImage = base64String ;
	            inputBase64BackgroundImage = base64String ;
	            
	            bos.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
	    
	}

	@When("^I send the image to backend$")
	public void SendImage() {
//		String url = "140.138.xxx.xxx/upload/backgoundImage" ;
//		/*Send background picture by API*/
//		JSONObject response = null;
//		try{
//			HttpConnection connection = new HttpConnection() ;
//			response = connection.Get(url);
//		} catch (IOException e) {
//            e.printStackTrace();
//        }
//		
//	    assertEquals("Success", response.getString("status"));
	}

	@Then("^I receive \"([^\"]*)\"$")
	public void ReceiveResponse(String arg, String response){
		
		JSONObject sampleResponse = null;
		JSONObject inputResponse = null ;
		/*check status*/
		try{
			sampleResponse = new JSONObject(response);
			inputResponse = new JSONObject(response);
			
		} catch(Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	    
	    assertEquals(sampleResponse.toString(), inputResponse.toString());
		
	}

}
