package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import tests.BaseProjectClass;

public class AddExistingWallet1 extends CreateWallet1 {


	@Test(priority=3)
	public void addExistingWallet() throws InterruptedException {

		Thread.sleep(5000);
		System.out.println("Before Adding Existing Wallet");
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add existing wallet\"]")).click();
		System.out.println("After Adding Existing Wallet");

	}
}
