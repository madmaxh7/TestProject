package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;

public class ComputersPage extends GeneralPageMethods {
    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    String urlAddComputer = "http://computer-database.gatling.io/computers/new";

    @FindBy(xpath  = "//a[contains(.,'Computer database')]")
    public WebElement mainheadingpage2;

    @FindBy (id = "name")
    public WebElement computerNameField;

    @FindBy (id = "introduced")
    public WebElement introducedField;

    @FindBy (id = "discontinued")
    public WebElement discontinuedField;

    @FindBy (name = "company")
    public WebElement companyList;

    @FindBy (xpath = "//*[@id='company']/option[16]")
    public WebElement companyTarget;

    @FindBy (xpath = "*//input[@class='btn primary']")
    public WebElement createComputer;

    @FindBy (xpath = "*//div[@class='alert-message warning']/strong")
    public WebElement alertDone;


    public void openPageComputes(){
        driver.get(urlAddComputer);
        waitElementVisible(mainheadingpage2);
        System.out.println("web driver start 1");
        System.out.println("alertDone"+alertDone);


    }

    public void fillField (){
        ComputersPage computersPage;
        computersPage = new ComputersPage(driver);
        computersPage.openPageComputes();
        System.out.println("web driver start 2");
        computerNameField.sendKeys("MadMax");
        LocalDate today = LocalDate.now();
        LocalDate tenyearsago = today.minusYears(10);
        introducedField.sendKeys (""+tenyearsago);
        System.out.println(""+tenyearsago);
        discontinuedField.sendKeys(""+today);
        System.out.println(""+today);
        companyList.click();
        waitElementVisible(companyTarget);
        companyTarget.click();
        createComputer.click();
        System.out.println("alertDone"+alertDone);
    }






}
