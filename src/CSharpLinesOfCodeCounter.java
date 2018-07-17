import java.util.Arrays;
import java.util.List;

/**
 * Count lines of code in C# code.
 */
public class CSharpLinesOfCodeCounter {
	
	// TODO: Opening and closing comments not within strings

	public long linesOfCode(String inputCode) {
		String codeWithoutBlockComments = removeBlockCommentsFromCodeString(inputCode);	
		List<String> linesList = splitCodeIntoLines(codeWithoutBlockComments);
		
		return linesList.stream() //
				.map(this::removeLineComment) //
				.filter(this::isLineEmpty) //
				.count();		
	}

	private List<String> splitCodeIntoLines(String codeWithoutBlockComments) {
		return Arrays.asList(codeWithoutBlockComments.split("\r?\n"));
	}

	private String removeBlockCommentsFromCodeString(String code) {
		return code.replaceAll("(?s)/\\*.*?\\*/", "");
	}
	
	private String removeLineComment(String line) {
		return line.replaceAll("//.*", "");
	}
	
	private boolean isLineEmpty(String line) {
		return !line.trim().equals("");
	}
}
