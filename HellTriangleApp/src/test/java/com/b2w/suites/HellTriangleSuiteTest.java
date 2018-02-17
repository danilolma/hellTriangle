package com.b2w.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.b2w.hellTriangle.EmptyTriangleTest;
import com.b2w.hellTriangle.HellTriangleSucessTest;
import com.b2w.hellTriangle.MalFormedTriangleTest;
import com.b2w.hellTriangle.singleValueTriangleTest;

@RunWith(Suite.class)
@SuiteClasses({ EmptyTriangleTest.class, HellTriangleSucessTest.class, MalFormedTriangleTest.class,
		singleValueTriangleTest.class })
public class HellTriangleSuiteTest {

}
