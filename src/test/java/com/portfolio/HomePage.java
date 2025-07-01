package com.portfolio;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.portfolio.*;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;
	private static final int TIMEOUT_SECONDS = 10;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
	}
	
	public String getLogoText() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.LOGO)).getText();
	}
	
	public boolean isHeaderLinksDisplayed(int index) {
		try {
			return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HEADER_LINKS.get(index))).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isHeaderFeaturesDisplayed(int index) {
		try {
			return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HEADER_FEATURES.get(index))).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public String getHomePageTitle() {
		WebElement span1 = wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HOME_PAGE_TITLE_SPAN1));
		wait.until(ExpectedConditions.visibilityOf(span1));
		wait.until(ExpectedConditions.textToBePresentInElement(span1, "Hello, I'm"));
		String span1Text = span1.getText();
		
		WebElement span2 = wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HOME_PAGE_TITLE_SPAN2));
		wait.until(ExpectedConditions.visibilityOf(span2));
		wait.until(ExpectedConditions.textToBePresentInElement(span2, "Leonardo"));
		String span2Text = span2.getText();
		
		return span1Text + "\r\n" + span2Text;
	}
	
	public String getHomePageDescription() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HOME_PAGE_DESCRIPTION)).getText();
	}
	
	public String getHomePageSubtext() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HOME_PAGE_SUBTEXT)).getText();
	}
	
	public boolean isHomePageButtonDisplayed(int index) {
		try {
			return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HOME_PAGE_BUTTONS.get(index))).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public String getHomePageButtonText(int index) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(HomePageXPATH.HOME_PAGE_BUTTONS.get(index))).getText();
	}
}
