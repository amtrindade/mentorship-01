package com.page;

import static com.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryPage {

	public int getQtdSubCategories() {
		List<WebElement> sub = getDriver().findElements(By.xpath("//*[@id='subcategories']/ul/li/h5/a"));
		return sub.size();
	}

	public String getDescriptionCategory(int position) {
		List<WebElement> sub = getDriver().findElements(By.xpath("//*[@id='subcategories']/ul/li/h5/a"));	
		return sub.get(position).getText();
	}

}
