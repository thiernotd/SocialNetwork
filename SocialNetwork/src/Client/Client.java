/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Client;

import Serveur.SocialNeworkRemote;

import java.rmi.Naming;

public class Client{

	
	public static void main(String[] args) {
		try {
			SocialNeworkRemote stub = (SocialNeworkRemote) Naming.lookup("rmi://localhost:1198/SN");
			System.out.println(stub.scoreComment());
			stub.decreaseMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
