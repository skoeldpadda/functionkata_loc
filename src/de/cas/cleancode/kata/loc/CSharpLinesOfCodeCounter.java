package de.cas.cleancode.kata.loc;
import java.util.Arrays;
import java.util.List;

/**
 * Count lines of code in C# code.
 */
public class CSharpLinesOfCodeCounter {

	public long linesOfCode(String inputCode) {
		String codeString = inputCode;
		codeString = removeStringConstantsFromCodeString(codeString);
		codeString = removeBlockCommentsFromCodeString(codeString);
		List<String> linesList = splitCodeIntoLines(codeString);
		
		return linesList.stream() //
				.map(this::removeLineComment) //
				.filter(this::isLineEmpty) //
				.count();		
	}

	private String removeStringConstantsFromCodeString(String codeWithoutBlockComments) {
		return codeWithoutBlockComments.replaceAll("\".*\"", "\"\"");
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
