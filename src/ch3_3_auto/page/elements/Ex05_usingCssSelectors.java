package ch3_3_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex05_usingCssSelectors extends BaseTest1 {

	/*
	 * Identify User name text field with CSS Selector (Tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.cssSelector("input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with CSS Selector (Tag name and a given
	 * attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field with CSS Selector (Tag name, attribute and
	 * value)
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - ID Variant of test03
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id='user_login']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Class Variant of test03
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[class='input']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Name Variant of test03
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Special Symbols (# means
	 * ID)
	 */
	@Test
	void test04_01() {
		WebElement element = getDriver().findElement(By.cssSelector("#user_login"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Special Symbols (. means
	 * Class)
	 */
	@Test
	void test04_02() {
		WebElement element = getDriver().findElement(By.cssSelector(".input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Special Symbols (* means
	 * any tag)
	 */
	@Test
	void test04_03() {
		WebElement element = getDriver().findElement(By.cssSelector("*[name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Relationships (Parent -
	 * Child) Denoted by >
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.cssSelector("label>input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Relationships (Siblings)
	 * Denoted by +
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.cssSelector("br+input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Partial Match Contains *=
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id*='er_l']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Partial Match starts with
	 * ^=
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id^='user_']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Partial Match ends with $=
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id$='_login']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Submit button with CSS Selector - Partial Match Contains Word ~=
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[value~='Log']"));
		SeleniumUtils.printElementInfo("Submit button", element);
	}

	/*
	 * Identify Submit button with CSS Selector - Logical OR (comma ,)
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input, *[name='log']"));
		SeleniumUtils.printElementInfo("Submit button", element);
	}

	/*
	 * Identify User Name text field with CSS Selector - Logical AND We can give a
	 * class with a . operator which acts as an AND condition on the previous part
	 * of the CSS Selector
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input.input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field with CSS Selector - Logical AND We can give an
	 * ID with # operator which acts as an AND condition on the previous part of the
	 * CSS Selector
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input#user_pass"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Password text field with CSS Selector - using the not() function
	 */
	@Test
	void test07_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input:not([name='log'])"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify text field with CSS Selector - Multiple Attributes
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type][name]"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify User name text field with CSS Selector - Multiple Attributes with
	 * values
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='text'][name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
}
