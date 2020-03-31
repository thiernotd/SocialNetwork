package Client;

import java.rmi.*;
import Serveur.Display;

import java.io.*;
public class Client {
public static void main(String[] args) throws Exception{
     File file = new File(args[0]);
     Display display = (Display) Naming.lookup("rmi://localhost/UnDisplayDistant");
     display.showDigest(file);
     }
}
