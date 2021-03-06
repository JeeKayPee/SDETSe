package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

class Ex01_EnterAndVerifyText extends BaseTest1 {

	@Test
	void test() {
		String expectedUsername = Configuration.USER_NAME;
		WebElement userTextBox = getDriver().findElement(By.name("log"));
		assertTrue(userTextBox.isEnabled(), "Assert that user name text field is enabled ");
		userTextBox.sendKeys(expectedUsername);

		String actualUserName = userTextBox.getAttribute("value");
		assertEquals(expectedUsername, actualUserName, "Assert that user name is entered correctly");

	}

}
