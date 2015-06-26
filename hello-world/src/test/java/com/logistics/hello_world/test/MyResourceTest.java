package com.logistics.hello_world.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.logistics.hello_world.MyResource;


public class MyResourceTest {

	@Test
	public void test() {
	
		MyResource res = new MyResource();
		assertEquals("Got it ok!", res.getIt());
		
	}
	
	/*@Test
	public void GetTest() {	
		MyResource res = new MyResource();
		assertEquals("Hello Srinivas!", res.get("Srinivas"));
	}*/
}
