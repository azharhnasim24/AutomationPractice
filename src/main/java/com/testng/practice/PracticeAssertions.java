package com.testng.practice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class PracticeAssertions {
	
	int a = 5;
	int b = 3;
	
	@Test(priority = 0)
	public void getSum() {
		System.out.println(a+b);//8
		Assert.assertEquals(a+b, 10); //(expected, actual) also hard assert
	}
	
	@Test(priority = 1)
	public void getMultuply() {
		System.out.println(a*b);//15
		Assert.assertEquals(15, a*b);
	}

}
