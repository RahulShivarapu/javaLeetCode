
public class SortArray {

    public static void main(String[] args) {
        int [] num = {99,-143,0,567,-1};

       for(int i=0;i<num.length-1;i++){
        for(int j=0;j<num.length-1-i;j++){
            if(num[j]>num[j+1]){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
       }
       for(int i : num){
        System.out.println(i);
       }
    }
}
