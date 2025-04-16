package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= ".//src//test//resources//Features//Conduit.feature",
glue={"StepDefinition"},
monochrome=true,
dryRun=false,//if true it will not execute
plugin= {"pretty",
		"html:target/Reports/HtmlReport.html"}
//		"usage:target/Reports/usageReport.html",
//		"json:target/Reports/jsonReport.json",
//		"rerun:target/failedScenarios.txt",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)

public class ConduitRunner extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=true)
		public Object[][] scenarios() {
	        
	        return super.scenarios();
	         
		}

}
