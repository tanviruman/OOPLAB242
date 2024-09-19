
import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        String s1 = "abc";
        Scanner sc = new Scanner(System.in);
//      for(int i=0;i<3;i++){
//          String s2 = sc.next();
//
//          if(s1.equals(s2)){
//              System.out.println("Equal");
//          }
//          else{
//              System.out.println("Not equal");
//          }
//      }


      for(int i=0;i<3;i++){
          String s2 = sc. next();

          int res = s1.compareTo(s2);
          if(res>0){
              System.out.println(res);
              System.out.println("S1 is bigger than S2");
          }
          else if(res<0){
              System.out.println(res);
              System.out.println("S1 is smaller than s2");
          }
          else{
              System.out.println("Both are Equal");
          }


      }

    }
}
