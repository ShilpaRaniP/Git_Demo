package BaseClassUtility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeMethod
	public void BMConfig()
	{
		System.out.println("====== LOG IN =======");
		System.out.println("updated");
	}

	@AfterMethod
	public void AMConfig()
	{
		System.out.println("====== LOG OUT =======");
	}

}
