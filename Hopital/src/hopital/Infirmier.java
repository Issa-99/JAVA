/*
Devoir 1
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


package hopital;

public class Infirmier {
	
	// creation de l'enumeration
	 enum departements {
		Pédiatrie,
		Psychiatrie, 
		Pneumologie,
		Dermatologie,
		Cardiologie
	}
	// variable d'instancene
	
	private String nom;
	private String prenom;
	private departements departements;
	private int nbHeurs;
    
    // Constructors
   
	public Infirmier(String nomInfirmier,String prenomInfirmier,departements departementsInfirmier,int nbHeursInfirmier  ) {
		this.nom = nomInfirmier;
		this.prenom = prenomInfirmier;
		this.departements = departementsInfirmier;
		this.nbHeurs = nbHeursInfirmier;
	}
	
	
	// getters pour les variables d'instances
	
	public String getNom() {
		return this.nom;
		
	}
	public String getPrenom() {
		return this.prenom;
		
	}
	
	public departements getDepartements() {
		return this.departements;
		
	}
	public int getnbHeurs() {
		return this.nbHeurs;
		
	}

	
	// setters pour modifier  les variables d'instances
	
	
	public  void setnbHeurs(int plusHeures) {
		this.nbHeurs=plusHeures;
		
		
	}
	
	
	
	
	// method d'ajout d'heure supplementaire 
	
	public void ajouterHeuresSupplementaires(int heuresenplus) {
		nbHeurs = nbHeurs + heuresenplus ;
	}
	
	// methode toString pour afficher les attribut des obhects
	 public String toString() {
			
		return "NomInfirmier " + nom + ",PrenomInfirmier "+ prenom +",Departements "+departements+" nombre d'heures "+nbHeurs;
	}
	
		
}
