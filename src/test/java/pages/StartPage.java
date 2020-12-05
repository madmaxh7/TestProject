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

    public void openPageComputes(){
        driver.get(urlStartPage);
        waitElementVisible(mainheading);
    }
    public void clickAddComputer() {

        clickElement(addnewcomputer);
    }
}