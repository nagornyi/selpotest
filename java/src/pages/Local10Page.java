package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Local10Page extends MyLocalSite {
	public static String path = "page10";

	public void testFrames() {
		switchToFrame("frame1");
		isTextPresent("An operating system is the set of basic programs and utilities");
		switchToRoot();
		switchToFrame("frame2");
		isTextPresent("Welcome to the Linux Kernel Archives");
		switchToRoot();
		switchToFrame("frame3");
		isTextPresent("Canonical Ltd. Ubuntu and Canonical are registered trademarks of Canonical Ltd.");
	}
}

