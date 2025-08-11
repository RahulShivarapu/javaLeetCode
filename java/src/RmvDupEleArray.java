package com.example.leetCode;

public class RmvDupEleArray {
    
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int val = 3;
      // Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      // .entrySet()
      // .stream()
      // .flatMap(n->Collections.nCopies(2, n.getKey()).stream())
      // .forEach(System.out::println);
      //   // nums = [0,0,1,1,1,1,2,3,3]

      System.out.println(removeElement(nums, val));
        
        
    }
    public static int removeElement(int[] nums, int val) {
    int count =0;
        for(int i = 1; i<=nums.length-1;i++){
            for(int j=1; i<=nums.length-1;j++){
                if(nums[j]!=nums[1-i]){
                    nums[i]= nums[j];
                    j++;
                }
                i++;
                count ++;
            }
        }
        return count;

    }
}
