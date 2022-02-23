package com.page;

import static com.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.core.GlobalProperty;

public class DatePickerPage  {

	public DatePickerPage open() {
		getDriver().get(GlobalProperty.getProperty("url.datepicker"));
		return this;
	}
	
	public DatePickerPage sendDate(String day, String month, String year) throws InterruptedException {
		WebElement calendar = getDriver().findElement(By.cssSelector("#date-picker-example > i"));
		calendar.click();
		
		WebElement selectYear = getDriver().findElement(By.cssSelector("#date-picker-example_root > div > div > div > div > div.picker__header.datepicker__box > div.picker__select-year > i"));	
		Thread.sleep(1000);
		selectYear.click();
		
		List<WebElement> yearsPicker;
		for (int i = 0; i < 10; i++) {
			yearsPicker = getDriver().findElements(By.xpath("//*[text()='"+year+"']"));
			
			if (yearsPicker.size() == 0) {
				WebElement prior = getDriver().findElement(By.cssSelector("#date-picker-example_root button.picker__nav--prev.btn.btn-flat"));
				prior.click();
			}
			else {
				yearsPicker.get(0).click();
				break;
			}
		}
		
		WebElement monthDtPicker = getDriver().findElement(By.xpath("//*[text()='"+month+"']"));
		monthDtPicker.click();
					
		List<WebElement> dayPicker = getDriver().findElements(By.xpath("//*[@id='example_table']//div[text()='"+day+"']"));
		dayPicker.get(0).click();		
		
		return this;
	}
	
	public DatePickerPage setDay() throws InterruptedException {
		WebElement calendar = getDriver().findElement(By.cssSelector("#date-picker-example > i"));
		calendar.click();
		
		List<WebElement> dayPickers = getDriver().findElements(By.xpath("//*[@id='example_table']//div[text()='22']"));
		dayPickers.get(0).click();
		return this;
	}
	
	public String getValueDatePicker() {
		List<WebElement> dateValues = getDriver().findElements(By.id("example"));
		return dateValues.get(0).getAttribute("value");
	}
	
}
