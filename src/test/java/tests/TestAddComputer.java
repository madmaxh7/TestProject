package tests;

import general.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ComputersPage;
import pages.StartPage;


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
    }

    @Test
    public void ceckSerchFiald () {
        StartPage startPage = new StartPage(driver);
        startPage.openPageComputes();
        startPage.fillSerchFeald();
        startPage.clickSerchComputer();
        Assert.assertTrue(startPage.checkElementExisting(startPage.acecomputer));
        System.out.println("search work correct");
    }
    @Test
    public void ceckAddfunction () {
        StartPage startPage = new StartPage(driver);
        startPage.openPageComputes();
        startPage.fillSerchFealdAddetComp();
        startPage.clickSerchComputer();
        Assert.assertTrue(startPage.checkElementExisting(startPage.nothingFind));
        System.out.println("Computer didn't add");
    }

    @AfterTest
    public void closeDriver() {
        quitDriver();
   }
}
