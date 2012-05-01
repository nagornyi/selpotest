package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//calling JavaScript functions on the page, handling JS popups
public class Local9Page extends MyLocalSite {
	public static String path = "page9";

	public void testJavaScript() {
		executeJS_no_return("enter_name();");
		assertEquals(getAlertText(), "Please enter your name");
		sleep(5);
		dismissAlert();
		executeJS_no_return("enter_age();");
		if (getAlertText() != "nosuchtextexists"){
			sendKeysAlert("99");
			sleep(5);
			acceptAlert();
			isTextPresent("99");
		}
	}
}

