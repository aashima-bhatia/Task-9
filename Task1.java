package meavenpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver2.get("http://google.com");
		String url = driver2.getCurrentUrl();
		System.out.println("Current Page URL : "+ url);
		driver2.navigate().refresh();
        driver2.quit();
	}

}
