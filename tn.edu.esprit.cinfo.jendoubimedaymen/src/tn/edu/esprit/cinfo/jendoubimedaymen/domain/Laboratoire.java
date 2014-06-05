package tn.edu.esprit.cinfo.jendoubimedaymen.domain;

import java.util.Arrays;

public class Laboratoire {

	private String nom;
	private String specialite;
	private static final int NB_MAX_BUREAU = 5;
	private Bureau[] bureaus = new Bureau[NB_MAX_BUREAU];
	private Adresse adresse;
	private int nb_bureaux = 0;

	public Laboratoire() {

	}

	public Laboratoire(String nom, String specialite, Bureau[] bureaus,
			Adresse adresse) {
		super();
		this.nom = nom;
		this.specialite = specialite;
		this.bureaus = bureaus;
		this.adresse = adresse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + Arrays.hashCode(bureaus);
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result
				+ ((specialite == null) ? 0 : specialite.hashCode());
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
		Laboratoire other = (Laboratoire) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (!Arrays.equals(bureaus, other.bureaus))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (specialite == null) {
			if (other.specialite != null)
				return false;
		} else if (!specialite.equals(other.specialite))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laboratoire [nom=" + nom + ", specialite=" + specialite
				+ ", bureaus=" + Arrays.toString(bureaus) + ", adresse="
				+ adresse + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Bureau[] getBureaus() {
		return bureaus;
	}

	public void setBureaus(Bureau[] bureaus) {
		this.bureaus = bureaus;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public static int getNbMaxBureau() {
		return NB_MAX_BUREAU;
	}

	public boolean insertBureauInToThisLaboratoire(Bureau bureau) {
		if (nb_bureaux < NB_MAX_BUREAU) {
			bureaus[nb_bureaux] = bureau;
			nb_bureaux++;
			return true;
		} else {
			return false;
		}
	}

	public Bureau findTheFullOffice() {

		Bureau fullOffice = bureaus[0];
		for (Bureau b : bureaus) {
			if (b != null) {
				if (b.getNb_Chercheur() > fullOffice.getNb_Chercheur()) {
					fullOffice = b;
				}
			}
		}
		return fullOffice;
	}

	public Bureau findTheEmptyOffice() {

		Bureau emptyOffice = bureaus[0];

		for (Bureau b : bureaus) {
			if (b != null) {
				if (b.getNb_Chercheur() < emptyOffice.getNb_Chercheur()) {
					emptyOffice = b;
				}
			}
		}
		return emptyOffice;
	}

}
