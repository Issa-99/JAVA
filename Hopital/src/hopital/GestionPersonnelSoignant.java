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
import hopital.Infirmier.departements;
import java.util.Scanner;

public class GestionPersonnelSoignant {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation de trois obeject de type infirmier
		Infirmier infirmier1 = new Infirmier("joe","doe",departements.Dermatologie,25);
		Infirmier infirmier2 = new Infirmier("ray","allen",departements.Pneumologie,26);
		Infirmier infirmier3 = new Infirmier("myke","tyson",departements.Pédiatrie,27);
		// Afficher le nom et prenom des objects infirmier
		System.out.println("infirmier1 :"+"nom =>"+infirmier1.getNom()+" prenom =>"+infirmier1.getPrenom());
		System.out.println("infirmier2 :"+"nom =>"+infirmier2.getNom()+" prenom =>"+infirmier2.getPrenom());
		System.out.println("infirmier3 :"+"nom =>"+infirmier3.getNom()+" prenom =>"+infirmier3.getPrenom());
		
		
		// recuperer l'entre utilisateur avec la class scanner
		System.out.print("tripler le nombre d'heure du second infirmier: ");
		Scanner scanner = new Scanner(System.in);
		int triplerndHeures = scanner.nextInt(); 
		// utiliser le nombre recuperer pour l'arttribuer a infiermier 2
		infirmier2.setnbHeurs(triplerndHeures);
		
		
		// recuperer l'entre utilisateur avec la class scanner
		System.out.print("doubler le nombre d'heure du troisieme infirmier: ");
		Scanner scanner2 = new Scanner(System.in);
		int doublerndHeures = scanner2.nextInt(); 
		// utiliser le nombre recuperer pour l'arttribuer a infiermier 3
		infirmier3.setnbHeurs(doublerndHeures);

		
		//appeller la methode ajout d'heure supplementaire de l'obeject infirmier
		infirmier1.ajouterHeuresSupplementaires(20);
		
		//afficher les objects infirmier 
		System.out.println(infirmier1);
		System.out.println(infirmier2);
		System.out.println(infirmier3);
		
	}

}
