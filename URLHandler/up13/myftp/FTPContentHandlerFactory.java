
package up13.myftp;
import java.net.*;

class FTPContentHandlerFactory implements ContentHandlerFactory {
	public FTPContentHandlerFactory() { }

	public ContentHandler createContentHandler(String mimeType) {
		return new FTPContentHandler();
	}
}
