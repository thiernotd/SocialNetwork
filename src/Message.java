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
	public int idMsg;
	public int idUser;
	public String message;
	public String user;
	
	
	public Message(Date date, int idMsg, int idUser, String message, String user) {
		this.date = date;
		this.idMsg = idMsg;
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



	public int getIdMsg() {
		return idMessage;
	}



	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
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
