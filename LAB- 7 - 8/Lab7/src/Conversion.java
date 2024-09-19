public class Conversion {
    public static void main(String[] args) {
        //String to other data type Conversion

        String s1 = "10";
        String s2 = "13243256";
        String s3 = "true";

        int a = Integer.parseInt(s1);
        long l1 = Long.parseLong(s2);
        boolean b1 = Boolean.parseBoolean(s3);

        //Other data type to String Conversion

        int a1 =5;
        float a2 = 5.6f;

        String s4= a1 + "";
        s4 = String.valueOf(a1);

        String s5  = String.valueOf(a2);




    }
}
