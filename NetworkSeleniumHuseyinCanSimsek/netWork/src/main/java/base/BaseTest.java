package base;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {
public static WebDriver webDriver=null;
@Before
public void SetUp()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\huseyin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
ChromeOptions secenekler=new ChromeOptions();
secenekler.addArguments("start-maximized");
secenekler.addArguments("disable-notifications");
secenekler.addArguments("enable-popup-blocking");
BaseTest.webDriver=new ChromeDriver(secenekler);
BaseTest.webDriver.navigate().to("https://www.network.com.tr/");
String currentUrl=BaseTest.webDriver.getCurrentUrl();
Assert.assertEquals(currentUrl,"https://www.network.com.tr/");


}

}
