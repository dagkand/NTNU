package stuff;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
 
public class MedianComputer {
 
    public static double compute(final Collection<Double> nums) throws IllegalArgumentException {
        if (nums.size() < 1) {
            throw new IllegalArgumentException("Cannot compute median of no values");
        }
        final List<Double> sorted = new ArrayList<>(nums);
        Collections.sort(sorted);
        final int size = sorted.size();
        if (size % 2 == 0) {
            return (sorted.get(size / 2 - 1) + sorted.get(size / 2)) / 2;
        } else {
            return sorted.get(size / 2);
        }
    }
}