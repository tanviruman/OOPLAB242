// Course.java
class Course {
    private String courseCode;
    private String courseName;
    private double credits;

    // Constructor to initialize course attributes
    public Course(String courseCode, String courseName, double credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Method to display the course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName + ", Credits: " + credits);
    }
}

// Department.java
class Department {
    private String departmentName;
    private Course[] courses; // Array to hold courses offered by the department

    // Constructor to initialize department attributes
    public Department(String departmentName, Course[] courses) {
        this.departmentName = departmentName;
        this.courses = courses;
    }

    // Method to display the courses offered by the department
    public void displayCourses() {
        System.out.println("Department: " + departmentName);
        for (Course course : courses) {
            course.displayCourseDetails(); // Display details of each course
        }
    }
}

// UIU.java
public class UIU {
    public static void main(String[] args) {
        // Creating Course objects for CSE department
        Course cse1 = new Course("CSE1115", "OOP", 3.0);
        Course cse2 = new Course("CSE1116", "OOP Lab", 1.0);
        Course[] cseCourses = {cse1, cse2}; // Array of courses for CSE

        // Creating Department object for CSE
        Department cseDepartment = new Department("CSE", cseCourses);

        // Creating Course objects for EEE department
        Course eee1 = new Course("EEE1211", "Electrical Circuits", 3.0);
        Course eee2 = new Course("EEE1212", "Electrical Circuits Lab", 1.0);
        Course[] eeeCourses = {eee1, eee2}; // Array of courses for EEE

        // Creating Department object for EEE
        Department eeeDepartment = new Department("EEE", eeeCourses);

        // Creating Course objects for CIVIL department
        Course civil1 = new Course("CIVIL1010", "Introduction to Civil Engineering", 3.0);
        Course civil2 = new Course("CIVIL1011", "Engineering Mechanics", 3.0);
        Course[] civilCourses = {civil1, civil2}; // Array of courses for CIVIL

        // Creating Department object for CIVIL
        Department civilDepartment = new Department("CIVIL", civilCourses);

        // Creating Course objects for DATA_SCIENCE department
        Course data1 = new Course("DATA2010", "Data Science Fundamentals", 3.0);
        Course data2 = new Course("DATA2011", "Machine Learning", 3.0);
        Course[] dataCourses = {data1, data2}; // Array of courses for DATA_SCIENCE

        // Creating Department object for DATA_SCIENCE
        Department dataScienceDepartment = new Department("DATA_SCIENCE", dataCourses);

        // Display courses for each department
        cseDepartment.displayCourses();
        eeeDepartment.displayCourses();
        civilDepartment.displayCourses();
        dataScienceDepartment.displayCourses();
    }
}
