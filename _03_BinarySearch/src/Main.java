public class Main {

    public static  int  binarySearch(int[] a, int key){

        int lo = 0, hi = a.length;

        while( lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(key < a[mid]) hi = mid - 1;
            else if( key > a[mid]) lo = mid + 1;

            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97};
        int key = 33;

        var results = binarySearch(a, key);

        System.out.println(results);
    }
}