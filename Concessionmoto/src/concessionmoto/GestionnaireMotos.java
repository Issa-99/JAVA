/*
Devoir 3
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

package concessionmoto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class GestionnaireMotos {
	
	// liste de moto
	static ArrayList<Moto>listMotos = new ArrayList<Moto>();
	
	

	public static void main(String[] args) {
		
		
		int choix = 0;
		boolean arret = false;
		Scanner scan = new Scanner(System.in);

		// menu utilisateur
		while (!arret) // cette boucle permet de boucler tant que l'utilisateur ne quitte pas le menu
		{
			System.out.println("    --Mon menu-- ");
			System.out.println("1 : Création et ajout d’un objet moto à la liste de motos");
			System.out.println("2 : Affichage de toutes les motos de la liste");
			System.out.println("3 : Suppression d’une moto ");
			System.out.println("4 : Augmentation du kilométrage d’une moto ");
			
			System.out.println("5 : Comparaisons du kilométrage de deux motos");
			
			System.out.println("6 : Création et ajout de 4 objets motos prédéfinies");
			
			
			System.out.println("0 :Quitter le menu ");
			
	
			choix = scan.nextInt();
			
			switch (choix) // ce switch permet d'effectuer les actions relatives aux choix
			{
			case 1:

				
				creeretajoutermotos();
				
				break;

			case 2:

				afficherlesmotos();
				break;

			case 3:

				suprimmermotos();
				break;
				
			case 4:

				 ajoutekilometrage();
				break;
			
			case 5:

				compareraisonkilometrage();
				break;
				
			case 6:

				creationetajoutde4objetsmotospredefinies();
				break;
			case 0:

				arret = true;
				break;

			default: // si un chiffre autre que 0-1-2-3 est entr�

				System.out.println("entrez un choix entre 0 et 5 ");
				break;

			}
			// Juste pour a�rer l'affichage
			System.out.println();
		}

		System.out.println("Fin du programme");
	}
			// creation de 4 object moto
			private static void creationetajoutde4objetsmotospredefinies() {
				
				Moto moto1 = new Moto(Marque.Davidson,"model D",1999,"rouge",10);
			    listMotos.add(moto1);
			    
			    Moto moto2 = new Moto(Marque.Harley,"model H",1999,"bleu",20);
			    listMotos.add(moto2);
			    
			    Moto moto3 = new Moto(Marque.Kawasaki,"model K",1999,"blanc",30);
			    listMotos.add(moto3);
			    
			    Moto moto4 = new Moto(Marque.Triumph,"model T",1999,"vert",10);
			    listMotos.add(moto4);
			    
			    System.out.println(" 4 MOTOS CREE!!");
			 
			}
			// comparaison de kilometrage
			private static void compareraisonkilometrage() {
				
				// boucle sur la liste de moto 
				if(listMotos.size()>1) {
					System.out.println(" Liste des motos a comparer");
					 Iterator<Moto> it = listMotos.iterator();
					 int i = 0;
					 while(it.hasNext()) {
						 
						 System.out.println("MOTO NUMERO "+ i);
						 System.out.println(it.next());	
						 i++;			 
						 
						 }
					 
					 System.out.println("CHOISISSEZ L'INDEX DE LA 1ERE MOTO ");	
					 
				 	 int index;
				 	 Scanner scan = new Scanner(System.in);
				 	 
				 	 // recupere la moto 1  a partir de son index
				 	 index = scan.nextInt();
				 	 Moto moto1 = listMotos.get(index);
				 	 int killometrageMoto1 = moto1.getKilometrage();
				 	 
				 	 System.out.println("CHOISISSEZ L'INDEX DE LA 2EME MOTO ");	
					 
				 	// recupere la moto 2  a partir de son index
				 	 int index2;
				 	 index = scan.nextInt();
				 	 Moto moto2 = listMotos.get(index);
				 	 int killometrageMoto2 = moto2.getKilometrage();
				 	 
				 	 //compare les killometrages
				 	 if(killometrageMoto1>killometrageMoto2) {
				 		System.out.println("MOTO 1 a plus de killometrage  ");
				 	 }else if(killometrageMoto1<killometrageMoto2) {
				 		System.out.println("MOTO 2 a plus de killometrage  "); 
				 	 }else {
				 		System.out.println("MOTO 1 et MOTO 2 ONT LE MEME KILLOMETRAGE ");
				 	 }
				 	 
				}else {
					System.out.println("-------------liste vide------------");
				}
				
			}
		
			private static void ajoutekilometrage() {
				
				if(listMotos.size()>0) {
					// boucle sur la liste de moto 
					 System.out.println(" LIST DES MOTOS  ");
					 Iterator<Moto> it = listMotos.iterator();
					 int i = 0;
					 while(it.hasNext()) {
						 
						 System.out.println("MOTO NUMERO "+ i);
						 System.out.println(it.next());	
						 i++;			 
						 
						 }
					 	 System.out.println("CHOISISSEZ L'INDEX DE LA MOTO DONT ON VA AUGMENTER LE KILLOMETRAGE ");	
					 	 // recupere la moto grace a son index et appelle la methode ajout kilometrage
					 	 int index;
					 	 Scanner scan = new Scanner(System.in);
					 	 index = scan.nextInt();
					 	 Moto moto = listMotos.get(index);
					 	 moto.ajoutKilometrage();
					 	 
					 	 System.out.println("killometrage  AUGMENTER !");
				}else {
					System.out.println("-------------liste vide------------");
				}
				
			}
		
			private static void suprimmermotos() {
				
				
				// boucle sur la liste de moto 
				if(listMotos.size()>0) {
					 System.out.println(" LIST DES MOTOS A  SUPRIMMER");
					 Iterator<Moto> it = listMotos.iterator();
					 int i = 0;
					 while(it.hasNext()) {
						 
						 System.out.println("MOTO NUMERO "+ i);
						 System.out.println(it.next());	
						 i++;			 
						 
						 }
					 	 System.out.println("CHOISISSEZ L'INDEX DE LA MOTO A SUPRIMMER");	
					 	 
					 	 // recupere la moto grace a son index et la suprime avec la methode remove
					 	 int index;
					 	 Scanner scan = new Scanner(System.in);
					 	 index = scan.nextInt();
					 	 listMotos.remove(index);
					 	 System.out.println("MOTO  SUPRIMMER!");
				}else {
					System.out.println("-------------liste vide------------");
				}
			}
			
			private static void afficherlesmotos() {
				// affiche les motos en bouclant sur la list des motos
				if(listMotos.size()>0) {
					for (int i = 0; i < listMotos.size(); i++) {
					      System.out.println(listMotos.get(i));}
				}else {
					System.out.println("-------------liste vide--------------");
				}
				
					    
					  
			}
		
			private static void creeretajoutermotos() {
				
				
			    System.out.println("    --choix marque-- ");
				System.out.println("1 : Davidson");
				System.out.println("2 : Harley");
				System.out.println("3 : Honda");
				System.out.println("4 : Kawasaki");
				System.out.println("5 : Suzuki ");
				System.out.println("6 : Triumph");
				System.out.println("6 : Yamaha");
				
				Marque marques = null;
				
			    int choix = 0;
			    
			    Scanner scan = new Scanner(System.in);
			    choix = scan.nextInt();
			    // propose un choix de marque a l'utilisateur 
			    
			    switch(choix) {
			    
				    case 1:
				    	 marques = Marque.Davidson;
				    	 break;
				    case 2:
				    	 marques = Marque.Harley;
				    	 break;
				    case 3:
				    	 marques = Marque.Honda;
				    	 break;
				    case 4:
				    	 marques = Marque.Kawasaki;
				    	 break;
				    case 5:
				    	 marques = Marque.Suzuki;
				    	 break;
				    case 6:
				    	 marques = Marque.Triumph;
				    	 break;
				    case 7:
				    	 marques = Marque.Yamaha;
				    	 break;
				    
					default: // 
	
						System.out.println("un chiffre entre 0 et 7 ");
						break;
						
			    	}
			    
			    System.out.println("modele"); 
			    Scanner scan2 = new Scanner(System.in);
			    String modele = scan2.nextLine();
			    
			    System.out.println("annee"); 
			    int annee = scan2.nextInt();
			    scan.nextLine();
			    
			    
			    System.out.println("couleur"); 
			    String couleur = scan2.nextLine();
			    scan.nextLine();
			  
			    System.out.println("Kilometrage");
			    int kilometrage = scan2.nextInt();
			    
			    Moto Moto = new Moto(marques,modele,annee,couleur,kilometrage);
			    listMotos.add(Moto);
			    System.out.println("Moto cree!");
			}
}

