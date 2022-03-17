package com.page;

import static com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndexPage {

		public IndexPage open() {
			getDriver().get("http://automationpractice.com/index.php");	
			
			return this;
		}

		public ListPage searchProduct(String product) {
			WebElement tfSearch = getDriver().findElement(By.id("search_query_top"));
			tfSearch.sendKeys(product);
			
			WebElement btnSearch = getDriver().findElement(By.name("submit_search"));
			btnSearch.click();
			
			return new ListPage();
		}
}
