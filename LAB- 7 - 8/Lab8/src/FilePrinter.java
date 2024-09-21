import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter {
    public static void main(String[] args) {

        try{
            File file = new File("Files/A.txt");

            PrintWriter out = new PrintWriter(file);
            for(int i=0;i<2000;i++){
                out.println("OOp class");
            }

            //out.println("Sec Y");

            out.close();


        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
