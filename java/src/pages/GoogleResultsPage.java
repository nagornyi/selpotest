package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//looking for "More search tools" link that should be present on Google Results page
public class GoogleResultsPage extends GoogleSite {
	public static String path = "";

  @FindBy(css = ".tbpc")
  private WebElement searchToolsLink;

	public void checkSearchToolsLinkText() {
		assertEquals(searchToolsLink.getText(), "More search tools");
	}
}

