package tests;

import general.DriverSetUp;
import pages.ComputersPage;
import pages.StartPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestAddComputer extends DriverSetUp {
    WebDriver driver;


    @BeforeTest
    public void startTest() {
        driver = setUpDriver();

    }

    @Test
    public void openTheHomePage() {
        ComputersPage computersPage = new ComputersPage(driver);
        computersPage.openPageComputes();
        Assert.assertTrue(computersPage.checkElementExisting(computersPage.mainheadingpage2));
    }
    @Test
    public void openAddComputerPage () {
        StartPage startPage = new StartPage(driver);
        startPage.clickAddComputer();
    }

    @Test
    public void addComputer2base () {
        ComputersPage computersPage = new ComputersPage(driver);
        computersPage.fillField();
        Assert.assertTrue(computersPage.checkElementExisting(computersPage.alertDone));
    }

    @AfterTest
    public void closeDriver() {
        quitDriver();
   }
}
