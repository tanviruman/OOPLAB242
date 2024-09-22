import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         try{

             File file_r= new File("E:\\NAruto\\Input.txt");// Scan from here
             File file_out=new File("E:\\NAruto\\Output.txt");

             PrintWriter write=new PrintWriter(file_out);


             Scanner sc=new Scanner(file_r);
             Scanner s= new Scanner(System.in);

             String a=s.nextLine();

             for(int i=1; sc.hasNextLine();i++ ){

                 int count=0;

               String f=sc.nextLine();
               String[] part=f.split(" ");

               for(int j=0; j<part.length ; j++){
                   if(part[j]==null)
                     break;
                   if(part[j].equalsIgnoreCase(a)) count++;

               }

               if(count>0){
                   write.println(i+"-"+ count);
               }



             }

            sc.close();
             write.close();
         }catch( IOException e){
             e.printStackTrace();
         }
        }
    }