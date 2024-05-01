package bibliotheque;

public abstract class Documents {
	
	private String numeroEnregistrement;
	protected String titre;
	private int nbCopies;
	protected String description;
	protected String typedeDocument;
	
	public Documents(String numeroEnregistrement,String titre, int nbCopies,String description,String typedeDocument) {
		super();
		this.numeroEnregistrement = numeroEnregistrement;
		this.titre = titre;
		this.nbCopies = nbCopies;
		this.description = description;
		this.typedeDocument = typedeDocument;
	}
	
	public String getNumeroEnregistrement() {
		return numeroEnregistrement;
	}
	public void setNumeroEnregistrement(String numeroEnregistrement) {
		this.numeroEnregistrement = numeroEnregistrement;
	}
	public int getNbCopies() {
		return nbCopies;
	}
	public void setNbCopies(int nbCopies) {
		this.nbCopies = nbCopies;
	}

	public void ajoutNbCopies(int copies) {
		this.nbCopies += copies;
	}
	public void reductionNbCopies(int copies) {
		this.nbCopies -= copies;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String afficherLadescription() {
		
		return this.description;
	}
	
	public String getTypedeDocument() {
		return typedeDocument;
	}
	public void setTypedeDocument(String typedeDocument) {
		this.typedeDocument = typedeDocument;
	}
	@Override
	public String toString() {
		return " [numeroEnregistrement : " + numeroEnregistrement + ", titre : "+ titre +  ", nbCopies : " + nbCopies +  " ";
	}

	
}
