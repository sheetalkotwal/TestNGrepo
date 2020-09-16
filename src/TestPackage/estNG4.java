package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class estNG4 {

	@Test(groups= {"smoke"})
	public void Memo()
	{
		System.out.println("sample case");
		
	}
	
	@Parameters({"URL"})
	@Test
	public void my(String name)
	{
		System.out.println(name);
	}
	
}
