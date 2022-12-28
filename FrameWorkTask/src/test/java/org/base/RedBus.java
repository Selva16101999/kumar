package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement cl = driver.findElement(By.id("sign-in-icon-down"));
		cl.click();

		Thread.sleep(4000);
		WebElement signin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		signin.click();

		Thread.sleep(4000);

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);

		WebElement number = driver.findElement(By.id("mobileNoInp"));
		number.sendKeys("098908409897");

	}

}
