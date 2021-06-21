package ch4_auto.beyond;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest2;
import common.Configuration;

class Ex10_TakingScreenshots extends BaseTest2 {

	@Test
	void takeScreenshot() {

		TakesScreenshot camera = (TakesScreenshot) getDriver();
		File sfile = camera.getScreenshotAs(OutputType.FILE);

		String path = String.format("%s%s-%s.png", Configuration.SCREENSHOTS_DIR, "dashboard",
				System.currentTimeMillis());
		sfile.renameTo(new File(path));

	}

}
