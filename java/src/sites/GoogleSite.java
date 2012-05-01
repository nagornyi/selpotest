package org.openqa.selenium.example;

import org.openqa.selenium.support.PageFactory;

public class GoogleSite extends WebDriverTestBase {
	public static String url = "http://www.google.co.uk/";

	public void load(String path) {
		driver.get(url+path);
	}

    public static GoogleSearchPage search_page() {
		return PageFactory.initElements(driver, GoogleSearchPage.class);
    }

    public static GoogleResultsPage results_page() {
		return PageFactory.initElements(driver, GoogleResultsPage.class);
    }
}

