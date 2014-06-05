package tn.edu.esprit.cinfo.jendoubimedaymen.tests;

import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Adresse;
import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Bureau;
import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Chercheur;
import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Laboratoire;

public class TestPlateforme {

	public static void main(String[] args) {

		// creation d'une adresse
		Adresse adresse = new Adresse(1, "Tunis", "Tunis");

		// creation d'un laboratoire avec l'adresse cree
		Laboratoire laboratoire = new Laboratoire();
		laboratoire.setSpecialite("Recherche et Développement");
		laboratoire.setNom("Intuitiv Tech");
		laboratoire.setAdresse(adresse);

		// creation de deux bureau
		Bureau bureau = new Bureau("informatique", 1);

		Bureau bureau2 = new Bureau("telecome", 2);

		// insertion deux bureaux
		System.out.println("resultat d'insertion d'un bureau"
				+ laboratoire.insertBureauInToThisLaboratoire(bureau));
		System.out.println("resultat d'insertion d'un bureau"
				+ laboratoire.insertBureauInToThisLaboratoire(bureau2));

		// Création de 2 chercheur
		Chercheur chercheur = new Chercheur("Aymen", 120, "développeur");
		Chercheur chercheur2 = new Chercheur("Takwa", 101, "Développeur");

		// Affectation des chercheurs au bureau
		System.out.println("resultat d'insertion d'un chercheur"
				+ bureau.insertChercheurIntoThisBureau(chercheur));
		System.out.println("resultat d'insertion d'un chercheur"
				+ bureau.insertChercheurIntoThisBureau(chercheur2));

		System.out.println("le bureau saturé : "
				+ laboratoire.findTheFullOffice());
	}

}
