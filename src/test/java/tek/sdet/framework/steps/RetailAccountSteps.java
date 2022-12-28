package tek.sdet.framework.steps;

import java.util.List;


import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("User click on loginbutton")
	public void userClickOnLoginbutton() {
		click(factory.signInPage().loginbtn);
		logger.info("user cliked on loginbutton");
	}

	
	@When ("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountbtn);
		logger.info("user cliked on account option");
	}
	@And ("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().name);
		sendText(factory.accountPage().name, name);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
         sendText(factory.accountPage().phoneInput, phone);
		logger.info("user updated name and phone ");
		
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateBtn);
		logger.info("user cliked on update button");
	}
	@Then ("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		isElementDisplayed(factory.accountPage().updatedInfo);
		logger.info("user information should be updated");
	}
	@And ("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String >> accountdata = data.asMaps(String.class ,String.class);
		sendText(factory.accountPage().perviousPass, accountdata.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPass, accountdata.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPass, accountdata.get(0).get("confirmPassword"));
		logger.info("user Enterd below information");
		
		
	}
	
	@And ("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().submitBtn);
		logger.info("user cliked on change password btn");
	}
		@And ("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPayment);
		logger.info("user clicked on add a payment method link");
		
		
	}
	@And ("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformatin(DataTable data) {
		List<Map<String, String >> carddata = data.asMaps(String.class ,String.class);
		sendText(factory.accountPage(). cardNumber,carddata.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOncard,carddata.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationM,carddata.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationY,carddata.get(0).get("expirationYear"));
		sendText(factory.accountPage().codeInput,carddata.get(0).get("securityCode"));
		logger.info("user filled Debit or credit card information");
	}
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().cardBtn);
		logger.info("user clicked on add card number");
		slowDown();
	}
	@Then("a message should be displayed {string}")
		public void aMessageShouldBeDisplayed(String message) {
		isElementDisplayed(factory.accountPage().message);
		logger.info("a message displayed");
		slowDown();
		
	}
	@And("User  select the payment Card")
    public void userSelectedThePaymentCard() {
		waitTillPresence(factory.accountPage().SelectedpaymentCard);
		click(factory.accountPage().SelectedpaymentCard);
		logger.info("user selected payment card");
		}
	
	@And ("User click on Edit option of card section")
	public void userClickedOnEditOptionOfCardSection() {
		click(factory.accountPage().editcard);
		logger.info("user clicked on Edit option of card section");
		
	}
	@And ("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String >> carddata = data.asMaps(String.class ,String.class);
		sendText(factory.accountPage(). cardnum,carddata.get(0).get("cardNumber"));
		sendText(factory.accountPage().cardname,carddata.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMon,carddata.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationyear,carddata.get(0).get("expirationYear"));
		sendText(factory.accountPage().codeinput,carddata.get(0).get("securityCode"));
		logger.info("user edited information");
	}
	@And ("user click on Update Your Card button")
	public void userClickOnUpdateYopurCardButton() {
		click(factory.accountPage().updatepayment);
		logger.info("user clikced on update card btn");
	}
	
	@And("User select the payment Card")
    public void userSelectedThePaymentCard1() {
        click(factory.accountPage().SelectedpaymentCard);
        logger.info("User clicked on payment card");
	}
	@And ("User click on remove option of card section")
	public void userClikceOnRemoveOptionOfcardSection() {
		click(factory.accountPage().remove);
		logger.info("user clicked on remove option of card");
		
	}
	@Then ("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().removedpage);
		logger.info("payment details removed");
		
	}
	@And ("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().adress);
		logger.info("user clicked on add address option");
	}
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String >> address = data.asMaps(String.class ,String.class);
		sendText(factory.accountPage(). country,address.get(0).get("country"));
		sendText(factory.accountPage(). nameInput,address.get(0).get("fullName"));
		sendText(factory.accountPage(). phoneNum,address.get(0).get("phoneNumber"));
		sendText(factory.accountPage(). streetInput,address.get(0).get("streetAddress"));
		sendText(factory.accountPage(). apartment,address.get(0).get("apt"));
		sendText(factory.accountPage(). city,address.get(0).get("city"));
		sendText(factory.accountPage(). state,address.get(0).get("state"));
		sendText(factory.accountPage(). zipcode,address.get(0).get("zipCode"));
		logger.info("user filled address information");
	
	}
	@And ("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().adressbtn);
		logger.info("user clicked add your adress button");
	}
	
	@And ("User click on edit address option")
	public void userClickOnEditAddressOption() {
		waitTillPresence(factory.accountPage().editadress);
		click(factory.accountPage().editadress);
		logger.info("user clicked on edit address option");
	}
	@And ("user  fill new address form with below information")
	public void userFillNewAddressFromWithBelowInformatin(DataTable data) {
		List<Map<String, String >> address = data.asMaps(String.class ,String.class);
		sendText(factory.accountPage(). editcountry,address.get(0).get("country"));
		sendText(factory.accountPage(). updateName,address.get(0).get("fullName"));
		sendText(factory.accountPage(). updatephone,address.get(0).get("phoneNumber"));
		sendText(factory.accountPage(). updatestreet,address.get(0).get("streetAddress"));
		sendText(factory.accountPage(). updateapp,address.get(0).get("apt"));
		sendText(factory.accountPage(). updatecity,address.get(0).get("city"));
		sendText(factory.accountPage(). updatestate,address.get(0).get("state"));
		sendText(factory.accountPage(). updatezip,address.get(0).get("zipCode"));
		
	}
	@And ("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updatebtn);
		logger.info("user clicked update address button");
		
	}
	
	@And ("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeaddress);
		logger.info("user clicked on remove option");
		
	}
	@Then("Address details should be removed")
	public void adressDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().removed);
		logger.info("adress details removed");
		
	}
	
}
