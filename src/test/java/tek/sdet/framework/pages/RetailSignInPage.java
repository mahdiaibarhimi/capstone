package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy (xpath="//a[@class='top-nav__logo active']") 
	public WebElement retailWebsite;
	
	@FindBy (id="signinLink")
	public WebElement signInbtn;
	
	@FindBy(id= "email") 
	public WebElement email;
	
	@FindBy (id = "password")
	public WebElement passwordField;
	
	@FindBy (id="loginBtn")
	public WebElement loginbtn;
	
	
	@FindBy (id ="heroImage")
	public WebElement account;
	
	@FindBy (id ="newAccountBtn")
	public WebElement newaccountbtn;
	
	@FindBy (id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy(id ="passwordInput")
	public WebElement passwordInput;
	
	@FindBy (id ="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id ="signupBtn")
	public WebElement signUpBtn;
	
	
	@FindBy(id="accountLink") 
	public WebElement accountbtn;
	
	

}
