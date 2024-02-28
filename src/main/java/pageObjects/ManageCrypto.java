package pageObjects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ManageCrypto {
    public void Enablebitcoin extends PageObject {
        // Click on the "Manage" button
        MobileElement manageButton = driver.findElement(By.id("manage_button"));
        manageButton.click();

        // Wait for the "Manage Crypto" screen to load
        MobileElement manageCryptoScreen = driver.findElement(By.id("manage_crypto_screen"));
        manageCryptoScreen.isDisplayed();

        // Search for Bitcoin
        MobileElement searchField = driver.findElement(By.id("search_field"));
        searchField.sendKeys("Bitcoin");

        // Wait for the search results to load
        MobileElement searchResults = driver.findElement(By.id("search_results"));
        searchResults.isDisplayed();

        // Enable Bitcoin
        MobileElement bitcoinResult = driver.findElement(By.xpath("//android.widget.TextView[@text='Bitcoin']"));
        bitcoinResult.click();

        // Wait for the "Add Currency" confirmation screen to load
        MobileElement addCurrencyConfirmationScreen = driver.findElement(By.id("add_currency_confirmation_screen"));
        addCurrencyConfirmationScreen.isDisplayed();

        // Click on the "Add" button
        MobileElement addButton = driver.findElement(By.id("add_button"));
        addButton.click();

        // Wait for the "Manage Crypto" screen to load with the new currency
        manageCryptoScreen = driver.findElement(By.id("manage_crypto_screen"));
        manageCryptoScreen.isDisplayed();

        MobileElement bitcoinElement = driver.findElement(By.xpath("//android.widget.TextView[@text='Bitcoin']"));
        bitcoinElement.isDisplayed();

        // Check if Bitcoin is enabled
        MobileElement bitcoinSwitch = driver.findElement(By.id("bitcoin_switch"));
        assertTrue(bitcoinSwitch.isSelected());
    }
    public void testDisableBitcoin() {
        // Click on the "Manage" button
        MobileElement manageButton = driver.findElement(By.id("manage_button"));
        manageButton.click();

        // Wait for the "Manage Crypto" screen to load
        MobileElement manageCryptoScreen = driver.findElement(By.id("manage_crypto_screen"));
        manageCryptoScreen.isDisplayed();

        // Disable Bitcoin
        MobileElement bitcoinSwitch = driver.findElement(By.id("bitcoin_switch"));
        bitcoinSwitch.click();

        // Wait for the "Disable Currency" confirmation screen to load
        MobileElement disableCurrencyConfirmationScreen = driver.findElement(By.id("disable_currency_confirmation_screen"));
        disableCurrencyConfirmationScreen.isDisplayed();

        // Click on the "Disable" button
        MobileElement disableButton = driver.findElement(By.id("disable_button"));
        disableButton.click();

        // Wait for the "Manage Crypto" screen to load without Bitcoin
        manageCryptoScreen = driver.findElement(By.id("manage_crypto_screen"));
        manageCryptoScreen.isDisplayed();

        MobileElement bitcoinElement = driver.findElement(By.xpath("//android.widget.TextView[@text='Bitcoin']"));
        assertFalse(bitcoinElement.isDisplayed());
    }

}
}
