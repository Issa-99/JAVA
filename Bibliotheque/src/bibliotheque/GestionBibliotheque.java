package bibliotheque;
import java.util.Scanner;

import java.util.ArrayList;

public class GestionBibliotheque {

		private static ArrayList<Documents> listDocuments = new ArrayList<Documents>();
	
		public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        boolean arret = false;
        


      
        
        while (!arret) {
            System.out.println("    -- Menu Principal -- ");
            System.out.println("1 : Ajout et suppression de documents");
            System.out.println("2 : Afficher la liste de tous les documents");
            System.out.println("3 : Afficher les caractéristiques d'un document");
            System.out.println("4 : Afficher la liste de prix littéraires pour un roman");
            System.out.println("5 : Augmentation ou diminution du nombre de copies du document");
            System.out.println("6 : Modification du titre d'un document");
            System.out.println("7 : Modification de l'auteur d'un livre");
            System.out.println("8 : Création et ajout de documents prédéfinis");
            System.out.println("0 : Quitter le menu ");

            int choix = scan.nextInt();

            switch (choix) {
                case 1:
                    menuAjoutSuppression(listDocuments);
                    break;

                case 2:
                    afficherTousLesDocuments();
                    break;

                case 3:
                    afficherCaracteristiquesDocument();
                    break;

                case 4:
                    afficherPrixLitterairesPourRoman();
                    break;

                case 5:
                    gererNombreCopies();
                    break;

                case 6:
                    modifierTitreDocument();
                    break;

                case 7:
                    modifierAuteurLivre();
                    break;

                case 8:
                    creerDocumentsPredefinis();
                    break;

                case 0:
                    arret = true;
                    break;

                default:
                    System.out.println("Entrez un choix entre 0 et 8");
                    break;
            }

            System.out.println();
        }

