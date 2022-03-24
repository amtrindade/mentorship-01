package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.core.BaseTest;
import com.page.IndexPage;
import com.page.ListPage;

public class SearchTest extends BaseTest{
	
	private IndexPage index;
	private ListPage list;
	
	@Before
	public void setUp() {
		index = new IndexPage();
		index.open();
	}
	
	@Test
	public void testSearchProduct() {
		list = index.searchProduct("short");
		
		assertEquals(4, list.getQtdProduct());
		assertTrue(list.isProductVisible("Printed Dress"));
	}
	
	@Test
	public void testAddCart() throws InterruptedException {
		String name = "Printed Dress";
		list = index.searchProduct(name);
		list.addCart(name);

		assertEquals("Product successfully added to your shopping cart", list.getTextTitleCart());
	}
}
