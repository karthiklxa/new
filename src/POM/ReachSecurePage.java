package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generics.BasePage;

public class ReachSecurePage extends BasePage {
	@FindBy(xpath="//button[.='Add To Cart']")
	private WebElement addCart;
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buy;
	@FindBy(xpath="//input[@id='zip']")
	private WebElement pinCode;
	@FindBy(xpath="//input[@id='check_shipping']")
	private WebElement check;
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement Cart;
	@FindBy(xpath="//span[contains(.,'Reach Secure')]")
	private WebElement verifyCart;
	@FindBy(xpath="//span[@id='5411359']")
	private WebElement colBlack;
	@FindBy(xpath="//span[@id='5419829']")
	private WebElement colChampagne;
	public ReachSecurePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	public void clkAddCart()
	{
		verifyElement(driver, ETO, addCart);
		addCart.click();
	}
	public void clkBuy()
	{
		verifyElement(driver, ETO, buy);
		buy.click();
	}
	public void enterPinCode(String zip)
	{
		verifyElement(driver, ETO, pinCode);
		pinCode.sendKeys(zip);
	}
	public void clkCheck()
	{
		verifyElement(driver, ETO, check);
		check.click();
	}
	public void verifyCart()
	{
		Actions a = new Actions(driver);
		a.moveToElement(Cart);
		verifyElement(driver, ETO, verifyCart);
		Reporter.log("Item is present in the cart", true);
	}
	public void clkColorBlack()
	{
		verifyElement(driver, ETO, colBlack);
		colBlack.click();
	}
	public void clkColorChampagne()
	{
		verifyElement(driver, ETO, colBlack);
		colChampagne.click();
	}
	
	
}


