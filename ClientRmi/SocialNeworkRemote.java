package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Thierno DIALLO
 *
 */
public interface SocialNeworkRemote extends Remote {
	
	public int importanceValeur() throws RemoteException;
	public int scoreComment()throws RemoteException;
	public int scoreMessage()throws RemoteException;
	public void decreaseMessage()throws RemoteException;
	public boolean isActiveMessage()throws RemoteException;
	
}
