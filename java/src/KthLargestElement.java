
import java.util.Arrays;
// import java.util.Comparator;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,5,5,6};
        int k=4;
        System.out.println(findKthLargest(arr, k));
    }
    public  static int findKthLargest(int[] nums, int k) {

    //    int[] largestToSmallest = Arrays.stream(nums)
    //        .boxed()
    //        .sorted(Comparator.reverseOrder())
    //        .mapToInt(Integer::intValue)
    //        .toArray();

    //        System.out.println(Arrays.toString(largestToSmallest));


    //     return largestToSmallest[k-1];
        
    Arrays.sort(nums);
    return nums[nums.length-k];
    }

}
