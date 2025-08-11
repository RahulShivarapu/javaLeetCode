
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3}; 
        String str = "";
        for(int i : digits){
            str = str + String.valueOf(i); 
        }

        int num = Integer.parseInt(str);
        String addOne = String.valueOf(num+1);

        int[] result = new int[addOne.length()];
        for(int j = 0; j<addOne.length();j++){
            result[j] = Character.getNumericValue(addOne.charAt(j));
        } 
      System.out.println(Arrays.toString(result));  
    }
    

}
