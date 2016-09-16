package cn.tk.leetcode;

import java.util.*;

/**
 * Created by xiedan on 16/9/15.
 */
public class TopKFrequentElements {
    public static void main(String args[]) {
        int nums[] = {};
        List<Integer> retList = topKFrequent(nums, 1);
        System.out.println(retList.toArray());

    }

    /**
     * 思想:桶排
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frenquencyMap = getFrenquencyHashMap(nums);
        List<Integer>[] bucket = new List[nums.length + 1];         //防止数组越界
        for (int key : frenquencyMap.keySet()
                ) {
            int frenquency = frenquencyMap.get(key);
            if (bucket[frenquency] == null) {
                bucket[frenquency] = new ArrayList<Integer>();
            }
            bucket[frenquency].add(key);
        }
        List<Integer> retList = new ArrayList<Integer>();
        for (List<Integer> list : bucket
             ) {
            System.out.println("bucket: " + list);
        }
        //这里i必须大于等于0(数组下标是从0开始),因此在定义bucket的长度时,需要nums.length + 1。
        for (int i = bucket.length - 1; i >= 0 && k > retList.size(); i--) {
            if (bucket[i] != null) {
                retList.addAll(bucket[i]);
            }
        }
        return retList;
    }

    /**
     * 将数组中元素出现频率记到HashMap中,key:数组元素值   value:元素出现次数
     * @param nums
     * @return
     */
    private static HashMap<Integer, Integer> getFrenquencyHashMap(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> frenquencyMap = new HashMap<Integer, Integer>();
        int tmpCount = 1;
        for (int i = 0; i < nums.length; i++) {
            if(frenquencyMap.containsKey(nums[i])) {
                tmpCount++;
                frenquencyMap.put(nums[i], tmpCount);
            }
            else {
                tmpCount = 1;
                frenquencyMap.put(nums[i], tmpCount);
            }
        }
        return frenquencyMap;
    }
}
