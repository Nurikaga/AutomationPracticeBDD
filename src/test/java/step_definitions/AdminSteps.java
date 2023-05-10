package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class AdminSteps implements CommonPage {

    LoginPage page;

    WebDriver driver;

    public AdminSteps(){
        page = new LoginPage();
    }
    @Given("I log in as admin user")
    public void iLogInAsAdminUser() {
        BrowserUtils.getDriver();
        BrowserUtils.sendKeys(page.usernameInputField, "admin@yahoo.com");
        BrowserUtils.sendKeys(page.passwordInputFiled, "admin123");
        BrowserUtils.click(page.loginBtn);
    }

    @Then("I should see {string} link")
    public void i_should_see_link() {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/a[1]/u")));
    }
}


