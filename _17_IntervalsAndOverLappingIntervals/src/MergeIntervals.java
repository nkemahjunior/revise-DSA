import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * check readme.md
 *
 * QUESTION: Given a list of intervals, merge all the overlapping intervals and return a list of non overlapping intervals
 *
 * @Example  input = [ {2, 6}, {1, 3}, {8, 10} ]
 *           output = [{1, 6}, {8, 10}
 *
 *  EXPLANATION
 *  sort the intervals based on their start time, the plot them on the graph
 *
 *         0      1      2       3      4       5       6       7        8      9       10      11
 *     ---|------|------|------ |------|-------|-------|-------|--------|------|-------|--------|------> time axis
 *               [       1,3    ]                                       [      8, 10   ]
 *                      [            2, 6              ]
 *
 *
 *    - As you can see from the graph, a = (1, 3) and b =  ( 2, 6) overlap, so we merge them and we get c = ( 1, 6)
 *    - (8, 10) does not overlap, so we allow it like that
 *
 *    - so to get the values in c we do :
 *    c.start = a . start
 *    c.end = MAX( a.end, b.end)
 */
public class MergeIntervals {

    static List<Interval> merge( List<Interval> intervals){

        //we can not merge less than 2 intervals
        if(intervals.size() < 2) return intervals;

        //sorting intervals according to their start value, so they can be represented on the graph
        intervals.sort(Comparator.comparingInt(el -> el.start));

        List<Interval> result = new LinkedList<>();

        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;

        // starting the loop at 1 since we already collected the first element above
        for(int i = 1; i < intervals.size(); i++){

            Interval current = intervals.get(i);
            //check if the nodes overlap
            if( current.start <= end){
                end = Math.max(current.end, end);
            }else{
                //they were not overlapping
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }


    public static void main(String[] args) {

        List<Interval> intervals = new LinkedList<>();
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(8, 10));

        List<Interval> results = merge(intervals);
        System.out.println(results);
    }
}
