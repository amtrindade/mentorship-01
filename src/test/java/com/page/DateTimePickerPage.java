package com.page;

import static com.core.DriverFactory.getDriver;

import com.core.GlobalProperty;

public class DateTimePickerPage  {

	public void open() {
		getDriver().get(GlobalProperty.getProperty("url.datepicker"));
	}
	
}
