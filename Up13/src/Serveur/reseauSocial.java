package Serveur;

public class reseauSocial {
	
	public int idMessage;
	public int idUser;
	
	
	public reseauSocial(int idMessage, int idUser) {
		super();
		this.idMessage = idMessage;
		this.idUser = idUser;
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



}
