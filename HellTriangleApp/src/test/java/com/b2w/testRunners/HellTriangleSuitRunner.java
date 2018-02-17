package com.b2w.testRunners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.b2w.suites.HellTriangleSuiteTest;

public class HellTriangleSuitRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(HellTriangleSuiteTest.class);
		for(Failure failure : result.getFailures())
			System.out.println(failure.toString());
		
		System.out.println(result.wasSuccessful());
	}
}
