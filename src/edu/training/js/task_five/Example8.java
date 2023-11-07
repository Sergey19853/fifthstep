package edu.training.js.task_five;

public class Example8 {

	public static void main(String[] args) {

        int a = -5;
        int b = 20;
        int h = 2;
        int c = 1;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i == 15) {
                y = (i + c) * 2;
            } else {
                y = (i - c) + 6;
            }
            System.out.println("i = " + i + " у = " + y);
        }

	}

}
