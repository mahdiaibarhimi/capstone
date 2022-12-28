package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
		
	}

	
@FindBy(id="orderLink") 
public WebElement orderpage;

@FindBy (xpath="//div[@class='order__status-arriving']")
public WebElement firstorder;

@FindBy (id = "cancelBtn")
public WebElement cancelbtn;

@FindBy (id ="reasonInput")
public WebElement reason;

@FindBy (id ="orderSubmitBtn")
public WebElement cancelorderBtn;

@FindBy (xpath="//p[text()='Your Order Has Been Cancelled']")
public WebElement cancelconfirmation;

//return
@FindBy (id = "returnBtn")
public WebElement returnBtn;

@FindBy (id ="reasonInput")
public WebElement returnreason;

@FindBy (id ="dropOffInput")
public WebElement fedex;

@FindBy (id ="orderSubmitBtn")
public WebElement returnorderBtn;

@FindBy (xpath = "//div[@class='return__confirm-message']")
public WebElement message;

//review
@FindBy (id ="reviewBtn")
public WebElement reviewbtn;

@FindBy (id ="headlineInput")
public WebElement headlineInput;

@FindBy (id ="descriptionInput")
public WebElement reviewText;

@FindBy (id ="reviewSubmitBtn")
public WebElement reviewtexbtn;

@FindBy (xpath ="//div[@class='Toastify']")
public WebElement confimmessage;


}
