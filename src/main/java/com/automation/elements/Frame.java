package com.automation.elements;

import org.openqa.selenium.By;
import com.automation.browser.Driver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Frame implements IFrameable{

	protected By byLocator;
	protected Driver driver;
	
	public Frame(By byLocator,Driver driver) {
		this.byLocator = byLocator;
		this.driver = driver;
	}
	
	@Override
	public void switchToFrame() {
		driver.switchToFrame(byLocator);
	}

	@Override
	public void switchToFrame(ExtentTest test,String frameName) {
		driver.switchToFrame(byLocator);
		test.log(Status.INFO, "browser has been switched successfully to frame "+ "\""+frameName+ "\"");
	}
}