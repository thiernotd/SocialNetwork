/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Client;

import Serveur.SocialNeworkRemote;

import java.io.*;
import java.rmi.Naming;

import javax.xml.bind.*;


public class Client{

	
	public static void main(String[] args) {
		try {
			SocialNeworkRemote stub = (SocialNeworkRemote) Naming.lookup("rmi://localhost:1198/SN");
		
            //getting the xml file to read
            File file = new File(stub.getNomXml());
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Message.class);
            //creating the unmarshall object
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            //calling the unmarshall method
            Message message=(Message) unmarshallerObj.unmarshal(file);
            System.out.println(message.getIdMessage1()+" "+message.getIdUser1());
            System.out.println(message.getIdMessage2()+" "+message.getIdUser2());
            System.out.println(message.getIdMessage3()+" "+message.getIdUser3());
    } catch (Exception e) {
        e.printStackTrace();
    }
	}
}
