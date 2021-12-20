package LabSession2Q2.service;

public class NotesCount {
	public void notesCountImplementation(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];
		try {
			for(int i=0; i<notes.length; i++) {
				if(amount>=notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount can not be given with the highest denomination");
			}else {
				System.out.println("Your payment approach in order to give min noof notes will be");
				for(int i=0; i<notes.length; i++) {
					if(notesCounter[i]!=0) {
						System.out.println(notes[i] + ":" + notesCounter[i]);
					}
				}
			}
		}
			catch(ArithmeticException e) {
				System.out.println(e+ " notes of denomination 0 is invalid");
			}
		}
	}


