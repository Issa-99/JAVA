package gestionnaireChalet;
import java.util.Arrays;
import java.util.Scanner;

import gestionnaireChalet.Chalet;
import gestionnaireChalet.Employes;
public class GestionCentreLocation {
	final static String  motDePasse ="chaletsTroisRivieres24";
	
	static Chalet[] listeChalet = {
			new Chalet("chaletbelleville","ville1","rue24",3,true,true),
			new Chalet("chaletbellemare","v353","rue2554",3,true,true),
			new Chalet("chaletmarie","v3713","rue2554",3,false,true),
			new Chalet("chaletvert","v37134","rue2554",3,false,true)
			};
			
	static Employes[] listeEmployes = {
		    new Employes("sam", "saf", 111111,4555, "Montreal", new int[]{1, 0, 1, 0, 1, 0, 0},new Chalet[]{listeChalet[0]}),
		    new Employes("samir", "oblack", 222222,5633, "Montreal", new int[]{1, 0, 1, 0, 1, 0, 0},new Chalet[]{listeChalet[1]}),
		    new Employes("sameantah", "piere", 333333,3314, "Montreal", new int[]{1, 0, 1, 0, 1, 0, 0},new Chalet[]{listeChalet[0]})
		    };
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
		int choix = 0;
		boolean arret = false;
		Scanner scan = new Scanner(System.in);

		while (!arret) // cette boucle permet de boucler tant que l'utilisateur ne quitte pas le menu
		{
			System.out.println("    -- Menu Principale -- ");
			System.out.println("1 :	Menu employé");
			System.out.println("2 :	Menu propriétaire");	
			System.out.println("0 :	Quitter le menu ");
			
			
	
			choix = scan.nextInt();
			
			
			
			switch (choix) // ce switch permet d'effectuer les actions relatives aux choix
			{
			
			// sous menu employees
			
			case 1:
				// verifier si le id entrer corrrespond a un employer
					System.out.println("entrez votre id");
					int idEmployer = scan.nextInt();
					for (Employes employe : listeEmployes) {
				    boolean id = employe.getIdEmployes() == idEmployer;     
				   
				if( id == true) {
				    	
	
					int choix1 = 0;
					boolean arret1 = false;
					Scanner scan1 = new Scanner(System.in);

					while (!arret1) // cette boucle permet de boucler tant que l'utilisateur ne quitte pas le menu
					{
						
						System.out.println("1 :	disponibilités");
						System.out.println("2 :	Modifier mes disponibilités");	
						System.out.println("3 :	Consulter mes chalets associés ");
						System.out.println("4 :	voir  mon salaire");
						System.out.println("0 :	Quitter le menu ");
						
						Scanner scan3 = new Scanner(System.in);
						choix1 = scan3.nextInt();
						
						switch (choix1) // ce switch permet d'effectuer les actions relatives aux choix
						{
						case 1:

							voirdisponibilités(idEmployer);
							
							break;

						case 2:
							Modifierdisponibilités(idEmployer);
						
							break;
							
						case 3:
							Consultermeschaletsassociés(idEmployer);
							
							break;
							
						case 4:

							afficherSalaire(idEmployer);
							
							break;

						case 0:

							arret1 = true;
							break;

						default: // si un chiffre autre que 0-1-2-3-4 est entre

							System.out.println("entrez un choix entre 0 et 4 ");
							
							break;
						}
	
					}
					
					
				    }else {
				    	//System.out.println("incorrect");
						
				    }
				    
			}break;		
				
				
				// sous menu employees proprietaire 
			case 2:
				
				// verifier si le mdp entrer corrrespond 
				System.out.println("entrez votre mot de Passe");
				Scanner scan3 = new Scanner(System.in);
				String motdePasses = scan3.next();
				boolean verification = motdePasses.equals(motDePasse) ;
			    if(verification == true) {
			    	
			    	int choix2 = 0;
					boolean arret2 = false;
					Scanner scan2 = new Scanner(System.in);
	
					while (!arret2) // cette boucle permet de boucler tant que l'utilisateur ne quitte pas le menu
					{
						
						System.out.println(" :------Menu propriétaire-------");
						System.out.println("1 :	liste employés ");
						System.out.println("2 :	liste chalets");
						System.out.println("3 :	Afficher le nombre d’employés");
						System.out.println("4 :	Afficher le nombre de chalets ");
						System.out.println("5 :	Gérer les employés(ajout ou suppression)");
						System.out.println("6 :	Gérer les chalets(ajout ou suppression)");
						System.out.println("7 :	Modifier le salaire d’un employé ");
						System.out.println("8 :	Comparer deux employés selon leurs salaires");
						System.out.println("9:	Afficher les disponibilités d’un employé ");
						System.out.println("10:	Afficher les chalets associés à un employé");
						System.out.println("11:	Gérer les chalets associés aux employés (ajout et suppression)");
						System.out.println("12:	Mettre un chalet en location ou libre pour la location");
						System.out.println("0 :	Quitter le menu ");
						
				
						choix2 = scan2.nextInt();
						
						
						
						switch (choix2) // ce switch permet d'effectuer les actions relatives aux choix
						{
						case 1:
							listeemployes(listeEmployes);
							
							break;
	
						case 2:
							listechalets();
							
							break;
	
						case 3:
							afficherleNombrEemployes(listeEmployes);
							
						    break;
						    
						case 4:
							afficherleNombreChalets(listeChalet);
							
							break;
							
						case 5:
							gestionEmployes(listeEmployes);
							listeEmployes = gestionEmployes(listeEmployes);
							break;
							
						case 6:
							
							
							break;
							
						case 7:
	
							ModifierLeSalaireEmploye();
							break;
							
						case 8:
							
							compareraisonDesSalaires();
							
							break;
							
						case 9:
							AfficherlesDisponibilitésEmploye();
							
							break;
							
						case 10:
							AfficherLesChaletsAssociesaunemploye();
							
							break;
							
						case 11:
							
							
							break;
							
						case 12:
							
							statutChalet();
							
							break;
							
						
						case 0:
	
							arret2 = true;
							
							break;
	
						default: // si un chiffre autre que 0 et 13 est entrer
	
							System.out.println("entrez un choix entre 0 et 13");
							break;
	
						}

					}
				break;
			    	
			    }else {
			    	System.out.println(" mot de Passe incorrect");
			    }break;
			    
					
			case 0:

				arret = true;
				break;

				default: // si un chiffre autre que 0-1-2 est entrer

				System.out.println("entrez un choix entre 0 et 2 ");
				break;

			}
			
			System.out.println();
		}

