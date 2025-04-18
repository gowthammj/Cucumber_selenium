package cucumberProject.Cucumber_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gearpage {

	WebDriver driver;
	public Gearpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Gear']")WebElement gearhover;
	@FindBy(xpath="//span[text()='Bags']")WebElement bag_click;
	@FindBy(xpath="//img[@alt='Rival Field Messenger']")WebElement rivalbag;
	@FindBy(xpath="//input[@id='qty']")WebElement bag_quantity;
	@FindBy(xpath="//button[@id='product-addtocart-button']")WebElement addcartbag;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getGearhover() {
		return gearhover;
	}
	public WebElement getBag_click() {
		return bag_click;
	}
	public WebElement getRivalbag() {
		return rivalbag;
	}
	public WebElement getBag_quantity() {
		return bag_quantity;
	}
	public WebElement getAddcartbag() {
		return addcartbag;
	}

}
