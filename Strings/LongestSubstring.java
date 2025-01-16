package Strings;

public class LongestSubstring {
    

    public int longestUniqueSubstr(String s) {
        // code here
        //nested loops
        int maxLength = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            //outer loop area
        maxLength = Math.max(count,maxLength);
        count = 0;
        boolean arr[] = new boolean[256];
            for(int j= i; j<s.length();j++){
                //inner loop area
                if(arr[(int)s.charAt(j)] ==true){
                    break;
                }
                else{
                    arr[(int)s.charAt(j)] =true;
                }
                count++;
            }
        }
        return maxLength;

    }
}
