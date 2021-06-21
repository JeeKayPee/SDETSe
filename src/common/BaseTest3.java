package common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest3 {
	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	void login() throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		setDriver(Configuration.createChromeDriver(options));

		wait = new WebDriverWait(getDriver(), 60);
		getDriver().manage().window().maximize();

		getDriver().get(Configuration.ADMIN_URL);

		WebElement userTextBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_login")));
		userTextBox.sendKeys(Configuration.USER_NAME);
		WebElement passTextBox = driver.findElement(By.id("user_pass"));
		passTextBox.sendKeys(Configuration.PASSWORD);
		passTextBox.submit();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpadminbar")));
	}

	@AfterEach
	void logOut() throws Exception {
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
		driver.get(logOut.getAttribute("href"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'logged out')]")));

		getDriver().quit();

	}

	protected WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	protected WebDriverWait getWaiter() {
		return this.wait;
	}

}
