package com.b2w.application;

import com.b2w.exceptions.OutOfFormatException;

public class Application {
	
	// TDD test
	public static void main(String[] args) {
		Application app = new Application();
		int[][] example = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
		int result = 0;
		try {
			result = app.calculateHellTriangle(example);
			if (result != 26)
				throw new Exception("Miss calculated"); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}

	/**
	 * Method responsible for calculate the best sum from top to botton considering only the 2 closest numbers from each level.
	 * 
	 * @param triangle bidimensional array containing the values to be calculated
	 * @return maximum sum 
	 * @throws OutOfFormatException
	 */
	public int calculateHellTriangle(int[][] triangle) throws OutOfFormatException {
		if (triangle == null || triangle.length == 0)
			return 0;

		int result = 0;
		result = calculateUpToBotton(triangle, 0, 0);
		return result;
	}
	
	
	/**
	 * Recursive method that calculates the sum from each side from top to botton considering only the two closest numbers from the above one
	 * @param triangle
	 * @param level
	 * @param index
	 * @return
	 * @throws OutOfFormatException
	 */
	private int calculateUpToBotton(int[][] triangle, int level, int index) throws OutOfFormatException {
		int leftResult = 0;
		int rightResult = 0;
		
		if(triangle[level] == null)
			return 0;
		
		if (triangle[level].length <= index)
			throw new OutOfFormatException();

		int result = triangle[level][index];

		// Check if exists another level below
		if (level < (triangle.length - 1)) {
			leftResult = calculateUpToBotton(triangle, level + 1, index);
			rightResult = calculateUpToBotton(triangle, level + 1, index + 1);

			// There`s no need to check if they are equals.
			if (leftResult > rightResult)
				result += leftResult;
			else
				result += rightResult;
		}

		return result;
	}
}
