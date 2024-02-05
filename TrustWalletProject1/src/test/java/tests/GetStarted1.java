package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import tests.BaseProjectClass;

public class GetStarted1 extends BaseProjectClass {



	@Test(priority=1)
	public void getStarted() throws MalformedURLException, InterruptedException {

		driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']")).click();
		System.out.println("Clicked On Get Started");
		Thread.sleep(2000);
	}

}