
package up13.myftp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ContentHandler;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class FTPContentHandler extends ContentHandler {
    public String login = "";
    public String passwd = "";
    public String host = "";
    public String fileName = "";
    public String file = "";
    public Message m1 = new Message();
    public Message m2 = new Message();
    public Message m3 = new Message();
    public FTPContentHandler(){}
    public Object getContent(URLConnection urlc) throws IOException { 
         URL url = urlc.getURL();  
         String[] userInfo = url.getUserInfo().split(":");
        login = userInfo[0]; 
        passwd = userInfo[1]; 
        host = url.getHost();
        fileName = url.getQuery();
        setFile();
        
        Message liste[] = meilleurMessage(ListeMessage);
        m1 = liste[0];
        m2= liste[1];
        m3= liste[2];
        
        return new FTPContent(login ,passwd ,host ,fileName ,file,m1,m2,m3);
     }
    ArrayList <Message> ListeMessage = new ArrayList<Message>(); // Create an ArrayList object
    ArrayList <Comment> ListeComment = new ArrayList<Comment>(); // Create an ArrayList object
   public  void setFile() throws IOException {
       file="";
       BufferedReader in = new BufferedReader(new FileReader("reseauSocial.txt"));
       String line;
       int i =0;
       Date date;
       Integer idMessage;
       Integer idUser;
       String message;
       String user ;
       Integer pidMessage = 0;
       Integer idCommentaire;
       String comment ;
       Integer pidCommentaire;

       int max = 2500;
       int min = 100;
       int range = max - min + 1;
       int rand = (int)(Math.random() * range) + min;



           while ((line = in.readLine()) != null && i < rand )
       {
           
           String elementLigne[]=line.split("@");
           if(elementLigne.length==4) {
               date = new Date();
               idMessage = Integer.parseInt(elementLigne[0]);
               idUser =  Integer.parseInt(elementLigne[1]);
               message = elementLigne[2];
               user = elementLigne[3];
               Message e = new Message(date,idMessage,idUser,message,user,20 );
               ListeMessage.add(e);
              
           } else if (elementLigne.length==5) {

               pidMessage = 1;
               date = new Date();
               idCommentaire = Integer.parseInt(elementLigne[0]);
               idUser =  Integer.parseInt(elementLigne[1]);
               comment = elementLigne[2];
               user = elementLigne[3];
               pidCommentaire = Integer.parseInt(elementLigne[4]);
               Comment e = new Comment(date,idCommentaire,idUser,comment,user,pidCommentaire,pidMessage );
               ListeComment.add(e);
               int idCom = 0;
               int pidMes = 0;
               for(Comment a:ListeComment) {
                   if (a.getIdCommentaire() == e.getPidCommentaire()) {
                       idCom = a.getIdCommentaire();
                   }
               }
               for(Comment a:ListeComment) {
                   if (a.getIdCommentaire() == idCom) {
                       pidMes = a.getPidMessage();
                   }
               }
               for(Message a:ListeMessage) {
                   if(a.getIdMessage() == pidMes) {
                       a.setScore(20);
                   }
               }

               
           }
           else if (elementLigne.length==6)
           {
               pidCommentaire = 1;
               date = new Date();
               idCommentaire = Integer.parseInt(elementLigne[0]);
               idUser =  Integer.parseInt(elementLigne[1]);
               comment = elementLigne[2];
               user = elementLigne[3];
               if (elementLigne[5].length()<2){pidMessage=1;}else {
                   pidMessage = Integer.parseInt(elementLigne[5]);
               }
               Comment e = new Comment(date,idCommentaire,idUser,comment,user,pidCommentaire,pidMessage );
               ListeComment.add(e);
               for(Message a:ListeMessage) {
                    if(a.getIdMessage() == e.getPidMessage()) {
                        a.setScore(20);
                }
               }
               
           }
           i++;
       }
       Collections.sort(ListeMessage);
       Collections.reverse(ListeMessage);
       
       in.close();
   }


    public Message[] meilleurMessage(ArrayList<Message> lesMessages){
        Message liste[] = new Message[3];
        for(int i=0; i < 3; i++) {
            liste[i] = lesMessages.get(i);
        }
        return liste;
    }
    public void afficheLesMessage(){
       Message liste[] = meilleurMessage(ListeMessage);
        for (Message a :liste) {
            System.out.println(a.toString());
        }
    }

    public static void error(String s){
        System.out.println(s); System.exit(1);
    }
}