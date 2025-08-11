
// import java.util.Stack;

public class AddOnetoMaxIntInArray {
    public static void main(String[] args){
        int[] nums = {2,3,4,7,5,6};// outPut : [2,3,4,8,-1,-1]
        int[] result = findMaxNumber(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] findMaxNumber(int[] nums){
    
        int n= nums.length;
        int max = Integer.MIN_VALUE;
        int[] result = new int[n]; 
        boolean isAddedOne = false;
        for(int i=n-1;i>=0;i--){
            if(nums[i]> max){
                max = nums[i];
                if(!isAddedOne){
                    result[i] = max + 1;
                    isAddedOne = true;
                }else{
                result[i] = -1;
                }
        }else{
            result[i] = nums[i];
        }
        }
        return result;
    }    
    }
    

