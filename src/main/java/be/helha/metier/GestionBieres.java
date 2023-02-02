package be.helha.metier;

import be.iesca.domaine.Bundle;

public interface GestionBieres {
	
	void ajouterBiere(Bundle bundle);
	void lister(Bundle bundle);
	void modifierBiere(Bundle bundle);
	void rechercherBiere(Bundle bundle);
	void supprimerBiere(Bundle bundle);

}
