package up13.myftp;
import java.net.*;
import java.io.*;

public class FTPURLConnection extends URLConnection {
    public FTPURLConnection(URL url) throws MalformedURLException { 
        super(url); 
        setContentHandlerFactory(new FTPContentHandlerFactory()); 
     }

    public void connect() { }

    public InputStream getInputStream() { return null;  }

    public String getHeaderField(String name) {
          if (name.equals("content-type")) return "myftp";  
          return null;  
        }
}
