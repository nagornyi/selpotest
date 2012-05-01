package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//working with radiobuttons: checking, unchecking, return status
public class Local6Page extends MyLocalSite {
	public static String path = "page6";

    @FindBy(name = "radiobutton1")
    private WebElement rb1;

    @FindBy(name = "radiobutton3")
    private WebElement rb2;

	public void testRadiobuttons() {
		assertTrue(rb1.isDisplayed());
		assertTrue(rb2.isDisplayed());
		if(rb1.isSelected() == false) {
			rb1.click();
		}
		if(rb2.isSelected() == false) {
			rb2.click();
		}
	}
}

