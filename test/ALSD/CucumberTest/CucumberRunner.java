package ALSD.CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json"},
		monochrome = true,
		features = {
				"classpath:resources/certificate_frontend.feature",
				//"classpath:resources/certificate.feature"
				"classpath:resources/invoice.feature"
				}
)

public class CucumberRunner {

}
