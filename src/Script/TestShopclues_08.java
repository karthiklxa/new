package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import generics.BaseTest;
import generics.CustomListner;


@Listeners(CustomListner.class)
public class TestShopclues_08 extends BaseTest{
	@Test
	public void BuyMemoryCard()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkUnder999();
	}

}
