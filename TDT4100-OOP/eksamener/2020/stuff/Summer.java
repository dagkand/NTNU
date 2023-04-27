package stuff;

import java.util.Iterator;
import java.util.List;

public class Summer {

	/**
	 * @param nums
	 * @return the sum of all elements in nums
	 */
	public static int sum(final List<Integer> nums) {
		int sum = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			sum = sum + nums.get(i);
		}
		return sum;
	}

	/**
	 * @param nums
	 * @return the sum of all elements in nums
	 */
	public int sum(final Iterable<Integer> nums) {
		final Iterator<Integer> it = nums.iterator();
		int sum = it.next();
		while (it.hasNext()) {
			sum = sum + it.next();
		}
		return sum;
	}

	/**
	 * @param nums
	 * @return the first element minus the rest of the elements
	 * @throws IllegalArgumentException if nums is empty
	 */
	public static int difference(final List<Integer> nums) throws IllegalArgumentException {
		int diff = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			diff = diff - nums.get(i);
		}
		return diff;
	}
}
