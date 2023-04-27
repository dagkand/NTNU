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
		// TODO: reveal mistake in sum method
	}

	@Test
	public void testDifference1() {
		Assert.assertEquals(0, Summer.difference(List.of(6, 1, 2, 3)));
	}

	@Test
	public void testDifferenceMistake() {
		// TODO: reveal mistake in difference method
	}
}

