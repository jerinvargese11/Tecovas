package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mousehovering {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/nav/div[1]/div[2]/a[1]")
	WebElement mens;
	@FindBy(xpath="//a[@href='/shop/wallets']")
	WebElement wallet;
	
	public Mousehovering(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void mousehover() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(mens).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		act.moveToElement(wallet).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
