/*
Devoir 3
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
package concessionmoto;

import java.util.Scanner;

public class Moto {
	// attribut moto 
	private Marque marque;
	private String modele;
	private int annee;
	private String couleur;
	private int kilometrage;
	
	// constructeur
	public Moto(concessionmoto.Marque marque, String modele, int annee, String couleur, int kilométrage) {
		;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.couleur = couleur;
		this.kilometrage = kilométrage;
	}
	
	// ajout kilometrage 
	
	public int ajoutKilometrage() {
		
		System.out.println("Ajout kilometrage");
		Scanner scan = new Scanner(System.in);
	    return kilometrage = kilometrage + scan.nextInt();
	    
	}

	// accesseurs get et set 
	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	// methode to string 
	public String toString() {
		return "Moto [Marque=" + marque + ", Modele=" + modele + ", Annee=" + annee + ", Couleur=" + couleur
				+ ", Kilometrage=" + kilometrage + "]";
	}
	
}
