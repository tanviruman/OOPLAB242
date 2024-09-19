public class Container {
    public static void main(String[] args) {
        String s1 = "xyaAbAbAdfg";
        String s2 = "AbA";

        boolean b = s1.contains(s2);
       //int i = s1.indexOf(s2);
      // System.out.println(i);

        String s3 = s1.substring(3);
        System.out.println(s3);

        String s4 = s1.substring(3,7);
        System.out.println(s4);

        System.out.println(s1.substring(1,1));


        char[] c = s2.toCharArray();

 }


}
