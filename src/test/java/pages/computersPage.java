package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class computersPage extends GeneralPageMethods {


    public computersPage(WebDriver driver) {
        super(driver);
    }

    String urlHomePage = "http://computer-database.gatling.io/computers";

    @FindBy(className = "mainheading")
    public WebElement mainTitle;

    public void openHomePage(){
        driver.get(urlHomePage);
        waitElementVisible(mainTitle);
    }
}