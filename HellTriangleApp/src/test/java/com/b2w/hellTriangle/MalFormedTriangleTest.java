package com.b2w.hellTriangle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.b2w.application.Application;
import com.b2w.exceptions.OutOfFormatException;

public class MalFormedTriangleTest {

	@Test(expected = OutOfFormatException.class)
	public void test() throws OutOfFormatException {
		Application app = new Application();
		//Malformed entry
		int[][] example = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8 } };
		
		//it should throw an exception
		app.calculateHellTriangle(example);
		fail("Unexpected behavior");
	}

}
