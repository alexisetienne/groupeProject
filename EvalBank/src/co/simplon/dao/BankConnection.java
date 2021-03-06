package co.simplon.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BankConnection {
private static Connection connection = null;	
	
	private BankConnection() {		
		Properties props = new Properties();		
		try (FileInputStream fis = new FileInputStream("config.properties")){
			props.load(fis);
		} catch (FileNotFoundException e1) {			
			e1.printStackTrace();
		} catch (IOException e1) {			
			e1.printStackTrace();
		}		
		String url = props.getProperty("jdbc.url");
		String log = props.getProperty("jdbc.login");
		String pwd = props.getProperty("jdbc.password");
		
		try {
			Class.forName(props.getProperty("jdbc.driver.class"));
			connection = DriverManager.getConnection(url, log, pwd);
			Statement statement = connection.createStatement();
			statement.executeQuery("create database if not exists Bank;");
			statement.executeQuery("use Bank;");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 				
		catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		if(connection == null) {
			new BankConnection();
		}
		return connection;
	}

}
