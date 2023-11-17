package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNGAnnotations {
	
	@Test
	public void test() {
		System.out.println("This is test method.");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is beforeTest.");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is beforeMethod.");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is afterMethod.");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is afterTest.");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is afterSuite.");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is beforeSuite.");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is beforeClass.");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is afterClass.");
	}

}
