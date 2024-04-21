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
import ClubSoccer.*;
import java.util.*;
import ClubSoccer.Joueur;

// creation de classe de la classe Equipe

public class Equipe {

	// initialisations des variables des variables d'instances 
	private String nom;
	private int nbPartiesGagnees;
	private ArrayList<Joueur> listjoueurs= new ArrayList<Joueur>();
	private Categories categories;
	// constructeur 
	public Equipe(String nom, int nbPartiesGagnees, ArrayList<Joueur> listjoueurs, Categories categories) {
		super();
		this.nom = nom;
		this.nbPartiesGagnees = nbPartiesGagnees;
		this.listjoueurs = listjoueurs;
		this.categories = categories;
	
	// les accesseurs 
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbPartiesGagnees() {
		return nbPartiesGagnees;
	}
	public void setNbPartiesGagnees(int nbPartiesGagnees) {
		this.nbPartiesGagnees = nbPartiesGagnees;
	}
	public ArrayList<Joueur> getListjoueurs() {
		return listjoueurs;
	}
	public void setListjoueurs(ArrayList<Joueur> listjoueurs) {
		this.listjoueurs = listjoueurs;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	
	// methode d'ajout de partie
	
	public int  ajoutPartiesGangner(int n) {
		nbPartiesGagnees += n; 
		return nbPartiesGagnees;
	}
	
	// methode qui retourne le nombre le nombre de joueurs
	
	public int nombreJoueurs() {
		
		int nbJoueurs = listjoueurs.size();
		
		return nbJoueurs;
		
	}
	// methode qui ajoute un joueurs a une equipe 
	public void ajouterJoueur(Joueur joueur) {
		 
		listjoueurs.add(joueur);
	
	}
	// methode qui suprimme un joueurs d'une equipe
	public void supprimerJoueur(int location) {
			
			listjoueurs.remove(location);	
		
	}
	
}

