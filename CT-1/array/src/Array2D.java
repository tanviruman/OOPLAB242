import java.util.Scanner;
public class Array2D {
    import java.util.Scanner;

    public class Array2D {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
//        int row,col;
//        row= sc.nextInt();
//        col= sc.nextInt();
//        int[][] num= new int[row][col]; //Array declaration
//
//        int[][] num1= {{1,2,3},
//                        {4,5,6}}; //manually initialization
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                num[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<3;i++){
//            int sum=0;
//            for(int j=0;j<3;j++){
//                sum+= num[j][i];
//            }
//            System.out.println("Sum of column " +(i+1) + " " + sum);
//        }

            //task: find maximum number in each row and column

            int[][] num ={ {1,2,3},
                    {4,5},
                    {7,8,9,10}}; //ragged array
            System.out.println("Row Size" + num.length);
            System.out.println("Column size in first row" + num[0].length);
            System.out.println("Column size in second row" + num[1].length);
            System.out.println("Column size in third row" + num[2].length);
            for(int i=0;i<num.length;i++){
                for(int j=0;j<num[i].length;j++){
                    System.out.print(num[i][j]+ " ");
                }
                System.out.println();
            }

            int[][] num1 = new int[3][];
            num1[0]= new int[1];
            num1[1]= new int[2];
            num1[2]=new int[3];
            for(int i=0;i<num1.length;i++){
                for(int j=0;j<num1[i].length;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }




}
