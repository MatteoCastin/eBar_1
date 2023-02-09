package be.iesca.domaine;

import be.iesca.dao.BiereDao;
import be.iesca.daoimpl.DaoFactory;

import java.sql.SQLException;

public class main {
    public static void main(String[] args){
        Biere biere1 = new Biere("Duvel Moortgat","blonde", "Duvel Blonde", "Blonde");
        Biere biere2 = new Biere("Jup", "Pils", "PilsJup", "pppppppp");
        BiereDao biereDao = DaoFactory.getInstance().getBiereDao();
        try{
            biereDao.ajouterBiere(biere1);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
