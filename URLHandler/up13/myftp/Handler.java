package up13.myftp;

import java.net.*;

public class Handler extends URLStreamHandler {

	public FTPURLConnection openConnection(URL u) throws MalformedURLException {
		return new FTPURLConnection(u);
	}
}

