package com.page;

import static com.core.DriverFactory.getDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

	public Boolean isLoad() {

		WebElement linkAvisos = getDriver().findElement(By.xpath("//a[contains(text(),'Avisos')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		String name = js.executeScript("return arguments[0].text;", linkAvisos).toString();		
		return (name.length() > 0);
		
	}

}
