/**
 * Reverse characters in given character array.
 */
public class ReverseCharInString {
    public static void main(String[] args) {

        char[] arr = new char[]{'s', 'u', 'r', 'y', 'a'};
        System.out.println(arr);
        System.out.println(reverse(arr));
        
    }

    private static char[] reverse(char[] arr) {
        char temp;

        for(int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
