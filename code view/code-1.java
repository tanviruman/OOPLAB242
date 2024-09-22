import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static boolean is_num(String a){
        try{
            Double.parseDouble(a);
            return true;
    }
    
    
    catch(NumberFormatException e){
        return false;
        }
    }


    
    public static void main(String[] args) {
        try{
            File file_r=new File("C:\\Users\\user\\IdeaProjects\\untitled3\\src\\PostsInput.txt");
            File file_w=new File("C:\\Users\\user\\IdeaProjects\\untitled3\\src\\PostsOutput.txt");

            PrintWriter write=new PrintWriter(file_w);
            Scanner sc=new Scanner(file_r);

            while(sc.hasNextLine()){

                String s=sc.nextLine();
                String[]part=s.split(" ");
                for(int i=0;i<part.length;i++){
                    if(is_num(part[i])==true){
                        write.print(part[i]+" ");
                    }
                }
                write.println();

            }
            sc.close();
            write.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}