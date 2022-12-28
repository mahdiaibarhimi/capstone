package tek.sdet.framework.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}


@FindBy (id= "profileImage")
public WebElement profileImage;


@FindBy(id="accountLink") 
public WebElement accountbtn;

@FindBy (id = "nameInput")
public WebElement name;

@FindBy (id ="personalPhoneInput")
public WebElement phoneInput;

@FindBy (id = "personalUpdateBtn")
public WebElement updateBtn;

@FindBy (id ="personalInformationForm")
public WebElement updatedInfo;

@FindBy(id = "previousPasswordInput")
public WebElement perviousPass;

@FindBy(id= "newPasswordInput")
public WebElement newPass;

@FindBy (id = "confirmPasswordInput")
public WebElement confirmPass;

@FindBy (id ="credentialsSubmitBtn")
public WebElement submitBtn;

@FindBy (xpath="//div[@class='Toastify']")
public WebElement message;

@FindBy (xpath="//p[text()='Add a payment method']")
public WebElement addPayment;


@FindBy (id ="cardNumberInput")
public WebElement cardNumber;

@FindBy (id ="nameOnCardInput")
public WebElement nameOncard;

@FindBy (id ="expirationMonthInput")
public WebElement expirationM;

@FindBy (id ="expirationYearInput")
public WebElement  expirationY;

@FindBy (id="securityCodeInput")
public WebElement codeInput;

@FindBy (id = "paymentSubmitBtn")
public WebElement cardBtn;

@FindBy (xpath ="//p[@class='account__payment__sub-text']")
public WebElement SelectedpaymentCard;

@FindBy (xpath="//button[text()='Edit']")
public WebElement editcard;

@FindBy (xpath="//h1[@class='account__payment-new-title']")
public WebElement editpage;

@FindBy(id="cardNumberInput")
public WebElement cardnum;

@FindBy(id="nameOnCardInput")
public WebElement cardname;

@FindBy (id="expirationMonthInput")
public WebElement expirationMon;

@FindBy (id="expirationYearInput")
public WebElement expirationyear;

@FindBy (id="securityCodeInput")
public WebElement codeinput;

@FindBy (id="paymentSubmitBtn")
public WebElement updatepayment;


@FindBy (xpath="//div[@class='Toastify']")
public WebElement updatemessage;


@FindBy (xpath="//button[text()='remove']")
public WebElement remove;

@FindBy (xpath="//h1[@class='account__payment-new-title']")
public WebElement removedpage;

@FindBy (xpath="//div[@class='account__address-new-wrapper']")
public WebElement adress;

@FindBy (id="countryDropdown")
public WebElement country;

@FindBy (id="fullNameInput")
public WebElement nameInput;

@FindBy (id= "phoneNumberInput")
public WebElement phoneNum;

@FindBy (id ="streetInput")
public WebElement streetInput;

@FindBy (id ="apartmentInput")
public WebElement apartment;

@FindBy (id ="cityInput")
public WebElement city;

@FindBy(xpath ="//select[@class='account__address-new-dropdown']")
public WebElement state;

@FindBy (id="zipCodeInput")
public WebElement zipcode;

@FindBy (id="addressBtn")
public WebElement adressbtn;

@FindBy (xpath="//div[@class='Toastify']")
public WebElement messageadress;

@FindBy (xpath ="//button[text()='Edit']")
public WebElement editadress;

@FindBy (id="countryDropdown")
public WebElement editcountry;

@FindBy (id="fullNameInput")
public WebElement updateName;

@FindBy (id="phoneNumberInput")
public WebElement updatephone;

@FindBy (id="streetInput")
public WebElement updatestreet;

@FindBy (id="apartmentInput")
public WebElement updateapp;

@FindBy (id="cityInput")
public WebElement updatecity;

@FindBy (xpath="//select[@class='account__address-new-dropdown']")
public WebElement updatestate;


@FindBy (id="zipCodeInput")
public WebElement updatezip;

@FindBy (id ="addressBtn")
public WebElement updatebtn;

@FindBy (xpath="//div[@class='Toastify']")
public WebElement messageupdate;

@FindBy (xpath="//button[text()='Remove']")
public WebElement removeaddress;

@FindBy (xpath="//div[@class='account__address-grid']")
public WebElement removed;

}
