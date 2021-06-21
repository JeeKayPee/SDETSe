package ch3_3_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex02_PrintElementInfo extends BaseTest1 {

	/*
	 * Identify User name using By name
	 */
	@Test
	void test() {
		WebElement userNameTextField = getDriver().findElement(By.name("log"));
		SeleniumUtils.printElementInfo("User name text field", userNameTextField);
	}
}