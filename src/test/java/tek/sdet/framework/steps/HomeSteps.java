package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);

	}
	
	@When ("User click on All section")
	public void userclickOnAllSection() {
		click(factory.homePage().allSelection);
		logger.info("user clicked on all section");
		
	}
	@Then ("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
		List<List<String>> optionsToDisplay = options.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
		logger.info("below options are present");
		slowDown();
		
	}
	@When("User on {string}")
	public void userOnElectronics(String department) {
	List<WebElement> dept =  factory.homePage().sideBar;  
	for(WebElement element : dept) {
		if (element.getText().equals(department)) {
			element.click();
			break;
		}
	}
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	List<List<String>> deptOpt = dataTable.asLists(String.class);
	List<WebElement> dept =  factory.homePage().sideBar;  
	for(int i =0; i< deptOpt.get(0).size(); i++) {
		
		for(WebElement element: dept) {
		if (element.getText().equals(deptOpt.get(0).get(i))) {
			Assert.assertTrue(element.isDisplayed());
	logger.info(element.getText()+ "is present ");
		}
	
		}}
	}
	@And ("User change the category to {string}")
	   public void userChangeTheCategoryToSmartHome(String SmartHome) {
		selectByVisibleText(factory.homePage().Smart, SmartHome);
		logger.info("user changed the category" + SmartHome);
	}
	    @And("User search for an item {string}")
	    public void userSearchForAnItem(String item) {
		sendText(factory.homePage().searchField, item);
		logger.info("user searched for an item" + item);
		
	}
	   @And("User click on Search icon")
	   public void userClickOnSearchIcon() {
		click(factory.homePage().serachbton);
		logger.info("user clicked on search icon");
		
	}

   @And("User click on item")
   public void userClickeOnItem() {
	//waitTillPresence(factory.homePage().image);
	click(factory.homePage().image);
	logger.info("user clikced on item");
	}

  @And("User select quantity {string}")
  public void userSelectQuantity(String qty) {
	  selectByVisibleText(factory.homePage().quantity2,qty);
	logger.info("user selected quantity" + qty);
}
  @And("User click add to Cart button")
  public void userClickAddToCartButton() {
	click(factory.homePage().addtocart);
	logger.info("user clicked on add to cart");
}
  @Then ("the cart icon quantity should change to {string}")
  public void theCartIconQuantityShouldChangeTo(String quantity) {
	Assert.assertEquals(quantity, factory.homePage().cartbtnquantity.getText());
	logger.info("the cart incon quantity changed");
	
}
  @And ("User click on Cart option")
public void userClickOnCartOption() {
	click(factory.homePage().cartBtn);
		logger.info("user clicked on cart option");
	}

  @And ("User click on Proceed to Checkout button")
  public void userClickOnProceedToChecloutButton() {
	click(factory.homePage().procedcheckoutBtn);
	logger.info("user clicked on proceed checkout button");
}
  @And ("User click Add a new address link for shipping address")
  public void userClickAddANewAddressLinkForShippingaddress() {
	click(factory.homePage().addAddress);
	logger.info("user clicked add a new address");
	
}
  @And ("User fill new address form with below information")
  public void userFillNewAddressFormWithBelowInformation(DataTable data) {
	List<Map<String, String >> address = data.asMaps(String.class ,String.class);
	sendText(factory.homePage().countryDropDown, address.get(0).get("country"));
	sendText(factory.homePage().nameInput, address.get(0).get("fullName"));
	sendText(factory.homePage().numberInput, address.get(0).get("phoneNumber"));
	sendText(factory.homePage().streetInput, address.get(0).get("streetAddress"));
	sendText(factory.homePage().apartmentInput, address.get(0).get("apt"));
	sendText(factory.homePage().cityInput, address.get(0).get("city"));
	sendText(factory.homePage().selectState, address.get(0).get("state"));
	sendText(factory.homePage().zipcodeInput, address.get(0).get("zipCode"));
	logger.info("user filled new address");
}
@And ("User click Add a credit card or Debit Card for Payment method")
public void userClickAddACreditOrDebitCardForPaymentMethod() {
	click(factory.homePage().addcard);
	logger.info("user clicked add a credit card");
	
}@And ("User  click on Add your card button")
public void userClickOnAddYourcardButton() {
	click(factory.homePage().paymentSubmitBtn);
	logger.info("user clicked on add card btn");

	
}
@And ("User click on Place Your Order")
public void userclickOnPlaceYourOrder() {
	//waitTillPresence(factory.homePage().orderBtn);
	click(factory.homePage().orderBtn);
	logger.info("user clicked on place order");
}
@Then ("a  message should be displayed {string}")
public void aMessageShouldBeDisplayed(String message) {
	isElementDisplayed(factory.homePage().messageorder);
	logger.info("a message displayed");
}
@And ("User  change the category to {string}")
public void userChangeTheCategoryToElectronics(String Electronics) {
	selectByVisibleText(factory.homePage().electronics, Electronics);
	logger.info("user changed the category" + Electronics);
}
@And("User  search for an item {string}")
public void userSearchForAnItemApex(String item) {
	sendText(factory.homePage().item, item);
	logger.info("user searched for an item" + item);
}
//@And("User click on item")
//public void userClickeOnItem1() {
	//click(factory.homePage().clickitem);
	//logger.info("user clikced on item");	
//}	
@And("User  select quantity '5'")
public void userSelectQuant() {
	isElementDisplayed(factory.homePage().quantity);
	logger.info("user selected quantity");
}
@Then ("the  cart icon quantity should change to '5'")
public void theCartIconQuantityShouldChangeTo5() {
	isElementDisplayed(factory.homePage().cartQuant);
	logger.info("the cart incon quantity changed");

}}


