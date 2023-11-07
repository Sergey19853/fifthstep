package edu.training.js.task_five;

public class Example13 {

	public static void main(String[] args) {

        int a = -5;
        int b = 5;
        double h = 0.5;
        double y;

        for (double i = a; i <= b; i += h) {
            y = 5 - (i * i) / 2.0;
            System.out.println("х = " + i + " у = " + y);
        }

	}

}
