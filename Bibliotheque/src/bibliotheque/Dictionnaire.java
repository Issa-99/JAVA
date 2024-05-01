package bibliotheque;

public class Dictionnaire extends Documents {
	protected String[] langue ={"Français","Anglais","Espagnol","Latin","Allemand"};
	String langueDictionnaire;




	public Dictionnaire(String numeroEnregistrement, String titre, int nbCopies, String description,
			String typedeDocument, String langueDictionnaire) {
		super(numeroEnregistrement, titre, nbCopies, description, typedeDocument);
		this.langueDictionnaire = langueDictionnaire;
	}

	public String getLangueDictionnaire() {
		return langueDictionnaire;
	}

	public void setLangueDictionnaire(String langueDictionnaire) {
		this.langueDictionnaire = langueDictionnaire;
	}

	public String[] getLangue() {
		return langue;
	}
	public String getTypedeDocument() {
		return typedeDocument;
	}
	public void setTypedeDocument(String typedeDocument) {
		this.typedeDocument = "Dictionnaire";
	}
	@Override
	public String afficherLadescription() {
		String texte = "Ce document est de type Dictionnaire, un Dictionnaire est ";
		return  texte + this.description;
	}

	@Override
	public String toString() {
		return "Dictionnaire" + super.toString()+" ,langueDictionnaire : " + langueDictionnaire + "]";
	}
	
	

}
