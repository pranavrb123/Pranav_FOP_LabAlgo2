package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.main.MainClass;

public class ServiceClass extends MainClass {

	Scanner sc = new Scanner(System.in);
	int sum = 0;

	public void TransactionsService(int[] inputarray, int target) {
		for (int j = target; j > 0; j--) {
			System.out.println("enter the value of the target");

			int targetvalue = sc.nextInt();

			for (int i = 0; i < inputarray.length; i++)

			{

				sum = sum + inputarray[i];
				System.out.println("The value of sum:" + sum);

				if (sum >= targetvalue)

				{
					System.out.println("The target value found at:" + (i + 1));
					break;
				}

			}
			if (!(sum >= targetvalue)) {
				System.out.println("The Target value exceeded");
			}
			sum = 0;

		}
		sc.close();
	}

}
