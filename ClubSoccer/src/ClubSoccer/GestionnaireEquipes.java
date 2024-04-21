/*
Devoir 2
INF 1002
Introduction à la programmation objet
Equipe 10
Participant :
	BELM24029805 Béland, Marc

	MANJ79360300 Manicka, Jean Olivier

	OUMI25129901 Oumarou El Hadji, Issa

	TAMG84340500 Tamba Wakou, Grace Andra

 	TAZM84280400 Tazniti, Mohamed Oussama

 */
package ClubSoccer;
import java.util.ArrayList;

import ClubSoccer.*;
import ClubSoccer.Equipe;
import ClubSoccer.Categories;
import ClubSoccer.Joueur;

// creation de la classe Gestionnaire d'equipe
public class GestionnaireEquipes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation de huit object joueurs 
		Joueur joueur1 = new Joueur("Cristiano","Ronaldo",39);
		Joueur joueur2 = new Joueur("Salah","Mohamed",31);	
		Joueur joueur3 = new Joueur("Leo","Messi",35);
		Joueur joueur4 = new Joueur("Kevin","De bruyne",32);
		Joueur joueur5 = new Joueur("Kylian","Mbappe",24);
		Joueur joueur6 = new Joueur("Jude","Bellingham",20);
		Joueur joueur7 = new Joueur("Vini","Junior",23);
		Joueur joueur8 = new Joueur("Erling","Haaland",23);
		
		// creation de deux equipes
		Equipe equipe1 = new Equipe("OldEra",0,new ArrayList<Joueur>(),Categories.Amateur);
		Equipe equipe2 = new Equipe("NewEra",0,new ArrayList<Joueur>(),Categories.Amateur);
		// assignation des joueurs aux equipes
		equipe1.ajouterJoueur(joueur1);
		equipe1.ajouterJoueur(joueur2);
		equipe1.ajouterJoueur(joueur3);
		equipe1.ajouterJoueur(joueur4);
		equipe2.ajouterJoueur(joueur5);
		equipe2.ajouterJoueur(joueur6);
		equipe2.ajouterJoueur(joueur7);
		equipe2.ajouterJoueur(joueur8);
		// assignation des nombres de parties de gagner
		equipe1.setNbPartiesGagnees(4);
		equipe2.setNbPartiesGagnees(5);
		// ajout de parties gagner 
		equipe1.ajoutPartiesGangner(2);
		// affichage de l'equipe avec le plus de victoire 
		if(equipe1.getNbPartiesGagnees()>equipe2.getNbPartiesGagnees()) {
			System.out.println("Equipe 1 a plus de victoire.");
	    }
		else{
			
			System.out.println("Equipe 2 a plus de victoire.");	
			}
		// Afficher le nombre de joueurs dans une equipe
		System.out.println("Le nombre de joueur pour l'equipe 1 est :" + equipe1.nombreJoueurs());		
		System.out.print("Le nombre de joueur pour l'equipe 2 est :"+equipe2.nombreJoueurs());
		
		// suppression d'un joueur gracea son index
		equipe1.supprimerJoueur(3);
		 // Afficher la liste des joueurs dans une equipe
		System.out.print("\nles joueurs de l'equipe 1 sont : " + equipe1.getListjoueurs());
		System.out.print("\nles joueurs de l'equipe  sont : " + equipe2.getListjoueurs());
		

		
	}

}
