package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
public static void main(String[] args) throws InterruptedException {
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
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kkkk@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[text()='kkkk'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	if (title.contains("Duplicate Lead")) {
		System.out.println("verified and on the correct page");
	} else {
		System.out.println("Not verified");
	}
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kkkk@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text=driver.findElement(By.xpath("//a[text()='kkkk@gmail.com']")).getText();
	System.out.println(text);
	if(text.contains("kkkk@")) {
		System.out.println("duplication is sucessful");
	}
	else {
		System.out.println("Not Done");
	}
	
	
	
	
	
}
}
