package crossBrowserParallel;

import org.testng.annotations.Test;

public class Test2 extends BaseClass {

	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
}
