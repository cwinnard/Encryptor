import java.io.IOException;

public class URLReaderApp {
	public static void main(String[] args) throws IOException {
		
		String output  = URLReader.getUrlContents("http://espn.go.com/");
		
		String editedOutput = WordReplace.wordReplace(output);
		
	    URLWriter.writeContentToHTMLFile(editedOutput);
	    
	    System.out.println("Done!");
	}
	
}
