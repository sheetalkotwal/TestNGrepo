package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class testNG1 {

	@Test(groups= {"smoke"})
	public void Demo()
	{
		System.out.println("first TestNG test case");
		
	}

	

	@Test
		public void Demo1()
		{
		{System.out.println("Before case");
		;
	}

		}
}
