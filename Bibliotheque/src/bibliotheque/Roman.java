package bibliotheque;
import java.util.ArrayList;

 // Create an ArrayList object
public class Roman extends Livres{
	
	protected ArrayList<String> prixLitterair = new ArrayList<String>();
	String prixLitterairRoman ;

	
	
	public Roman(String numeroEnregistrement, String titre, int nbCopies, String description, String typedeDocument,
			String nomAuteur, int nbPages, String prixLitterairRoman) {
		super(numeroEnregistrement, titre, nbCopies, description, typedeDocument, nomAuteur, nbPages);
		this.prixLitterairRoman = prixLitterairRoman;
		this.prixLitterair.add(this.prixLitterairRoman);
	}

	public ArrayList<String> getPrixLitterair() {
		return prixLitterair;
	}

	public void setPrixLitterair(ArrayList<String> prixLitterair) {
		this.prixLitterair = prixLitterair;
	}
	public String getTypedeDocument() {
		return this.typedeDocument;
	}
	public void setTypedeDocument(String typedeDocument) {
		this.typedeDocument = "Roman";
	}
	@Override
	public String afficherLadescription() {
		String texte = "Ce document est de type Roman, un Roman est ";
		return  texte + this.description;
	}

	@Override
	public String toString() {
		return "Roman " + super.toString()+ ", prixLitterairRoman : " + prixLitterairRoman + "]";
	}
	
}
