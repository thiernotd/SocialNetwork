/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Serveur;

import java.io.FileOutputStream;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import up13.myftp.FTPContent;


public class Serveur {

	public static void main(String[] args) {
			
				System.getProperties().put("java.protocol.handler.pkgs", "up13");
		try{
			URL url = new URL("myftp://aLogin:aPaswwd@www.ig-edu.univ-paris13.fr");
			FTPContent ftpContent = (FTPContent) url.getContent();
			
		    //creating the JAXB context
		    JAXBContext jContext = JAXBContext.newInstance(Message.class);
		    //creating the marshaler object
		    Marshaller marshallObj = jContext.createMarshaller();
		    //setting the property to show xml format output
		    marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    //setting the values in POJO class
		    Message message = new Message(ftpContent.getM1().getIdMessage(),ftpContent.getM1().getIdUser(), 
		    		ftpContent.getM2().getIdMessage(),ftpContent.getM2().getIdUser(), 
		    		ftpContent.getM3().getIdMessage(),ftpContent.getM3().getIdUser());
		    
		    //calling the marshal method
		    marshallObj.marshal(message, new FileOutputStream("message.xml"));
		} catch(Exception e) {
		    e.printStackTrace();
		    
		}
		try {
			SocialNetworkImpl obj = new SocialNetworkImpl();
			LocateRegistry.createRegistry(1198);
			Naming.rebind("rmi://localhost:1198/SN", obj);
			System.out.println(obj.toString());
			obj.setNomXml("message.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}
}
	

