package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000); // Wait for page to load
        WebElement historyLink = driver.findElement(By.id("History"));
        historyLink.click();
        WebElement sectionHeader = driver.findElement(By.id("History"));
        System.out.println("Section title: " + sectionHeader.getText());
        driver.quit();
    }
}
