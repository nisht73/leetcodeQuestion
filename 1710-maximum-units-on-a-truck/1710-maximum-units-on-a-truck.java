class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int count = 0;
        int units = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (count < truckSize) {
                if (count + boxTypes[i][0] <= truckSize) {
                    count += boxTypes[i][0];
                    units += (boxTypes[i][0] * boxTypes[i][1]);
                } else {
                    int remaining = truckSize - count;
                    count += remaining;
                    units += remaining * boxTypes[i][1];
                }

            }
        }

        return units;
    }
}