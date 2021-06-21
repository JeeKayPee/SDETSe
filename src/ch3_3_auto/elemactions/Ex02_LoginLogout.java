package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

class Ex02_LoginLogout extends BaseTest1 {

	@Test
	void test() throws Exception {

		WebElement userTextBox = getDriver().findElement(By.id("user_login"));
		userTextBox.sendKeys(Configuration.USER_NAME);
		WebElement passTextBox = getDriver().findElement(By.id("user_pass"));
		passTextBox.sendKeys(Configuration.PASSWORD);
		passTextBox.submit();
		Thread.sleep(3000);

		boolean dBoardLoaded = getDriver().findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dBoardLoaded, "Assert that dashboard is loaded");

		WebElement logOut = getDriver().findElement(By.xpath("//a[text()='Log Out']"));
		getDriver().get(logOut.getAttribute("href"));
		Thread.sleep(2000);

		WebElement logOutMsg = getDriver().findElement(By.xpath("//*[contains(text(), 'logged out')]"));
		assertTrue(logOutMsg.isDisplayed(), "Assert successfull logout");

	}

}
