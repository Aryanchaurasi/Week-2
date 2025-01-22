import java.util.*;
public class UniversityManagement {
    public static void main(String[] args) {
        // Example usage
        Student student = new Student("Aryan chaurasia", "211033");
        Professor professor = new Professor("Nischal Kaushal", "Training and Placement");
        Course course = new Course("AL-801", "Business Intellegence");

        student.enrollCourse(course);
        professor.assignCourse(course);

        System.out.println(student);
        System.out.println(professor);
        System.out.println(course);
    }
}

class Student {
    private String name;
    private String studentId;
    private Course course;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void enrollCourse(Course course) {
        this.course = course;
        course.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student name = " + name + " ,  Student studentId = " + studentId + " , Student course = " + course.getCourseName() ;
    }
}

class Professor {
     String name;
     String department;
    Course course;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void assignCourse(Course course) {
        this.course = course;
        course.setProfessor(this);
    }

    @Override
    public String toString() {
        return "Professor name = " + name + " , Professor department = " + department + " , Professor's course = " + course.getCourseName() ;
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course Code = " + courseCode + " , Course Name = " + courseName + " , Professor = " + professor.name + ", Students = " + students.size() ;
    }
}