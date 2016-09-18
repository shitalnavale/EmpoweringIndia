package mavenProject.comEmpoweringIndia;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="D:\\comEmpoweringIndia\\resources\\Features",
		glue="poweringIndiaStepDefinitions",
		
		tags={"@home"},
		plugin={"pretty","html:target/cucumber", "json:target/cucumber_json"}
		
		)
public class Runner 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
