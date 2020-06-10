package leetcode;

import java.util.*;

public class LeetCode_78 {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {

            List<List<Integer>> subset= new ArrayList<>();

            generateSubSet(nums, 0, new ArrayList<Integer>(),subset );
            return subset;
        }
        public void generateSubSet(int[] nums, int index,List<Integer> current,List<List<Integer>> subset  )
        {
            subset.add(new ArrayList<Integer>(current));
            for(int i=index;i<nums.length;i++)
            {
                current.add(nums[i]);
                generateSubSet(nums, i+1,current, subset );
                current.remove(current.size()-1);
            }


        }
    }
}
