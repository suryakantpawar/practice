import java.util.ArrayList;
import java.util.List;

/**
 * Print numbers from 1 to n, but for multiples of 3, print "Fizz" instead of the number,
 * and for multiples of 5, print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                fizzBuzzList.add("FizzBuzz");
            else if(i % 5 == 0)
                fizzBuzzList.add("Buzz");
            else if(i % 3 == 0)
                fizzBuzzList.add("Fizz");
            else
                fizzBuzzList.add(String.valueOf(i));
        }

        return fizzBuzzList;
    }
}
