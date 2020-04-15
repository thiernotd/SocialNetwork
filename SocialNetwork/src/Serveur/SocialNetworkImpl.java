/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Serveur;

import up13.myftp.FTPContent;

import java.net.URL;
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
		System.getProperties().put("java.protocol.handler.pkgs", "up13");
		try{
			//if(args.length!=1)
			//error("Usage: java TestURLHandler myftp://aLogin:aPaswwd@www.ig-edu.univ -paris13.fr?aFile.txt");
			URL url = new URL("myftp://aLogin:aPaswwd@www.ig-edu.univ-paris13.fr");
			FTPContent ftpContent = (FTPContent) url.getContent();
			System.out.println("login : " + ftpContent.getLogin());
			System.out.println("passwd : " + ftpContent.getPasswd());
			System.out.println("host : " + ftpContent.getHost());
			System.out.println("retrieved file : " + ftpContent.getFileName());
			System.out.println("file content : " + ftpContent.getFile());
		} catch (Exception e) {
				e.printStackTrace();
			}
		}

	@Override
	public boolean isActiveMessage() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
