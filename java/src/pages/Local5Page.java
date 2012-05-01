package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//verifying checkbox functionality: checking, unchecking, return state
public class Local5Page extends MyLocalSite {
	public static String path = "page5";

    @FindBy(name = "checkthebox")
    private WebElement cb;

	public void testCheckbox() {
		assertTrue(cb.isDisplayed());
		cb.click();
		assertTrue(cb.isSelected());
		cb.click();
		assertFalse(cb.isSelected());
	}
}

