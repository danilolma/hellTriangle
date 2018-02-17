package com.b2w.hellTriangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.b2w.application.Application;

public class HellTriangleSucessTest {

	@Test
	public void test() {
		try {
			Application app = new Application();
			int[][] example = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };

			int result = app.calculateHellTriangle(example);
			
			assertEquals("Unexpected result", 26, result);
			
		} catch (Exception e) {
			assert (false);
		}
	}

}
