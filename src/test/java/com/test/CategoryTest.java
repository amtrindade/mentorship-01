package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.core.BaseTest;
import com.page.CategoryPage;
import com.page.IndexPage;

public class CategoryTest extends BaseTest{
	
	private IndexPage index;
	private CategoryPage category;
	
	@Before
	public void setUp() {
		index = new IndexPage();
		index.open();
	}
	
	@Test
	public void navigationCategories() {
		category = index.navigationCategory("WOMEN");
		
		assertEquals(2, category.getQtdSubCategories());
		assertEquals("TOPS", category.getDescriptionCategory(0));
		assertEquals("DRESSES", category.getDescriptionCategory(1));
		
		index.open();
		
		category = index.navigationCategory("DRESSES");
		
		assertEquals(3, category.getQtdSubCategories());
		assertEquals("CASUAL DRESSES", category.getDescriptionCategory(0));
		assertEquals("EVENING DRESSES", category.getDescriptionCategory(1));
		assertEquals("SUMMER DRESSES", category.getDescriptionCategory(2));
		
		index.open();
		
		category = index.navigationCategory("T-SHIRTS");
		assertEquals(0, category.getQtdSubCategories());
		
		
	}

}
