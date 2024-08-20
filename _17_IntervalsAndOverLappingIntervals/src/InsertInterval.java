import java.util.LinkedList;
import java.util.List;

/**
 * QUESTION : Given a list of non-overlapping intervals sorted by their start time, insert a given interval at the valid position, merge all the overlapping
 * intervals and return a list of mutually exclusive intervals.
 *
 * @Example  input: intervals = [ {1, 3}, {5, 7}, {8, 10} ], new interval = [{4, 9}]
 *          output: [{1, 3}, {4, 10}]
 *
 *         0      1      2       3      4       5       6       7        8      9       10      11
 *     ---|------|------|------ |------|-------|-------|-------|--------|------|-------|--------|------> time axis
 *               [       1,3    ]             [     5,7        ]        [      8, 10   ]
 *                                    [            4,9                         ]
 *
 *
 */
public class InsertInterval {


    static List<Interval> insert( List<Interval> intervals, Interval newInterval){

        if( intervals == null || intervals.isEmpty()) return intervals;

        List<Interval> results = new LinkedList<>();
        int i = 0;

        // adding intervals which do not overlap with the new interval
        while( i < intervals.size() && intervals.get(i).end < newInterval.start){
            results.add(intervals.get(i));
            i++;
        }

        //intervals which overlap
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end){
            Interval current = intervals.get(i);
            newInterval.start = Math.min(current.start, newInterval.start);
            newInterval.end = Math.max(current.end, newInterval.end);
            i++;
        }

        results.add(newInterval);

        // adding the other intervals after the new interval i.e. intervals which did not overlap and are after the new interval
        while(i < intervals.size()){
            results.add(intervals.get(i));
            i++;
        }

        return results;
    }


    public static void main(String[] args) {

        List<Interval> intervals = new LinkedList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(8, 10));

        Interval newInterval = new Interval(4, 9);

        List<Interval> results = insert(intervals, newInterval);
        System.out.println(results);
    }
}
