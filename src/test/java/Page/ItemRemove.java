package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemRemove {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[3]/button")
	WebElement carticon;
	@FindBy(xpath="/html/body/header/nav/div[7]/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/button")
	WebElement remove;
	@FindBy(xpath="/html/body/header/nav/div[7]/div[1]/div[1]/button")
	WebElement close;
	
	public ItemRemove(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void itemremoving() {
		carticon.click();
		remove.click();
		close.click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
}
