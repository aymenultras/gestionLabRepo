package tn.edu.esprit.cinfo.jendoubimedaymen.domain;

import java.util.Arrays;

public class Bureau {

	private String nom;
	private int code;
	private static final int NB_MAX_CHERCHEUR = 5; 
	private Chercheur[] chercheurs = new Chercheur[NB_MAX_CHERCHEUR];
	
	public Bureau() {

	}

	public Bureau(String nom, int code, Chercheur[] chercheurs) {
		super();
		this.nom = nom;
		this.code = code;
		this.chercheurs = chercheurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(chercheurs);
		result = prime * result + code;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Bureau other = (Bureau) obj;
		if (!Arrays.equals(chercheurs, other.chercheurs))
			return false;
		if (code != other.code)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bureau [nom=" + nom + ", code=" + code + ", chercheurs="
				+ Arrays.toString(chercheurs) + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Chercheur[] getChercheurs() {
		return chercheurs;
	}

	public void setChercheurs(Chercheur[] chercheurs) {
		this.chercheurs = chercheurs;
	}

	public static int getNbMaxChercheur() {
		return NB_MAX_CHERCHEUR;
	}

}
