package week4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement option = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select obj = new Select(option);
		obj.selectByIndex(1);
		boolean checked = option.isEnabled();
		System.out.println(checked);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		boolean checked1 = option.isEnabled();
		System.out.println(checked1);
		/*driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		boolean checked2 = option.isEnabled();
		System.out.println(checked2);*/
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		boolean checked3 = option.isEnabled();
		System.out.println(checked3);
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		boolean checked4 = option.isEnabled();
		System.out.println(checked4);
	}

}
