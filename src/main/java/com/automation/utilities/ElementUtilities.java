package com.automation.utilities;
import org.openqa.selenium.By;

import com.automation.browser.Driver;
import com.automation.elements.Button;
import com.automation.elements.DropDownList;
import com.automation.elements.Element;
import com.automation.elements.ElementTypes;
import com.automation.elements.HyperLink;
import com.automation.elements.Textbox;
import com.automation.jsonParser.ElementParser;


public class ElementUtilities {
	
	public static HyperLink getHyperLink(ElementParser elementParser,Driver driver,String elementName) {
		By hyperLinkLocator= elementParser.getElementByName(elementName);
		HyperLink hyperLink = new HyperLink(hyperLinkLocator, driver);
		return hyperLink;
	}
	
	public static Textbox getTextbox(ElementParser elementParser,Driver driver,String elementName) {
		By textboxLocator= elementParser.getElementByName(elementName);	
		Textbox textbox = new Textbox(textboxLocator, driver);
		return textbox;
	}
	
	public static Button getButton(ElementParser elementParser,Driver driver,String elementName) {
		By buttonLocator= elementParser.getElementByName(elementName);	
		Button button = new Button(buttonLocator, driver);
		return button;
	}
	
	public static DropDownList getDropDownList(ElementParser elementParser ,Driver driver,String elementName) {
		By dropDownLocator = elementParser.getElementByName(elementName);
		DropDownList dropDownList = new DropDownList(dropDownLocator, driver);
		return dropDownList;
	}
	
	public static Element getWebElement(ElementTypes type,ElementParser elementParser,Driver driver,String elementName) {
		
		By elementLocator= elementParser.getElementByName(elementName);	
		switch (type) {
		case BUTTON:
			return new Button(elementLocator,driver);
		case TEXTBOX:
			return new Textbox(elementLocator, driver);
		case HYPERLINK:
			return new HyperLink(elementLocator, driver);	
		default:
			break;
		}
		return null;
	}
}
