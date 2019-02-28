package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author wangteng
 * @desc
 * @date 2019/2/28 19:46
 */
public class ArrayLeetCode {
    /**
     *
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j!= k && i!=k) {
                        int result = nums[i] + nums[j] + nums[k];
                        if (result == 0) {
                            List<Integer> results = new ArrayList();
                            results.add(nums[i]);
                            results.add(nums[j]);
                            results.add(nums[k]);
                            Collections.sort(results);
                            resultList.add(results);
                        }
                    }
                }
            }
        }

        Iterator<List<Integer>> iterator = resultList.iterator();
        List<List<Integer>> temp = new ArrayList<>();
        while (iterator.hasNext()){
            List<Integer> list = iterator.next();
            if (!temp.contains(list)) {
                temp.add(list);
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        int [] array ={-1, 0, 1, 2, -1, -4};
        final List<List<Integer>> lists = threeSum(array);
        System.out.println(lists);
    }
}
