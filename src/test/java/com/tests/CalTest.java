package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CalculatorPage;


public class CalTest {
	
	CalculatorPage calPage;
	
	@BeforeTest
	public void setup(){
		calPage = new CalculatorPage();
	}
	
	
	@Test(priority=1)
	public void sumTest(){
		String res = calPage.doSum("20", "20");
		Assert.assertEquals(res, "40");
	}
	
	@Test(priority=2)
	public void subTest(){
		String res = calPage.doSub("100", "50");
		Assert.assertEquals(res, "50");
	}
	
	@Test(priority=3)
	public void divTest(){
		String res = calPage.doDiv("200", "10");
		Assert.assertEquals(res, "20");
	}
	
	

}
