package qaclickacademy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void BrowserAoutomation()
	{
		System.out.println("BrowserAoutomation");
	}	
	@Test
	public void elementui(){
		
		System.out.println("elementui");
	}	
	@BeforeTest
	public void prereq(){
		System.out.println("running before");
	}
}
