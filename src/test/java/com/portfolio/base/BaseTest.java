package com.portfolio.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
	protected WebDriver driver;
	
	@BeforeEach
	public void setUp() {
		driver = DriverFactory.getDriver();
		System.out.println("Driver: " + driver);
		driver.manage().window().maximize();
		driver.get("https://leonardo.vercel.app");
	}
	
	@AfterEach
	public void tearDown() {
		DriverFactory.quitDriver();
	}
	
}
