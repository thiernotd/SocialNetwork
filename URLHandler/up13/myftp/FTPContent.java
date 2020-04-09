// FTPContent.java
//
// content returned with protocol myFTP
// fields :
//		- String login
//		- String passwd
//		- String host
//		- String fileName
//		- String file

package up13.myftp;

public class FTPContent {
	private String login="";
	private String passwd="";
	private String host="";
	private String fileName=null;
	private String file=null;

	public FTPContent (String login,String passwd,String host,String fileName,String file) {
		this.login = login;
		this.passwd = passwd;
		this.host = host;
		this.fileName = fileName;
		this.file = file;
	}

	public String getLogin () {
		return login;
	}

	public String getPasswd () {
		return passwd;
	}

	public String getHost () {
		return host;
	}

	public String getFileName () {
		return fileName;
	}

	public String getFile () {
		return file;
	}

}
