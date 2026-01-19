class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}


class Student extends Person {
    private String studentId;

    public Student(String name, int age, String gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("\n________________________________");
        System.out.println("|      Student Information     |");
        System.out.println("________________________________");
        displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println();
    }
}


class Course {
    String courseCode;
    String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }
}

class Teacher extends Person {
    private String department;
    private Course[] courses;
    private int courseCount;

    public Teacher(String name, int age, String gender, String department, int maxCourses) {
        super(name, age, gender);
        this.department = department;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("Too many courses.");
        }
    }

    public void displayTeacher() {
        System.out.println("\n________________________________");
        System.out.println("|      Teacher Information     |");
        System.out.println("________________________________");
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses handled:");
        for (int i = 0; i < courseCount; i++) {
            courses[i].displayCourse();
            System.out.println();
        }
    }
}

public class TeacherStudentAssignment {
    public static void main(String[] args) {
       
        Student s1 = new Student("Libao Khenverlie", 19, "Male", "202411506");
        s1.displayStudent();

        
        Course c1 = new Course("DCIT 50", "Object-Oriented Programming");
        Course c2 = new Course("COSC 60B", "Digital Logic Design");

      
        Teacher t1 = new Teacher("Mr. Charlie Agustin", 45, "Male", "Computer Science", 5);
        t1.addCourse(c1);
        t1.addCourse(c2);

        t1.displayTeacher();
    }
}
