package daoMySql;

import dao.ArticleDao;
import dao.CategoryDao;
import dao.DaoFactory;
import dao.DatabaseManager;
import dao.UserDao;

public class DaoFactoryMySql extends DaoFactory{

	@Override
	public UserDao getUserDao() {
		// TODO Auto-generated method stub
		return new UserDaoMySql();
	}

	@Override
	public ArticleDao getArticleDao() {
		// TODO Auto-generated method stub
		return new ArticleDaoMySql();
	}

	@Override
	public CategoryDao getCategoryDao() {
		// TODO Auto-generated method stub
		return new CategoryDaoMySql();
	}
	
	@Override
	public DatabaseManager getDatabaseManager() {
		return DatabaseManagerMySql.getInstance();
		
	}

}
