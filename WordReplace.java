
public class WordReplace {

	public static String wordReplace(String content) {
		String editedContent = "";
		
		editedContent = content.replaceAll("Mag", "<mark>Mag</mark>");
		editedContent = content.replaceAll("football", "<mark>football</mark>");
		
		return editedContent;
	}
}
