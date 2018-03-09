package stringPkg;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Android7\\Desktop\\1.txt");
        FileInputStream inputStream=new FileInputStream(file);
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader reader=new BufferedReader(inputStreamReader);
        String line;

        int countWord=0;
        int sentanceCount=0;
        int characterCount=0;
        int paragraphCount=1;
        int whitespaceCount=0;
        while ((line=reader.readLine())!=null)
        {
            if (line.equals(""))
                paragraphCount++;
            if (!(line.equals("")))
            {
                characterCount+=line.length();

                String[] wordList=line.split("\\s+");
                countWord+=wordList.length;
                whitespaceCount+=wordList.length-1;

                String [] sentenceList=line.split("[!?.:]+");
                sentanceCount+=sentenceList.length;
            }
        }
        System.out.println("Total world count "+countWord);
        System.out.println("Total number of sentence "+sentanceCount);
        System.out.println("Total number of character "+characterCount);
        System.out.println("Number of paragraph"+paragraphCount);
        System.out.println("Total Number of white space "+whitespaceCount);
    }
}
