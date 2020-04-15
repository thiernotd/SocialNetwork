
package up13.myftp;

import java.net.*;
import java.io.*;

public class FTPContentHandler extends ContentHandler {
    public String login = "";
    public String passwd = "";
    public String host = "";
    public String fileName = "";
    public String file = "";
    public FTPContentHandler(){}
    public Object getContent(URLConnection urlc) throws IOException { 
         URL url = urlc.getURL();  
         String[] userInfo = url.getUserInfo().split(":"); 
        login = userInfo[0]; 
        passwd = userInfo[1]; 
        host = url.getHost(); 
        fileName = url.getQuery(); 
        setFile(); 
        return new FTPContent(login ,passwd ,host ,fileName ,file); 
     }

   public  void setFile() throws IOException { 
    InputStream in = new FileInputStream("File.txt"); 
    int b; 
    while ((b = in.read()) != -1) {  
          file += (char) b; 
         }; 
    in.close(); 
 } 
   public static void error(String s){ 
        System.out.println(s); 
        System.exit(1); 
     } 
     }
