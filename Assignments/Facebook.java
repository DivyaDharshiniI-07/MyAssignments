package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//form[@id='reg']//input[@name='firstname']")).sendKeys("Divya");
	driver.findElement(By.xpath("//form[@id='reg']//input[@name='lastname']")).sendKeys("Ilamurugu");
	driver.findElement(By.xpath("//form[@id='reg']//input[@name='reg_email__']")).sendKeys("divdhar22@gmail.com");
	driver.findElement(By.xpath("//form[@id='reg']//input[@name='reg_email_confirmation__']")).sendKeys("divdhar22@gmail.com");
	driver.findElement(By.xpath("//form[@id='reg']//input[@name='reg_passwd__']")).sendKeys("notebook@123");
	WebElement source= driver.findElement(By.name("birthday_day"));
	Select obj=new Select(source);
	obj.selectByIndex(21);
	WebElement source1= driver.findElement(By.name("birthday_month"));
	Select obj1=new Select(source1);
	obj1.selectByValue("7");
	WebElement source2= driver.findElement(By.name("birthday_year"));
	Select obj2=new Select(source2);
	obj2.selectByVisibleText("2002");
	driver.findElement(By.xpath("//form[@id='reg']//label[text()='Female']")).click();
	
}
}
