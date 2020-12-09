package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends GeneralPageMethods {


    public StartPage (WebDriver driver) {
        super(driver);
    }

    String urlStartPage = "http://computer-database.gatling.io/computers";

    @FindBy(xpath  = "//a[contains(.,'Computer database')]")
    public WebElement mainheading;

    @FindBy(id  = "add")
    public WebElement addnewcomputer;

    @FindBy (xpath = "//*[@id='searchbox']")
    public WebElement searchBox;

    @FindBy (id="searchsubmit")
    public WebElement searchSubmit;

    @FindBy (xpath = "//a[text()='ACE']")
    public WebElement acecomputer;

    @FindBy (xpath = "//em[text()='Nothing to display']")
    public WebElement nothingFind;

    @FindBy (xpath = "//a[text()='MadMax']")
    public WebElement computerName;



    public void openPageComputes(){
        driver.get(urlStartPage);
        waitElementVisible(mainheading);
    }
    public void checkAddComputerButton(){
        driver.get(urlStartPage);
        waitElementVisible(addnewcomputer);
    }
    public void clickAddComputer() {
        driver.get(urlStartPage);
        clickElement(addnewcomputer);
    }
    public void fillSerchFeald () {
        waitElementVisible(searchBox);
        searchBox.sendKeys("ace");
    }
    public void fillSerchFealdAddetComp () {
        waitElementVisible(searchBox);
        searchBox.sendKeys("MadMax");
    }
    public void clickSerchComputer() {
        waitElementVisible(searchSubmit);
        clickElement(searchSubmit);
    }


}