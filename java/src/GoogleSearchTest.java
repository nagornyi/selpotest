package org.openqa.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.Assert;

public class GoogleSearchTest extends WebDriverTestBase { 
    @Test(groups = {"regression"})
    public void regressionSearch() {
		  // Create a new instance of the search page class
		  // and initialise any WebElement fields in it.
			GoogleSearchPage search_page = GoogleSite.search_page();
		  // Navigate to the right place
			search_page.load(search_page.path);
		  // And now do the search.
		  GoogleResultsPage results_page = search_page.searchFor("Regression");
			results_page.checkSearchToolsLinkText();
			isTextPresent("a defensive reaction to some unaccepted impulses");	
    }

    @Test(groups = {"smoke", "inprogress"})
    public void smokeSearch() {
			//this test will not be executed because it belongs to a group "inprogress"
    }
}

