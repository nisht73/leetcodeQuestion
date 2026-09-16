class Solution {
    public List<Integer> partitionLabels(String s) {
        int last[] = new int[26];

        for(int i=0; i<s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int end = 0;
        int start = 0;
        List<Integer> partition = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if(i == end){
                partition.add(end-start+1);
                start = i + 1;
            }
        }
        return partition;
    }
}