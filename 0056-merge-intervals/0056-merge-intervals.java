class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        ArrayList<int[]> mergeIntervals = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                mergeIntervals.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        mergeIntervals.add(new int[]{start, end});

        return mergeIntervals.toArray(new int[mergeIntervals.size()][]);
    }
}