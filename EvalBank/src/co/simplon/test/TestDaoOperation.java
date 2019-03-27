package co.simplon.test;

import co.simplon.dao.OperationDao;
import co.simplon.entities.Operation;

public class TestDaoOperation {

	public static void runTests() {
		OperationDao od = new OperationDao();		
		
		Operation o1 = new Operation(1,3300,1);
		
		if(od.create(o1))	System.out.println("insertion ok de " + o1);
		else System.out.println("insertion impossible, client avec cet id existe déjà ");
				
		Operation o2 = od.find(o1.getNumOp()); 		
		if(o2 == null)	System.out.println("ce client n'est pas contenu en base ");
		else System.out.println("client trouvé en base : " + o2);
		
		o1.setAmount(2100);
		if(od.update(o1)) System.out.println("ok mise à jour " + o1);
		else System.out.println("mise à jour impossible ");
		
		if(od.delete(o1))	System.out.println("delete ok " + o1);
		else System.out.println("delete impossible ");				
	}
	
}
