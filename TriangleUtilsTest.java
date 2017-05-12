import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TriangleUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = IllegalArgumentException.class)
	public void testZeroArgument() {
		TriangleUtils.determineType(0, 2, 3);		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeArgument() {
		TriangleUtils.determineType(-1, 2, 3);		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInequalityConstraint() {
		TriangleUtils.determineType(7, 2, 3);		
	}
	
	@Test
	public void testIsosceles() {
		Assert.assertEquals("Triangle is Isosceles [5, 5, 9]", TriangleUtils.TriangleType.ISOSCELES, TriangleUtils.determineType(5, 5, 9));		
	}
	
	@Test
	public void testScalene() {
		Assert.assertEquals("Triangle is Scalene [5, 6, 9]", TriangleUtils.TriangleType.SCALENE, TriangleUtils.determineType(5, 6, 9));		
	}
	
	@Test
	public void testEquilateral() {
		Assert.assertEquals("Triangle is Equilateral [5, 5, 5]", TriangleUtils.TriangleType.EQUILATERAL, TriangleUtils.determineType(5, 5, 5));		
	}

}