		System.out.println("Fin du programme");
		
	}



private static void compareraisonDesSalaires() {

	listeemployes(listeEmployes);
	System.out.println("-- Saissisez l'id de l'employer 1 --");
	
	Scanner scan7 = new Scanner(System.in);
	int idEmployer1 = scan7.nextInt();	
	
	 for (Employes employes : listeEmployes) {
	        if (employes.getIdEmployes()==idEmployer1){
	        	
	        	System.out.println("-- Saissisez l'id de l'employer 2 --");
	        	Scanner scan8 = new Scanner(System.in);
	        	int idEmployer2 = scan8.nextInt();
	        	for(Employes employes2 : listeEmployes) {
	        		
	        		if(employes2.getIdEmployes()==idEmployer2) {
		        		
	        			int comparaison = employes.compareTo(employes2);
	        			
	        		     if (comparaison < 0) {
	        		            System.out.println(employes.getNomEmploye() + " gagne moins que " + employes2.getNomEmploye());
	        		        } else if (comparaison > 0) {
	        		            System.out.println(employes.getNomEmploye() + " gagne plus que " + employes2.getNomEmploye());
	        		        } else {
	        		            System.out.println(employes.getNomEmploye() + " et " + employes2.getNomEmploye() + " ont le même salaire");
	        		        }
	        		    }
		        	}
	        	}
					
	        	
	            }
	 }




