package com.portfolio;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

public final class HomePageXPATH {
	private HomePageXPATH() {
	}

	// Logo
	public static final By LOGO = By.xpath("//*[@id=\"root\"]/div[2]/nav/div/a");
	
	// Header Links
	private static final String HEADER_LINKS_BASE = "//*[@id=\"root\"]/div[2]/nav/div/div[1]/a[%d]";
	public static final List<By> HEADER_LINKS = Arrays.asList(
			By.xpath(String.format(HEADER_LINKS_BASE, 1)),  // About
			By.xpath(String.format(HEADER_LINKS_BASE, 2)),  // Experience
			By.xpath(String.format(HEADER_LINKS_BASE, 3))   // Contact
	);
	
	// Header Features
	public static final List<By> HEADER_FEATURES = Arrays.asList(
			By.xpath("//*[@id=\"radix-:r0:\"]"),  // Theme Toggle
			By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/button[2]")   // Language Toggle
	);
	
	// Home Page
	public static final By HOME_PAGE_TITLE_SPAN1 = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/h1/span[1]");
	public static final By HOME_PAGE_TITLE_SPAN2 = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/h1/span[2]");
	public static final By HOME_PAGE_DESCRIPTION = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/h2");
	
	// Home Page Subtext
	public static final By HOME_PAGE_SUBTEXT = By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/p");
	
	// Home Page Buttons
	public static final List<By> HOME_PAGE_BUTTONS = Arrays.asList(
			By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div/a[1]"),  // Projects
			By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div/div/a[2]")   // Contact
	);
}
