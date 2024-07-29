package AssignmentJava;

public class pgm4 {
	

	    public static int findLastPosition(int n, int m, int s) {
	        return ((s - 1) + (m - 1)) % n + 1;
	    }

	    public static void main(String[] args) {
	        int n1 = 5, m1 = 2, s1 = 1;
	        System.out.println(findLastPosition(n1, m1, s1)); 

	        int n2 = 5, m2 = 2, s2 = 2;
	        System.out.println(findLastPosition(n2, m2, s2)); 

	        int n3 = 4, m3 = 6, s3 = 2;
	        System.out.println(findLastPosition(n3, m3, s3)); 
	    }
	}



