// FTPContentHandler.java
//
// content handler for protocol myFTP
package up13.myftp;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.*;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import java.io.*;

public class FTPContentHandler extends ContentHandler {

	String login="";
	String passwd="";
	String host="";
	String fileName="";
	String file="";

	public Object getContent(URLConnection urlc) throws IOException {
		URL url = urlc.getURL();
		String[] userInfo = url.getUserInfo().split(":");
		login = userInfo[0];
		passwd = userInfo[1];
		host = url.getHost();
		fileName = url.getQuery();
		setFile();
		return new FTPContent(login,passwd,host,fileName,file);
	}

	private void setFile() throws IOException {
	String command = new String();
	command = "cp "+ fileName + " reseauSocial.txt";
	Process p = Runtime.getRuntime().exec(command);
	System.out.println(command);
	try {
		p.waitFor();
	} catch (Exception ex){ System.out.println(ex); error("InterruptedException occurred."); }

	file="";
	
	BufferedReader in = new BufferedReader(new FileReader("reseauSocial.txt"));
	String line;
	int i =0;
	ArrayList <Message> ListeMessage = new ArrayList<Message>(); // Create an ArrayList object
	ArrayList <Comment> ListeComment = new ArrayList<Comment>(); // Create an ArrayList object
	
	while ((line = in.readLine()) != null && i < 1000)
	{	
		//System.out.println(line);
		String elementLigne [] = line.split("@");
		if(elementLigne.length<=4) {
		    Date date = new Date();
			Integer idMessage = Integer.parseInt(elementLigne[0]);
			Integer idUser =  Integer.parseInt(elementLigne[1]);
			String message = elementLigne[2];
			String user = elementLigne[3]; 
			Message e = new Message(date,idMessage,idUser,message,user );
			ListeMessage.add(e);
			//System.out.println(e.toString());
//		for(int j = 0; j<elementLigne.length; j++)
//		System.out.println(elementLigne[j]);
		} else if (elementLigne.length==5) {
			
				int pidMessage = 1;
			    Date date = new Date();
				Integer idCommentaire = Integer.parseInt(elementLigne[0]);
				Integer idUser =  Integer.parseInt(elementLigne[1]);
				String comment = elementLigne[2];
				String user = elementLigne[3]; 
				Integer pidCommentaire = Integer.parseInt(elementLigne[4]);
				Comment e = new Comment(date,idCommentaire,idUser,comment,user,pidCommentaire,pidMessage );
				ListeComment.add(e);
				//System.out.println(e.toString());
		}
		 else
			{
			int pidCommentaire = 1;
		    Date date = new Date();
			Integer idCommentaire = Integer.parseInt(elementLigne[0]);
			Integer idUser =  Integer.parseInt(elementLigne[1]);
			String comment = elementLigne[2];
			String user = elementLigne[3]; 
			Integer pidMessage = Integer.parseInt(elementLigne[5]);
			Comment e = new Comment(date,idCommentaire,idUser,comment,user,pidCommentaire,pidMessage );
			ListeComment.add(e);
			System.out.println(e.toString());
			}
		i++;
	}
	in.close();
}

//	public int scoreComment(Comment a, ArrayList <Comment> ListeComment ){
//		int score = 20;
//		for(Comment b:ListeComment) {
//			if(a.getIdComment()==b.getPidCommentaire()) 
//			{
//				score =score+20; 
//			}
//		}
//		return score;
//	}
//
//	@Override
//	public int scoreMessage(Message a, ArrayList <Comment> ListeComment){
//		int score = 20;
//		for(Comment b:ListeComment) {
//			if(a.getIdMessage() == b.pidMessage()) {
//				score = score+ scoreComment(b,ListeComment);
//			}
//		}
//		return score;
//	} 
//	
	
	 
//	private void setFile() throws IOException {
//		String command = new String();
//		command = "cp "+ fileName + " reseauSocial.txt";
//		Process p = Runtime.getRuntime().exec(command);
//		System.out.println(command);
//		try {
//			p.waitFor();
//		} catch (Exception ex){ System.out.println(ex); error("InterruptedException occurred."); }
//
//		file="";
//		InputStream in = new FileInputStream("reseauSocial.txt");
//		int b;
//		while ((b = in.read()) != -1) {
//			file += (char) b;
//		};
//		in.close();	
//	}

	public static void error(String s){
		System.out.println(s); System.exit(1);
	}
}
