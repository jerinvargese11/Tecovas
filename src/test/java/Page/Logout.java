package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;

	@FindBy(xpath="//button[normalize-space()='Log out']")
	WebElement logoutbutton;
	
	public Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loggingout() throws InterruptedException {
		Thread.sleep(1000);
		logoutbutton.click();
	}
}
