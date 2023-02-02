package be.iesca.dao;

import java.util.List;

import be.iesca.domaine.*;

public interface BiereDao {
	
	boolean ajouterBiere(Biere biere);
	Biere getBiere(String nom);
	List<Biere> listerBieres();
	boolean supprimerBiere(String nom);
	boolean modifierBiere(Biere biere);
}
