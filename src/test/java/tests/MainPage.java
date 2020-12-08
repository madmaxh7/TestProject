package tests;

import general.DriverSetUp;
import pages.StartPage;
import pages.ComputersPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPage extends DriverSetUp {
    WebDriver driver;

    @BeforeTest
    public void startTest() {
        driver = setUpDriver();
    }

    @Test //check main page load, and internet connection is allow
    public void openTheHomePage() {
        StartPage startPage = new StartPage(driver);
        startPage.openPageComputes();
        Reporter.log("Check that page opened");
        Assert.assertTrue(startPage.checkElementExisting(startPage.mainheading));
    }
    @Test
    public void AddComputerButton () {
       StartPage startPage = new StartPage(driver);
       Reporter.log("Check that button addComputer is visible");
       startPage.openPageComputes();
       startPage.checkAddComputerButton();
       Assert.assertTrue(startPage.checkElementExisting(startPage.addnewcomputer));
    }

    @AfterTest
    public void closeDriver() {
        quitDriver();
    }
}