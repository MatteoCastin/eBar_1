package be.iesca.usecaseimpl;

import be.iesca.dao.BiereDao;
import be.iesca.daoimpl.*;
import be.iesca.domaine.Biere;
import be.iesca.domaine.Bundle;
import be.iesca.usecase.GestionBieres;

public class GestionBieresImpl implements GestionBieres {
	
	BiereDao biereDao = DaoFactory.getInstance().getBiereDao();

	@Override
	public void ajouterBiere(Bundle bundle) {
		if (bundle.get(Bundle.BIERE) instanceof Biere){
			if(biereDao.ajouterBiere((Biere) bundle.get(Bundle.BIERE))){
				bundle.put(Bundle.OPERATION_REUSSIE, true);
				bundle.put(Bundle.MESSAGE, "La bière à été ajoutée avec succès");
			} else {
				bundle.put(Bundle.OPERATION_REUSSIE, false);
				bundle.put(Bundle.MESSAGE, "La bière existe déjà");
			}
		}
		else {
			bundle.put(Bundle.OPERATION_REUSSIE, false);
			bundle.put(Bundle.MESSAGE, "Ceci n'est pas une bière");
		}
	}

	@Override
	public void lister(Bundle bundle) {

	}

	@Override
	public void modifierBiere(Bundle bundle) {
	}

	@Override
	public void rechercherBiere(Bundle bundle) {
	}

	@Override
	public void supprimerBiere(Bundle bundle) {
	}

}
