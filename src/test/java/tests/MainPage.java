package tests;

import tests.general.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.pages.StartPage;

public class MainPage extends DriverSetUp {
    WebDriver driver;

    @BeforeTest
    public void startTest() {
        driver = setUpDriver();
    }

    @Test
    public void openTheHomePage() {
        StartPage startPage = new StartPage(driver);
        startPage.openPageComputes();
        Reporter.log("Check that page opened");
        Assert.assertTrue(startPage.checkElementExisting(startPage.mainheading));
    }
    @Test
    public void openAddComputerPage () {
       StartPage startPage = new StartPage(driver);
       startPage.clickAddComputer();
    }

    @AfterTest
    public void closeDriver() {
        quitDriver();
    }
}