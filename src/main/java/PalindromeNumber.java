public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int num = x, reversed=0;
        if (x<0){return false;}
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }
        return (x==reversed);
    }
}
