package crossBrowserParallel;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {

	@Test
	public void google() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
}