        System.out.println("Fin du programme");
        scan.close();
	        
	
	}
	 public static void menuAjoutSuppression(ArrayList<Documents> listDocuments) {
	        // Mettez ici le code pour l'ajout et la suppression de documents
	        System.out.println("Ajout et suppression de documents");
	        
	        Scanner scan = new Scanner(System.in);
	        boolean arret = false;
 
	        
	        while (!arret) {
	            System.out.println("1 : Ajout a la liste de tous les documents");
	            System.out.println("2 : suppression a la liste de tous les documents");
	            System.out.println("0 : Quitter");
	            int choix = scan.nextInt();

	            switch (choix) {
	                case 1:
	                    
	                	 while (!arret) {
	         	            System.out.println("    --Type de Documents a ajouter   -- ");
	         	            System.out.println("1 : Ajout de Roman");
	         	            System.out.println("2 : Ajout de Manuel");
	         	            System.out.println("3 : Ajout de Revue");
	         	            System.out.println("4 : Ajout de Dictionnaire");
	         	            int choix2 = scan.nextInt();

	         	            switch (choix2) {
	         	                case 1:
	         	                    
	         	                    ajoutRoman();
	         	                    break;

	         	                case 2:
	         	                	ajoutManuel();
	         	                    break;
	         	                case 3:
	         	                    ajoutRevue();
	         	                    break;
	         	                case 4:
	         	                	ajoutDictionnaire();
	         	                    break;

	         	                case 0:
	         	                    arret = true;
	         	                    break;

	         	                default:
	         	                    System.out.println("Entrez un choix entre 0 et 8");
	         	                    break;
	         	            }
	                    
	                    break;
	                	 }
	                break; 
	                
	                case 2:
	                	System.out.println("Choix de l'element a supprimer");
	                	
	                	if(listDocuments.size()> 0) {
	                		
	                		   for(int i = 0; i <listDocuments.size();i++) {
	                			   System.out.println("Index : " + i +", Numero d'enregistrement : "+listDocuments.get(i).getNumeroEnregistrement() + ", Titre du documents : "+ listDocuments.get(i).getTitre());
	                		   }
	                		
	         
	                		   	 System.out.println("entrez l'index de l'elements  a supprimer");
		               		 	 int index;
							 	 Scanner scan1 = new Scanner(System.in);
							 	 index = scan1.nextInt();
							 	 Boolean validateur;
							 	 System.out.println("entrez /'true/' pour confirmer et /'false/'  pour annuler");
							 	 validateur = scan1.nextBoolean();
							 	 if(validateur==true){
							 		 listDocuments.remove(index);
								 	 System.out.println("Documents Supprimer!"); 
							 	 }else {
							 		 System.out.println("Suppression annuler!"); 
							 	 }
							 	 
							 	
					
	                	}else {
							System.out.println("-------------liste vide------------");
               			}
	                    break;


	                case 0:
	                    arret = true;
	                    break;

	                default:
	                    System.out.println("Entrez un choix entre 0 et 8");
	                    break;
	            }

	            System.out.println();
	        }
	        
	    }
	 
	 

	    private static void ajoutDictionnaire() {
	    		int choix = 0;
	    		String[] langue ={"Français","Anglais","Espagnol","Latin","Allemand"};
	    
			    
			    Scanner scan2 = new Scanner(System.in);
			    
			    System.out.println("Numero d'enregistrement"); 
			    String numeroEnregistrement = scan2.nextLine();
			    
			    while(numeroEnregistrement.length() != 9) {
			    	
			    	System.out.println("Numero d'enregistrement doit etre de 8 charatectere Chiffres et letrres"); 
				    numeroEnregistrement = scan2.nextLine();
			    }
			    
			    System.out.println("Titre"); 
			    String titre = scan2.nextLine();
			    
			    System.out.println("nbCopies"); 
			    int nbCopies = scan2.nextInt();
			    scan2.nextLine();
			    
			    System.out.println("description"); 
			    String description = scan2.nextLine();
			    
			    System.out.println("type de Document"); 
			    String typedeDocument = scan2.nextLine();
			    
			    
			    
			    System.out.println("langueDictionnaire"); 
			    System.out.println("    --choix langue-- ");
				System.out.println("1 : Français");
				System.out.println("2 : Anglais");
				System.out.println("3 : Espagnol");
				System.out.println("4 : Latin");
				System.out.println("5 : Allemand ");
				
				
			    
			    String langueDictionnaire = "valeurs Initials";
			    
			    Scanner scan1 = new Scanner(System.in);
			    choix = scan1.nextInt();
			    // propose un choix de marque a l'utilisateur 
			    
			    switch(choix) {
			    
				    case 1:
				    	langueDictionnaire = langue[0];
				    	 break;
				    case 2:
				    	langueDictionnaire = langue[1];
				    	 break;
				    case 3:
				    	langueDictionnaire = langue[2];
				    	 break;
				    case 4:
				    	langueDictionnaire = langue[3];
				    	 break;
				    case 5:
				    	langueDictionnaire = langue[4];
				    	 break;
			  
					default: // 
	
						System.out.println("un chiffre entre 0 et 5 ");
						break;
						
			    	}
			    
				    
			    
			    
			    
			    
			    Dictionnaire Dictionnaire = new Dictionnaire(numeroEnregistrement,titre,nbCopies,description,typedeDocument,langueDictionnaire);
			    
			    listDocuments.add(Dictionnaire);
			    System.out.println("Manuel cree!");
			}
	
		private static void ajoutRevue() {
    		int choix = 0;
    		Scanner scan2 = new Scanner(System.in);
    		
		    System.out.println("Numero d'enregistrement"); 
		    String numeroEnregistrement = scan2.nextLine();
		    
		    while(numeroEnregistrement.length() != 9) {
		    	
		    	System.out.println("Numero d'enregistrement doit etre de 8 charatectere Chiffres et letrres"); 
			    numeroEnregistrement = scan2.nextLine();
		    }
		    
		    System.out.println("Titre"); 
		    String titre = scan2.nextLine();
		    
		    System.out.println("nbCopies"); 
		    int nbCopies = scan2.nextInt();
		    scan2.nextLine();
		    
		    
		    System.out.println("description"); 
		    String description = scan2.nextLine();
		    
		    System.out.println("type de Document"); 
		    String typedeDocument = scan2.nextLine();
		    
		    System.out.println("mois de Publication"); 
		    String moisPublication  = scan2.nextLine();
		    
		    
		    System.out.println("annee de Publication"); 
		    int anneePublication = scan2.nextInt();
		    scan2.nextLine();    

		    Revue revue = new Revue(numeroEnregistrement,titre,nbCopies,description,typedeDocument,moisPublication,anneePublication);
		    
		    listDocuments.add(revue);
		    System.out.println("revue cree!");
		
	}
		private static void ajoutManuel() {
    		
			String[] domaine ={"Biologie", "Nutrition", "Ergonomie", "Médecine",
			"Chiropratique"};
			
			int choix = 0;
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Numero d'enregistrement"); 
		    Scanner scan2 = new Scanner(System.in);
		    String numeroEnregistrement = scan2.nextLine();
		    
		    while(numeroEnregistrement.length() != 9) {
		    	
		    	System.out.println("Numero d'enregistrement doit etre de 8 charatectere Chiffres et letrres"); 
			    numeroEnregistrement = scan2.nextLine();
		    }
		    
		    System.out.println("titre"); 
		    String titre = scan2.nextLine();
		    scan2.nextLine();
		    
		    System.out.println("nbCopies"); 
		    int nbCopies = scan2.nextInt();
		    
		    
		    System.out.println("description"); 
		    String description = scan2.nextLine();
		    scan2.nextLine();
		    
		    System.out.println("type de Document"); 
		    String typedeDocument = scan2.nextLine();
		    
		    System.out.println("nom de l'Auteur"); 
		    String nomAuteur = scan2.nextLine();
		    
		    System.out.println("nombre de Pages"); 
		    int nbPages = scan2.nextInt();
		    scan2.nextLine();
		    
		    
		    
		    
		    System.out.println("    --choix du domaine-- ");
			System.out.println("1 : Biologie");
			System.out.println("2 : Nutrition");
			System.out.println("3 : Ergonomie");
			System.out.println("4 : Médecine");
			System.out.println("5 : Chiropratique ");
			
			
		    
		    String langueDictionnaire = null;
		    Scanner scan1 = new Scanner(System.in);
		    choix = scan1.nextInt();
		    // propose un choix de domaine a l'utilisateur 
		    String domaineManuel = "valeur initial";
		    switch(choix) {
		    
			    case 1:
			    	domaineManuel = domaine[0];
			    	 break;
			    case 2:
			    	domaineManuel = domaine[1];
			    	 break;
			    case 3:
			    	domaineManuel = domaine[2];
			    	 break;
			    case 4:
			    	domaineManuel = domaine[3];
			    	 break;
			    case 5:
			    	domaineManuel = domaine[4];
			    	 break;
		  
				default: // 

					System.out.println("un chiffre entre 0 et 5 ");
					break;
					
		    	}
		    
		    Manuel manuel = new Manuel(numeroEnregistrement,titre,nbCopies,description,typedeDocument,nomAuteur,nbPages,domaineManuel);
		    
		    listDocuments.add(manuel);
		    System.out.println("Dictionnaire cree!");
		
	}
		private static void ajoutRoman() {
			
			int choix = 0;
			 Scanner scan2 = new Scanner(System.in);

		    System.out.println("Numero d'enregistrement"); 
		    String numeroEnregistrement = scan2.nextLine();
		    
		    
		    
		    while(numeroEnregistrement.length() != 9) {
		    	
		    	System.out.println("Numero d'enregistrement doit etre de 8 charatectere Chiffres et letrres"); 
			    numeroEnregistrement = scan2.nextLine();
		    }
		    
		    System.out.println("Titre"); 
		    String titre = scan2.nextLine();
		    
		    System.out.println("nbCopies"); 
		    int nbCopies = scan2.nextInt();
		    scan2.nextLine();
		    
		    
		    System.out.println("description"); 
		    String description = scan2.nextLine();
		    
		    System.out.println("type de Document"); 
		    String typedeDocument = scan2.nextLine();
		    
		    System.out.println("nomAuteur"); 
		    String nomAuteur  = scan2.nextLine();
		    
		    
		    System.out.println("nombre de Pages"); 
		    int nbPages = scan2.nextInt();
		    scan2.nextLine();
		    
		    System.out.println("prixLitterair"); 
		    String prixLitterairRoman  = scan2.nextLine();
		    
		    
		    Roman roman = new Roman(numeroEnregistrement,titre,nbCopies,description,typedeDocument,nomAuteur,nbPages,prixLitterairRoman);
		    
		    listDocuments.add(roman);
		    System.out.println("Roman cree!");
		
	}
	    
    
	    
		public static void afficherTousLesDocuments() {
			if(listDocuments.size()> 0) {
        		
     		   for(int i = 0; i <listDocuments.size();i++) {
     			   System.out.println("Index : " + i +", Numero d'enregistrement : "+listDocuments.get(i).getNumeroEnregistrement() + ", Titre du documents : "+ listDocuments.get(i).getTitre());
     		   }
			}else {
				System.out.println("-------------liste vide------------");
			}
			
			
	    }
	   public static void afficherCaracteristiquesDocument() {
	    	
	        System.out.println("Afficher les caractéristiques d'un document");
	        
			if(listDocuments.size()> 0) {
				
				String numeroEnregistrement;
				Scanner scan1 = new Scanner(System.in);
				System.out.println("entrez le Numero d'enregistrement du documets a Afficher");
				numeroEnregistrement = scan1.next();
				
				for(int i = 0; i <listDocuments.size();i++) {
					if(numeroEnregistrement.compareTo(listDocuments.get(i).getNumeroEnregistrement()) == 0) {
						System.out.println(listDocuments.get(i).toString());
						break;
					}else {
						System.out.println("Numero d'enregistrement introuvable ");
					}

     		   }
				
			}else {
				   System.out.println("-------------liste vide------------");
			}
	        
	        
	    }

	   public static void afficherPrixLitterairesPourRoman() {
		   for(int i = 0; i <listDocuments.size();i++) {
	        	
	        	if(listDocuments.get(i).getTypedeDocument().compareTo("Roman")==0) {
	        		
	        		System.out.printf ("Index "+i); System.out.printf(" Titre du Roman : "+ listDocuments.get(i).getTitre()); System.out.printf(",Auteur: " + ((Roman)listDocuments.get(i)).getNomAuteur());
	        		System.out.println("");
	        	}};
		   
	        System.out.println("Afficher la liste de prix littéraires pour un roman");
	     	
	        Scanner scan1 = new Scanner(System.in);
			
			System.out.println("entrez le nom de l'auteur");
			String auteur = scan1.nextLine();
			
			System.out.println("entrez le  titre du documets ");
			String titre = scan1.nextLine();
			
			
			boolean numeroTrouve = false; 
			boolean typeDocuments = false; 
			
	        for(int i = 0; i <listDocuments.size();i++) {
	        	
	        	if((listDocuments.get(i).getTypedeDocument() == "Roman")) {
	        	
					if((auteur.compareTo(((Livres) listDocuments.get(i)).getNomAuteur()) == 0 && titre.compareTo(listDocuments.get(i).getTitre()) == 0)) {

						System.out.println(((Roman)listDocuments.get(i)).getPrixLitterair());
						numeroTrouve = true;
					
				 }
					
	        }
				
			  }if (numeroTrouve == false) {
			        System.out.println(" introuvable");};
	
	    }


	        
	     

	    public static void gererNombreCopies() {
	        System.out.println("Augmentation ou diminution du nombre de copies du document");
	        
	        boolean numeroTrouve = false;
	        
	        if(listDocuments.size()> 0) {
        		
	     		   for(int i = 0; i <listDocuments.size();i++) {
	     			   System.out.println(listDocuments.get(i).toString());
	     		   }
				}else {
					System.out.println("-------------liste vide------------");
				}
	        
	        String numeroEnregistrement;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("entrez le Numero d'enregistrement du documets a Afficher");
			numeroEnregistrement = scan1.next();
			
			for(int i = 0; i <listDocuments.size();i++) {
				
				if(numeroEnregistrement.compareTo(listDocuments.get(i).getNumeroEnregistrement()) == 0) {
					System.out.println(listDocuments.get(i).toString());
					System.out.println("1 pour augmenter || 2 pour dimunier");		
					int choix;
					choix = scan1.nextInt();

       	            switch (choix) {
       	                case 1:
       	                    
       	                    augmenterNbcopies(listDocuments.get(i), i, scan1);
       	                    
       	                    break;

       	                case 2:
       	                	diminuerNbcopies(listDocuments.get(i), i, scan1);
       	                    break;
       	                default:
       	                    System.out.println("mauvais choix");
       	                    break;
       	          
       	            }
	       	         numeroTrouve = true; // Mettez à jour le statut du numéro trouvé
	                 break;
					
				 }
				
			  }
				if (!numeroTrouve) {
			        System.out.println("Numero d'enregistrement introuvable");
				}
 		   }
	
	   

	    
	    private static void diminuerNbcopies(Documents documents, int i, Scanner scan1) {
	    	
	    	System.out.println("combien de copie a Dimunier ? ");
	    	int nbCopies;
			nbCopies = scan1.nextInt();
			listDocuments.get(i).reductionNbCopies(nbCopies);
			System.out.println("Dimunier!");
			System.out.println(listDocuments.get(i).toString());
	    	
			
			
	    	
			
		}
		private static void augmenterNbcopies(Documents documents, int i, Scanner scan1) {
			System.out.println("combien de copie a augmenter ? ");
	    	
	    	int nbCopies;
			nbCopies = scan1.nextInt();
			listDocuments.get(i).ajoutNbCopies(nbCopies);
			System.out.println("Ajouter!");
			System.out.println(listDocuments.get(i).toString());
			
			
		}
		
		
		
		public static void modifierTitreDocument() {
	        System.out.println("Modification du titre d'un document");
	        
	        if(listDocuments.size()> 0) {
        		
	     		   for(int i = 0; i <listDocuments.size();i++) {
	     			   System.out.println(listDocuments.get(i).toString());
	     		   }
				}else {
					System.out.println("-------------liste vide------------");
				}
				
			        	
			       		 
	     			Scanner scan1 = new Scanner(System.in);
	     			
	     			System.out.println("entrez le Numero d'enregistrement du documets");
	     			String numeroEnregistrement = scan1.nextLine();
	     			
	     			System.out.println("entrez le  titre du documets ");
	     			String titre = scan1.nextLine();

	     			
	     			boolean numeroTrouve = false; 
	     			
					for(int i = 0; i <listDocuments.size();i++) {
						
						
	     				if((numeroEnregistrement.compareTo(listDocuments.get(i).getNumeroEnregistrement()) == 0 && titre.compareTo(listDocuments.get(i).getTitre()) == 0)) {

	     						System.out.println(listDocuments.get(i).toString());
	     						
	     						
	     						System.out.println("entrez le nouveau titre du documets ");
	     		     			
	     						String titre1 = scan1.nextLine();;
	     						
	     						System.out.println("entrez /'true/' pour confirmer et /'false/'  pour annuler");
	     						
							 	 boolean validateur = scan1.nextBoolean();
							 	 
							 	 if(validateur==true){
							 		listDocuments.get(i).setTitre(titre1);
								 	 System.out.println("Titre modifier"); 
							 	 }else {
							 		 System.out.println("modification annuler"); 
							 	 }
	     						
	     						
	     						
	     						System.out.println(listDocuments.get(i).toString());
	     						
	     					
	     					
     	       	         numeroTrouve = true; // Mettez à jour le statut du numéro trouvé
	     	                 break;
	     					
	     				 }
	     				
	     			  }if (!numeroTrouve) {
	     			        System.out.println("Numero d'enregistrement introuvable");
	     				}
	     				
	      		   }
	     	
	        

		
	    public static void modifierAuteurLivre() {
	        
	        System.out.println("Modification de l'auteur d'un livre");
	              if(listDocuments.size()> 0) {
        		
	     		   for(int i = 0; i <listDocuments.size();i++) {
	     			   System.out.println(listDocuments.get(i).toString());
	     		   }
				}else {
					System.out.println("-------------liste vide------------");
				}
				
			        	
			       		 
	     			Scanner scan1 = new Scanner(System.in);
	     			
	     			System.out.println("entrez le nom de l'auteur");
	     			String auteur = scan1.nextLine();
	     			
	     			System.out.println("entrez le  titre du documets ");
	     			String titre = scan1.nextLine();

	     			
	     			boolean numeroTrouve = false; 
	     			boolean typeDocuments = false; 
	     			
					for(int i = 0; i <listDocuments.size();i++) {
						
						
						typeDocuments = true;
							
	     				if((auteur.compareTo(((Livres) listDocuments.get(i)).getNomAuteur()) == 0 && titre.compareTo(listDocuments.get(i).getTitre()) == 0)) {

	     						System.out.println(listDocuments.get(i).toString());
	     						
	     						
	     						System.out.println("entrez le nouveau nom d'auteur du  Livre ");
	     		     			
	     						String auteur1 = scan1.nextLine();;
	     						
	     						System.out.println("entrez /'true/' pour confirmer et /'false/'  pour annuler");
	     						
							 	 boolean validateur = scan1.nextBoolean();
							 	 
							 	 if(validateur==true){
							 		 
							 		((Livres) listDocuments.get(i)).setNomAuteur(auteur1);
							 		
								 	 System.out.println("Nom modifier"); 
							 	 }else {
							 		 System.out.println("modification annuler"); 
							 	 }
	     						
	     						
	     						
	     						System.out.println(listDocuments.get(i).toString());
	     						
	     					
	     					
     	       	         numeroTrouve = true; // Mettez à jour le statut du numéro trouvé
	     	                 break;
	     					
	     				 }
	     				
	     			  }if (numeroTrouve == false) {
	     			        System.out.println(" introuvable");
	     				}
					
					
	    }

	    
	    
	    public static void creerDocumentsPredefinis() {
	    	Manuel manue1 = new Manuel("M123ABCD", "Manuel d'histoire", 50, "Un guide complet d'histoire", "Manuel",
	    			"Jean Dupont", 300, "Histoire");
	    	Manuel manue2 = new Manuel("X987ZYXW", "Manuel de mathématiques", 30, "Un guide pour les mathématiques avancées", "Manuel",
                    "Sophie Martin", 250, "Mathématiques");
	    	Roman roman1 = new Roman("R567PQRS", "Les Misérables", 100, "L'histoire émouvante de Jean Valjean", "Roman",
                    "Victor Hugo", 600, "Prix Goncourt");
	    	Roman roman2 = new Roman("B321JKLM", "Harry Potter à l'école des sorciers", 80, "Le premier livre de la série Harry Potter", "Roman",
                    "J.K. Rowling", 400, "Prix Hugo");
	    	Revue revue1 = new Revue("E246WXYZ", "National Geographic", 200, "Magazine d'exploration et de découvertes", "Revue",
                    "Avril", 2024);
	    	Revue revue2 = new Revue("F789UVWX", "Science et Vie", 150, "Magazine de science", "Revue",
                    "Mars", 2024);
	    	Dictionnaire dictionnaire1 = new Dictionnaire("D456QRST", "Dictionnaire Français", 75, "Dictionnaire de la langue française", "Dictionnaire",
                    "Français");
	    	Dictionnaire dictionnaire2 = new Dictionnaire("K654OPQR", "Oxford English Dictionary", 60, "The definitive record of the English language", "Dictionnaire",
                    "Anglais");
	    	listDocuments.add(manue1);
	    	listDocuments.add(manue2);
	    	listDocuments.add(roman1);
	    	listDocuments.add(roman2);
	    	listDocuments.add(revue1);
	    	listDocuments.add(revue2);
	    	listDocuments.add(dictionnaire1);
	    	listDocuments.add(dictionnaire2);

	    	System.out.println("8 Documents crees !");
	    }
}
