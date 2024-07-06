public class emloyee {
    double salary = 500000;
}

class programmer extends emloyee{

    int bonus=100000;

    public static void main(String[] args) {

        programmer p = new programmer();

        System.out.println("Salary="+p.salary);
        System.out.println("Bonus="+p.bonus);


    }

}