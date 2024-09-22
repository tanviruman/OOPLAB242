import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public boolean is_num(String a)
    {
try{
   Double.parseDouble(a);
    return true;
}
catch (NumberFormatException e){
return false;

}

    }

    public static void main(String[] args) {
        File file_r=new File(PostsInput.txt");
        File file_w=new File("C:\\Users\\user\\IdeaProjects\\untitled3\\src\\PostsOutput.txt");
    }



}
