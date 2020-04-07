/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	public static void main(String[] args) {
		try {
			SocialNetworkImpl obj = new SocialNetworkImpl();
			LocateRegistry.createRegistry(1199);
			Naming.rebind("rmi://localhost:1199/SN", obj);
			System.out.println(obj.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
