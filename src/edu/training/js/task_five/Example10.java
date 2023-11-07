package edu.training.js.task_five;

import java.math.BigInteger;

public class Example10 {

	public static void main(String[] args) {

		BigInteger a = BigInteger.valueOf(1);
		for(int i = 1; i <= 200; i++) {
		    a = a.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(a);

	}

}
