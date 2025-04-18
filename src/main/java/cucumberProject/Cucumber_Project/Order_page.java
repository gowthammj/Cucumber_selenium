package cucumberProject.Cucumber_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_page {
	
	WebDriver driver;
	public Order_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Proceed to Checkout']")WebElement proceed_button;
	@FindBy(name="firstname")WebElement f_name;
	@FindBy(name="lastname")WebElement l_name;
	@FindBy(xpath="//input[@name='company']")WebElement company;
	@FindBy(xpath="//input[@name='street[0]']")WebElement street1;
	@FindBy(xpath="//input[@name='street[1]']")WebElement street2;
	@FindBy(xpath="//input[@name='street[2]']")WebElement street3;
	@FindBy(xpath="//input[@name='city']")WebElement city;
	@FindBy(xpath="//select[@name='country_id']")WebElement country;
	@FindBy(xpath="//input[@name='postcode']")WebElement pincode;
	@FindBy(xpath="//select[@name='region_id']")WebElement state;
	@FindBy(xpath="//input[@name='telephone']")WebElement phone;
	@FindBy(xpath="//form[@id='co-shipping-method-form']//div//table//tbody//tr[1]//td[1]//input[@type='radio']")WebElement radiobutton;
	@FindBy(xpath="//span[text()='Next']")WebElement next_button;
	@FindBy(xpath="//input[@id='billing-address-same-as-shipping-checkmo']")WebElement checkbox_button ;
	@FindBy(xpath="//span[text()='Place Order']")WebElement placeorder_button;
	@FindBy(xpath="//a[@class='order-number']")WebElement ordernumber_text;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProceed_button() {
		return proceed_button;
	}
	public WebElement getF_name() {
		return f_name;
	}
	public WebElement getL_name() {
		return l_name;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getStreet1() {
		return street1;
	}
	public WebElement getStreet2() {
		return street2;
	}
	public WebElement getStreet3() {
		return street3;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getNext_button() {
		return next_button;
	}
	public WebElement getCheckbox_button() {
		return checkbox_button;
	}
	public WebElement getPlaceorder_button() {
		return placeorder_button;
	}
	public WebElement getOrdernumber_text() {
		return ordernumber_text;
	}


}
