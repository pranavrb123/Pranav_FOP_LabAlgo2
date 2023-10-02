package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.ServiceClass;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of transaction array");

		int sizeofarray = sc.nextInt();

		int[] inputarray = new int[sizeofarray];

		for (int i = 0; i < sizeofarray; i++) {

			System.out.println("Enter value for element " + (i + 1) + ":");
			inputarray[i] = sc.nextInt();

		}

		System.out.println("enter the total number of targets that needs to be achieved");

		int target = sc.nextInt();

		ServiceClass sc1 = new ServiceClass();
		sc1.TransactionsService(inputarray, target);

		sc.close();

	}

}
