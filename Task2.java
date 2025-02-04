package meavenpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver newdriver = new ChromeDriver();
        newdriver.get("https://www.demoblaze.com/");
        newdriver.manage().window().maximize();
        newdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String title = newdriver.getTitle();
        System.out.println("Title: " + title);
        if(title.equals("STORE")) {
        	System.out.println("Page Landed on correct website");
        }else {
        	System.out.println("Page not landed on correct website");
        }
        newdriver.quit();
	}

}
