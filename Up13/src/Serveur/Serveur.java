/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Serveur;

import java.io.*;
import java.net.*;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import up13.myftp.FTPContent;


public class Serveur {

	public static void main(String[] args) {
		try {
			SocialNetworkImpl obj = new SocialNetworkImpl();
			LocateRegistry.createRegistry(1198);
			Naming.rebind("rmi://localhost:1198/SN", obj);
			System.out.println(obj.toString());
		} 
		
		catch (Exception e) {
		
			e.printStackTrace();
		}

		System.getProperties().put("java.protocol.handler.pkgs", "up13"); 
	    try{ 
	    	//if(args.length!=1) 
	    	//error("Usage: java TestURLHandler myftp://aLogin:aPaswwd@www.ig-edu.univ -paris13.fr?aFile.txt");
	    	URL url = new URL("myftp://aLogin:aPaswwd@www.ig-edu.univ-paris13.fr?File.txt"); 
	    	FTPContent ftpContent = (FTPContent) url.getContent(); 
	    	System.out.println("login : " + ftpContent.getLogin()); 
	    	System.out.println("passwd : " + ftpContent.getPasswd()); 
	    	System.out.println("host : " + ftpContent.getHost()); 
	    	System.out.println("retrieved file : " + ftpContent.getFileName()); 
	    	System.out.println("file content : " + ftpContent.getFile()); 
	    	}catch (MalformedURLException ex){ System.out.println(ex); error("Bad URL"); 
	    	}catch (IOException ex){ System.out.println(ex); error("IOException occurred.");
	    	} 
	    } 
 public static void error(String s){ 
	 System.out.println(s); System.exit(1); 
	 } 
		

} 
	

