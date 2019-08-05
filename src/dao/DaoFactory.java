package dao;

import daoMySql.DaoFactoryMySql;

public abstract class DaoFactory {
	
	public static DaoFactory getIstance() {
		return new DaoFactoryMySql(); 
	}
	
	public abstract UserDao getUserDao(); 
	public abstract ArticleDao getArticleDao(); 
	public abstract CategoryDao getCategoryDao(); 
	public abstract DatabaseManager getDatabaseManager(); 
	public abstract AdministratorDao getAdministratorDao(); 
	public abstract OrderDao getOrderDao(); 
	

}
