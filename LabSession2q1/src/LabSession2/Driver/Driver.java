package LabSession2.Driver;

import java.util.Scanner;

import LabSession2.services.TransactionTargetAlgo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
TransactionTargetAlgo transactionTargetAlgo = new TransactionTargetAlgo();
System.out.println("Enter the totalNoOfTransactions of transaction array");
int totalNoOfTransactions = scanner.nextInt();
int[] transactions = new int[totalNoOfTransactions];

System.out.println("Enter the values of transactions");

for (int i=0;i<totalNoOfTransactions;i++) 
	transactions [i] = scanner.nextInt();
	System.out.println("Enter the total no of targets that needs to be achieved");
	int targetCount = scanner.nextInt();
	System.out.println("Enter the value of targets");
	int[] targets = new int[targetCount];
	int target;
	for(int i=0; i<targetCount;i++) {
		target = scanner.nextInt();
		transactionTargetAlgo.processTransactions(transactions,target);
	}
}
}


