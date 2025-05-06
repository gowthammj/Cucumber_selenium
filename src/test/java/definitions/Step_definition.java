package definitions;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumberProject.Cucumber_Project.Base;
import cucumberProject.Cucumber_Project.Cart_page;
import cucumberProject.Cucumber_Project.CreateAccount_pom;
import cucumberProject.Cucumber_Project.Gearpage;
import cucumberProject.Cucumber_Project.Homepage_cartone;
import cucumberProject.Cucumber_Project.Order_page;
import io.cucumber.java.en.*;

public class Step_definition extends Base {
	
	CreateAccount_pom ca;
	Homepage_cartone hmcart;
	Gearpage gp;
	Cart_page cp;
	Order_page op;

	//TestCase 1:
	@Given("user should Launch the browser.")
	public void userShouldLaunchTheBrowser() {
		browseroptions();
		launch_browser();
		
	}
	@Given("Maximize the browser window.")
	public void maximizeTheBrowserWindow() {
		maximize();
	    	}
	@Then("Navigate to the URL {string}")
	public void navigateToTheURL(String url) {
		url(url);

	   	}
	@Then("Verify the page title and currentURL.")
	public void verifyThePageTitleAndCurrentURL() {
		ca=new CreateAccount_pom(driver);
		implicitywait(20);
		System.out.println("Test Case :1");
		getthetitle();
		getthtcurrenturl();
	    }
	@When("its verified Click the Create an Account button.")
	public void itsVerifiedClickTheCreateAnAccountButton() {
		
		clickelement(ca.getCreateaccountbutton());
	   	}
	@Then("Verify the visibility of the Create New Customer Account text.")
	public void verifyTheVisibilityOfTheCreateNewCustomerAccountText() {
		String text=ca.getCreateaccounttext().getText();
		System.out.println(text);
		Assert.assertEquals("Create New Customer Account", text);
	   }
	@Then("Enter personal information of FirstName,LastName,Email,Password,and ConfirmPassword.")
	public void enterPersonalInformationOfFirstNameLastNameEmailPasswordAndConfirmPassword() {
		sendkeysvalue(ca.getF_name(), "Gowtham");
		sendkeysvalue(ca.getL_name(), "Mj");
		sendkeysvalue(ca.getEmail(), "gowthamluma182@gmail.com");
		ca.getPwd().sendKeys("GowPoc@123456");
		ca.getC_pwd().sendKeys("GowPoc@123456");
		}
	@Then("Click the Create an Account button.")
	public void clickTheCreateAnAccountButton() {
		ca.getC_button().click();

	    	}
	
	@Then("Verify the current URL and the visibility of Contact Information text.")
	public void verifyTheCurrentURLAndTheVisibilityOfContactInformationText() {
		getthtcurrenturl();
		String text=ca.getC_text().getText();
		Assert.assertEquals("Contact Information", text);
	}
	@When("its verified Click the cart icon and verify The cart is empty message.")
	public void itsVerifiedClickTheCartIconAndVerifyTheCartIsEmptyMessage() {
		clickelement(ca.getCart_button());
		String text=elementgettextvalue(ca.getCart_text());
		//System.out.println(text);
		Assert.assertEquals("You have no items in your shopping cart.",text);
		
	    }
	@Then("cart is empty Capture a screenshot")
	public void cartIsEmptyCaptureAScreenshot() throws IOException {
		
		particular_elementscreenshot(ca.getCartemptyscreeenshot(),"C:\\Users\\gowth\\eclipse-workspace\\Cucumber_Project\\target\\screenshot\\cartempty.png");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
	   	}
	
	//Test Case 2:
	@Given("user should Navigate into the homepage.")
	public void userShouldNavigateIntoTheHomepage() {
		System.out.println("Test Case : 2");
		pagenavigate("https://magento.softwaretestingboard.com/");
		//pagenavigateback();
	   }
	@Given("Hover over the Women menu.")
	public void hoverOverTheWomenMenu() throws InterruptedException {
		hmcart=new Homepage_cartone(driver);
		Thread.sleep(2000);
		mousehover(hmcart.getWomenoption_hover());
		
	    	}
	@When("Click on Shorts under Bottoms.")
	public void clickOnShortsUnderBottoms() throws InterruptedException {
		Thread.sleep(2000);
		mousehover(hmcart.getBottomhover());
		clickelement(hmcart.getShortshover());
	   }
	@When("Select the product MimiAll-PurposeShort.")
	public void selectTheProductMimiAllPurposeShort() {
		clickelement(hmcart.getMimishort());
		}
	@When("Choose size and color options.")
	public void chooseSizeAndColorOptions() {
		explicitywait(hmcart.getShort_size(),20);
		clickelement(hmcart.getShort_size());
		clickelement(hmcart.getShort_color());
	    }

