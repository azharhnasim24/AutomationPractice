package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {
	
	public void getPracticeAlert() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

		MasterPageFactory mpf = new MasterPageFactory(driver);

		mpf.getAlertBtn1().click();
		mpf.getAlertBtn2().click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		if (mpf.getOktext().isDisplayed()) {
			System.out.println("You Pressed Ok");
		} else {
			System.out.println("You Pressed Cancel");
		}

	}

	public static void main(String[] args) {
		PracticeAlert obj = new PracticeAlert();
		obj.getPracticeAlert();
	}

}
