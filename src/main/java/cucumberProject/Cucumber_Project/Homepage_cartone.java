package cucumberProject.Cucumber_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_cartone {

	WebDriver driver;
	public Homepage_cartone(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='ui-id-4']")WebElement womenoption_hover;
	@FindBy(xpath="//a[@id='ui-id-10']//span[text()='Bottoms']")WebElement bottomhover;
	@FindBy(xpath="//a[@id='ui-id-16']")WebElement shortshover;
	@FindBy(xpath="//img[@alt='Mimi All-Purpose Short']")WebElement mimishort;
	@FindBy(id="option-label-size-143-item-171")WebElement short_size;
	@FindBy(id="option-label-color-93-item-53")WebElement short_color;
	@FindBy(xpath="//input[@id='qty']")WebElement shorts_quantity;
	@FindBy(id="product-addtocart-button")WebElement addtocartforshorts;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getWomenoption_hover() {
		return womenoption_hover;
	}
	public WebElement getBottomhover() {
		return bottomhover;
	}
	public WebElement getShortshover() {
		return shortshover;
	}
	public WebElement getMimishort() {
		return mimishort;
	}
	public WebElement getShort_size() {
		return short_size;
	}
	public WebElement getShort_color() {
		return short_color;
	}
	public WebElement getShorts_quantity() {
		return shorts_quantity;
	}
	public WebElement getAddtocartforshorts() {
		return addtocartforshorts;
	}
	
	
}
