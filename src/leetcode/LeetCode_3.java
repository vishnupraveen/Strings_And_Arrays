package leetcode;

import java.util.HashSet;

public class LeetCode_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {

            if(s.length()<=1) return s.length();

            int max=0;
            int windowStart=0;
            int windowEnd=0;
            int n=s.length();

            HashSet<Character> set=new HashSet<>();
            while(windowStart<n&&windowEnd<n)
            {
                if(!set.contains(s.charAt(windowEnd)))
                {
                    set.add(s.charAt(windowEnd++));
                    max=Math.max(max,windowEnd-windowStart);
                }
                else
                {
                    set.remove(s.charAt(windowStart++));
                }


            }
            return max;

        }
    }
}
