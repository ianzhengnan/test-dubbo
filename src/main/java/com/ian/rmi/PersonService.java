package com.ian.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PersonService extends Remote{

	Person getPersonInfo(int id, String name, int age) throws RemoteException;
}
