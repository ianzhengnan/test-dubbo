package com.ian.rmi;

import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Server {

	public static void main(String[] args) {
		
		try {
			PersonService personService = new PersonServiceImpl();
			LocateRegistry.createRegistry(6600);
			Context namingContext = new InitialContext();
			namingContext.rebind("rmi://127.0.0.1:6600/PersonService", personService);
			//or 
			// Naming.rebind("rmi://127.0.0.1:6600/PersonService", personService);
			System.out.println("Server Started!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
