package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

class Ex06_JSExecution extends BaseTest2 {

	@Test
	void test() {

		JavascriptExecutor jsExec = (JavascriptExecutor) getDriver();

		// Finding in JavaScript and click event in JavaScript
		jsExec.executeScript("document.getElementsByClassName('welcome-view-site')[0].click();");
		getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Site Admin")));
		getDriver().navigate().back();

		// Find in WebDriver, click in JavaScript
		WebElement viewSiteLink = getDriver().findElement(By.className("welcome-view-site"));
		jsExec.executeScript("arguments[0].click();", viewSiteLink);
		getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Site Admin")));
		getDriver().navigate().back();

		// Find in JavaScript and click in WD
		WebElement siteLink = (WebElement) jsExec
				.executeScript("return document.getElementsByClassName('welcome-view-site')[0];");
		siteLink.click();
		getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Site Admin")));

	}

}
