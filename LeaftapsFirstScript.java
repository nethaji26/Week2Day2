package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsFirstScript {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		/*WebElement findingusername = driver.findElement(By.id("username"));
		findingusername.sendKeys("Demosalesmanager");
		WebElement findingpassword = driver.findElement(By.id("password"));
		findingpassword.sendKeys("crmsfa");
		WebElement submitbutton = driver.findElement(By.className("decorativeSubmit"));
		submitbutton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
		driver.findElement(By.className("smallSubmit")).click();
		String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyname);*/
		
		//using x-path 
		
		WebElement findingusername = driver.findElement(By.xpath("//input[@id='username']"));
		findingusername.sendKeys("Demosalesmanager");
		WebElement findingpassword = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		findingpassword.sendKeys("crmsfa");
		WebElement submitbutton = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		submitbutton.click();
		driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains (text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains (text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Teestleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mr.");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String companyname = driver.findElement(By.xpath("//span[@id ='viewLead_companyName_sp']")).getText();
		System.out.println(companyname);
		
		
		
		
		
		
		
	}

}
