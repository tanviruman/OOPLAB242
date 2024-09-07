// create Course class
class Course
{
    public String course_code;
    public String course_name;
    public double number_of_credits;

    public Course(String course_code, String course_name, double number_of_credits)
    {
        this.course_code = course_code;
        this.course_name = course_name;
        this.number_of_credits = number_of_credits;
    }
    public void displayCourse()
    {
        System.out.println("Course Code: " + course_code + ", Course Name: " + course_name + ", Credits: " + number_of_credits);
    }
}
// create Department
 class Department {
    public String department_name;
    public Course[] Courses;

    public void displayCourses()
    {
        System.out.println("Department: " + department_name);

        for (int i = 0; i < Courses.length; i++)
        {
            Courses[i].displayCourse();
        }

    }
}
// create CSE subclass
class CSE extends Department
{
    public CSE()
    {
        department_name = "CSE";
        Courses = new Course[2];
        Courses[0] = new Course("CSE 1115", "OOP", 3.0);
        Courses[1] = new Course("CSE 1116", "OOP Lab", 1.0);

    }
}

// create EEE subclass
class EEE extends Department
{
    public EEE()
    {
        department_name = "EEE";
        Courses = new Course[2];
        Courses[0] = new Course("EEE 2113", "Electrical Circuits", 3.0);
        Courses[1] = new Course("EEE 2123", "Electronics", 3.0);
    }
}

// create CIVIL subclass
class CIVIL extends Department
{
    public CIVIL()
    {
        department_name = "CIVIL";
        Courses = new Course[2];
        Courses[0] = new Course("CE 2171", "Fluid Mechanics", 3.0);
        Courses[1] = new Course("CE 2172", "Fluid Mechanics Lab", 1.5);
    }
}

// create DATA_SCIENCE subclass
class DATA_SCIENCE extends Department
{
    public DATA_SCIENCE()
    {
        department_name = "DATA_SCIENCE";
        Courses = new Course[2];
        Courses[0] = new Course("DS 3521", "Data Visualization", 3.0);
        Courses[1] = new Course("DS 3522", "Data Visualization Lab", 1.0);
    }
}

// Main class
public class UIU {
    public static void main(String[] args) {
        Department[] departments = new Department[4];
        departments[0] = new CSE();
        departments[1] = new EEE();
        departments[2] = new CIVIL();
        departments[3] = new DATA_SCIENCE();

        for (int i = 0; i < departments.length; i++) {
            departments[i].displayCourses();
            System.out.println();
        }
    }
}


// output:

/*

Department: CSE
Course Code: CSE 1115, Course Name: OOP, Credits: 3.0
Course Code: CSE 1116, Course Name: OOP Lab, Credits: 1.0

Department: EEE
Course Code: EEE 2113, Course Name: Electrical Circuits, Credits: 3.0
Course Code: EEE 2123, Course Name: Electronics, Credits: 3.0

Department: CIVIL
Course Code: CE 2171, Course Name: Fluid Mechanics, Credits: 3.0
Course Code: CE 2172, Course Name: Fluid Mechanics Lab, Credits: 1.5

Department: DATA_SCIENCE
Course Code: DS 3521, Course Name: Data Visualization, Credits: 3.0
Course Code: DS 3522, Course Name: Data Visualization Lab, Credits: 1.0

*/