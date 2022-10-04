package TestRunner;		

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	

@RunWith(Cucumber.class)				
@CucumberOptions(features={"src/test/resources/Features"},
glue={"StepDefinition"},
//tags="@tag1", 
monochrome=false
//,dryRun=true

)			

//dryrun option is used in cucumber options to compile featurea and step definition files. it can
// be set true or false.
//monchrome is used to remove unreadable characters in the console output during execution
public class Runner 				
{		

}
