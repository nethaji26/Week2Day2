package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.id("input-country"));
		element.click();
		Select dropdown = new Select(element);
		//dropdown.selectByIndex(1);
		dropdown.selectByValue("2");
		//dropdown.selectByVisibleText("Algeria");
		driver.close();
		
		
		

	}

}
