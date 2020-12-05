package tests;

import general.DriverSetUp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.StartPage;

public class Tests extends DriverSetUp {
    WebDriver driver;

        @Before
        public void startTest() {
            driver = setUpDriver();
        }

        @Test
        public void openTheHomePage() {
            StartPage startPage = new StartPage(driver);
            startPage.openPageComputes();
            Assert.assertTrue(startPage.checkElementExisting(startPage.mainheading));
        }

        @After
        public void closeDriver() {
            quitDriver();
        }
    }
