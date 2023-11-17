package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
	
	public void getSignUp() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();

		MasterPageFactory mpf = new MasterPageFactory(driver);
		mpf.getLoginBtnHome().click();
		Thread.sleep(1000);
		mpf.getNamefield().sendKeys("Muhammad Haque");
		Thread.sleep(1000);
		mpf.getEmailfield2().sendKeys("mahnhiyan@gmail.com");
		Thread.sleep(1000);
		mpf.getSignUpBtn().click();
		mpf.getGenderBtn().click();
		mpf.getPasswordField2().sendKeys("mahnHiyan!123");
		mpf.getDayField().sendKeys("25");
		mpf.getMonthField().sendKeys("October");
		mpf.getYearField().sendKeys("1995");
		mpf.getFirstName().sendKeys("Muhammad");
		mpf.getLastName().sendKeys("Haque");
		mpf.getCompany().sendKeys("SmartTech");
		mpf.getAddress1().sendKeys("239 New Hope Rd, APT #6-102");
		mpf.getAddress2().sendKeys("");
		mpf.getCountry().sendKeys("United States");
		mpf.getState().sendKeys("GA");
		mpf.getCity().sendKeys("Lawrenceville");
		mpf.getZipCode().sendKeys("30048");
		mpf.getMobileNumber().sendKeys("4704166999");
		mpf.getCreateBtn().click();

//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Muhammad Haque");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("mahnhiyan@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("mahnHiyan!123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='days']")).sendKeys("25");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='months']")).sendKeys("October");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1995");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Muhammad");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Haque");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='company']")).sendKeys("SmartTech");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("239 New Hope Rd, APT #6-102");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("United States");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("GA");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Lawrenceville");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("30046");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("4704166999");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
//		Thread.sleep(3000);
//		driver.close();

	}

}
