/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */
package Serveur;

import java.util.Date;

public class Comment{
	public Date date;
	public int idCommentaire;
	public int idUser;
	public String comment;
	public String user;
	public int pidCommentaire;
	public int pidMessage;

	public Comment(Date date,int idCmnt,int idUsr,String cmnt,String usr)
	{
		this.date=date;
		this.idCommentaire = idCmnt;
		this.idUser= idUsr;
		this.comment = cmnt;
		this.user = usr;
	}
	public Date getDate(){
		return this.date;
	}
	public int getIdComment(){
		return this.idCommentaire;
	}
	public int getIdUser(){
		return this.idUser;
	}
	public String getComment(){
		return this.comment;
	}
	public String getUser(){
		return this.user;
	}
	public int getPidCommentaire(){
		return this.pidCommentaire;
	}
	public int getPidMessage(){
		return this.pidMessage;
	}
	public void setDate(Date date){
		this.date = date;
	}
	public void setIdComment(int idCmnt){
		this.idCommentaire=idCmnt;
	}
	public void setIdUser(int idUsr){
		this.idUser = idUsr;
	}
	public void setComment(String cmnt){
		this.comment = cmnt;
	}
	public void setUser(String usr){
		this.user=usr;
	}
	public void setPidCommentaire(int pidCmnt){
		this.pidCommentaire = pidCmnt;
	}
	public void setPidMessage(int pidMsg){
		this.pidMessage = pidMsg;
	}
	public String toString(){
		String c = "";
		c+=this.date+" "+this.idCommentaire+" "+this.idUser+" "+this.comment+" "+this.user;
		return c;
	}

}
