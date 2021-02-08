package Project3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class FileHandlingProject {
	
	private File textfile;
	
	public File getText() {
		return textfile;
	}
	
	

	public File CreateFile(String text) {
		try {
			textfile = new File(text);
			if(textfile.createNewFile()) {
				System.out.println("A new file was created named "+textfile.getName());
			}
			else {
				System.out.println("This file was already made.");
			}
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
		return textfile;
	}
	
	
	
	public void WriteFile(String writetext) {	  
		    try {
		      FileWriter writing = new FileWriter(textfile, true);
		      writing.write(writetext);
		      writing.close();
		      System.out.println("File was written successfully.");
		    } 
		    catch (IOException ex) {
		      System.out.println(ex.getMessage());
		    }
		  }
	
	
		
	public boolean ReadFile(String textfile) {
        try {
            Stream<String> s = Files.lines(Paths.get(textfile));
            for (String x : s.collect(Collectors.toList())) {
                System.out.println(x);
            }
            s.close();
        }
        catch(IOException iex) {
            System.err.println(iex.getMessage());
            return false;
        }
        return true;
        }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FileHandlingProject fh = new FileHandlingProject();
		File newFile = fh.CreateFile("test.txt");
		System.out.println("The file is located in the folder "+ newFile.getAbsolutePath());
		System.out.println("Enter what you would like to input into the text file. ");
		String s = input.nextLine();
		fh.WriteFile(s);
		System.out.println("The text written in the file is below the line.");
		System.out.println("-----------------------------------------------");
		fh.ReadFile("test.txt");
		
	}
}
	
	

