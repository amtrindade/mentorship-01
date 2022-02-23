package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.core.BaseTest;
import com.page.DatePickerPage;

public class DatePickerTest extends BaseTest{
	
	DatePickerPage dtPage = new DatePickerPage();
	
	@Test
	public void testSendDatePicker() throws InterruptedException {
		String day = "15";
		String month = "May";
		String year = "1998";
		
		dtPage.open();
		dtPage.sendDate(day, month, year);
		assertEquals("15 May, 1998", dtPage.getValueDatePicker());
	}
	
	@Test
	public void testSelectDayCurrent() throws InterruptedException {
		dtPage.open();
		dtPage.setDay();
		
	}

}
