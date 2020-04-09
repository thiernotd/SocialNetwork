import java.net.*; 
import java.io.*;
import up13.myftp.*;

public class TestURLHandler {
	public static void main(String args[]){
	System.getProperties().put("java.protocol.handler.pkgs", "up13");
	try{
		if(args.length!=1) 
          error("Usage: java TestURLHandler myFTP://myLogin:myPaswwd@www.ig-edu.univ-paris13.fr?myFile");
		URL url = new URL(args[0]);

		FTPContent ftpContent = (FTPContent) url.getContent();
		System.out.println("login : " + ftpContent.getLogin());
		System.out.println("passwd : " + ftpContent.getPasswd());
		System.out.println("host : " + ftpContent.getHost());
		System.out.println("retrieved file : " + ftpContent.getFileName());
		System.out.println("file content : " + ftpContent.getFile());
	}catch (MalformedURLException ex){ System.out.println(ex); error("Bad URL");
	}catch (IOException ex){ System.out.println(ex); error("IOException occurred."); }	
	}

	public static void error(String s){
		System.out.println(s); System.exit(1);
	}
}
