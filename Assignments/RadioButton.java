package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement button= driver.findElement(By.xpath("(//label[text()='Firefox'])[1]"));
        System.out.println(button.isSelected());
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();  
        WebElement button2= driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[4]"));
        System.out.println(button2.isEnabled());
	}

}
