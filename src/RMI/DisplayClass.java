package Serveur;

import java.rmi.*;
 import java.io.*; 
 import java.rmi.server.UnicastRemoteObject;
public class DisplayClass extends UnicastRemoteObject  implements Display{ 
    private static final long serialVersionUID = 2674880711467464646L;
    File input; 
    byte[] digest;
    protected DisplayClass() throws RemoteException {
        super();
      }
    public void showDigest(File input) throws RemoteException{
            System.out.println("Nom du fichier"+input.getName());
       
    }
    public String toString() {
        return "Khady";
    }
}
