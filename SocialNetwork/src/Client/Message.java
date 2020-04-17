/**
 * @author Thierno DIALLO
 * @author Khady Adiama DIEDHIOU
 */

package Client;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Message {
	
	private int idMessage1;
	private int idUser1;
	private int idMessage2;
	private int idUser2;
	private int idMessage3;
	private int idUser3;

	Message() {
	}


	public Message(int idMessage1, int idUser1, int idMessage2, int idUser2, int idMessage3, int idUser3) {
		
		this.idMessage1 = idMessage1;
		this.idUser1 = idUser1;
		this.idMessage2 = idMessage2;
		this.idUser2 = idUser2;
		this.idMessage3 = idMessage3;
		this.idUser3 = idUser3;
	}

	@XmlAttribute
	public int getIdMessage1() {
		return idMessage1;
	}


	public void setIdMessage1(int idMessage1) {
		this.idMessage1 = idMessage1;
	}

	@XmlAttribute
	public int getIdMessage2() {
		return idMessage2;
	}


	public void setIdMessage2(int idMessage2) {
		this.idMessage2 = idMessage2;
	}

	@XmlAttribute
	public int getIdMessage3() {
		return idMessage3;
	}


	public void setIdMessage3(int idMessage3) {
		this.idMessage3 = idMessage3;
	}

	@XmlAttribute
	public int getIdUser1() {
		return idUser1;
	}


	public void setIdUser1(int idUser1) {
		this.idUser1 = idUser1;
	}

	@XmlAttribute
	public int getIdUser2() {
		return idUser2;
	}


	public void setIdUser2(int idUser2) {
		this.idUser2 = idUser2;
	}

	@XmlAttribute
	public int getIdUser3() {
		return idUser3;
	}


	public void setIdUser3(int idUser3) {
		this.idUser3 = idUser3;
	}


}
