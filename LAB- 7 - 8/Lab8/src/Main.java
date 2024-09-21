import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a =10,c = 0;
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();
        int[ ] array = new int[4];
        try{
             c = a/b;
             array[5] = 34;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
        }

    }
}
