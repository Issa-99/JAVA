
/*
Devoir 4
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
package gestionnaireChalet;

import java.util.Arrays;

public class Employes implements Comparable<Employes> {
	

	
	private String nomEmploye;
	private String prenomEmploye;
	private int idEmployes;
	private float salaireEmployes;
	private String villeEmploye;
	private int[] disponibilites;
	private Chalet[] chalets;
	
	// constucteur
	
	public Employes(String nomEmploye, String prenomEmploye, int idEmployes, float salaireEmployes, String villeEmploye,
			int[] disponibilites, Chalet[] chalets) {
		super();
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.idEmployes = idEmployes;
		this.salaireEmployes = salaireEmployes;
		this.villeEmploye = villeEmploye;
		this.disponibilites = disponibilites;
		this.chalets = chalets;
		

	}



	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public String getPrenomEmploye() {
		return prenomEmploye;
	}

	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}

	public int getIdEmployes() {
		return idEmployes;
	}

	public void setIdEmployes(int idEmployes) {
		this.idEmployes = idEmployes;
	}

	public float getSalaireEmployes() {
		return salaireEmployes;
	}

	public void setSalaireEmployes(float salaireEmployes) {
		this.salaireEmployes = salaireEmployes;
	}

	public String getVilleEmploye() {
		return villeEmploye;
	}

	public void setVilleEmploye(String villeEmploye) {
		this.villeEmploye = villeEmploye;
	}

	public int[] getDisponibilites() {
		return this.disponibilites;
	}

	public void setDisponibilites(int[] disponibilites) {
		this.disponibilites = disponibilites;
	}

	public Chalet[] getChalets() {
		return chalets;
	}

	public void setChalets(Chalet[] chalets) {
		this.chalets = chalets;
	}

	  
	interface Comparable {
		
	}
	//
	public int compareTo(Employes autreEmploye) {
	    // Convertir les salaires en Float
	    Float salaire1 = Float.valueOf(this.salaireEmployes);
	    Float salaire2 = Float.valueOf(autreEmploye.salaireEmployes);
	    
	    return salaire1.compareTo(salaire2);
	}

	

	
	@Override
	public String toString() {
		return "Employes [nomEmploye=" + nomEmploye + ", prenomEmploye=" + prenomEmploye + ", idEmployes=" + idEmployes
				+ ", salaireEmployes=" + salaireEmployes + ", villeEmploye=" + villeEmploye + ", disponibilites="
				+ Arrays.toString(disponibilites) + ", chalets=" + Arrays.toString(chalets) + "]";
	}
	
	

}
