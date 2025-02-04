package meavenpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    // find search box
		WebElement searchBox = driver.findElement(By.name("search"));
		// search for Artificial Intelligence
		searchBox.sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// 	find and click on history section
		WebElement history_section = driver.findElement(By.xpath("//span[text()='View history']"));
		history_section.click();
		// print the title
		String title = driver.getTitle();
        System.out.println("Title: " + title);
	

	}

}
