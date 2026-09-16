class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparing(o -> o[1]));

        int arrows = 0;
        int endCordinate = Integer.MIN_VALUE;
 

        for(int i =0; i<points.length; i++) {
            if(arrows == 0 || endCordinate < points[i][0]) {
                arrows++;
                endCordinate = points[i][1];
            }
        }
        return arrows;
    }
}