package ch3_3_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex04_IdentifyingLinks extends BaseTest1 {

	/*
	 * Identifying Lost your password? link using Linktext
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.linkText("Lost your password?"));
		SeleniumUtils.printElementInfo("Lost your password?", element);
	}

	/*
	 * Identifying Lost your password? link using Partial Link text Contains <- and
	 * name of the blog may change
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.partialLinkText("Back to"));
		SeleniumUtils.printElementInfo("Back to blog link", element);
	}

}
