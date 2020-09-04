import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a>b){
            if(a>c){
                return Math.max(b,c);
            }
            else{
                return a;
            }
            }
        else{
            if(a<c){
                return Math.min(b,c);
            }
            else{
                return a;
            }
        }
        }
        
    

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int d = Math.abs(a);
        int e = Math.abs(b);
        if (d>e){
            return a;
        }
        else{
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.sqrt((a*a)+(b*b));
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(3, 2, 1)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
