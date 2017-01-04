package ALSD.CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json"},
		monochrome = true,
		features = {
				"classpath:resources/"
		}
//		features = {
//				"classpath:resources/invoice.feature",
//				"classpath:resources/sendMail.feature",
//				"classpath:resources/certificate_frontend.feature"
//		}
)

public class CucumberRunner {

}
