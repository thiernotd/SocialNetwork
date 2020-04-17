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
	private  String  nomXml;

	public SocialNetworkImpl() throws RemoteException {
		super();
	}


	public String getNomXml() throws RemoteException {
		
		return this.nomXml;
	}
	
	public void setNomXml(String nom) throws RemoteException {
		this.nomXml=nom;
	}

	
}
