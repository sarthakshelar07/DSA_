import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1 {

        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map= new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int complement= target-nums[i];

                if(map.containsKey(complement)){
                    return new int[]{map.get(complement),i};
                }

                map.put(nums[i],i);
            }
            return new int[0];
        }

    public static void main(String[] args) {
        int[] nums= {2,7,11,15};
        int target=9;
        Leetcode1 leetcode1=new Leetcode1();
        System.out.println(Arrays.toString(leetcode1.twoSum(nums, target)));
    }
    }


