package PageObjects;

public class HomePage extends BasePage 
{
  String homepage_url="http://www.empoweringindia.org/new/home.aspx";
  public  void open_homepage()
  {
	browser.get(homepage_url);
  }
}
