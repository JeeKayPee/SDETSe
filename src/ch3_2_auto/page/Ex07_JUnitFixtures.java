package ch3_2_auto.page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex07_JUnitFixtures {
	WebDriver driver = null;

	@BeforeEach
	void launchBrowser() throws Exception {
		driver = Configuration.createChromeDriver();
	}

	@AfterEach
	void closeBrowser() throws Exception {
		driver.quit();
	}

	@Test
	void testSiteTitle() {
		driver.get(Configuration.BLOG_URL);

		String expectedTitle = "dummy";
		String actualTitle = driver.getTitle();

		assertEquals(expectedTitle, actualTitle, "Verity Site title");

	}

}
