package be.iesca.domaine;

import be.iesca.daoimpl.BiereDaoMockImpl;
import be.iesca.usecase.GestionBieres;
import be.iesca.usecaseimpl.GestionBieresImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Bundle bundle = new Bundle();
        Biere biere1 = new Biere("Duvel Moortgat","blonde", "Duvel Blonde", "Blonde");
        Biere biere2 = new Biere("Jup", "Pils", "PilsJup", "pppppppp");

        GestionBieres gestionBieres = new GestionBieresImpl();

        bundle.put(biere1.getNom(), biere1);
        gestionBieres.ajouterBiere(bundle);

    }
}
