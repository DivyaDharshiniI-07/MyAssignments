package week4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Divya");
	driver.findElement(By.id("lastNameField")).sendKeys("I");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Divya");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("I");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Marketing");
	driver.findElement(By.id("createContactForm_description")).sendKeys("About the courses available in the institute and Placements");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("divya123@gmail.com");
	WebElement source= driver.findElement(By.name("generalStateProvinceGeoId"));
	Select obj=new Select(source);
	obj.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Details are changed");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
}
}
