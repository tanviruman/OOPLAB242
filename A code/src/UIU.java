
public class UIU {

    public static void main(String[] args) {

        Course cse1115 = new Course("CSE 1115", "OOP", 3.0);
        Course cse1116 = new Course("CSE 1116", "OOP Lab", 1.0);

        Course eee4121= new Course("EEE 4121 ", "VLSI Design", 3.0);
        Course eee4122 = new Course("EEE 4122", "VLSI Design Lab", 1.0);

        Course civil2101 = new Course("CIVIL 2101", "Engineering Materials", 3.0);
        Course civil2201 = new Course("CIVIL 2201", "engineering Geology and Geomorphology", 3.0);

        Course dataScience1101 = new Course("DATA_SCIENCE 1101", "Fundamental of Data Science", 3.0);
        Course dataScience3885 = new Course("DATA_SCIENCE 3885", "Data Wranglig", 3.0);

        Department cse = new Department("Computer Science and Engineering");
        cse.addCourse(cse1115);
        cse.addCourse(cse1116);

        Department eee = new Department("Electrical and Electronic Engineering");
        eee.addCourse(eee4121);
        eee.addCourse(eee4122);

        Department civil = new Department("Civil Engineering");
        civil.addCourse(civil2101);
        civil.addCourse(civil2201);

        Department dataScience = new Department("Data Science");
        dataScience.addCourse(dataScience1101);
        dataScience.addCourse(dataScience3885);

        System.out.println("Department Courses:");
        cse.displayCourses();
        eee.displayCourses();
        civil.displayCourses();
        dataScience.displayCourses();
    }
}