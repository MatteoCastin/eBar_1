package be.iesca.daoimpl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
	public List<Biere> listerBieres() {
		return mapBieres.values().stream().toList();
	}

	@Override
	public boolean supprimerBiere(String nom) {
		return !(mapBieres.remove(nom) == null);
	}

	@Override
	public boolean modifierBiere(Biere biere) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private class ComparateurBieres implements Comparator<String> {
		@Override
		public int compare(String nom1, String nom2) {
		return nom1.compareTo(nom2);
		}
		}

}
