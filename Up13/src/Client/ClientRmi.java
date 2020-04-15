/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Client;

import java.rmi.Naming;
import Serveur.SocialNeworkRemote;

public class ClientRmi {

	
	public static void main(String[] args) {
		try {
			SocialNeworkRemote stub = (SocialNeworkRemote) Naming.lookup("rmi://localhost:1198/SN");
			System.out.println(stub.scoreComment());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
