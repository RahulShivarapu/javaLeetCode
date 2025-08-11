
public class PalindromeInteger {

    public static void main(String[] args) {
        int num = 121;
        boolean isPalindrome = isPalindrome(num);
        System.out.println(isPalindrome);
        System.out.println(ispalindrome2(num));
    }

    public static boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int start = 0;
    int end = str.length()-1;

    while(start<end){
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        start ++;
        end --;
    }
        return true;
    }      

    public static boolean ispalindrome2(int x){
        // check if integer is palindrome without converting to string
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }       
        int reversed = 0;
        while(x>reversed){
            reversed = reversed*10 + x%10;
            x /= 10;
        }
        // when the length is odd, we can get rid of the middle digit by reversed/10
        return x == reversed || x == reversed/10;
    }
}
