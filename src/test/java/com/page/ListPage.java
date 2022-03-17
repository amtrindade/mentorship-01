package com.page;

import static com.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ListPage {

	public int getQtdProduct() {
		List<WebElement> list =  getDriver().findElements(By.xpath("//*[@id='center_column']/ul/li"));
		
		return list.size();
	}

	public boolean isProductVisible(String productName) {
		Boolean find = false;
		
		List<WebElement> list = getDriver().findElements(By.xpath("//*[@id='center_column']/ul/li//h5/a"));
		
		for (WebElement e : list) {
			System.out.println(e.getText());
			if (e.getText().equals(productName)) {
				find = true;
				break;
			}
		}
		
		return find;
	}

	public ListPage addCart(String name) throws InterruptedException {
		List<WebElement> list = getDriver().findElements(By.xpath("//*[@id='center_column']/ul/li//h5/a"));
		
		for (WebElement e : list) {
			System.out.println(e.getText());
			if (e.getText().equals(name)) {
		
				Actions action = new Actions(getDriver());
				action.moveToElement(e).build().perform();
				WebElement btnAddCart =  e.findElement(By.xpath("../..//*[@title='Add to cart']"));
				btnAddCart.click();
				
				break;
			}		 
		}

		return this;
		
	}
	
	public String getTextTitleCart() throws InterruptedException {

		WebElement title = getDriver().findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"));
		Thread.sleep(3000);
		return title.getText();
	}

}
