/*
Devoir 4
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

package gestionnaireChalet;

public class Chalet {

	private String nom;
	private String ville;
	private String adress;
	private int chambres;
	private boolean statutLocation;
	private boolean statutAssocier;
	//boolean associerEmployer;
	public Chalet(String nom, String ville, String adress, int chambres, boolean statutLocation,
			boolean statutAssocier) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.adress = adress;
		this.chambres = chambres;
		this.statutLocation = statutLocation;
		this.statutAssocier = statutAssocier;
		

	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getChambres() {
		return chambres;
	}
	public void setChambres(int chambres) {
		this.chambres = chambres;
	}
	public boolean isStatutLocation() {
		return statutLocation;
	}
	public void setStatutLocation(boolean statutLocation) {
		this.statutLocation = statutLocation;
	}
	public boolean isStatutAssocier() {
		return statutAssocier;
	}
	public void setStatutAssocier(boolean statutAssocier) {
		this.statutAssocier = statutAssocier;
	}
	

	@Override
	public String toString() {
		return "Chalet [nom=" + nom + ", ville=" + ville + ", adress=" + adress + ", chambres=" + chambres
				+ ", statutLocation=" + statutLocation + ", statutAssocier=" + statutAssocier + "]";
	}
	
}
