package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.page.LoginPage;
import com.page.MainPage;

public class AccessMenuTest {
	LoginPage login;
	MainPage main; 
	
	@Test
	public void shouldOpenMenuAvisos() {
		
		login = new LoginPage();
		login.open("link da página");
		main = login.logar("usuario", "senha");
		
		assertTrue(main.isLoad());
	}
}
