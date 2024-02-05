package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import tests.BaseProjectClass;

public class CreateWallet1 extends GetStarted1 {



	@Test(priority=2)
	public void createWallet() throws InterruptedException, MalformedURLException {
		Thread.sleep(2000);
		System.out.println("Before Creating New Wallet");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Create new wallet']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.View[@content-desc='Back']")).click();
		System.out.println("After Creating New Wallet");
		Thread.sleep(2000);
	}

}
