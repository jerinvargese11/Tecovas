package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemSearch {
	WebDriver driver;

	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[1]/button[1]")
	WebElement searchicon;
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[1]/div[1]/input")
	WebElement searchfield;
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[2]/button")
	WebElement accounticon;
	@FindBy(xpath="/html/body/header/nav/div[5]/a/p[2]")
	WebElement accounthome;
	
	public ItemSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void searching(String item) throws InterruptedException {
	    Thread.sleep(2000);
		searchicon.click();
		searchfield.click();
		searchfield.sendKeys(item,Keys.ENTER);
		Thread.sleep(3000);
		accounticon.click();
		accounthome.click();
	}
}
