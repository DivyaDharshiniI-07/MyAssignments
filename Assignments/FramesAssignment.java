package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FramesAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		WebElement topic = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(5000);
		topic.sendKeys("Frame");
		// driver.switchTo().defaultContent(); - it is not required because the frame is
		// nested so we don;t need to go back to default
		driver.switchTo().frame("frame3");
		WebElement checkBox = driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input"));
		checkBox.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		Select values = new Select(dropdown);
		values.selectByValue("avatar");

	}

}
