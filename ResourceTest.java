import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This class contains all the unit tests for Resource class.
 */
public class ResourceTest {
	Resource resource1;

	@Before
	public void setup() {
		resource1 = new Resource(3.14, ResourceType.STONE);
	}
	
	/**
	 * Tests the constructor in Resource class. 
	 * Does so by using it's toString method, though getters can have been used as well.
	 */
	@Test
	public void testResourceConstructor() {
		assertEquals("Resource: weight = 3.14, type = STONE", resource1.toString());
	}
	
	/**
	 * Tests addWeight method in Resource class.
	 */
	@Test
	public void testAddWeight() {
		resource1.addWeight(2.00);
		assertEquals("Resource: weight = 5.14, type = STONE", resource1.toString());
	}
	
	/**
	 * Tests subtractWeight method in Resource class.
	 */
	@Test
	public void testSubtractWeight() {
		resource1.subtractWeight(2.00);
		assertEquals("Resource: weight = 1.14, type = STONE", resource1.toString());
	}
	
	/**
	 * Tests if exception is raised in Resource class when weight to be subtracted
	 * surpasses current weight of resource.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractWeightException() {
		resource1.subtractWeight(5.00);
	}
	
	/**
	 * Tests getWeight method.
	 */
	@Test
	public void testGetWeight() {
		assertEquals(3.14, resource1.getWeight(), 0.01);
	}
	
	/**
	 * Tests getType method.
	 */
	@Test
	public void testGetType() {
		assertEquals(ResourceType.STONE, resource1.getType());
	}

}
