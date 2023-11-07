package edu.training.js.task_five;

public class Example12 {
    
	public static void main(String[] args) {

	    long x = 1L;
	    int an = 1;

	    for (int i = 2; i <= 10; i++) {
	        an = 6 + an;
	        x *= an;
	    }

	    System.out.println(x);

	}
}
