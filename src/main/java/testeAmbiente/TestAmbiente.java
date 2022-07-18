package testeAmbiente;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmbiente {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\017145631\\Downloads\\program install\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://todomvc.com/examples/vue/");

	}
}
