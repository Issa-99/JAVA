package bibliotheque;

public class Revue extends Documents {
	
	private String moisPublication;
	private int anneePublication;

	

	public Revue(String numeroEnregistrement, String titre, int nbCopies, String description, String typedeDocument,
			String moisPublication, int anneePublication) {
		super(numeroEnregistrement, titre, nbCopies, description, typedeDocument);
		this.moisPublication = moisPublication;
		this.anneePublication = anneePublication;
	}

	public String getMoisPublication() {
		return moisPublication;
	}

	public void setMoisPublication(String moisPublication) {
		this.moisPublication = moisPublication;
	}

	public int getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}
	public String getTypedeDocument() {
		return typedeDocument;
	}
	public void setTypedeDocument(String typedeDocument) {
		this.typedeDocument = "Revue";
	}
	
	@Override
	public String afficherLadescription() {
		String texte = "Ce document est de type Revue, un Revue est ";
		return  texte + this.description;
	}

	@Override
	public String toString() {
		return "Revue" + super.toString()+ " moisPublication : " + moisPublication + ", anneePublication : " + anneePublication + "]";
	}
	

}
