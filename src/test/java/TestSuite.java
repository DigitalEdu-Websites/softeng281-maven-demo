
import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
		TestSuite.TaskTest.class
})

public class TestSuite {

	@FixMethodOrder(MethodSorters.JVM)
	public static class TaskTest {

		@Test
		public void testSum() {
			assertEquals(10, Basics.getSum(1, 9));
		}
  }

}
