package be.iesca.daoimpl;

public class DaoFactory {

	private static DaoFactory single_daoFactory = null;

	private DaoFactory(){}

	public DaoFactory getInstance() {
		if (single_daoFactory == null)
			single_daoFactory = new DaoFactory();

		return single_daoFactory;
	}

	public BiereDaoMockImpl getBiereDao(){
		return null;
	}
}
