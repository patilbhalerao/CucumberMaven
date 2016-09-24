package Page_object;

public class Homepage extends BasePage
{
	String homepage_url = "http://www.empoweringindia.org/new/home.aspx";
	
	public  void open_homepage()
	{
		browser.get(homepage_url);
	}
}
