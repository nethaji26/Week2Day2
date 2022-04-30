package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Test1@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Selenium");
		
		System.out.println(" The current url is " + driver.getCurrentUrl());
		System.out.println("The page title is " + driver.getTitle());
		//System.out.println(" The page source is " + driver.getPageSource());
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(" The attribute name is " +attribute);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		System.out.println("Clear the 'text field' is cleared");
		WebElement element = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = element.isEnabled();		
		System.out.println("The field disabled is " + enabled);
		System.out.println("good");
	
		
		

	}

}
