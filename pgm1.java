package AssignmentJava;

public class pgm1 {


	    public static int reverse(int x) {
	        int reversed = 0;
	        while (x != 0) {
	            int digit = x % 10;
	            x /= 10;

	            // Check for overflow
	            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
	                return 0;
	            }
	            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
	                return 0;
	            }

	            reversed = reversed * 10 + digit;
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        int x = 123;
	        System.out.println("Reversed: " + reverse(x));

	        x = -123;
	        System.out.println("Reversed: " + reverse(x)); 

	        x = 120;
	        System.out.println("Reversed: " + reverse(x)); 
	    }
	}