package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.AddToCart;
import Page.ItemRemove;
import Page.ItemSearch;
import Page.Login;
import Page.Logout;
import Page.Mousehovering;

public class TecovasTest {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.tecovas.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() throws InterruptedException {
//		Signup sup=new Signup(driver);
//		sup.signning("Jerin", "Varghese", "vk259@gmail.com", "to#_j70_u7", "to#_j70_u7");
		
		Login log=new Login(driver);
		log.logging("vjerin259@gmail.com", "tom03%@#_j70_u7");
		
		ItemSearch is=new ItemSearch(driver);
		is.searching("bag");
		
		AddToCart ad=new AddToCart(driver);
		ad.addingtocart();
		
		ItemRemove ir=new ItemRemove(driver);
		ir.itemremoving();
		
		Mousehovering mh=new Mousehovering(driver);
		mh.mousehover();
		
		Logout lo=new Logout(driver);
		lo.loggingout();
		
	}
}
