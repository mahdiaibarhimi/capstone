package tek.sdet.framework.steps;



import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	
	@And ("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderpage().orderpage);
		logger.info("user clicked on orders section");
	}
	@And ("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderpage().firstorder);
		logger.info("user clicked on first order in list");
	}
	@And ("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderpage().cancelbtn);
		logger.info("user clicked on cancel the order btn");
		
	}
	@And ("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String value) {
		selectByVisibleText(factory.orderpage().reason,value);
		//isElementDisplayed(factory.orderpage().reason);
		logger.info("user selected the cancelation reason");
			
	}
	
	@And ("User click on Cancel Order button")
	public void userClickOncancelOrderButton() {
		click(factory.orderpage().cancelorderBtn);
		logger.info("user clicked on cancel order button");
	}
	@Then ("a cancelation message should be displayed {string}")
	public void aCancelationMsgShouldBeDisplayed(String message) {
		Assert.assertTrue(isElementDisplayed(factory.orderpage().cancelconfirmation));
   logger.info("A message displayed as 'Your Order Has Been Cancelled'");
	}
	@And ("User click on Return Items button")
	public void userClickOnRetailItemsButton() {
		click(factory.orderpage().returnBtn);
		logger.info("user clicked on return item button");
	}
	@And ("User select the Return Reason {string}")
	public void userSelectTheReturnreason(String value) {
		selectByVisibleText(factory.orderpage().returnreason,value);
		logger.info("user selected the return reason");
	}
	@And ("User select the drop off service {string}")
	public void userSelectTheDropOffService(String value) {
		selectByVisibleText(factory.orderpage().fedex,value);
		logger.info("user selected the drop off service");
		
	}
	@And ("User click on Return Order button")
	public void userClickOnreturnOrderButton(){
		click(factory.orderpage().returnorderBtn);
		logger.info("user clicked on return order button");
		
	}
	@Then ("a  cancelation message should be displayed {string}")
	public void aCancelationMessageshouldBeDisplayed(String message) {
		Assert.assertTrue(isElementDisplayed(factory.orderpage().message));
		logger.info("a cancelation message displayed 'your order has been canceled'");
	}
	
	@And ("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderpage().reviewbtn);
		logger.info("user clicked on review button");
	}
	@And ("User write Review headline {string} and {string}")
	public void userWriteReviewHeadline(String headline , String review ) {
		sendText(factory.orderpage().headlineInput, headline);
		sendText(factory.orderpage().reviewText, review);
		logger.info("user wrote review headline");
	}
	@And ("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderpage().reviewtexbtn);
		logger.info("user clicked add your review button");
	}
	@Then ("a review message should be displayed {string}")
	public void aReviewMessageshouldBeDisplayed(String message) {
		isElementDisplayed(factory.orderpage().confimmessage);
		logger.info("review message diplayed");
		
	}
	
}
