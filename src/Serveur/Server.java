package Serveur;
import java.rmi.*; 
import java.net.InetAddress;
public class Server { 
    public static void main (String[] args) throws Exception { 
        Display display = new DisplayClass(); 
        String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/RMI";
        System.out.println("Enregistrement de l'objet avec l'url : " + url);
        // creates a thread waiting for calls on this object (here display),
        Naming.rebind("/UnDisplayDistant", display); 
      }
}
