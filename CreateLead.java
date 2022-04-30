package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//password
		driver.findElement(By.className("decorativeSubmit")).click();//click submit
		driver.findElement(By.linkText("CRM/SFA")).click();//click CRMSFA
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Net1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RX");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("tx");
		driver.findElement(By.name("submitButton")).click();
		//method1
		WebElement title = driver.findElement(By.id("sectionHeaderTitle_leads"));
		 System.out.println(title.getText());
		//method2
		String ss = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(ss);

	}

}
