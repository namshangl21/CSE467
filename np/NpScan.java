import java.io.*;
public class NpScan {
    public static void main(String[] args) throws IOException{
		
		File file = new File("NP8.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
                File file2 = new File("NP8seg.txt");
		FileInputStream fileStream2 = new FileInputStream(file2);
		InputStreamReader input2 = new InputStreamReader(fileStream);
		BufferedReader reader2 = new BufferedReader(input2);
                
                
		String line;
		
		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 0;
		int lineCount = 0;
                int lineCount2 = 0;
                
                
		while(file.readLine() != null) {
                    line = file.readLine();
                            if(line.equals(""))
				lineCount++;
                            if(!(line.equals("")))
				lineCount++;
                        }
                file.close();
                String arr[] = new String[lineCount];
                
		 for(int j = 0; j <= lineCount; j++) {
			
                                String lineUS = file.readLine();
				int lineCount2++;
				characterCount += lineUS.length();
				
				String[] wordList = lineUS.split("\\s+");
				
				countWord += wordList.length;
                                
                             for(int i = 0; i < countWord; i++)
                            {
                                String line5 = fileStream2.readLine();
                                String str  = "";
                                str += line5;
                        }
                         arr[j] = str;   
		}
				
                                                       
				String[] sentenceList = line.split("[!?.:]+");
				
				sentenceCount += sentenceList.length;
				}
       
		}
                
               
		System.out.println("Total lines = " + lineCount);
		System.out.println("Total word count = " + countWord);
		System.out.println("Total number of sentences = " + sentenceCount); 
		System.out.println("Total number of characters = " + characterCount);
	}
}
