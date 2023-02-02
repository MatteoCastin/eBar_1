package be.iesca.daoimpl;

import java.util.*;

import be.iesca.dao.BiereDao;
import be.iesca.domaine.Biere;

public class BiereDaoMockImpl implements BiereDao {
	
	private Map<String, Biere> mapBieres;
	
	public BiereDaoMockImpl() {
		Comparator<String> comp = new ComparateurBieres();
		this.mapBieres = new TreeMap<>(comp);
	}
	
	@Override
	public boolean ajouterBiere(Biere biere) {
		return mapBieres.putIfAbsent(biere.getNom(),biere) == null;
	}

	@Override
	public Biere getBiere(String nom) {
		return mapBieres.get(nom);
	}

	@Override
	public List<Biere> listerBieres() { return new ArrayList<>(mapBieres.values());}

	@Override
	public boolean supprimerBiere(String nom) { return !(mapBieres.remove(nom) == null);}

	@Override
	public boolean modifierBiere(Biere biere) { return !(mapBieres.replace(biere.getNom(), biere) == null);	}
	
	private class ComparateurBieres implements Comparator<String> {
		@Override
		public int compare(String nom1, String nom2) {
		return nom1.compareTo(nom2);
		}
		}

}
