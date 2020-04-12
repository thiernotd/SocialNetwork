package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Serveur.Comment;
import Serveur.Message;

/**
 * @author Thierno DIALLO
 *
 */
public interface SocialNeworkRemote extends Remote {
	
	public int importanceValeur() throws RemoteException;
	public int scoreComment(Comment a, Comment tableauComent[] ) throws RemoteException;
	public int scoreMessage(Message a, Comment tableauComment[])throws RemoteException;
	public void decreaseMessage()throws RemoteException;
	public boolean isActiveMessage()throws RemoteException;
	
}
  