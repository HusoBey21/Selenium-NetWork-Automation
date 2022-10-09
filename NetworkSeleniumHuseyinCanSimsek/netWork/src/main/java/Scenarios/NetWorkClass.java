package Scenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.BaseClass;
import constants.Constants;

public class NetWorkClass extends BaseClass {
	public NetWorkClass(WebDriver surucu)
	{
		super(surucu);
	}
	public NetWorkClass search()
	{
		sendkeys(Constants.SEARCH,"ceket");
		return this;
	}
	public NetWorkClass scrollDown()
	{
		ScrollToElement(Constants.MORE_BUTTON);
		return this;
	}
	public NetWorkClass clickButton()
	{
		click(Constants.GOBASKET);
		return this;
		
	}
	public NetWorkClass dropdownMenu()
	{
		DropdownElement(Constants.DROPDOWN);
		return this;
	}
	public NetWorkClass hover()
	{
		hoverElement(Constants.PRODUCTS);
		return this;
	}
	public NetWorkClass RandomSize()
	{
		RandomSize(Constants.PRODUCTSIZE);
		return this;
	}
	public NetWorkClass addChart()
	{
		click(Constants.ADDCART);
		return this;
	}
	public NetWorkClass Continue()
	{
		
		clickAction(Constants.CONTINUE);
		return this;
	}
	public NetWorkClass SignIn() 
	{
		signin(Constants.EMAIL,Constants.PASSWORD);
		BaseClass.bekleme.until(ExpectedConditions.visibilityOfElementLocated(Constants.SIGNIN));
		return this;
	}
	public NetWorkClass turnMainPage()
	{
		turnMainPage(Constants.LOGO);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public NetWorkClass Delete()
	{
		delete(Constants.SHOPPINGBAG);
		return this;
	}
	public NetWorkClass EmptyControl()
	{
		EmptyControl(Constants.SHOPPINGBAG);
		return this;
	}

}
