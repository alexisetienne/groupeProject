package co.simplon.test;

import co.simplon.dao.AccountDao;
import co.simplon.entities.Account;


public class TestDaoAccount {
	
	public static void runTests() {
		java.util.Date date_util = new java.util.Date();
		java.sql.Date date_sql = new java.sql.Date(date_util.getTime());

		AccountDao ad = new AccountDao();		
		
		Account a1 = new Account(1,date_sql,1000,22);
		
		if(ad.create(a1))	System.out.println("insertion ok de " + a1);
		else System.out.println("insertion impossible, client avec cet id existe déjà ");
				
		Account a2 = ad.find(a1.getIdCust()); 		
		if(a2 == null)	System.out.println("ce client n'est pas contenu en base ");
		else System.out.println("client trouvé en base : " + a2);
		
		a1.setBalance(2290);
		if(ad.update(a1)) System.out.println("ok mise à jour " + a1);
		else System.out.println("mise à jour impossible ");
		
		if(ad.delete(a1))	System.out.println("delete ok " + a1);
		else System.out.println("delete impossible ");				
	}

}
