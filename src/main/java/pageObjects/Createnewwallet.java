package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Createnewwallet extends PageObject{



	public Createnewwallet(AndroidDriver<MobileElement> driver) {
		super(driver);


	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Create new wallet\"]");
			//skip to backup
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"SKIP\"]");
	//create passcode


			@AndroidFindBy(className ="android.widget.TextView").sendKeys(123456);

		}
		// confirm passcode

	  @AndroidFindBy(className = "andrdoid.widget.TextView").sendKeys(123456);

	MobileElement startButton= driver.findElementByXPath( "//android.widget.TextView[@text=\"Start using Trust Wallet\"]");

	startButton.click();



	


}
