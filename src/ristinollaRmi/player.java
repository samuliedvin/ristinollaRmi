package ristinollaRmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Player extends Remote {
	

	
	public boolean isMe(Player player) throws RemoteException;

	public void setMarker(String m) throws RemoteException;

	public String getMarker() throws RemoteException;

	public String getName() throws RemoteException;

	public String echo() throws RemoteException;

}
