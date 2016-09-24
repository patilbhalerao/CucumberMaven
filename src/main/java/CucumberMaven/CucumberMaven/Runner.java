package CucumberMaven.CucumberMaven;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 * Hello world!
 *
 */
//Annotation//call to cucumber JVM//
@RunWith(Cucumber.class)
@CucumberOptions
(
		features="Features",      //path of feature folder//
		glue="C:\\Users\\Saidada\\workspace\\CucumberMaven\\src\\test\\java\\StepDefination"//path of stefdefination pakage//
		
		
)

public class Runner 
{
   
}
