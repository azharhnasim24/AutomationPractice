package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {
	
	@Test
	@Parameters({ "myName", "a" })
	public void practiceParameter(String myName, int a) {
		System.out.println(myName);
		System.out.println(a);
	}

}
