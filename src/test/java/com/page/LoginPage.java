package com.page;

import static com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public LoginPage open(String url) {
		getDriver().get(url);
		return this;		
	}

	public MainPage logar(String user, String pass) {
		
		WebElement tfUser = getDriver().findElement(By.id("Usuario"));
		tfUser.sendKeys(user);
		
		WebElement tfPass = getDriver().findElement(By.id("Senha"));
		tfPass.sendKeys(pass);
		
		WebElement btnEnter = getDriver().findElement(By.id("btn-ok"));
		btnEnter.click();
		
		return new MainPage();
	}

}
