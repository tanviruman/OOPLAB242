// create Course class
public class Course {
    public String courseCode;
    public String courseName;
    public double credits;

    public Course(String courseCode, String courseName, double credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }
}

// create Department

// create CSE subclass

// create EEE subclass

// create CIVIL subclass

// create DATA_SCIENCE subclass


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