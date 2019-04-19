package com.automation.elements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.browser.ActionDriver;
import com.automation.browser.Driver;
import com.automation.browser.JavascriptDriver;
import com.automation.browser.WaitDriver;
import com.automation.jsonParser.ElementParser;

public abstract class Element{

	protected By byLocator;
	protected Driver driver;
	protected JavascriptDriver jsDriver;
	protected WaitDriver waitDriver;
	protected ActionDriver actionDriver;
	protected List<WebElement> webElements;
	
	public Element(By byLocator,Driver driver) {
		this.byLocator = byLocator;
		this.driver = driver;
		jsDriver = new JavascriptDriver();
		waitDriver = new WaitDriver(40);
		actionDriver = new ActionDriver();
		webElements = new ArrayList<WebElement>();
	}
	
	protected WebElement getElement() {
		WebDriver webdriver= driver.getWebdriver();
		waitDriver.waitForElementToBePresent(byLocator, webdriver);
		return webdriver.findElement(byLocator);
	}
	
	protected List<WebElement> getElements(){
		WebDriver webdriver = driver.getWebdriver();
		waitDriver.waitForElementToBePresent(byLocator, webdriver);
		return webdriver.findElements(byLocator);
	}
}
