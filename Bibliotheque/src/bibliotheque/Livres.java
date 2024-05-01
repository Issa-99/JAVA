package bibliotheque;

public class Livres extends Documents{
	
	private String nomAuteur;
	private int nbPages;

	
	
	public Livres(String numeroEnregistrement, String titre, int nbCopies, String description, String typedeDocument,
			String nomAuteur, int nbPages) {
		super(numeroEnregistrement, titre, nbCopies, description, typedeDocument);
		this.nomAuteur = nomAuteur;
		this.nbPages = nbPages;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	@Override
	public String afficherLadescription() {
		return  this.description;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", nomAuteur : " + nomAuteur + ", nbPages : " + nbPages + " ";
	}
	
}
