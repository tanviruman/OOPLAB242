public class Department {
    String name;
    Course[] courses;

    public Department(String name) {
        this.name = name;
        this.courses = new Course[100];
    }

    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return;
            }
        }
        System.out.println("Warning: Department course list is full!");
    }

    public void displayCourses() {
        System.out.println("Department: " + name);
        for (Course course : courses) {
            if (course != null) {
                System.out.println("  Course Code: " + course.courseCode + ", Course Name: " + course.courseName + ", Credits: " + course.credits);
            }
        }
        System.out.println();
    }
}









