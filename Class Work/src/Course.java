public class Course {
    int courseId;
    String courseName;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course name: " + courseName);
    }
}

class Student2 {
    int id;
    String name;
    String program;
    Course enrolledCourse;
    Student2(int id, String name, String program, Course course) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.enrolledCourse = course;
    }

    boolean enroll(Course course) {
        this.enrolledCourse = course;
        System.out.println(name + " enrolled in " + course.courseName);
        return true;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        if (enrolledCourse != null) {
            System.out.println("Enrolled Course: " + enrolledCourse.courseName);
        }
    }
}

class CourseManagement {
    public static void main(String[] args) {
        Course bcaCourse = new Course(123131313, "BCA");
        Student2 st1 = new Student2(123, "Nav", "BCA", bcaCourse);

        st1.displayStudent();
        st1.enrolledCourse.display();
    }
}