package Test;
import base.BaseTest;
import Scenarios.NetWorkClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
public class NetWorkTest extends BaseTest{
	NetWorkClass nc;

	
	@Before
	public void before()
	{
	
		nc=new NetWorkClass(BaseTest.webDriver);
	}
	@Test
	public void test()
	{
		nc.search().scrollDown().dropdownMenu().hover().RandomSize().clickButton().Continue().SignIn().turnMainPage().Delete().EmptyControl();
	}
	@After
	public void after()
	{
		webDriver.quit();
	}

}
