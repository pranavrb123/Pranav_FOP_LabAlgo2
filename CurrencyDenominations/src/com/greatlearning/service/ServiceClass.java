package com.greatlearning.service;

public class ServiceClass {

	// notes = 10, 52, 89 ,1, 0
	// notes = 89, 52, 10, 1 sorting in the decreasing order
	// 900
	// notes 900/89 = 10 89:10
	// amount = 900-890=10
	// 10/10 = 1
	// 0

	// 89, 52, 10, 1
	// 10, 0, 1, 0
	// 89:10
	// 10 : 1

	public void notesCountImplementation(int[] inputarray, int amount) {

		int[] notes = new int[inputarray.length];

		for (int i = 0; i <= inputarray.length; i++) {
			if (amount > inputarray[i]) {
				notes[i] = amount / inputarray[i];
				amount = amount - notes[i] * inputarray[i];

				if (amount == 0)
					break;
			}
		}
		if (amount > 0) {
			System.out.println("The exact amount cannot be given with the highest denomination");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int j = 0; j < inputarray.length; j++) {
				if (notes[j] > 0)
					System.out.println("No of Notes " + notes[j] + " of :" + inputarray[j]);
			}
		}

	}

}
