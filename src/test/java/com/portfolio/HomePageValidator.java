package com.portfolio;

import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import com.portfolio.constants.HomePageConstants;

public class HomePageValidator {
    private HomePage homePage;
    private WebDriver driver;
    
    public HomePageValidator(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }
    
    public void validateHeaderComponent() {
        validateLogoText();
        validateHeaderLinks();
        validateHeaderFeatures();
    }
    
    public void validateHomePage() {
        validateHomePageTitle();
        validateHomePageDescription();
        validateHomePageSubtext();
        validateHomePageButtons();
    }
    
    private void validateLogoText() {
        String logoText = homePage.getLogoText();
        assertEquals(HomePageConstants.LOGO_TEXT, logoText, 
                    HomePageConstants.LOGO_VALIDATION_MESSAGE);
    }
    
    private void validateHeaderLinks() {
        for (int i = 0; i < HomePageXPATH.HEADER_LINKS.size(); i++) {
            assertTrue(homePage.isHeaderLinksDisplayed(i),
                      HomePageConstants.HEADER_LINK_VALIDATION_MESSAGE + (i + 1));
        }
    }
    
    private void validateHeaderFeatures() {
        for (int i = 0; i < HomePageXPATH.HEADER_FEATURES.size(); i++) {
            assertTrue(homePage.isHeaderFeaturesDisplayed(i),
                      HomePageConstants.HEADER_FEATURE_VALIDATION_MESSAGE + (i + 1));
        }
    }
    
    private void validateHomePageTitle() {
        String actualTitle = homePage.getHomePageTitle();
        assertEquals(HomePageConstants.HOME_PAGE_TITLE, actualTitle,
                    HomePageConstants.HOME_PAGE_TITLE_VALIDATION_MESSAGE);
    }
    
    private void validateHomePageDescription() {
        String description = homePage.getHomePageDescription();
        assertEquals(HomePageConstants.HOME_PAGE_DESCRIPTION, description,
                    HomePageConstants.HOME_PAGE_DESCRIPTION_VALIDATION_MESSAGE);
    }
    
    private void validateHomePageSubtext() {
        String subtext = homePage.getHomePageSubtext();
        assertEquals(HomePageConstants.HOME_PAGE_SUBTEXT, subtext,
                    HomePageConstants.HOME_PAGE_SUBTEXT_VALIDATION_MESSAGE);
    }
    
    private void validateHomePageButtons() {
        for (int i = 0; i < HomePageXPATH.HOME_PAGE_BUTTONS.size(); i++) {
            assertTrue(homePage.isHomePageButtonDisplayed(i),
                      HomePageConstants.HOME_PAGE_BUTTON_VISIBILITY_MESSAGE + (i + 1));
            
            String buttonText = homePage.getHomePageButtonText(i);
            assertEquals(HomePageConstants.HOME_PAGE_BUTTON_TEXTS[i], buttonText,
                        HomePageConstants.HOME_PAGE_BUTTON_TEXT_MESSAGE + (i + 1));
        }
    }
}