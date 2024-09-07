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
    public abstract void displayCourses();
}

// CSE subclass
class CSE extends Department {
    private Course[] courses;

    public CSE() {
        courses = new Course[2];
        courses[0] = new Course("CSE 1115", "OOP", 3.0);
        courses[1] = new Course("CSE 1116", "OOP Lab", 1.0);
    }

    @Override
    public void displayCourses() {
        System.out.println("Department: CSE");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.courseCode + ", Course Name: " + course.courseName + ", Credits: " + course.credits);
        }
    }
}

// EEE subclass
class EEE extends Department {
    private Course[] courses;

    public EEE() {
        courses = new Course[2];
        courses[0] = new Course("EEE 2113", "Electrical Circuits", 3.0);
        courses[1] = new Course("EEE 2123", "Electronics", 3.0);
    }

    @Override
    public void displayCourses() {
        System.out.println("Department: EEE");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.courseCode + ", Course Name: " + course.courseName + ", Credits: " + course.credits);
        }
    }
}

// CIVIL subclass
class CIVIL extends Department {
    private Course[] courses;

    public CIVIL() {
        courses = new Course[2];
        courses[0] = new Course("CE 2171", "Fluid Mechanics", 3.0);
        courses[1] = new Course("CE 2172", "Fluid Mechanics Lab", 1.5);
    }

    @Override
    public void displayCourses() {
        System.out.println("Department: CIVIL");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.courseCode + ", Course Name: " + course.courseName + ", Credits: " + course.credits);
        }
    }
}

// DATA_SCIENCE subclass
class DATA_SCIENCE extends Department {
    private Course[] courses;

    public DATA_SCIENCE() {
        courses = new Course[2];
        courses[0] = new Course("DS 3521", "Data Visualization", 3.0);
        courses[1] = new Course("DS 3522", "Data Visualization Lab", 1.0);
    }

    @Override
    public void displayCourses() {
        System.out.println("Department: DATA_SCIENCE");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.courseCode + ", Course Name: " + course.courseName + ", Credits: " + course.credits);
        }
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
