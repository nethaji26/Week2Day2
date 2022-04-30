package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement element = driver.findElement(By.id("currencyUomId"));
		element.click();
		Select dropdown = new Select(element);
		dropdown.selectByValue("INR");
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Test1");
		driver.findElement(By.id("officeSiteName")).sendKeys("Test2");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("551");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		String text = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(text);
		
		

	}

}
