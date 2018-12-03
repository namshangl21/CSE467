import java.io.*;
import java.util.*;
public class NpScan2 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("NP8.txt");		//unsegmented text
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		File file2 = new File("NP8seg.txt");		//segmented text
		FileInputStream fileStream2 = new FileInputStream(file2);
		InputStreamReader input2 = new InputStreamReader(fileStream2);
		BufferedReader reader2 = new BufferedReader(input2);
		
		String line;		//check for strings to count number of lines
		String line2;

		int countWord = 0;
		int characterCount = 0;
		int lineCount = 0;		//counts total number of lines in unsegmented text
		int lineCount2 = 0;
		
		while((line = reader.readLine()) != null) {			//counts total number of lines in unsegmented text
			if(line.equals(""))
				lineCount++;
			
			if(!(line.equals("")))
				lineCount++;	
		}
		
		while((line2 = reader2.readLine()) != null) {			//counts total number of lines in segmented text
			if(line2.equals(""))
				lineCount2++;
			
			if(!(line2.equals("")))
				lineCount2++;
		}
		reader.close();
		reader2.close();
		
		File file3 = new File("NP8.txt");		//unsegmented text
		FileInputStream fileStream3 = new FileInputStream(file3);
		InputStreamReader input3 = new InputStreamReader(fileStream3);
		BufferedReader reader3 = new BufferedReader(input3);
		
		File file4 = new File("NP8seg.txt");		//segmented text
		FileInputStream fileStream4 = new FileInputStream(file4);
		InputStreamReader input4 = new InputStreamReader(fileStream4);
		BufferedReader reader4 = new BufferedReader(input4);
		
		String newSegArr [] = new String[lineCount];		//intialize array to size of toal lines
		int currentIndex = 0;
		
		int currentStart = 1;			//current starting line of text
		String currentLine = "";
		
		while((currentLine = reader3.readLine()) != null) {
			String str = "";
			String[] words = currentLine.split("\\s+");
			int wordsInSentence = words.length;			//gets the number of words in each line

			for(int i = 1; i < wordsInSentence; i++) {
				String segLine = reader3.readLine();
				str = str + " " + segLine;
			}
			newSegArr[currentIndex] = str;
			currentIndex++;
		}
		
		/**int index =0;
		while(newSegArr[index] != null)
		{
			System.out.println(newSegArr[index]);
			index++;
		}
		*/
		
		for(int k = 0; k < newSegArr.length; k++) {
			System.out.println(newSegArr[k]);
		}
	}
}
