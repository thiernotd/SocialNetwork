/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */
package up13.myftp;


import java.util.Date;

public class Comment {
	public Date date;
	public int idCommentaire;
	public int idUser;
	public String comment;
	public String user;
	public int pidCommentaire;
	public int pidMessage;
	
	
	public Comment(Date date, int idCommentaire, int idUser, String comment, String user, int pidCommentaire,
			int pidMessage) {
		
		this.date = date;
		this.idCommentaire = idCommentaire;
		this.idUser = idUser;
		this.comment = comment;
		this.user = user;
		this.pidCommentaire = pidCommentaire;
		this.pidMessage = pidMessage;
	}
	@Override
	public String toString() {
		return "Comment [date=" + date + ", idCommentaire=" + idCommentaire + ", idUser=" + idUser + ", comment="
				+ comment + ", user=" + user + ", pidCommentaire=" + pidCommentaire + ", pidMessage=" + pidMessage
				+ "]";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPidCommentaire() {
		return pidCommentaire;
	}
	public void setPidCommentaire(int pidCommentaire) {
		this.pidCommentaire = pidCommentaire;
	}
	public int getPidMessage() {
		return pidMessage;
	}
	public void setPidMessage(int pidMessage) {
		this.pidMessage = pidMessage;
	}




}
