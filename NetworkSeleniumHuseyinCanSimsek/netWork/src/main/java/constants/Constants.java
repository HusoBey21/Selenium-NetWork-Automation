package constants;
import org.openqa.selenium.By;

public class Constants {
	public static final By SEARCH=By.cssSelector(".o-header__searchInput--input.form-control.header__searchInput.header__searchAreaInput");
	public static final By MORE_BUTTON=By.cssSelector(".button.-secondary.-sm.relative");
	public static final By BASKET=By.cssSelector(".header_basketTrigger.js-basket-trigger-desktop");
	public static final By LOGO=By.className("headerCheckout__logo");
	public static final By GOBASKET=By.cssSelector(".button.-primary.header__basket--checkout.header__basketModal.-checkout");
	public static final By PRODUCTS=By.cssSelector(".product__imageList");
	public static final By PRODUCTSIZE=By.className("product__sizeList");
	public static final By DROPDOWN=By.xpath("//span[@class='tool__text']");
	public static final By ADDCART=By.cssSelector(".product__button.-addToCart.btn-black");
	public static final By CONTINUE=By.cssSelector(".continueButton.n-button.large.block.text-center.-primary");
	public static final By CARTVALUE=By.xpath("//span[@class='cartItem__attrValue']");
	public static final By DELETE=By.cssSelector(".header__basketProductBtn.header__basketModal.-remove");
	public static final By EMAIL=By.cssSelector(".input.js-trim");
	public static final By PASSWORD=By.id("n-input-password");
	public static final By SIGNIN=By.cssSelector(".n-button.large.block.text-center.-primary");
	public static final By SHOPPINGBAG=By.cssSelector(".header__basket.js-basket.header__basketLink");
	public static final By EXTRACTBUTTON=By.cssSelector(".btn.-black.o-removeCartModal__button");
	
	
}
