package src.model.dao;

import src.db.DB;
import src.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDaoJDBC createSellserDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
