package edu.training.js.task_five;

public class Example7 {

	public static void main(String[] args) {

        int a = -3;
        int b = 9;
        int h = 2;
        int c;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                c = i;
            } else {
                c = i * (-1);
            }
            System.out.println("i = " + i + " c = " + c);
        }

	}

}