	@When("Update the quantity.")
	public void updateTheQuantity() {
		clickelement(hmcart.getShorts_quantity());
		getclear(hmcart.getShorts_quantity());
		sendkeysvalue(hmcart.getShorts_quantity(), "2");
    	}
	@Then("Clickthe Add to Cart button.")
	public void clicktheAddToCartButton() throws InterruptedException {
		Thread.sleep(2000);
		clickelement(hmcart.getAddtocartforshorts());
	   }
	@Then("Capture a screenshot.")
	public void captureAScreenshot() throws InterruptedException, IOException {
		Thread.sleep(2000);
		fulpage_screensshot("C:\\Users\\gowth\\eclipse-workspace\\Cucumber_Project\\target\\screenshot\\shortspage.png");
	    }
	@Then("Navigate back and verify the previous page URL.")
	public void navigateBackAndVerifyThePreviousPageURL() throws InterruptedException {
		Thread.sleep(3000);
		pagenavigateback();
		getthtcurrenturl();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
	   	}

	//Test Case 3:
	@Given("user should Hover over the Gear menu.")
	public void userShouldHoverOverTheGearMenu() {
		System.out.println("Test Case 3:");
		gp=new Gearpage(driver);
		mousehover(gp.getGearhover());
		}
	@Given("Click on Bags.")
	public void clickOnBags() {
		clickelement(gp.getBag_click());
	    }
	@Then("Select the product Rival Field Messenger.")
	public void selectTheProductRivalFieldMessenger() {
		clickelement(gp.getRivalbag());
		 }
	@When("Update the quantity bag.")
	public void updateTheQuantityTobag() {
		clickelement(gp.getBag_quantity());
		getclear(gp.getBag_quantity());
		sendkeysvalue(gp.getBag_quantity(), "2");
	}
	@Then("Click the Add to Cart button.")
	public void clickTheAddToCartButton() {
		explicitywait(gp.getAddcartbag(), 10);
		clickelement(gp.getAddcartbag());
		System.out.println("Test case 3 is done");
	    }
	@Then("Capture a screenshot")
	public void captureAScreenshot2() throws IOException {
		fulpage_screensshot("C:\\Users\\gowth\\eclipse-workspace\\Cucumber_Project\\target\\screenshot\\bagpage.png");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	    }
	
	//Test Case 4:
	@Given("the user should Click on the cart icon.")
	public void theUserShouldClickOnTheCartIcon() {
		cp=new Cart_page(driver);
		System.out.println("Test Case 4:");
		explicitywait(cp.getCart_button(),10);
		clickelement(cp.getCart_button());
	   	}
	@Given("Click View and Edit Cart.")
	public void clickViewAndEditCart() {
		clickelement(cp.getView_edit_button());
	   	}
	@Then("Retrieve and print the subtotal for each product and grandtotal then Verify if the sum of sub total smatches the grand total")
	public void retrieveAndPrintTheSubtotalForEachProductAndGrandtotalThenVerifyIfTheSumOfSubTotalSmatchesTheGrandTotal() {
		String shorts_subtotal=cp.getSubtotal1().getText();
		String valueAsString = shorts_subtotal.replace("$", ""); 
		double shortstotal=Double.parseDouble(valueAsString);
		System.out.println("Shorts Subtotal :"+shortstotal);
		
		String bag_subtotal=cp.getSubtotal2().getText();
		String valueAsString2 = bag_subtotal.replace("$", "");
		double bagstotal=Double.parseDouble(valueAsString2);
		System.out.println("Bag Subtotal :"+bagstotal);

		String grand_total=cp.getGrand_total().getText();
		String valueAsString3 = grand_total.replace("$", "");
		double grandtotal=Double.parseDouble(valueAsString3);
		System.out.println("Grand Subtotal :"+grandtotal);
		double sub_total=(shortstotal+bagstotal);
		System.out.println("Sub-Total : "+sub_total);
		if(sub_total==grandtotal) {
			System.out.println("Both Total are matched and verified");
		}
		else {
			System.out.println("Both Total are not matched and unable to verify");
		}   }
	@Then("Capture a screenshot of view cart")
	public void captureAScreenshotOfViewCart() throws IOException {
		fulpage_screensshot("C:\\Users\\gowth\\eclipse-workspace\\Cucumber_Project\\target\\screenshot\\viewcartpage.png");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	   	}

