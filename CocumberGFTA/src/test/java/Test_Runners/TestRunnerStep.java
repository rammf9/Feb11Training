package Test_Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\ram\\Feb11Training\\CocumberGFTA\\src\\test\\java"
	,glue={"Step_Defs"
	},plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
   		 monochrome = true )
public class TestRunnerStep {

}

