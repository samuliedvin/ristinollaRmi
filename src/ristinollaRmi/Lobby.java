package ristinollaRmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Lobby extends Remote {
	public static final String NAMING = "lobby";
	public void findGame() throws RemoteException; 
}
