/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */
package rmi;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
	public Date date;
	public int idMessage;
	public int idUser;
	public String message;
	public String user;

	public Message(Date date,int idmsg,int idusr,String msg,String usr)
	{
		this.date=date;
		this.idMessage = idmsg;
		this.idUser= idusr;
		this.message = msg;
		this.user = usr;
	}
	public Date getDate(){
		return this.date;
	}
	public int getIdMessage(){
		return this.idMessage;
	}
	public int getIdUser(){
		return this.idUser;
	}
	public String getMessage(){
		return this.message;
	}
	public String getUser(){
		return this.user;
	}
	public void setDate(Date date){
		this.date = date;
	}
	public void setIdMessage(int idMsg){
		this.idMessage=idMsg;
	}
	public void setIdUser(int idUsr){
		this.idUser = idUsr;
	}
	public void setMessage(String msg){
		this.message = msg;
	}
	public void setUser(String usr){
		this.user=usr;
	}
	public String toString(){
		String m = "";
		m+=this.date+" "+this.idMessage+" "+this.idUser+" "+this.message+" "+this.user;
		return m;
	}

}
