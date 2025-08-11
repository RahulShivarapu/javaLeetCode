
import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(0,1,0,1,1,0,0,1,1);

        for(int i=0 ;i<nums.size()-1; i++){
            for(int j=0 ; j<nums.size()-1-i;j++){
                if(nums.get(j)>nums.get(j+1)){
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, temp);
                }
            }
        }

        System.out.println(nums);

    }

}
