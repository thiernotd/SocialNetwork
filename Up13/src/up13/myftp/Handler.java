package up13.myftp;
import java.io.*;
import java.net.*;
public class Handler extends URLStreamHandler{  
    public FTPURLConnection openConnection(URL url) throws IOException {
            return new FTPURLConnection( url ); 
           }
       }
