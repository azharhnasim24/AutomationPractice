package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);//handle the null pointer exception
	}
	
	@FindBy(xpath="//a[contains(text(), 'Login')]")
	private WebElement loginBtnHome;
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailField;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[contains(text(), 'Login')]")
	private WebElement loginBtn2;
	
	@FindBy(xpath="//*[contains(text(), 'Logout')]")
	private WebElement logOutBtn;
	
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	
	//Costco
	@FindBy(xpath="(//a[contains(text(), 'Services')])[1]")
	private WebElement services;
	
	//Drag & Drop
	@FindBy(xpath="//div[contains(text(), 'Oslo') and @id='box1']")
	private WebElement dragOslo;
	
	//Alert Practice
	@FindBy(xpath="//p[contains(text(), 'You pressed Ok')]")
	private WebElement oktext;
	
	@FindBy(xpath="//a[contains(text(), 'Alert with OK & Cancel')]")
	private WebElement alertBtn1;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement alertBtn2;
	
	//Zoopla
	
	@FindBy(xpath="//span[contains(text(), 'Accept all cookies')]")
	private List<WebElement> acceptCookiesBtn;
	
	@FindBy(xpath="(//span[contains(text(), 'Sign in')])[2]")
	private WebElement zooplaLoginBtn;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement zooplaEmailField;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement zooplaPasswordField;
	
	@FindBy(xpath="//button[@class='_1erwn750 _1erwn751 _1erwn752 _1erwn75a _1dgm2fc8']")
	private WebElement zooplaLoginBtn2;
	
	public WebElement getZooplaEmailField() {
		return zooplaEmailField;
	}

	public WebElement getZooplaPasswordField() {
		return zooplaPasswordField;
	}

	public WebElement getZooplaLoginBtn2() {
		return zooplaLoginBtn2;
	}

	public WebElement getZooplaLoginBtn() {
		return zooplaLoginBtn;
	}

	public List<WebElement> getAcceptCookiesBtn() {
		return acceptCookiesBtn;
	}

	public WebElement getAlertBtn1() {
		return alertBtn1;
	}

	public WebElement getAlertBtn2() {
		return alertBtn2;
	}

	public WebElement getOktext() {
		return oktext;
	}

	@FindBy(xpath="//div[contains(text(), 'Norway')]")
	private WebElement dropNorway;

	public WebElement getDragOslo() {
		return dragOslo;
	}

	public WebElement getDropNorway() {
		return dropNorway;
	}

	public WebElement getServices() {
		return services;
	}

	@FindBy(xpath="//*[@name='name']")
	private WebElement namefield;
	
	@FindBy(xpath="(//*[@name='email'])[2]")
	private WebElement emailfield2;
	
	@FindBy(xpath="(//*[@class='btn btn-default'])[2]")
	private WebElement signUpBtn;
	
	@FindBy(xpath="//*[@id='id_gender1']")
	private WebElement genderBtn;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement passwordField2;
	
	@FindBy(xpath="//*[@id='days']")
	private WebElement dayField;
	
	@FindBy(xpath="//*[@id='months']")
	private WebElement monthField;
	
	@FindBy(xpath="//*[@id='years']")
	private WebElement yearField;
	
	@FindBy(xpath="//*[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//*[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//*[@id='company']")
	private WebElement company;
	
	@FindBy(xpath="//*[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//*[@id='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//*[@id='country']")
	private WebElement country;
	
	@FindBy(xpath="//*[@id='state']")
	private WebElement state;
	
	@FindBy(xpath="//*[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//*[@id='zipcode']")
	private WebElement zipCode;
	
	@FindBy(xpath="//*[@id='mobile_number']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="(//*[@class='btn btn-default'])[1]")
	private WebElement createBtn;
	
	//drag&drop
	
	@FindBy(xpath="//div[contains(text(), 'Washington') and @id='box3']")
	private WebElement washington;
	
	@FindBy(xpath="//div[contains(text(), 'United States')]")
	private WebElement unitedstates;

	public WebElement getWashington() {
		return washington;
	}

	public WebElement getUnitedstates() {
		return unitedstates;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getGenderBtn() {
		return genderBtn;
	}

	public WebElement getPasswordField2() {
		return passwordField2;
	}

	public WebElement getDayField() {
		return dayField;
	}

	public WebElement getMonthField() {
		return monthField;
	}

	public WebElement getYearField() {
		return yearField;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getEmailfield2() {
		return emailfield2;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	public WebElement getLoginBtnHome() {
		return loginBtnHome;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginBtn2() {
		return loginBtn2;
	}

}
