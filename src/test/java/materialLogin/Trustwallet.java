package materialLogin;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import setup.SetupAndroidTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Trustwallet extends SetupAndroidTest {

    public static final String TRUST_WALLET_PACKAGE_NAME = "com.wallet.crypto.trustapp";
    public static final String TRUST_WALLET_ACTIVITY_NAME = "com.wallet.crypto.trustapp.ui.app.AppActivity";

    public static void main(String[] args) throws Exception {
        // Set up Appium driver
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI WAS-LX1A");
        capabilities.setCapability(MobileCapabilityType.APP, TRUST_WALLET_PACKAGE_NAME);
        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, TRUST_WALLET_ACTIVITY_NAME);
        AppiumDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch Trust Wallet app
        driver.launchApp();



        // Quit Appium driver
        driver.quit();
    }
}