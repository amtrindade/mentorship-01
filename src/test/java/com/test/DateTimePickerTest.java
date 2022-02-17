package com.test;

import static com.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.core.BaseTest;
import com.page.DateTimePickerPage;

public class DateTimePickerTest extends BaseTest{
	
	DateTimePickerPage dtPage = new DateTimePickerPage();
	
	@Test
	public void testSendDatePicker() throws InterruptedException {
		String day = "15";
		String month = "May";
		String year = "1992";
		
		dtPage.open();
		
		WebElement calendar = getDriver().findElement(By.cssSelector("#date-picker-example > i"));
		calendar.click();
		
		WebElement selectYear = getDriver().findElement(By.cssSelector("#date-picker-example_root > div > div > div > div > div.picker__header.datepicker__box > div.picker__select-year > i"));	
		Thread.sleep(5000);
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
		
		
		
		
		
		
		
		
	}

}
