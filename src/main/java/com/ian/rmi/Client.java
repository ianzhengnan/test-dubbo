package com.ian.rmi;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		
		try {
			PersonService personService = (PersonService)Naming.lookup("rmi://127.0.0.1:6600/PersonService");
			Person person = personService.getPersonInfo(5, "张三", 55);
			System.out.println(person);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
