package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//password
		driver.findElement(By.className("decorativeSubmit")).click();//click submit
		driver.findElement(By.linkText("CRM/SFA")).click();//click CRMSFA
		driver.findElement(By.linkText("Accounts")).click(); //clicks account
		driver.findElement(By.linkText("Create Account")).click(); //click create account
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");//entering account name
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");//entering description
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test");//entering local name
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Test2");//entering site name
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("Test11");//entering annual revenue field
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();//click create account
		driver.close();
			
			

	}

}
