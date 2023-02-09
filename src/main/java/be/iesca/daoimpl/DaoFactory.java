package be.iesca.daoimpl;

import be.iesca.dao.BiereDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {

	private static DaoFactory single_daoFactory = null;
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USER = "postgres";
	private static final String MDP = "matteo";

	private DaoFactory(){}

	public static DaoFactory getInstance() {
		if (single_daoFactory == null)
			single_daoFactory = new DaoFactory();

		return single_daoFactory;
	}

	public BiereDao getBiereDao(){
		return new BiereDaoImpl(DaoFactory.getInstance());
	}
	public Connection getConnexion() throws SQLException { return DriverManager.getConnection(URL, USER, MDP);


	}
}
