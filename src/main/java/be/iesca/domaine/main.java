package be.iesca.domaine;

import be.iesca.daoimpl.BiereDaoMockImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        BiereDaoMockImpl bdmi = new BiereDaoMockImpl();
        Biere biere1 = new Biere("Duvel Moortgat","blonde", "Duvel Blonde", "Blonde");
        Biere biere2 = new Biere("Jup", "Pils", "PilsJup", "pppppppp");


        List<Biere> list = bdmi.listerBieres();
        System.out.println(list);


    }
}
