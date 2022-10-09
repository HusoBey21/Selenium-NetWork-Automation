package base;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import constants.Constants;

public class BaseClass {
 public static WebDriver surucu=null;
 public static WebDriverWait bekleme=null;
 
 public BaseClass(WebDriver surucu)
 {
	 BaseClass.surucu=surucu;
	 BaseClass.bekleme=new WebDriverWait(surucu,Duration.ofSeconds(15));
	 
 }
 
 public WebElement findElement(By by)
 {
	 bekleme.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	 return surucu.findElement(by);
 }
 public void sendkeys(By by,String metin)
 {
	Actions a=new Actions(surucu);
	WebElement search= bekleme.until(ExpectedConditions.visibilityOfElementLocated(by));
	a.moveToElement(search).click().build().perform();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 search.sendKeys(metin);
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 search.sendKeys(Keys.ENTER);
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
 public void click(By by)
 {
	WebElement button= bekleme.until(ExpectedConditions.elementToBeClickable(by));
	 button.click();
	 
 }
 public void hoverElement(By by)
 {
	 List<WebElement> we=surucu.findElements(by);
	 Actions eylemler=new Actions(surucu);
	 eylemler.moveToElement(we.get(0)).build().perform();
	
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 public String getText(By by)
 {
	 bekleme.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	 return findElement(by).getText();
	 
 }
 public void ScrollToElement(By by)
 {
	 JavascriptExecutor js = (JavascriptExecutor) surucu;
	 WebElement element=surucu.findElement(by);
	 js.executeScript("arguments[0].scrollIntoView();", element);
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement s= bekleme.until(ExpectedConditions.elementToBeClickable(element));
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 js.executeScript("arguments[0].click()",s);
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 bekleme.until(ExpectedConditions.urlToBe("https://www.network.com.tr/search?searchKey=ceket&page=2"));
	 Assert.assertEquals(surucu.getCurrentUrl(), "https://www.network.com.tr/search?searchKey=ceket&page=2");
	 
 }
 public void DropdownElement(By by)
 {
	 WebElement k= surucu.findElement(by);
	 bekleme.until(ExpectedConditions.elementToBeClickable(k));
	 k.click();
	WebElement a= surucu.findElement(By.xpath("//span[text()='Ýndirim oranýna göre']"));
	bekleme.until(ExpectedConditions.elementToBeClickable(a));
	a.click();

 }
 public void RandomSize(By by)
 {
	 Actions eylemler=new Actions(surucu);
	 List<WebElement> k=surucu.findElements(by);
	 eylemler.moveToElement(k.get(0)).build().perform();
	 List<WebElement> sizes=k.get(0).findElements(By.className("product__sizeItem"));
	 eylemler.moveToElement(sizes.get(0)).build().perform();
	 List<WebElement> newProducts=sizes.get(0).findElements(By.className("product__size"));
	 
	 Random rd=new Random();
	 int u=rd.nextInt(newProducts.size());
	 WebElement tr=bekleme.until(ExpectedConditions.elementToBeClickable(newProducts.get(5)));
	 eylemler.moveToElement(tr).click().build().perform();
	 
	 
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 public void clickAction(By by)
 {
	 Actions a=new Actions(surucu);
	 bekleme.until(ExpectedConditions.visibilityOfElementLocated(by));
	 WebElement u=surucu.findElement(by);
	WebElement ty= bekleme.until(ExpectedConditions.elementToBeClickable(u));
	 a.moveToElement(ty).click().build().perform();
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
 public void signin(By a,By b) 
 {
	
	String row;
	try {
		BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\huseyin\\Documents\\adsoyad.csv"));
		while ((row = csvReader.readLine()) != null) {
		     String[] data = row.split(",");
		     sendkeys(a,data[0]);
		     sendkeys(b,data[1]);
		 }
		 csvReader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
 public void turnMainPage(By by)
 {
	 Actions t=new Actions(surucu);
	 WebElement r=bekleme.until(ExpectedConditions.visibilityOfElementLocated(by));
	 r=bekleme.until(ExpectedConditions.elementToBeClickable(r));
	 t.moveToElement(r).click().build().perform();
	 
 }
 public void delete(By by)
 {
	 Actions t=new Actions(surucu);
	 WebElement r=bekleme.until(ExpectedConditions.elementToBeClickable(by));
	 t.moveToElement(r).click().build().perform();
	 WebElement u=bekleme.until(ExpectedConditions.visibilityOfElementLocated(Constants.DELETE));
	 u=bekleme.until(ExpectedConditions.elementToBeClickable(u));
	 t.moveToElement(u).click().build().perform();
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 WebElement re=bekleme.until(ExpectedConditions.visibilityOfElementLocated(Constants.EXTRACTBUTTON));
	 re=bekleme.until(ExpectedConditions.elementToBeClickable(re));
	 t.moveToElement(re).click().build().perform();
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
 public void EmptyControl(By by)
 {
	 Actions t=new Actions(surucu);
	 WebElement r=bekleme.until(ExpectedConditions.elementToBeClickable(by));
	 t.moveToElement(r).click().build().perform();
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
 }
 
}
