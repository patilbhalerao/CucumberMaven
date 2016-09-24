package StepDefination;

import Page_object.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class EmpoweringIndiaHomestep 
{
	Homepage obj=new Homepage();
	@Given("^Homepage is use$")
	public void homepage_is_use() throws Throwable {
	   
	    obj.open_homepage();
	}

	@Given("^user open homepage$")
	public void user_open_homepage() throws Throwable {
	    
	    obj.open_homepage();
	}

	@Given("^verify homepage useble$")
	public void verify_homepage_useble() throws Throwable {
	    	    obj.open_homepage();
	}	
	
	
}
