
public class SortBinaryArray {
    public static void main(String[] args) {
        
        int[] num = {0,1,1,0,1,1,0};
        int zerosCount=0;

        for(int i : num){
            if(num[i]==0){
                zerosCount++;
            }
        }

        for(int i=0 ; i<num.length; i++){
            if(i<zerosCount){
                num[i] = 0;
            }else{
                num[i] = 1;
            }
        }

        for(int i : num){
            System.out.println(i);
        }

    }

}
