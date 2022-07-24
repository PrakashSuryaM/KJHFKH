package org.XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class x_Path {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com"
				+ "%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-"
				+ "account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
	
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Prakash");
		
		WebElement lastNmae = driver.findElement(By.id("lastName"));
		lastNmae.sendKeys("M");
		
		WebElement userNmae = driver.findElement(By.id("username"));
		userNmae.sendKeys("ppsm1005");
		
		WebElement passWOrd = driver.findElement(By.xpath("//input[@name='Passwd']"));
		passWOrd.sendKeys("Prakash@123");
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		confirm.sendKeys("Prakash@123");
		
		WebElement chechBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chechBox.click();
	}
}