private static void statutChalet() {
// TODO Auto-generated method stub
	listechalets();
	System.out.println("-- Saissisez le nom du chalet du Chalet --");
	
	Scanner scan6 = new Scanner(System.in);
	String nomChalet = scan6.next();
	
	 for (Chalet chalets : listeChalet) {
	        if (chalets.getNom().equals(nomChalet)){
	        	
	        	System.out.println("-- modifier le statut saisir /'true/' pour en location et /'false/' pour libre  --");
	        	Scanner scan5 = new Scanner(System.in);
				boolean statutchalet = scan5.nextBoolean();
				chalets.setStatutLocation(statutchalet);
	            System.out.println("statut modifier");    	
	            }
	 }
}


private static void ModifierLeSalaireEmploye() {
	listeemployes(listeEmployes);
	System.out.println("-- Saissisez l'id de l'employer --");
	Scanner scan4 = new Scanner(System.in);
	int idEmployer = scan4.nextInt();
	
	
	  for (Employes employe : listeEmployes) {
	        if (employe.getIdEmployes() == idEmployer) {
	        	
	        	System.out.println("-- Saissisez le nouveau salaire --");
	        	Scanner scan5 = new Scanner(System.in);
				float nouveauSalaire = scan5.nextFloat();
	        	employe.setSalaireEmployes(nouveauSalaire);
	            System.out.println("salaire modifier");
	            
	         
	            	
	            }

	        }
	       }

private static void AfficherLesChaletsAssociesaunemploye() {
	System.out.println("-- Saissisez l'id de l'employer --");
	Scanner scan4 = new Scanner(System.in);
	int idEmployer;
	idEmployer = scan4.nextInt();
	
	for (Employes employe : listeEmployes) {
        if (employe.getIdEmployes() == idEmployer) {
            Chalet[] chalets = employe.getChalets();
            System.out.println("chalets Associés :");
            
            for (int i = 0; i < chalets.length; i++) {
            	
           
            	 System.out.println(chalets[i]);	
           
            	
            }
            return;
          }
    	 }
       }
	

private static void AfficherlesDisponibilitésEmploye() {
	System.out.println("-- Saissisez l'id de l'employer --");
	Scanner scan4 = new Scanner(System.in);
	int idEmployer;
	idEmployer = scan4.nextInt();
	
	 for (Employes employe : listeEmployes) {
	        
			if (employe.getIdEmployes() == idEmployer) {
	            int[] disponibilites = employe.getDisponibilites();
	            System.out.println("Disponibilités de l'employé :");
	            
	            for (int i = 0; i < disponibilites.length; i++) {
	            	
	            	if(disponibilites[i]== 1) {
	            		System.out.println("Jour " + (i) + " : " + "Non Disponible");
	            		
	            		
	            	}else {
	            		System.out.println("Jour " + (i) + " : " + "Disponible");
	            		
	            	}
	            	
	            }
			}
	 }
}


private static Employes[] gestionEmployes(Employes[] listeEmployes) {
Scanner scanner = new Scanner(System.in);
System.out.println("1. Ajouter un nouvel employé");
System.out.println("2. Supprimer un employé");
System.out.println("0. Quittez");
int choix = scanner.nextInt();
scanner.nextLine();

switch (choix) {
    case 1:

    	listeemployes(listeEmployes);
            
        Employes[] tab = new Employes [listeEmployes.length+1 ];
        
        
        System.out.println("remplir les informations");
        System.out.println("nom Employe"); 
        Scanner scan2 = new Scanner(System.in);
        String nomEmploye = scan2.nextLine();
        
        System.out.println("prenom Employe"); 
        String prenomEmploye = scan2.nextLine();
        
        System.out.println("id Employes");
        int idEmployes = scan2.nextInt();
        
        System.out.println("salaire Employes");
        float salaireEmployes = scan2.nextFloat();
        
        
        System.out.println("ville Employe"); 
        Scanner scan3 = new Scanner(System.in);
        String villeEmploye = scan3.nextLine();
        
        Employes employe =  new Employes(nomEmploye,prenomEmploye,idEmployes,salaireEmployes, villeEmploye, new int[7],new Chalet[5]);
        
        for (int i =0; i < listeEmployes.length ; i++) {
        	tab[i] = listeEmployes[i];
        }
        
        tab[tab.length-1]=employe;
        
        
        listeEmployes = tab;

        listeemployes(listeEmployes);

        
        return listeEmployes;
     
    case 2:
    	
    	listeemployes(listeEmployes);
 	   

 	    System.out.println(("entrez l'index de l'employé à supprimer"));
 	    Scanner scan = new Scanner(System.in);
 	    int indexEmploye = scan.nextInt();

 	    for (int i = 0; i < listeEmployes.length; i++) {

 	        if (i == indexEmploye) {
 	            for (int j = i; j < listeEmployes.length - 1; j++) {
 	                listeEmployes[i] = listeEmployes[i + 1];
 	                i++;
 	            }
 	        }
 	    }

 	    tab = Arrays.copyOf(listeEmployes, listeEmployes.length - 1);

 	    listeEmployes = tab;
 	    
 	    listeemployes(listeEmployes);
 	    return listeEmployes;

    case 0:
        
        break;
    default:
        System.out.println("Choix invalide.");
        break;
}


return listeEmployes;
}
    	



