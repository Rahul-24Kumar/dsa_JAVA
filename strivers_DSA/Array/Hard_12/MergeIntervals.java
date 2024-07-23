import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override

    public String toString() {
        return "[" + start +", " + end + "]";
    }
}

public class MergeIntervals {
    public static List <Interval> MergeIntervals(List<Interval> intervals) {
        // Return empty list if input is empty

        if(intervals.isEmpty()) {
            return new ArrayList<>();
        }

        // Sort intervals based on start time
        intervals.sort((a, b) -> a.start - b.start);

        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);

            if(current.end >= next.start) {        // Overlapping
                current.end = Math.max(current.end, next.end);
            } else {
                merged.add(current);    // No overlapping
                current = next;
            }
        }

        merged.add(current);     // Add the last interval

        return merged;
    }

    public static void main (String[] args) {
        List <Interval> intervals = Arrays.asList(
            new Interval(1, 3),
            new Interval(2, 6),
            new Interval(8, 10),
            new Interval(15, 18)
        );

        List<Interval> mergedntervals = MergeIntervals(intervals);
        System.out.println("Merged Intervals: " + mergedntervals);
    }
}