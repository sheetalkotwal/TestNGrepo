package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class testNG2 {



		@Test(dataProvider="getData")
		public void Demo(String uname, String password)
		{
			System.out.println("after statement");
			System.out.println(uname);
			
			System.out.println(password);
			
			
		}
		@BeforeSuite
		public void Dan()
		{
			System.out.println("I am no 1");
			
		}

		
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data = new Object[2][2];
			data[0][0]="first";	
			data[0][1]="firstpass";
			data[1][0]="second";	
			data[1][1]="secondpass";
			return data;
		}
	
		@Test
		public void Fan()
		{
			System.out.println();
			
		}
		
		
		
		
	}


