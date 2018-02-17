package com.b2w.hellTriangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.b2w.application.Application;
import com.b2w.exceptions.OutOfFormatException;

public class EmptyTriangleTest {

	@Test
	public void emptyEntryTest() {
		Application app = new Application();
		int[][] example = new int[1][];
		try {
			int result = app.calculateHellTriangle(example);
			// it should return zero
			assertEquals("Unexpected result", 0, result);
		} catch (OutOfFormatException e) {
			fail();
		}

	}

	@Test
	public void nullEntryTest() {
		Application app = new Application();
		int[][] example = null;
		try {
			int result = app.calculateHellTriangle(example);
			// it should return zero
			assertEquals("Unexpected result", 0, result);
		} catch (OutOfFormatException e) {
			fail();
		}

	}

}
