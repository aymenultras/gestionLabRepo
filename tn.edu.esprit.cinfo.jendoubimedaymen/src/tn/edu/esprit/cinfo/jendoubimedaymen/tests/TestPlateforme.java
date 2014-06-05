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
		laboratoire.setSpecialite("Recherche et D�veloppement");
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

		// Cr�ation de 2 chercheur
		Chercheur chercheur = new Chercheur("Aymen", 120, "d�veloppeur");
		Chercheur chercheur2 = new Chercheur("Takwa", 101, "D�veloppeur");

		// Affectation des chercheurs au bureau
		System.out.println("resultat d'insertion d'un chercheur"
				+ bureau.insertChercheurIntoThisBureau(chercheur));
		System.out.println("resultat d'insertion d'un chercheur"
				+ bureau.insertChercheurIntoThisBureau(chercheur2));

		System.out.println("le bureau satur� : "
				+ laboratoire.findTheFullOffice());
	}

}
