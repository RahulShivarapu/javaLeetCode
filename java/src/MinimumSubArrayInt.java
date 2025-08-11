
public class MinimumSubArrayInt {
    public static void main(String[] args) {

        int target =7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
        
    }
     public  static int minSubArrayLen(int target, int[] nums) {
    
        int l=0;
        int h=0;
        int mini_len_win = Integer.MAX_VALUE;

        int currentSum = 0;

        for(h=0; h<nums.length ;h++){
            currentSum += nums[h];
            while(currentSum>=target){
                int currentWindow = h-l+1;
                mini_len_win = Math.min(mini_len_win, currentWindow);
                currentSum= currentSum-nums[l];
                l++;
            }
        }
        return mini_len_win == Integer.MAX_VALUE?0:mini_len_win;



    }

}
