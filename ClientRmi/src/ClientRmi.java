
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmi.SocialNeworkRemote;


public class ClientRmi {

	public static void main(String[] args) {
		try {
			SocialNeworkRemote stub = (SocialNeworkRemote) Naming.lookup("rmi://localhost:1199/SN");
			System.out.println(stub.scoreComment());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
