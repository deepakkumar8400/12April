import java.util.*;

class Interval {
    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {2, 9}, {8, 10}, {15, 18}};

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            int currentStart = arr[i][0];
            int currentEnd = arr[i][1];

            if (currentStart <= end) {
                end = Math.max(end, currentEnd);  // Merge
            } else {
                merged.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            }
        }

        merged.add(new int[]{start, end});  // Last interval

        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
