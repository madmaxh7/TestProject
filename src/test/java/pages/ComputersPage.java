package pages;

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








    public void openPageComputes(){
        driver.get(urlAddComputer);
        waitElementVisible(mainheadingpage2);
        System.out.println("open page Add Computer Done");
    }

    public void fillField (){
        String name = "MadMax";
        driver.get(urlAddComputer);
        waitElementVisible(mainheadingpage2);
        computerNameField.sendKeys(name);
        LocalDate today = LocalDate.now();
        LocalDate tenyearsago = today.minusYears(10);
        introducedField.sendKeys (""+tenyearsago);
        System.out.println(""+tenyearsago);
        discontinuedField.sendKeys(""+today);
        companyList.click();
        waitElementVisible(companyTarget);
        companyTarget.click();
        createComputer.click();
        System.out.println("Field Name:" +name);
        System.out.println("Field introduced:" +tenyearsago);
        System.out.println("Field discontinued:" +today);
    }
}
