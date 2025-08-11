
public class TwoSum_II {

    public static void main(String[] args) {
        int[] numbers = {2,3,4 };
        int[] res = twoSum(numbers, 6);

        for (int i : res) {
            System.out.println(i + ",");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[] { left + 1, right + 1 };
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
            
        }
        return new int[] { -1, -1 };

    }
}
