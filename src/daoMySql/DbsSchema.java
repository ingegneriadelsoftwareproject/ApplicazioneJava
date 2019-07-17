package daoMySql;

public final class DbsSchema {
	
	public static final String ADMINISTRATOR_TABLE = "administrator"; 
	public static final String ADMINISTRATOR_USERNAME_COLUMN = "username"; 
	public static final String ADMINISTRATOR_PASSWORD_COLUMN = "password"; 
	
	public static final String ARTICLE_TABLE = "article"; 
	public static final String ARTICLE_CODE_COLUMN = "code"; 
	public static final String ARTICLE_CATEGORYCODE_COLUMN = "category_code"; 
	public static final String ARTICLE_NAME_COLUMN = "name"; 
	public static final String ARTICLE_PRICE_COLUMN = "price"; 
	public static final String ARTICLE_DESCRIPTION_COLUMN = "description"; 
	public static final String ARTICLE_DIMENSION_COLUMN = "dimensions"; 
	public static final String ARTICLE_WEIGHT_COLUMN = "weight"; 
	
	public static final String CART_TABLE = "cart"; 
	public static final String CART_CODE_COLUMN = "code"; 
	
	public static final String CATEGORY_TABLE = "category"; 
	public static final String CATEGORY_CODE_COLUMN = "code"; 
	public static final String CATEGORY_NAME_COLUMN = "name"; 
	
	public static final String ORDER_TABLE = "order"; 
	public static final String ORDER_CODE_COLUMN = "code"; 
	public static final String ORDER_USERNAMEUSER_COLUMN = "username_user"; 
	public static final String ORDER_DATE_COLUMN = "date_order"; 
	public static final String ORDER_TOTAL_COLUMN = "total"; 
	
	public static final String USER_TABLE = "user"; 
	public static final String USER_USERANAME_COLUMN = "username"; 
	public static final String USER_EMAIL_COLUMN = "email"; 
	public static final String USER_NAME_COLUMN = "name"; 
	public static final String USER_SURNAME_COLUMN = "surname"; 
	public static final String USER_BIRTHDATE_COLUMN = "data_nascita"; 
	public static final String USER_PASSWORD_COLUMN = "password"; 
	
	
}