	//Test Case 5:
	@Given("the user should  Click the Proceed to Checkout button.")
	public void theUserShouldClickTheProceedToCheckoutButton() {
		op=new Order_page(driver);
		System.out.println("Test Case 5:");
		clickelement(op.getProceed_button());
	   }
	@Given("Enter the email,firstname,lastname,andaddressdetails.")
	public void enterTheEmailFirstnameLastnameAndaddressdetails() {
		op.getF_name().clear();
		sendkeysvalue(op.getF_name(), "Gowtham");
		op.getL_name().clear();
		sendkeysvalue(op.getL_name(), "MJ");
		sendkeysvalue(op.getCompany(), "dummytechnologies");
	   	}
	@Then("Select State,PostalCode,Country,and Phonenumber.")
	public void selectStatePostalCodeCountryAndPhonenumber() {
		sendkeysvalue(op.getStreet1(), "102");
		sendkeysvalue(op.getStreet2(), "Ambal Nagar");
		sendkeysvalue(op.getStreet3(), "Ekatuthangal");
		sendkeysvalue(op.getCity(), "Chennai");
		explicitywait(op.getCountry(), 10);
		
		dropdpwn_selectby(op.getCountry(), "India");
		explicitywait(op.getPincode(), 10);
		sendkeysvalue(op.getPincode(), "600032");
		explicitywait(op.getState(), 10);
		dropdpwn_selectby(op.getState(), "Tamil Nadu");
		explicitywait(op.getPhone(), 10);
		sendkeysvalue(op.getPhone(), "9839209992");
		}
	@Then("Choose a shipping method.")
	public void chooseAShippingMethod() {
		WebElement radiobutton = op.getRadiobutton();
		explicitywait(radiobutton, 20);
		//radio(op.getRadiobutton());
		op.getRadiobutton();
		if(!radiobutton.isSelected()) {
			radiobutton.click();
		}
		
	   }
	@Then("Click the Next button.")
	public void clickTheNextButton() {
		//submitBtn(op.getNext_button());
		/*boolean enable=op.getNext_button().isEnabled();
		System.out.println("Button is enabled :"+enable);
		boolean display=op.getNext_button().isDisplayed();
		System.out.println("Button is displayed :"+display);*/
		//op.getNext_button().sendKeys(Keys.ENTER);
		//explicitywait(op.getNext_button(), 20);
		//js_excecutor_scroll_down();
		//op.getNext_button().click();
		explicitywait(op.getNext_button(), 10);
		js_excecutor_click(op.getNext_button());
		//clickelement(op.getNext_button());
 }
	@Then("Select the billing address checkbox.")
	public void selectTheBillingAddressCheckbox() {
		explicitywait(op.getCheckbox_button(), 10);
		checkbox(op.getCheckbox_button());
	    }
	@Then("Click the PlaceOrder button.")
	public void clickThePlaceOrderButton() {
		clickelement(op.getPlaceorder_button());
	    }
	@Then("Capture and print the order number.")
	public void captureAndPrintTheOrderNumber() {
		String order_nmber=op.getOrdernumber_text().getText();
		System.out.println("Your Order Number is : "+order_nmber);
	    }
	@Then("Capture a screenshot of orderedpage.")
	public void captureAScreenshotOfOrderedpage() throws IOException {
		fulpage_screensshot("C:\\Users\\gowth\\eclipse-workspace\\Cucumber_Project\\target\\screenshot\\orderedpage.png");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
	   }


	



	
	
	
	}
