import java.util.Date;
/**
 * 
 */

/**
 * @author Thierno DIALLO
 *
 */
public class Message {

	public Date date ;
	public int idMessage;
	public int idUser;
	public String message;
	public String user;
	
	
	public Message(Date date, int idMessage, int idUser, String message, String user) {
		this.date = date;
		this.idMessage = idMessage;
		this.idUser = idUser;
		this.message = message;
		this.user = user;
	}
	


	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public int getIdMessage() {
		return idMessage;
	}



	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}



	public int getIdUser() {
		return idUser;
	}



	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public Message() {
		// TODO Auto-generated constructor stub
	}

}
