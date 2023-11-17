package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZooplaPractice {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public void getLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zoopla.co.uk/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//click on accept cookies btn
		if(mpf.getAcceptCookiesBtn().size()>0) {
			
			//explicit wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcceptCookiesBtn().get(0)));
			
			mpf.getAcceptCookiesBtn().get(0).click();
		}
		//click on sign in btn
		mpf.getZooplaLoginBtn().click();
		mpf.getZooplaEmailField().sendKeys("rezwanislam@rocketmail.com");
		mpf.getZooplaPasswordField().sendKeys("Boston2023!");
		mpf.getZooplaLoginBtn2().click();
	}
	
	public static void main(String[] args) {
		
		ZooplaPractice obj = new ZooplaPractice();
		obj.getLogin();
		
	}

}
