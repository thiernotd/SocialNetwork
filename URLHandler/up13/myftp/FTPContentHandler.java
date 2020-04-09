// FTPContentHandler.java
//
// content handler for protocol myFTP
package up13.myftp;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.*;
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
	while ((line = in.readLine()) != null && i < 100)
	{
	
		String elementLigne [] = line.split("@");
		System.out.println(line);
		for(int j = 0; j<elementLigne.length; j++)
		System.out.println(elementLigne[j]);
		i++;
	}
	in.close();
}
	 
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