private static void afficherleNombreChalets(Chalet[] listeChalet) {

System.out.println("le nombre de Chalet est "+listeChalet.length);

		}

private static void afficherleNombrEemployes(Employes[] listelisteEmployes) {
	
	System.out.println("le nombre d'employer est "+ listelisteEmployes.length);
}

private static void listechalets() {
	
	for (Chalet chalet : listeChalet) {
		  System.out.println(chalet.toString());
	          }
}

private static void listeemployes(Employes[] listeEmployes) {
		
	  for (Employes employe : listeEmployes) {
		  System.out.println(employe.toString());
	          
	  			}
	        }

private static void afficherSalaire(int idEmployer) {
    for (Employes employe : listeEmployes) {
        if (employe.getIdEmployes() == idEmployer) {
            float salaire = employe.getSalaireEmployes();
            
            System.out.println("votre salaire est de :"+salaire+"$");
           
            }
            
        }
    	return; 
    }

private static void Consultermeschaletsassociés(int idEmployer) {
	
    for (Employes employe : listeEmployes) {
        if (employe.getIdEmployes() == idEmployer) {
            Chalet[] chalets = employe.getChalets();
            System.out.println("chalets Associés :");
            
            for (int i = 0; i < chalets.length; i++) {
            	
           
            	 System.out.println(chalets[i]);	
           
            	
            }
            return;
          }
    	 }
       }

private static void Modifierdisponibilités(int idEmployer) {
	System.out.println("liste des jours  ");
	  for (Employes employe : listeEmployes) {
	        if (employe.getIdEmployes() == idEmployer) {
	            int[] disponibilites = employe.getDisponibilites();
	            System.out.println("Disponibilités de l'employé :");
	            
	            for (int i = 0; i < disponibilites.length; i++) {
	            	
	            	if(disponibilites[i]== 1) {
	            		System.out.println("Jour " + (i) + " : " + "Non Disponible");
	            		
	            		
	            	}else {
	            		System.out.println("Jour " + (i) + " : " + "Disponible");
	            		
	            	}
	            	
	            }
	            System.out.println("choisisez le jour a modifier ");
	            
	            Scanner scan = new Scanner(System.in);
				int jouraodifier = scan.nextInt();
				System.out.println("choisisez la modification 1 => non disponible || 0 => disponible");
				int modification  = scan.nextInt();
				disponibilites[jouraodifier] = modification ;	
				System.out.println("Modification effectuer");
	           
	            
	        }
	        
	    }
	  return; 
    }

private static void voirdisponibilités(int idEmployer) {
    for (Employes employe : listeEmployes) {
        if (employe.getIdEmployes() == idEmployer) {
            int[] disponibilites = employe.getDisponibilites();
            System.out.println("Disponibilités de l'employé :");
            
            for (int i = 0; i < disponibilites.length; i++) {
            	
            	if(disponibilites[i]== 1) {
            		System.out.println("Jour " + (i) + " : " + "Non Disponible");
            		
            		
            	}else {
            		System.out.println("Jour " + (i) + " : " + "Disponible");
            		
               }
            }    
          }
       }   
    }
}
