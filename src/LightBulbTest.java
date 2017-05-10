import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LightBulbTest {

	LightBulb x;

	@Before
	public void setUp() throws Exception {
		x=new LightBulb(200);
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(x.wattage,x.getBulbWattage());
	}

}
