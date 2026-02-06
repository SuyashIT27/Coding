import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1. FileWriter is used for writing streams of characters to files.
//        2. It's a character-based stream, which means it's best used for
//writing text rather than binary data.
//        3. Constructors:
//        ° FileWriter(String fileName): Creates a FileWriter object given
//the name of the filé to write to.
//        • FileWriter(File file): Creates a FileWriter object given a File
//object.
//4. Common Methods:
//write(int c): Writes a single character.
//° write(char[] cbuf): Writes an array of characters.
//° write(String str): Writes a string.
//flush(): Flushes the stream, ensuring all data is written out.
//• close(): Closes the stream, releasing any associated system
//resources.
public class FileHandeling{
    public static void main(String[] args) {
//       fileReading();
       try {
           FileWriter fr = new FileWriter("firstFile.txt");
           fr.write("Hello World1!");
           fr.flush();
           fr.close();
       }catch(IOException ex){
           System.out.println("There is the error");
           System.out.println(ex.getMessage());
        };


    }
    public static void fileWritting(){
        String fileName="firstFile.txt";
        try{
            FileWriter fr=new FileWriter(fileName);
            fr.write("Hello my name is suyash verma\n");
            fr.write("this is the second time.");
            fr.flush();
            fr.close();
            System.out.println("file sucessfully created");
        }
        catch (IOException exp){
            System.out.println("Error in the file handeling.");
            System.out.println(exp.getMessage());
        }
    }
    public static void fileReading(){
        String filename="firstFile.txt";
        try{
            FileReader fr=new FileReader(filename);
            int CharcterAt=0;
            do{
                CharcterAt=fr.read();
                System.out.print((char)CharcterAt);
            }while(CharcterAt !=-1);
        }catch (IOException exp){
            System.out.println("There is some error.");
        }
    }
}