package util;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{
	@BeforeSuite
	public void launchApp()
	{
		System.out.println("Launch");
	}
@AfterSuite
	public void closeApp()
	{
		System.out.println("Close");
	}
@BeforeTest
	public void login()
	{
		System.out.println("Loginnow");
	}
@AfterTest
	public void logout()
	{
		System.out.println("Logout");
	}

}

