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
// creation de la classe joueur 
public class Joueur {
	// creation des variables d'instances
	  private String nom ;
	  private String prenom;
	  private int age;
	// constructeur de la classe joueur  
	public Joueur(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	// methode to string 
	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	  

}
