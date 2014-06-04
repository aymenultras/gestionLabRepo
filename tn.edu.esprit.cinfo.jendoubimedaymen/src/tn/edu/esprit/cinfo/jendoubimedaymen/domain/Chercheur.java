package tn.edu.esprit.cinfo.jendoubimedaymen.domain;

public class Chercheur {

	private String nom;
	private int num_ordinateur;
	private String poste;

	public Chercheur() {
		
	}

	public Chercheur(String nom, int num_ordinateur, String poste) {
		super();
		this.nom = nom;
		this.num_ordinateur = num_ordinateur;
		this.poste = poste;
	}

	@Override
	public String toString() {
		return "Chercheur [nom=" + nom + ", num_ordinateur=" + num_ordinateur
				+ ", poste=" + poste + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + num_ordinateur;
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chercheur other = (Chercheur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (num_ordinateur != other.num_ordinateur)
			return false;
		if (poste == null) {
			if (other.poste != null)
				return false;
		} else if (!poste.equals(other.poste))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNum_ordinateur() {
		return num_ordinateur;
	}

	public void setNum_ordinateur(int num_ordinateur) {
		this.num_ordinateur = num_ordinateur;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

}
