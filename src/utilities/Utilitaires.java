package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import model.Aliment;

import java.util.Scanner;

public class Utilitaires {
	
	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		try{
			i = sc.nextInt();
		}
		catch(Exception e) {	
		}
		return i;
	}	
	
	public static void printAliment(HashMap<Aliment, Integer> mapToPrint) {
		for(Entry<Aliment, Integer> data: mapToPrint.entrySet()) {
			System.out.println(data);
		}
		
	}

	//le truc qui print le potager doit indiquer par une lettre minuscule
	//ce qui n'est pas mûr, et par une majuscule ce qui est prêt à être recolté
	//donc, pas ce qui est en dessous!
	public static void printPotager(ArrayList<Aliment> potager) {
		for (Aliment aliment : potager) {
			System.out.println(aliment.toString());
			System.out.println(aliment.getNom());
			System.out.println(aliment.getDureePousse());
			System.out.println(aliment.getRecoltePousse());
			System.out.println(aliment.getMomentPousse());
		}
	}
	
	
	
	
	
	
	
}
