package tek.sdet.framework.steps;

import java.util.List;



import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	

	@When("User click on Sign in option")
	public void userCleckOnSignInOption() {
		click(factory.signInPage().signInbtn);
		logger.info("user cliked on sign in option");

	}

	@And("User enter email {string} and password {string}")
	public void userenterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().email, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user enterd email" + email + "and password " + password);

	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginbtn);
		logger.info("user clicekd in to login bttn");

	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("User logged in into account");
		

	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreatNewAccountButton() {
		click(factory.signInPage().newaccountbtn);
		logger.info("user cliked on creat new account btn");
		
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
		logger.info("user enterd required information");
		slowDown();
	}	
		
	@And ("User click on SignUp button")
	public void userClickOnSignUpbutton() {
		click(factory.signInPage().signUpBtn);
		logger.info("user clicked on Sign up btn");
		
	}
		
	@Then ("User should be logged into account page")	
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("user logged into account page");
		slowDown();
	}
	
}
