package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class HomeSteps implements CommonPage {
    HomePage page;
    WebDriver driver;
    LoginPage LoginPage;

public HomeSteps() {
    page = new HomePage();
LoginPage = new LoginPage();
}
    @Given("I login")
    public void i_login() {
        String username = "test@yahoo.com";
        String password = "test123";
        BrowserUtils.sendKeys(LoginPage.usernameInputField, username);
        BrowserUtils.sendKeys(LoginPage.passwordInputFiled, password);
        BrowserUtils.click(LoginPage.loginBtn);

    }
    @Then("Verify the title of the page is {string}")
    public void verify_the_title_of_the_page_is(String title) {
BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify Sign out button is displayed")
    public void verify_sign_out_button_is_displayed() {
 BrowserUtils.isDisplayed(page.signOutBtn);
    }
    @Then("Verify {string} button is not displayed")
    public void verify_button_is_not_displayed(String manageAccessBtn) {

    }
    @Then("Verify {string} are displayed")
    public void verify_are_displayed(String dashs) {
       List<WebElement> dashboards = new ArrayList<>();
       for(WebElement each: dashboards){
           BrowserUtils.assertTrue(each.getText().contains(dashs));
       }
    }

    }


