package edu.training.js.task_five;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		System.out.print("Введите любое целое положительное число: ");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1; i<= n; i++){
			sum = sum + i;
		}
		System.out.println (sum);		

	}

}
