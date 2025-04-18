package cucumberProject.Cucumber_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {

	WebDriver driver;
	public Cart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='action showcart']")WebElement cart_button;
	@FindBy(xpath="//span[text()='View and Edit Cart']")WebElement view_edit_button;
	@FindBy(xpath="//tbody[@class='cart item'][1]//tr[1]//td[4]//span//span//span")WebElement subtotal1;
	@FindBy(xpath="//tbody[@class='cart item'][2]//tr[1]//td[4]//span//span//span")WebElement subtotal2;
	@FindBy(xpath="//td[@class='amount'][@data-th='Order Total']")WebElement grand_total;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCart_button() {
		return cart_button;
	}
	public WebElement getView_edit_button() {
		return view_edit_button;
	}
	public WebElement getSubtotal1() {
		return subtotal1;
	}
	public WebElement getSubtotal2() {
		return subtotal2;
	}
	public WebElement getGrand_total() {
		return grand_total;
	}
	
}
