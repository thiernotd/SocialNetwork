/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Serveur.Comment;
import Serveur.Message;

public class SocialNetworkImpl extends UnicastRemoteObject implements SocialNeworkRemote {

	public SocialNetworkImpl() throws RemoteException {
		super();
	}

	@Override
	public int importanceValeur() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int scoreComment(Comment a, ArrayList <Comment> ListeComment ) throws RemoteException {
		int score = 20;
		for(Comment b:ListeComment) {
			if(a.getIdComment()==b.getPidCommentaire()) 
			{
				score =score+20; 
			}
		}
		return score;
	}

	@Override
	public int scoreMessage(Message a, ArrayList <Comment> ListeComment) throws RemoteException {
		int score = 20;
		for(Comment b:ListeComment) {
			if(a.getIdMessage() == b.pidMessage()) {
				score = score+ scoreComment(b,ListeComment);
			}
		}
		return score;
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
