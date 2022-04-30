package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'accountlimit100')])[1]"));
		element.click();
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Account name is " + text);
		if(text.contains("Credit Limited Account (accountlimit100)"))
		{
			System.out.println("pass");
		}else
		{	System.out.println("mismatch");
		}
		String text1 = driver.findElement(By.xpath("(//td[@class='tabletext'])[1]")).getText();
		System.out.println(text1);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("opentaps"))
		{
			System.out.println("pass");}
			else
			{
				System.out.println("mismatch");
			}
		
		}
		

	}


