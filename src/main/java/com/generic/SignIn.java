package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class SignIn {
	
	public void getSingIn() {

		// WebDriverManager.chromedriver().setup();

		// Headless Browser/ Ghost Browser
		ChromeOptions headlesschrome = new ChromeOptions();
		headlesschrome.addArguments("--headless");

		WebDriver driver = new ChromeDriver(headlesschrome);

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();

		MasterPageFactory mpf = new MasterPageFactory(driver);

		// explicit wait
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait 10 seconds for login button in homepage
		// wait.until(ExpectedConditions.elementToBeClickable(By.id("mpf.getLoginBtnHome()")));
		// Highligt the logInBtn
		Highlighter.addColor(driver, mpf.getLoginBtnHome());
		mpf.getLoginBtnHome().click();

		// Highligt the emailfield
		Highlighter.addColor(driver, mpf.getEmailField());
		mpf.getEmailField().sendKeys(BaseConfig.getConfigValue("email"));

		// Highligt the passwordfield
		Highlighter.addColor(driver, mpf.getPasswordField());
		mpf.getPasswordField().sendKeys(BaseConfig.getConfigValue("password"));
		mpf.getLoginBtn2().click();

		Screenshot.getScreenShot(driver, "LoginPage");

		if (mpf.getLogOutBtn().isDisplayed()) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Failed");
		}

//		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();

//		driver.close();
	}

}
