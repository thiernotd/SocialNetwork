/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package up13.myftp;
import java.util.Date;

public class Message implements  Comparable<Message> {
	public Date date;
	public int idMessage;
	public int idUser;
	public String message;
	public String user;
	int score ;

	public Message() {
	}

	public Message(Date date, int idMessage, int idUser, String message, String user, int score) {
		this.date = date;
		this.idMessage = idMessage;
		this.idUser = idUser;
		this.message = message;
		this.user = user;
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public int getIdMessage() {
		return idMessage;
	}

	public int getIdUser() {
		return idUser;
	}

	public String getMessage() {
		return message;
	}

	public String getUser() {
		return user;
	}

	public int getScore() {
		return score;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setScore(int score) {
		this.score =this.score + score;
	}

	@Override
	public String toString() {
		return "Message{" +
				"date=" + date +
				", idMessage=" + idMessage +
				", idUser=" + idUser +
				", message='" + message + '\'' +
				", user='" + user + '\'' +
				", score=" + score +
				'}';
	}

	@Override
	public int compareTo(Message o) {
		return (this.score - o.score);
	}
}
