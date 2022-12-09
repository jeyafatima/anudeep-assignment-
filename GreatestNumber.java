package labproject1;

public class GreatestNumber {

	    public static void main(String[] args) {

	        double n1 = 9.8, n2 = 10.4, n3 = 7.8;

	        if(n1 >= n2) {
	            if(n1 >= n3)
	                System.out.println(n1 + " is the largest number.");
	            else
	                System.out.println(n3 + " is the largest number.");
	        } else {
	            if(n2 >= n3)
	                System.out.println(n2 + " is the largest number.");
	            else
	                System.out.println(n3 + " is the largest number.");
	        }
	    }
	}
