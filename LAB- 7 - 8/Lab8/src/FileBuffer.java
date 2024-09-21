import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBuffer {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("Files/Test");
            BufferedWriter filewrite = new BufferedWriter(file);

            filewrite.write("abcd\n");
           // filewrite.newLine();
            filewrite.write("12454\n");
            filewrite.write(97 + " ");

            filewrite.close();
        }
        catch(IOException e){
            e.printStackTrace();

        }


    }
}
