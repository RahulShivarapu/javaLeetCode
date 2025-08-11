
public class sample2 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int count=0, val=3;
// get count 
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!= val){
                count++;
            }
        }
        System.out.println(count);
      //  use that count to create array
        int[] newArray = new int[count];
        int index=0;
        
            for(int i = 0; i<nums.length;i++){
            if(nums[i] != val){
                newArray[index++] = nums[i];
            }
        }

        for(int i : newArray){
            System.out.print(i+",");
        }

    }
     
    
}
