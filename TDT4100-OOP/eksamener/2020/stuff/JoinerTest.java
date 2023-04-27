package stuff;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class JoinerTest {

	@Test
	public void testStatic() {
		assertEquals("en, to og tre", Joiner.join(List.of("en", "to", "tre").iterator(), ", ", " og "));
	}

	@Test
	public void testManyIterator() {
		assertEquals("en, to og tre", new Joiner(", ", " og ").join(List.of("en", "to", "tre").iterator()));
	}

	@Test
	public void testManyList() {
		assertEquals("en, to og tre", new Joiner(", ", " og ").join(List.of("en", "to", "tre")));
	}

	@Test
	public void testManyVarargs() {
		assertEquals("en, to og tre", new Joiner(", ", " og ").join("en", "to", "tre"));
	}

	@Test
	public void testManyListWithoutLast() {
		assertEquals("en, to, tre", new Joiner(", ").join(List.of("en", "to", "tre")));
	}

	@Test
	public void testTwoList() {
		assertEquals("en og to", new Joiner(", ", " og ").join(List.of("en og to")));
	}

	@Test
	public void testOneList() {
		assertEquals("en", new Joiner(", ").join(List.of("en")));
	}

	@Test
	public void testNoneList() {
		assertEquals("", new Joiner(", ", " og ").join(List.<String>of()));
	}
}

