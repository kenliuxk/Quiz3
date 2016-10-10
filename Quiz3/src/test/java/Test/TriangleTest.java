package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pkgMain.Triangle;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getAreaTest() {
		double side1 = 3;
		double side2 = 4;
		double side3 = 5;
		double area = 6;
		Triangle testTriangle = new Triangle(side1, side2, side3);
		
		assertEquals(area, testTriangle.getArea(),0.1);
	}
	
	public void getPerimeterTest() {
		double side4 = 5;
		double side5 = 6;
		double side6 = 7;
		double perimeter = 18;
		Triangle testTri = new Triangle(side4, side5, side6);
		
		assertEquals(perimeter, testTri.getPerimeter(),0.1);
	}

}
