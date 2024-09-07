
// Course class to represent an individual course
 class Course {
    public String courseCode;
    public String courseName;
    public double credits;

    public Course(String courseCode, String courseName, double credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }
}

// Abstract Department class
abstract class Department {
    private String departmentName;
    protected Course[] courses;

    public Department(String departmentName, Course[] courses) {
        this.departmentName = departmentName;
        this.courses = courses;
    }

    public void displayCourses() {
        System.out.println("Department: " + departmentName);
        for (Course course : courses) {
            System.out.println("Course Code: " + course.courseCode + ", Course Name: " + course.courseName + ", Credits: " + course.credits);
        }
    }
}

// CSE Department subclass
class CSE extends Department {
    public CSE() {
        super("CSE", new Course[]{
                new Course("CSE 1115", "OOP", 3.0),
                new Course("CSE 1116", "OOP Lab", 1.0)
        });
    }
}

// EEE Department subclass
class EEE extends Department {
    public EEE() {
        super("EEE", new Course[]{
                new Course("EEE 2113", "Electrical Circuits", 3.0),
                new Course("EEE 2123", "Electronics", 3.0)
        });
    }
}

// CIVIL Department subclass
class CIVIL extends Department {
    public CIVIL() {
        super("CIVIL", new Course[]{
                new Course("CE 2171", "Fluid Mechanics", 3.0),
                new Course("CE 2172", "Fluid Mechanics Lab", 1.5)
        });
    }
}

// DATA_SCIENCE Department subclass
class DATA_SCIENCE extends Department {
    public DATA_SCIENCE() {
        super("DATA_SCIENCE", new Course[]{
                new Course("DS 3521", "Data Visualization", 3.0),
                new Course("DS 3522", "Data Visualization Lab", 1.0)
        });
    }
}

// Main class
public class UIU2 {
    public static void main(String[] args) {
        Department[] departments = new Department[4];
        departments[0] = new CSE();
        departments[1] = new EEE();
        departments[2] = new CIVIL();
        departments[3] = new DATA_SCIENCE();

        for (Department department : departments) {
            department.displayCourses();
            System.out.println();
        }
    }
}

