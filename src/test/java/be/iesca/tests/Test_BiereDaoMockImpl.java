package be.iesca.tests;

import be.iesca.daoimpl.BiereDaoMockImpl;
import
        be.iesca.domaine.Biere;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test_BiereDaoMockImpl {
    BiereDaoMockImpl bdmi = new BiereDaoMockImpl();

    Biere biere1 = new Biere("Duvel Moortgat","blonde", "Duvel Blonde", "Blonde");
    Biere biere2 = new Biere("Jup", "Pils", "PilsJup", "pppppppp");


    public void setUp(){
        bdmi.ajouterBiere(biere1);
        bdmi.ajouterBiere(biere2);
    }

    @Test
    @Order(1)
    public void TestAjouterBiereOk(){
        Assertions.assertTrue(bdmi.ajouterBiere(biere1));
    }

    @Test
    @Order(2)
    public void TestAjouterNotOk(){
        setUp();
        Assertions.assertFalse(bdmi.ajouterBiere(biere1));
    }

    @Test
    @Order(3)
    public void TestGet (){
        setUp();
        Assertions.assertEquals(bdmi.getBiere("Duvel Blonde"),biere1);
    }

    @Test
    @Order(3)
    public void TestLister(){
        setUp();
        List<Biere> listBieres = bdmi.listerBieres();
        Assertions.assertEquals(listBieres.get(1), biere2);
    }

    @Test
    @Order(4)
    public void testRemoveOk(){
        setUp();
        bdmi.supprimerBiere(biere1.getNom());
        List<Biere> listBieres = bdmi.listerBieres();
        Assertions.assertEquals(listBieres.get(0), biere2);
    }

    @Test
    @Order(5)
    public void testModifierOk(){
        Biere biereModif = new Biere("Duvel Moortgat","blonde", "Duvel Blonde", "Rouge");
        setUp();
        Assertions.assertTrue(bdmi.modifierBiere(biereModif));
    }


    @Test
    @Order(6)
    public void testModifierNotOk(){
        Biere biereModif = new Biere("Duvel Moortgat","blonde", "Duvel", "Rouge");
        setUp();
        Assertions.assertFalse(bdmi.modifierBiere(biereModif));
    }

}
