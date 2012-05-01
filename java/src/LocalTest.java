package org.openqa.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.Assert;

public class LocalTest extends WebDriverTestBase {
    @Test(groups = {"regression"})
    public void checkText() {
			Local1Page first_page = MyLocalSite.first_page();
			first_page.load(first_page.path);
			isTextPresent("Testing Web Applications with Ruby and Selenium WebDriver");	
    }

    @Test(groups = {"regression", "smoke"})
    public void verifyLinks() {
		Local2Page second_page = MyLocalSite.second_page();
		second_page.load(second_page.path);
		second_page.checkLinks();
		second_page.checkLinksText();
    }

    @Test(groups = {"regression"})
    public void verifyThirdPage() {
		Local3Page third_page = MyLocalSite.third_page();
		third_page.load(third_page.path);
		third_page.checkSearchForm();
		third_page.searchInfo();
		isTextPresent("Testing Web Applications with Ruby and Selenium WebDriver");
    }

    @Test(groups = {"regression", "smoke"})
    public void verifyFourthPage() {
		Local4Page fourth_page = MyLocalSite.fourth_page();
		fourth_page.load(fourth_page.path);
		fourth_page.checkWater();
		fourth_page.useTotoro();
		isTextPresent("Testing Web Applications with Ruby and Selenium WebDriver");
    }

    @Test(groups = {"regression"})
    public void verifyFifthPage() {
		Local5Page fifth_page = MyLocalSite.fifth_page();
		fifth_page.load(fifth_page.path);
		fifth_page.testCheckbox();
    }

    @Test(groups = {"regression", "smoke"})
    public void verifySixthPage() {
		Local6Page sixth_page = MyLocalSite.sixth_page();
		sixth_page.load(sixth_page.path);
		sixth_page.testRadiobuttons();
    }

    @Test(groups = {"regression"})
    public void verifySeventhPage() {
		Local7Page seventh_page = MyLocalSite.seventh_page();
		seventh_page.load(seventh_page.path);
		seventh_page.testSelectBox();
    }

    @Test(groups = {"regression", "smoke"})
    public void verifyEighthPage() {
		Local8Page eighth_page = MyLocalSite.eighth_page();
		eighth_page.load(eighth_page.path);
		eighth_page.testTable();
    }

    @Test(groups = {"regression"})
    public void verifyNinethPage() {
		Local9Page nineth_page = MyLocalSite.nineth_page();
		nineth_page.load(nineth_page.path);
		nineth_page.testJavaScript();
    }

    @Test(groups = {"regression", "smoke"})
    public void verifyTenthPage() {
		Local10Page tenth_page = MyLocalSite.tenth_page();
		tenth_page.load(tenth_page.path);
		tenth_page.testFrames();
    }
}

