package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains (text(),'Login')]")).click();
		Thread.sleep(2000);
		String textinhomepage = driver.findElement(By.xpath("//div[@class='main-container']/h1")).getText();
		System.out.println(textinhomepage);
		//driver.findElement(By.xpath("//button[@class='navbar-toggle']")).click();
		driver.findElement(By.linkText("Log Out")).click();
		//driver.close();
		System.out.println("All actions completed");
		//h1[text()='Welcome, ']
		driver.close();
		
		
	}

}
