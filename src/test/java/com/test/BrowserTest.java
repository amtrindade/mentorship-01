package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.page.Browser;


public class BrowserTest {

	@Test
	public void testCriaBrowser() {
		
		Browser chrome = new Browser();
		Browser firefox = new Browser();
		
		chrome.setName("Google Chrome");
		firefox.setName("FireFox");
		
		System.out.println(chrome.getName());
		System.out.println(firefox.getName());
		
		assertEquals("Google Chrome", chrome.getName());
		assertEquals("FireFox", firefox.getName());
	}
}
