package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[2]/button")
	WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/button[2]")
	WebElement signuplink;
	@FindBy(xpath="//*[@id=\"tecovasInput-first-name-default-input-id\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"tecovasInput-last-name-default-input-id\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"tecovasInput-email-address-default-input-id\"]")
	WebElement mailid;
	@FindBy(xpath="//*[@id=\"tecovasInput-password-default-input-id\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"tecovasInput-confirm-password-default-input-id\"]")
	WebElement confirmpassword;
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/div[7]/button")
	WebElement iagreecheckbox;
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/div[9]/button/p")
	WebElement createaccount;
	
	public Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void signning(String first,String last,String mail,String pass,String confpass) throws InterruptedException {
		loginbutton.click();
		signuplink.click();
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		mailid.sendKeys(mail);
		password.sendKeys(pass);
		confirmpassword.sendKeys(confpass);
		iagreecheckbox.click();
		Thread.sleep(1000);
		createaccount.click();
	}
}
