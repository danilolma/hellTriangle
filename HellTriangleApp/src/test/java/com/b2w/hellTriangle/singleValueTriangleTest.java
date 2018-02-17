package com.b2w.hellTriangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.b2w.application.Application;
import com.b2w.exceptions.OutOfFormatException;

public class singleValueTriangleTest {

	@Test
	public void test() {
		Application app = new Application();
		int[][] example = { { 6 } };
		try {
			int result = app.calculateHellTriangle(example);
			//it should return the same value as the entry
			assertEquals("Unexpected result", 6, result);
		} catch (OutOfFormatException e) {			
			fail();
		}
		
	}

}
