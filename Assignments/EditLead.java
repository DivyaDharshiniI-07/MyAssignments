package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Peter");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Peter'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("View Lead")) {
			System.out.println("verified and on the correct page");
		} else {
			System.out.println("Not verified");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Peter");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text=driver.findElement(By.xpath("//a[text()='TestLeaf']")).getText();
		System.out.println(text);
		if(text.contains("TestLeaf")) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Not updated");
		}

		
	}
}
