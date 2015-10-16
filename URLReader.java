import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	public static String getUrlContents(String theUrl) throws IOException
	  {
	    StringBuilder content = new StringBuilder();
	      URL url = new URL(theUrl);
	      URLConnection urlConnection = url.openConnection();
	      BufferedReader urlReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	      String line;
	      while ((line = urlReader.readLine()) != null)
	      {
	        content.append(line + "\n");
	      }
	      urlReader.close();
	    return content.toString();
	  }
}
