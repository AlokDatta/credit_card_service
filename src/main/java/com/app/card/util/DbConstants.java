package com.app.card.util;

/**
 * DB configuration
 * @author Aloknath Datta
 */
public class DbConstants {
	
	public static final String JDBC_DRIVER = "org.h2.Driver";   
	public static final String DB_URL = "jdbc:h2:~/test";
	public static final String USER = "sa"; 
	public static final String PASS = "";

	public static final String CARD_USER_NAME = "name";
	public static final String CARD_NUMBER = "number";
	public static final String CARD_LIMIT = "card_limit";
	public static final String CARD_BALANCE = "balance";
	
	public static final String GET_ALL_QUERY = "SELECT name, number, card_limit, balance FROM CREDIT_CARD";
	public static final String INSERT_QUERY = "INSERT INTO CREDIT_CARD (name, number, card_limit, balance) VALUES (?, ?, ?, ?)";
	public static final String CREATE_TABLE_QUERY = "DROP TABLE IF EXISTS CREDIT_CARD; " +
													"CREATE TABLE CREDIT_CARD" + 
												    " (name VARCHAR(255), " +
												    " number VARCHAR(20) PRIMARY KEY, " +
												    " card_limit INTEGER, " +  
												    " balance INTEGER)";
	
}
