package ch3_3_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex03_UsingOtherSimpleTechniques extends BaseTest1{

	/*
	 * Identify User name using By name
	 */
	@Test
	void test01() {
		WebElement userNameTextField = getDriver().findElement(By.name("log"));
		System.out.println(userNameTextField);

	}
	/*
	 * Identify User name using By ID
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.id("user_login"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name using By Tag Name
	 */
	@Test
	void test03() {
		WebElement element = getDriver().findElement(By.tagName("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name using By Class name
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.className("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Submit button using By Class name (using one class from multiple class)
	 */
	@Test
	void test05() {
		WebElement element = getDriver().findElement(By.className("button-large"));
		SeleniumUtils.printElementInfo("Submit button", element);
	}

}