package org.openqa.selenium.example;

import org.openqa.selenium.support.PageFactory;

public class MyLocalSite extends WebDriverTestBase {
	public static String url = "http://localhost/selng/";

		public void load(String path) {
			driver.get(url+path);
		}

    public static Local1Page first_page() {
		return PageFactory.initElements(driver, Local1Page.class);
    }

    public static Local2Page second_page() {
		return PageFactory.initElements(driver, Local2Page.class);
    }

    public static Local3Page third_page() {
		return PageFactory.initElements(driver, Local3Page.class);
    }

    public static Local4Page fourth_page() {
		return PageFactory.initElements(driver, Local4Page.class);
    }

    public static Local5Page fifth_page() {
		return PageFactory.initElements(driver, Local5Page.class);
    }

    public static Local6Page sixth_page() {
		return PageFactory.initElements(driver, Local6Page.class);
    }

    public static Local7Page seventh_page() {
		return PageFactory.initElements(driver, Local7Page.class);
    }

    public static Local8Page eighth_page() {
		return PageFactory.initElements(driver, Local8Page.class);
    }

    public static Local9Page nineth_page() {
		return PageFactory.initElements(driver, Local9Page.class);
    }

    public static Local10Page tenth_page() {
		return PageFactory.initElements(driver, Local10Page.class);
    }
}

