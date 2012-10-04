package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//entering some data to the form and submitting it, then returning next page
public class Local3Page extends MyLocalSite {
	public static String path = "page3";

    @FindBy(name = "searchbox")
    private WebElement searchbox;

    @FindBy(name = "input")
    private WebElement form;

    @FindBy(name = "submit")
    private WebElement button;

	public void checkSearchForm() {
		assertTrue(searchbox.isDisplayed());
		assertTrue(form.isDisplayed());
	}

	public Local1Page searchInfo() {
		searchbox.sendKeys("Information");
		button.click();
		return MyLocalSite.first_page();
	}
}
