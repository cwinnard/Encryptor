import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class URLWriter {
	
	public static void writeContentToHTMLFile(String content) throws IOException {
		FileCreator.createNewHTMLFile();
		BufferedWriter urlWriter = new BufferedWriter(new FileWriter("src/VocabHTMLTest1.html", true));
		urlWriter.write(content);
		urlWriter.close();
	}

}
