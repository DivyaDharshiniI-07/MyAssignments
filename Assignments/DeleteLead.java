package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys("7754123698");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		/*
		 * driver.findElement(By.xpath("//a[text()='Neon']")).click();
		 * driver.findElement(By.linkText("Delete")).click();
		 */
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10098");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		if(text.contains("No records")) {
			System.out.println("Lead deleted");
		}
		else {
			System.out.println("Lead still exists");
		}

	}
}
