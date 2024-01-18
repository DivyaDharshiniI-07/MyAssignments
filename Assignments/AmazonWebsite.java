package week5.webtabeltrail;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonWebsite {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized", "--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9", Keys.ENTER);
		String orgPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String orgPrice1 = orgPrice.replaceAll("[^0-9]", "");
		System.out.println("Original Price:" + orgPrice1);
		WebElement ratings = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]"));
		Actions hover = new Actions(driver);
		hover.moveToElement(ratings).perform();

		Thread.sleep(5000);
		ratings.click();
		String text = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color')]")).click();

		// to switch to next window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("No of Windows:" + childWindow.size());
		List<String> openedWindow = new ArrayList<String>(childWindow);
		driver.switchTo().window(openedWindow.get(1));
		// scroll to get snapshot
		WebElement product = driver.findElement(By.xpath("//span[text()='Brand']"));
		Actions scroll = new Actions(driver);
		scroll.scrollToElement(product).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/001.jpeg");
		FileUtils.copyFile(source, destination);
		driver.findElement(By.id("submit.add-to-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Cart')])[2]")).click();
		String text2 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[2]")).getText();
		String subtotal = text2.replaceAll("[^0-9]", "");
		String subtotal1=subtotal.replaceAll("00","");
		System.out.println("Subtotal:" + subtotal1.trim());
		if (orgPrice1.equals(subtotal1)) {
			System.out.println("Prices are verified");
		} else {
			System.out.println("Prices Mismatched");
		}

	}

}
