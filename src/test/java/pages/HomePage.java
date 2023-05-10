package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath="//u[text()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath="//button[@type='submit']")
    public List<WebElement> dashboards;
}
