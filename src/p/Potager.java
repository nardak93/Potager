package p;

import java.util.ArrayList;
import java.util.HashMap;

import data.TxtConst;
import model.Aliment;
import model.Pdt;
import utilities.Utilitaires;

public class Potager {

	//A la bonne place?
	HashMap<Aliment, Integer> gardeManger = new HashMap<Aliment, Integer>();
	ArrayList<Aliment> potager = new ArrayList<Aliment>();
	float argentDisponible = 10;
	
	
	
	
	public void cestparti() {
		
		System.out.println(TxtConst.GREETING);
		System.out.println(TxtConst.BONJOUR);
		
		/*System.out.println("Souhaitez vous restaurer une sauvegarde?");
		
		if(Utilitaires.readString().equals("oui")) {
			//TODO
			//Lecture d'un fichier txt contenant les informations normalisés du potager
			Utilitaires.restaurationData();
		}*/
		
		boolean appliOn = true;
		
		do {
			//a la bonne place???
			System.out.println(TxtConst.CHOIXMENU);

			int i = Utilitaires.readInt();
			
			switch (i) {
			case 1:
				System.out.println("Que voulez-vous planter?"
						+ " 1 Pdt, 2 Carotte, 3 Poireau, 4 Pomme");
				int j = Utilitaires.readInt();
				
				

				//TO DO
				//Gestion saisie utilisateur : ajout d'un des fruits/legumes saisie dans le potager
				//On plante une unité.
				switch(j) {
				case 1:
					Pdt pdt = new Pdt();
					potager.add(pdt);
					break;
				case 2:
					Pdt carotte = new Pdt();
					potager.add(carotte);
					break;
				case 3:
					Pdt poireau = new Pdt();
					potager.add(poireau);
					break;
				case 4:
					Pdt pomme = new Pdt();
					potager.add(pomme);
					break;
					
				
				}
				
				break;
			case 2:
				Utilitaires.printPotager(potager);
			    //TO DO
				//Affichage du potager
				
				
				
				
				
				
				
				break;
			case 3:
				System.out.print("Quel fruit ou legume voulez vous recolter?");
				int jj = Utilitaires.readInt();
				switch(jj) {
				case 1:
					Pdt pdt = new Pdt();
					potager.remove(pdt);
					break;
				}
				
				

				//TO DO
				//On peut recolter l'un des fruits/legumes à maturité (ni trop tôt, ni trop tard)
				break;
			case 4 : 
				System.out.println("Vente au marché");
				//TO DO
				//Quel fruit/legume vendre ?
				
				break;
			
			case 5:
				System.out.println("Sauvegarde dans un fichier");
				//TO DO
				//On sauvegarde ce qui est dans le potager, ainsi que l'argent courant
				break;
			case 6:
				appliOn = false;
				break;
			default:
				;
			}
		}
		
		//TO DO
		//ajout : la pousse de chaque fruit/legume du potager 
		//(il faut qu'à chaque action, tous les fruits et légumes poussent)
		//les fruits et légumes trop mûr sont perdus et retirés du potager
		
		
		while(appliOn);
	}
	

}
