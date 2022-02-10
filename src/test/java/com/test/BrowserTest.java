package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.page.Browser;
import com.page.ChromeBrowser;
import com.page.FirefoxBrowser;


public class BrowserTest extends BaseTest{
	
	@Before
	public void setUp() {
		System.out.println("setUp test");
	}
	
	@After
	public void after() {
		System.out.println("after test");
	}
	
	@Test
	public void testCriaBrowser1() {
		
		Browser chrome = new ChromeBrowser();
		Browser firefox = new FirefoxBrowser();
		
		System.out.println("testCriaBrowser1");	
		
		assertEquals("Google Chrome", chrome.getName());
		assertEquals("FireFox", firefox.getName());
	}
	
	
	@Test
	public void testCriaBrowser2() {
		System.out.println("testCriaBrowser2");
		
	}

	
	
}
