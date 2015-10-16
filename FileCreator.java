import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreator {
	
	public static void createNewHTMLFile() throws IOException {
		String dirString = "/Users/CharlieWinnard/Documents/workspace_september_classwork/GroupProject2/src";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
		}

		String fileString = "VocabHTMLTest1.html";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
	}
}
