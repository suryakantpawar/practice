public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Surya"));
        System.out.println(isPalindrome("Naman"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0, j = s.length() - 1; j > i; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
