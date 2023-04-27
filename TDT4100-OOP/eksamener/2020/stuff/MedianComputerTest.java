package stuff;

import org.junit.Test;
import java.util.List;
import org.junit.Assert;


public class MedianComputerTest {

	// use as third argument to Assert.assertEquals(double, double, double) method for handling round-off errors
	// e.q. Assert.assertEquals(6.0, MedianComputer.compute(...), roundErrorDelta);
	double roundErrorDelta = 0.00000001;

	@Test
	public void testCompute1() {
        Assert.assertEquals(6.0, MedianComputer.compute(List.of(1.0,3.0,3.0,6.0,7.0,8.0,9.0)), roundErrorDelta);
        //med flyttall vil det være lurt å ha en margin for eventuelle små flytfeil.
	}

	@Test
	public void testCompute2() {
		Assert.assertEquals(4.5, MedianComputer.compute(List.of(1.0,2.0,3.0,4.0,5.0,6.0,8.0,9.0)), roundErrorDelta);
	}

	@Test
	public void testCompute3() {
        try {
            MedianComputer.compute(List.of());
            fail("Should not be able to take median of empty list");
        } catch (Exception e) {
            // do nothing
        }
	}
}

