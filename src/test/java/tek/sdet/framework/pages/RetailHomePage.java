package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	
   @FindBy (id="profileImage")
   public WebElement retailWebsite;

   @FindBy(xpath="//span[text()='All']")
   public WebElement allSelection;
  
   @FindBy (id="contentHeader")
   public WebElement header;

   @FindBy (id="contentHeader")
    public WebElement sidebar;
   
   @FindBy(xpath="//div[@class='sidebar_content-item']")
   public List <WebElement> sideBar;
   
   @FindBy (id="search")
   public WebElement Smart;
	
	@FindBy(id = "searchInput")
   public WebElement searchField;
	
	@FindBy (id="searchBtn")
	public WebElement serachbton;


	
	@FindBy (xpath="//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement image;
	
		
	@FindBy(xpath="//select[@class='product__select']")
    public WebElement quantity2;	
	
	@FindBy (xpath="//span[text()='Add to Cart']")
	public WebElement addtocart;
	
	@FindBy (id="cartQuantity")
	public WebElement cartbtnquantity;
	
	@FindBy (id="cartBtn")
	public WebElement cartBtn;
	
	@FindBy (id="proceedBtn")
	public WebElement procedcheckoutBtn;
	
	@FindBy (id="addAddressBtn")
	public WebElement addAddress;
	
	@FindBy (id ="countryDropdown")
	public WebElement countryDropDown;
	
	@FindBy (id ="fullNameInput")
	public WebElement nameInput;
	
	@FindBy (id="phoneNumberInput")
	public WebElement numberInput;
	
	@FindBy(id ="streetInput")
	public WebElement streetInput;
	
	@FindBy(id ="apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id ="cityInput")
    public WebElement cityInput;
	
	@FindBy(xpath ="//select[@name='state']")
   public WebElement selectState;
	
	@FindBy(id ="zipCodeInput")
	public WebElement zipcodeInput;
	
	@FindBy (id ="addressBtn")
	public WebElement addressBtn;
	
	@FindBy (xpath = "//img[@class='checkout__payment-image']")
	public WebElement addcard;
	
	
	@FindBy (id ="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy (id = "placeOrderBtn")
	public WebElement orderBtn;
	
	@FindBy (xpath="//div[@class='Toastify']")
	public WebElement messageorder;
	
	@FindBy (id="search")
	public WebElement electronics;
	
	@FindBy (id="searchInput")
	public WebElement item;
	
	//@FindBy (xpath="//select[@class ='product__select']")
	//public WebElement quant;
	@FindBy(css = "select.product__select")
    public WebElement quantity;
	
	@FindBy (id ="cartQuantity")
	public WebElement cartQuant;
	
	//@FindBy(xpath="//div[@class='products__layout']")
	//public WebElement kasaout;
	
	
}


