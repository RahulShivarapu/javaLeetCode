
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotateArrayBy(num, k)));
    }
    public static int[] rotateArrayBy(int[] num , int i){
      int n= num.length;
      int k = i % n;
      reverseArray(num, 0, n-1);
      reverseArray(num, 0, k-1);
      reverseArray(num, k,n-1);
        return num;
    }

    public static void reverseArray(int[] num, int start , int end){
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start ++;
            end--;
        }
    }
}
