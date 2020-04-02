package Serveur;

import java.rmi.*; 
import java.io.*;

public interface Display extends Remote{ 
    public void showDigest(File fileName) throws RemoteException; 
}
