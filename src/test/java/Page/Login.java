package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[2]/button")
	WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"tecovasInput-email-address-default-input-id\"]")
	WebElement loginemail;
	@FindBy(xpath="//*[@id=\"tecovasInput-password-default-input-id\"]")
	WebElement loginpassword;
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/div[3]/button")
	WebElement Loginbutton;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logging(String mail,String pass) throws InterruptedException {
		loginbutton.click();
		loginemail.sendKeys(mail);
		loginpassword.sendKeys(pass);
		Thread.sleep(1000);
		Loginbutton.click();
	}
}
