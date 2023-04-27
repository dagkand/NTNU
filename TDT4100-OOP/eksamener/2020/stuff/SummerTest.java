package stuff;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SummerTest {

	@Test
	public void testSum1() {
		Assert.assertEquals(6, Summer.sum(List.of(1, 2, 3)));
	}

	@Test
	public void testSumMistake() {
		Assert.assertEquals(0, Summer.sum(List.of()));
        //sum function does not check if the list is empty before starting
	}

	@Test
	public void testDifference1() {
		Assert.assertEquals(0, Summer.difference(List.of(6, 1, 2, 3)));
	}

	@Test
	public void testDifferenceMistake() {
		try {
            Summer.difference(List.of());
            //skal utløse unntak hvis listen er tom
            fail("Should throw IllegalArgumentException")
        } catch (IllegalArgumentException e) {
            // Do nothing
        }
	}
}

