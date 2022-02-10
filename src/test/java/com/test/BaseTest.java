package com.test;

import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
	
	@Before
	public void before() {
		System.out.println("setUp base");
	}
	
	@After
	public void tearDown() {
		System.out.println("after base");
	}

}
