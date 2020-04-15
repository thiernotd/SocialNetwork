/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SocialNetworkImpl extends UnicastRemoteObject implements SocialNeworkRemote {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SocialNetworkImpl() throws RemoteException {
		super();
	}

	@Override
	public int importanceValeur() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int scoreComment() throws RemoteException {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int scoreMessage() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void decreaseMessage() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isActiveMessage() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
