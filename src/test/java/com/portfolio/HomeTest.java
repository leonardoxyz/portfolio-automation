package com.portfolio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.portfolio.base.BaseTest;

public class HomeTest extends BaseTest {
    private HomePageValidator validator;
    
    @BeforeEach
    public void setupTest() {
        validator = new HomePageValidator(driver);
    }
    
    @Test
    @DisplayName("It must validate the portfolio logo")
    public void validateHomePageHeader() {
        validator.validateHeaderComponent();
    }
    
    @Test
    @DisplayName("It must validate the HomePage")
    public void validateHomePage() {
    	validator.validateHomePage();
    }
} 