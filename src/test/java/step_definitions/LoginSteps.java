package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;

public class LoginSteps implements CommonPage {
    LoginPage page;
    WebDriver driver;

    public LoginSteps(){
        page = new LoginPage();
    }
    @Given("I open  url of loginPage")
    public void i_open_url_of_login_page() {
 BrowserUtils.getDriver();
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) throws InterruptedException {
BrowserUtils.sendKeys(page.usernameInputField, username);
        BrowserUtils.sendKeys(page.passwordInputFiled, password);
    }
    @When("I click {string} button")
    public void i_click_button(String string) {
      BrowserUtils.click(page.loginBtn);
    }

    @Then("Verify title of the page is {string}")
    public void verify_title_of_the_page_is(String title) {
BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }
}
