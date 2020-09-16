package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG3 {
	@Test
	public void Car()
	{
		System.out.println("carloan");
	}
@Parameters({"URL","API/Username"})
@Test
public void Home(String uname,String key)
{
	System.out.println("Test123");
	System.out.println(uname);
	System.out.println(key);
	
}
	@AfterSuite
	public void Home2()
	{
		System.out.println("I am 1 last one");
	}
}

