package TestRunner;		

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	

@RunWith(Cucumber.class)				
@CucumberOptions(features={"src/test/resources/Features"},
glue={"StepDefinition"},
tags = "@tag2")			//dont put curly  braces. for tags			
public class Runner 				
{		

}

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features="src/test/resources/Feature",
//        glue={"StepDefination"},
//        tags=("@Functional or @Sanity"),
//                monochrome = true,
//                plugin= {"pretty", "junit:target/JUNITReports/report.xml",
//                 "json:target/JSONResports/report.json",
//                 "html:target/HTMLReports/report.html"},
//        dryRun=false
//)
