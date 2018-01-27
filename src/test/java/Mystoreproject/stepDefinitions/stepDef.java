package Mystoreproject.stepDefinitions;

//import OrangeHm.*;
import Mystoreproject.HomePage;
import Mystoreproject.LoginPage;
import Mystoreproject.AunthenticationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by SHRADHA on 18/08/2017.
 */
public class stepDef {

    //BaseMain baseMain = new BaseMain();
    HomePage homepage = new HomePage();
    AunthenticationPage authpage = new AunthenticationPage();
    LoginPage loginPage = new LoginPage();


    @Given("^user is on  homepage$")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();


        homepage.checkTitle();
        homepage.setSigninbutton();

    }

    @When("^user clicks sign in button$")
    public void userenteremail() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        authpage.setAuthenticationEmail();
    }

    @Then("^user should successfully login to signup page$")
    public void user_should_successfully_login_to_signup_page() {
        // Write code here that turns the phrase above into concrete actions
        authpage.emailConfirmationbutton();
    }


}
