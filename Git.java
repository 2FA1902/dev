import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player joueur1 = new Player("Arnold",4000,4000);
		Player joueur2 = new Player("Annette", 3000, 6500);
		
		joueur2.damage(joueur1.getPointAttaque(), joueur1.getName());
		
		Ananas ananas1 = new Ananas();
		ananas1.miam();
		
		Pomme pomme1 = new Pomme();
		pomme1.miam();
		
		for(Jour moment : Jour.values()){
			if(! moment.equals(Jour.APRESMIDI)){
				System.out.println("Nous sommes actuellement le "+ moment.name() + " il est " + moment.getHeure() + "h");
			}
		}
		
		ArrayList list = new ArrayList();
		
		int a = 5, b = 2;
		
		System.out.println((double) a / b);
		/***
		   Commentaire d'ajout du fichier Git
		*/

		System.out.println("Ajout effectué dans git");

	}

}
