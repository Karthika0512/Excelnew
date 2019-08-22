package org.test.MavenProject;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L extends B {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		d.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys(getDate(2,0));
		d.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		d.findElement(By.xpath("//p[text()='Apple iPhone 6s ( 32GB , 2 GB ) Space Grey']")).click();
	    d.findElement(By.xpath("//span[text()='add to cart']")).click();
		
	}

}
