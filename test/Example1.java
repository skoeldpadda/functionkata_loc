import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Example1 {

	private static String exampleCode1 = "/*\r\n" + 
			" * C# Program to Perform Bubble Sort\r\n" + 
			" */\r\n" + 
			"using System;\r\n" + 
			"class bubblesort\r\n" + 
			"{\r\n" + 
			"	static void Main(string[] args)\r\n" + 
			"	{\r\n" + 
			"		int[] a = { 3, 2, 5, 4, 1 };  \r\n" + 
			"		int t;\r\n" + 
			"		/* Heres a block comment\r\n" + 
			"		* with several lines\r\n" + 
			"		* hej hej hej */\r\n" + 
			"		Console.WriteLine(\"The Array is : \");\r\n" + 
			"		for (int i = 0; i < a.Length; i++)\r\n" + 
			"		{\r\n" + 
			"			Console.WriteLine(a[i]);\r\n" + 
			"		}\r\n" + 
			"		for (int j = 0; j <= a.Length - 2; j++)\r\n" + 
			"		{\r\n" + 
			"			for (int i = 0; i <= a.Length - 2; i++)\r\n" + 
			"			{\r\n" + 
			"				if (a[i] > a[i + 1])\r\n" + 
			"				{\r\n" + 
			"					// Line comment\r\n" + 
			"					t = a[i + 1];\r\n" + 
			"					a[i + 1] = a[i];\r\n" + 
			"					a[i] = t;\r\n" + 
			"				}\r\n" + 
			"			}\r\n" + 
			"		}\r\n" + 
			"		// Line comment\r\n" + 
			"		Console.WriteLine(\"The Sorted Array :\");\r\n" + 
			"		foreach (int aray in a)                         \r\n" + 
			"			Console.Write(aray + \" \");\r\n" + 
			"		Console.ReadLine();\r\n" + 
			"	}\r\n" + 
			"}";
	
	@Test
	public void bubbleSortLOCShouldBe30() {
		LOC loc = new LOC();
		assertEquals(30, loc.linesOfCode(exampleCode1));
	}
}
