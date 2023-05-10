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
    @Then("Verify that {string} button is displayed")
    public void verify_that_button_is_displayed(String btn) {

    BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, btn))));
    }
}



