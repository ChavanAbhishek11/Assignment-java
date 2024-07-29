package AssignmentJava;

public class pgm2 {
	

	    public static void generateSeries(int a, int b, int n) {
	        int sum = a;
	        int term = 1; 

	        for (int i = 0; i < n; i++) {
	            sum += term * b;
	            System.out.print(sum);
	            if (i < n - 1) {
	                System.out.print(" ");
	            }
	            term *= 2; 
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        generateSeries(0, 2, 10);  
	        generateSeries(5, 3, 5);   
	    }
	}


