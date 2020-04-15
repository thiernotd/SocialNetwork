package up13.myftp;
public class FTPContent {
   public String login;
   public String passwd;
   public String  host;
   public String fileName;
   public String file;
   public Message m1;
   public Message m2;
   public Message m3;

    public FTPContent(String login, String passwd, String host, String fileName, String file, Message m1, Message m2, Message m3) {
        this.login = login;
        this.passwd = passwd;
        this.host = host;
        this.fileName = fileName;
        this.file = file;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setM1(Message m1) {
        this.m1 = m1;
    }

    public void setM2(Message m2) {
        this.m2 = m2;
    }

    public void setM3(Message m3) {
        this.m3 = m3;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getHost() {
        return host;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFile() {
        return file;
    }

    public Message getM1() {
        return m1;
    }

    public Message getM2() {
        return m2;
    }

    public Message getM3() {
        return m3;
    }
}