package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleCliass {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
 		
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://kite.zerodha.com/");
	}

}
