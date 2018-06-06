package com.ian.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PersonServiceImpl extends UnicastRemoteObject implements PersonService{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7983732870767447832L;

	protected PersonServiceImpl() throws RemoteException {
		super();
	}

	public Person getPersonInfo(int id, String name, int age) throws RemoteException {
		System.out.println("get Person: " + id);
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setAge(age);
		return person;
	}
	
}
