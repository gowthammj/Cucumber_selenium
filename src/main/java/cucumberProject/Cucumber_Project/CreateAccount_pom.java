package cucumberProject.Cucumber_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount_pom {

	public WebDriver driver;
	public CreateAccount_pom(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	@FindBy(linkText="Create an Account")
	WebElement createaccountbutton;
	public WebElement getCreateaccountbutton() {
		return createaccountbutton;
	}
	@FindBy(xpath="//span[text()='Create New Customer Account']")
	WebElement createaccounttext;
	
	public WebElement getCreateaccounttext() {
		return createaccounttext;
	}
	@FindBy(id="firstname")
	WebElement f_name;
	public WebElement getF_name() {
		return f_name;
	}
	public WebElement getL_name() {
		return l_name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getC_pwd() {
		return c_pwd;
	}
	public WebElement getC_button() {
		return c_button;
	}
	@FindBy(id="lastname")
	WebElement l_name;
	@FindBy(id="email_address")
	WebElement email;
	@FindBy(id="password")
	WebElement pwd;
	@FindBy(id="password-confirmation")
	WebElement c_pwd;
	@FindBy(xpath="//button[@type='submit'][@title='Create an Account']")
	WebElement c_button;
	@FindBy(xpath="//div[@class='box box-information']//strong//span")
	WebElement c_text;
	public WebElement getC_text() {
		return c_text;
	}
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement cart_button;
	
	@FindBy(xpath="//strong[@class='subtitle empty']")
	WebElement cart_text;
	@FindBy(xpath="//div[@id='ui-id-1']")
	WebElement cartemptyscreeenshot;
	public WebElement getCart_button() {
		return cart_button;
	}
	public WebElement getCart_text() {
		return cart_text;
	}
	public WebElement getCartemptyscreeenshot() {
		return cartemptyscreeenshot;
	}
}
