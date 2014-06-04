package tn.edu.esprit.cinfo.jendoubimedaymen.tests;

import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Adresse;
import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Bureau;
import tn.edu.esprit.cinfo.jendoubimedaymen.domain.Laboratoire;

public class TestPlateforme {

	public static void main(String[] args) {
		
		//creation d'une adresse
		Adresse adresse = new Adresse(1, "Tunis", "Tunis");

		//creation d'un laboratoire avec l'adresse cree
		Laboratoire laboratoire= new Laboratoire();
		laboratoire.setSpecialite("Recherche et Développement");
		laboratoire.setNom("Intuitiv Tech");
		laboratoire.setAdresse(adresse);
		
		Bureau bureau=new Bureau("informatique",1);
		
		Bureau bureau2 = new Bureau();

	}

}
