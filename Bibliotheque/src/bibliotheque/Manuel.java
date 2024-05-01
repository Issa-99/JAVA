package bibliotheque;

public class Manuel extends Livres{
	
	protected String[] domaine ={"Biologie", "Nutrition", "Ergonomie", "Médecine","Chiropratique"};
	private String domaineManuel;
	
	

	public Manuel(String numeroEnregistrement, String titre, int nbCopies, String description, String typedeDocument,
			String nomAuteur, int nbPages, String domaineManuel) {
		super(numeroEnregistrement, titre, nbCopies, description, typedeDocument, nomAuteur, nbPages);
		
		this.domaineManuel = domaineManuel;
	}

	public String getDomaineManuel() {
		return domaineManuel;
	}

	public void setDomaineManuel(String domaineManuel) {
		this.domaineManuel = domaineManuel;
	}
	
	@Override
	public String afficherLadescription() {
		String texte = "Ce document est de type Manuel, un Manuel est ";
		return  texte + this.description;
	}

	
	@Override
	public String toString() {
		return "Manuel"+ super.toString() +", domaineManuel : " + domaineManuel + "]";
	}


	
}
