package tests;

import general.DriverSetUp;
import org.openqa.selenium.By;
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
    public boolean ceckSerchFiald () {
        StartPage startPage = new StartPage(driver);
        startPage.openPageComputes();
        startPage.fillSerchFeald();
        startPage.clickSerchComputer();
        try {
            driver.findElement((By) startPage.acecomputer);
            System.out.println("search work correct");
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("search not work correct");
            return false;
        }

    }
    @Test
    public void ceckAddfunction () {
        StartPage startPage = new StartPage(driver);
        startPage.openPageComputes();
        startPage.fillSerchFealdAddetComp();
        startPage.clickSerchComputer();
        Assert.assertTrue(startPage.checkElementExisting(startPage.computerName),"\"Checking existing of element\"");

    }

    @AfterTest
    public void closeDriver() {
        quitDriver();
   }
}
