package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.mergesortImplementation.MergeSortImplementation;
import com.greatlearning.service.ServiceClass;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the currency denominations");

		int sizeofcurrency = sc.nextInt();

		int[] inputarray = new int[sizeofcurrency];

		for (int i = 0; i < sizeofcurrency; i++) {

			System.out.println("Enter value for element " + (i + 1) + ":");
			inputarray[i] = sc.nextInt();
		}
        System.out.println("Enter the Amount");
        int Amount = sc.nextInt();
		MergeSortImplementation mergeimplementation = new MergeSortImplementation();
		mergeimplementation.sort(inputarray, 0, sizeofcurrency - 1);
		ServiceClass service = new ServiceClass();
		service.notesCountImplementation(inputarray , Amount);
		
	}
}