package org.formation.fonctionnelle;

//import java.util.Arrays;
import java.util.Scanner;

public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {
		int[] tab = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez une valeur : ");
		int val = scanner.nextInt();
		scanner.close();
		
		boolean found = false;
		for(int x : tab) {
			if(x == val) {
				System.out.println("trouv� !");
				found = true;
			}
		}
		if(!found) {
			System.out.println("cette valeur n'existe pas");
		}
		/*
		Arrays.sort(tab);
		if(Arrays.binarySearch(tab, val) >= 0) {
			System.out.println("trouv� !");
		} else {
			System.out.println("cette valeur n'existe pas");
		}
		*/
	}

}
