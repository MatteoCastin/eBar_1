package be.iesca.daoimpl;

import be.iesca.dao.BiereDao;
import be.iesca.domaine.Biere;

import java.sql.*;
import java.util.List;

public class BiereDaoImpl implements BiereDao {

    public static final String GET = "message";
    public static final String AJOUT = "message";
    public static final String MAJ = "message";
    public static final String LISTER = "message";
    public static final String SUPPRIMER = "message";

    DaoFactory daoFactory;

    public BiereDaoImpl(DaoFactory daoFactory){
        this.daoFactory = daoFactory;
    }

    private void cloturer(ResultSet rs, PreparedStatement ps, Connection connection) throws SQLException {
        if (rs != null)
        rs.close();
        ps.close();
        connection.close();
    }

    @Override
    public boolean ajouterBiere(Biere biere) throws SQLException {
        Connection connection = daoFactory.getConnexion();
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO bieres (nom, type, couleur, brasserie) VALUES (?, ?, ?, ?)");
        pstmt.setString(1, biere.getNom());
        pstmt.setString(2, biere.getType());
        pstmt.setString(3, biere.getCouleur());
        pstmt.setString(4, biere.getBrasserie());
        int res = pstmt.executeUpdate();
        cloturer(null, pstmt, connection);
        return true;
    }

    @Override
    public Biere getBiere(String nom) {
        return null;
    }

    @Override
    public List<Biere> listerBieres() {
        return null;
    }

    @Override
    public boolean supprimerBiere(String nom) {
        return false;
    }

    @Override
    public boolean modifierBiere(Biere biere) {
        return false;
    }
}
