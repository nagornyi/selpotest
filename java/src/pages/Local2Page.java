package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//verifying links using different locators
public class Local2Page extends MyLocalSite {
	public static String path = "page2";

  @FindBy(xpath = "//a[@href='http://www.elegantcode.com/']")
  private WebElement link1;

  @FindBy(xpath = "//a[@id='2']")
  private WebElement link2;

  @FindBy(name = "slashdotlink")
  private WebElement link3;

  @FindBy(id = "4")
  private WebElement link4;

	@FindBy(id = "2")
  private WebElement link6;

  public void checkLinks() {
    assertTrue(link1.isDisplayed());
    assertTrue(link2.isDisplayed());
    assertTrue(link3.isDisplayed());
    assertTrue(link4.isDisplayed());     
    }

	public void checkLinksText() {
		assertEquals(link6.getText(), "Yahoo");
		assertTrue(checkRegexp("ho", link6.getText()));
	}
}

