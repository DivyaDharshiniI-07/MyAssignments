package week4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement button=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		boolean editable=button.isEnabled();
		System.out.println(editable);
		Thread.sleep(5000);
		WebElement submitButton=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		System.out.println(submitButton.getLocation());

	}

}
