public class StringSplit {
    public static void main(String[] args) {
        String s = "Abc, 101, 3.56" ; //Abc || 101 || 3.5

        String[] parts = s.split("1");

        for (int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }


    }
}
