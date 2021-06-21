package ch3_3_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex06_UsingXPath extends BaseTest1 {

	/*
	 * Identify user name text field with Absolute XPath (Tag name) DO NOT USE THIS
	 * in your professional work. Absolute XPath are evil :->
	 */
	@Test
	void test00() {
		WebElement element = getDriver().findElement(By.xpath("/html/body/div[1]/form/p[1]/label/input"));
		SeleniumUtils.printElementInfo("User Name Text field", element);

	}

	/*
	 * Now onwards, we stick to relative XPath as Absolute XPath are brittle
	 * Identify user name text field with XPath (Tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.xpath("//input"));
		SeleniumUtils.printElementInfo("User Name Text field", element);
	}

	/*
	 * Identify user name text field with XPath (Tag name with attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type]"));
		SeleniumUtils.printElementInfo("User Name Text field", element);
	}

	/*
	 * Identify Password text field with XPath (Tag name, attribute and value)
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password']"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}

	/*
	 * Identify User name text field with XPath - Variant of test03 - ID
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@id='user_login']"));
		SeleniumUtils.printElementInfo("User name Text field", element);
	}

	/*
	 * Identify User name text field with XPath - Variant of test03 - class
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input']"));
		SeleniumUtils.printElementInfo("User name Text field", element);
	}

	/*
	 * Identify User name text field with XPath - Variant of test03 - name
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='log']"));
		SeleniumUtils.printElementInfo("User name Text field", element);
	}

	/*
	 * Identify User name text field with XPath - Variant of test03 - any attribute
	 */
	@Test
	void test03_05() {
		WebElement element = getDriver().findElement(By.xpath("//*[@name='log']"));
		SeleniumUtils.printElementInfo("User name Text field", element);
	}

	/*
	 * Identify Lost your password? link with XPath - text()
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.xpath("//*[text()='Lost your password?']"));
		SeleniumUtils.printElementInfo("Lost your password? link", element);
	}

	/*
	 * Identify User name text field with XPath - Relationships - Parent to
	 * immediate Child
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Relationships - Following-Sibling
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.xpath("//br/following-sibling::input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Partial Match - Contains
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[contains(@id,'er_l')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Partial Match - starts-with
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[starts-with(@id,'user_')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Partial Match - ends-with
	 * ends-with is not supported in current browsers since it requires v2 where all
	 * browser use V1.0
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[ends-with(@id,'_login')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Partial Match - text contains
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.xpath("//a[contains(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Partial Match - text starts-with
	 */
	@Test
	void test06_05() {
		WebElement element = getDriver().findElement(By.xpath("//a[starts-with(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field with XPath - Partial Match - Logical OR: using
	 * or keyword
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' or @id ='user_pass']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field with XPath - Partial Match - Logical AND: using
	 * and keyword
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' and @id ='user_pass']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Password text field with XPath - Partial Match - Logical NOT: using
	 * the not() function
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class = 'input' and not(@name = 'log')]"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Form with XPath - Hierarchy (Axis) - Parent immediate
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/../.."));
		SeleniumUtils.printElementInfo("Form", element);
	}

	/*
	 * Identify User Name text field with XPath - Hierarchy (Axis) - Descendant
	 * using // instead of / between form and input
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.xpath("//form//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Hierarchy (Axis) - Ancestors
	 * (using /ancestors)
	 */
	@Test
	void test08_03() {
		WebElement element = getDriver().findElement(By.xpath("//input/ancestor::form"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Hierarchy (Axis) - Preceding
	 * Sibling (starting from submit paragraph)
	 */
	@Test
	void test08_04() {
		WebElement element = getDriver().findElement(By.xpath("//p[@class='submit']/preceding-sibling::p//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Index (Index uses human counting)
	 * This variant looks at children of the same parent This is the reason
	 * //input[2] did not point to password field
	 */
	@Test
	void test09_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Index (Index uses human counting)
	 * This variant looks elements across the DOM Here //input[2] will point to the
	 * password field
	 */
	@Test
	void test09_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Multiple Attributes
	 */
	@Test
	void test10_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type][@name]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Multiple Attributes with values
	 */
	@Test
	void test10_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='text'][@name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
}
