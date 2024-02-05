package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;
//import io.appium.java_client.remote.MobileCapability;

public class BaseProjectClass {

	protected AppiumDriver driver;

	@BeforeTest
	public void setup() {

		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			// caps.setCapability("platform", "ANDROID");
			caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability("platformVersion", "8.1");
			caps.setCapability("deviceName", "emulator-5554");
			//caps.setCapability("udid", "RZ8M31KBJ0Z");
			// caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
			caps.setCapability("automationName", "UiAutomator2");
			caps.setCapability("appPackage", "com.wallet.crypto.trustapp");
			caps.setCapability("appActivity", ".ui.app.AppActivity");

			URL url = new URL("http://127.0.0.1:4723/");

			driver = new AppiumDriver(url, caps);
			driver = new AndroidDriver(url, caps);

		} catch (Exception exp) {
			System.out.println("Cause is :" + exp.getCause());
			System.out.println("Message is :" + exp.getMessage());
			exp.printStackTrace();
		}
	}
	

}
