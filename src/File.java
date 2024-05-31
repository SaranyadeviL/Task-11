import java.io.FileNotFoundException;
import java.util.Scanner;


public class File {
    public static void main(String[] args) {
        try{
            readFile("read.txt");
        }
        catch(FileNotFoundException e){
            System.err.println("File not Found:" +e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File (readFile());
        Scanner scanner = new Scanner("read.txt");
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

}
