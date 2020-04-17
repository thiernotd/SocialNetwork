/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SocialNeworkRemote extends Remote {
	
	public String getNomXml() throws RemoteException;
	public void setNomXml(String nom) throws RemoteException;
	
	

}
