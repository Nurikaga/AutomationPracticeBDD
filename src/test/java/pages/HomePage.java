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

    @FindBy(xpath="//button[text()='Add do ']")
    public WebElement  addDoBtn;

    @FindBy(xpath="//textarea")
    public WebElement textArea;

    @FindBy(xpath="(//div[@class=' col-md-6'])[1]")
    public WebElement textInputField;

    @FindBy(xpath="(//div[@class='anyClass'])[1]/div")
    public List<WebElement> statements2;

    @FindBy(xpath="//div[@class='col-md-3 dont']/button")
    public WebElement addDontBtn;
}
