package Page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[1]/button[1]")
	WebElement searchicon;
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[1]/div[1]/input")
	WebElement searchfield;
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/a")
	WebElement beltbuckle;
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[1]/div[2]/div[5]/form/button")
	WebElement cart;
	
	
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void addingtocart() throws InterruptedException {
		Thread.sleep(2000);
		searchicon.click();
		searchfield.click();
		searchfield.sendKeys("BIRTHDAY",Keys.ENTER,Keys.ENTER);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		beltbuckle.click();
		Thread.sleep(2000);
		cart.click();
		Thread.sleep(1000);
	}

}
