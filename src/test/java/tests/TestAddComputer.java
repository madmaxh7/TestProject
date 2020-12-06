package tests;

import general.DriverSetUp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ComputersPage;


public class TestAddComputer extends DriverSetUp {
    WebDriver driver;


    @Before
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
        pages.StartPage startPage = new pages.StartPage(driver);
        startPage.clickAddComputer();
    }

    @Test
    public void addComputer2base () {
        pages.ComputersPage computersPage = new pages.ComputersPage(driver);
        computersPage.fillField();
        Assert.assertTrue(computersPage.checkElementExisting(computersPage.alertDone));
    }

    @After
    public void closeDriver() {
        quitDriver();
   }
}
