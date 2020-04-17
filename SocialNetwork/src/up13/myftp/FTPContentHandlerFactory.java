package up13.myftp;
import java.net.*;

public class FTPContentHandlerFactory implements ContentHandlerFactory {
    public FTPContentHandlerFactory() {
    }

    public FTPContentHandler createContentHandler(String mimeType) { 
        
    	if(mimeType.equals("myftp")){
    		   System.out.println("Requested protocol: "+mimeType);
    		   return new FTPContentHandler();
    		  }
    		  return null;
    		 }
}
