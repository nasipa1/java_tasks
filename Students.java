import java.util.Scanner;

class Students {
    private String firstName;
    private String lastName;
    private int studentID;
    private String major;
    private int year;
    private String[] coursesRegistered;

    public Students(int studentID, String firstName, String lastName, String major, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.major = major;
        this.year = year;
        this.coursesRegistered = new String[4];
    }

    public String getStudentID() {
        return studentID + "";
    }

    public String[] getCoursesRegistered() {
        return coursesRegistered;
    }
}

class Course {
    private String professor;
    private String course;
    private String courseID;
    private int maxStudents;
    private String[] studentList;
    private int credits;

    public Course(String professor, String course, String courseID, int maxStudents, int credits) {
        this.professor = professor;
        this.course = course;
        this.courseID = courseID;
        this.maxStudents = maxStudents;
        this.studentList = new String[maxStudents];
        this.credits = credits;
    }

    public String[] getStudentList() {
        return studentList;
    }

    public String getCourseID() {
        return courseID;
    }
}

class University {
    private Students[] students;
    private Course[] courses;

    public University() {
        this.students = new Students[100];
        this.courses = new Course[50];
    }

    public void addStudent(Students student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                break;
            }
        }
    }

    public void registerStudentForCourse(String studentID, String courseID) {
        Students student = null;
        Course course = null;

        for (Students s : students) {
            if (s != null && s.getStudentID().equals(studentID)) {
                student = s;
                break;
            }
        }

        for (Course c : courses) {
            if (c != null && c.getCourseID().equals(courseID)) {
                course = c;
                break;
            }
        }

        if (student == null || course == null) {
            System.out.println("Student or course not found.");
            return;
        }

        String[] studentList = course.getStudentList();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = studentID;
                System.out.println(studentID + " successfully registered for " + courseID);
                return;
            }
        }
        System.out.println("Course is full");
    }

    public void listStudentsByCourse(String courseID) {
        for (Course c : courses) {
            if (c != null && c.getCourseID().equals(courseID)) {
                for (String studentID : c.getStudentList()) {
                    if (studentID != null) {
                        System.out.println("Student ID: " + studentID);
                    }
                }
                return;
            }
        }
        System.out.println("Course not found");
    }

    public void listCoursesByStudent(String studentID) {
        for (Students s : students) {
            if (s != null && s.getStudentID().equals(studentID)) {
                for (String course : s.getCoursesRegistered()) {
                    if (course != null) {
                        System.out.println("Course ID: " + course);
                    }
                }
                return;
            }
        }
        System.out.println("Student not found");
    }
}

class MainCourses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University university = new University();

        while (true) {
            System.out.println("1 - add student, 2 - add course, 3 - register students for course, 4 - list students by course, 5 - list courses by student, 6 - exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    int studentID = sc.nextInt();
                    System.out.println("Enter student name: ");
                    String name = sc.next();
                    System.out.println("Enter student last name: ");
                    String lastName = sc.next();
                    System.out.println("Enter student's major: ");
                    String major = sc.next();
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    university.addStudent(new Students(studentID, name, lastName, major, year));
                    break;
                case 2:
                    System.out.println("Enter professor name: ");
                    String profName = sc.next();
                    System.out.println("Enter course name: ");
                    String courseName = sc.next();
                    System.out.println("Enter course ID: ");
                    String courseID = sc.next();
                    System.out.println("Enter max students: ");
                    int maxStudents = sc.nextInt();
                    System.out.println("Enter credits: ");
                    int credits = sc.nextInt();
                    university.addCourse(new Course(profName, courseName, courseID, maxStudents, credits));
                    break;
                case 3:
                    System.out.println("Enter student ID: ");
                    String studentId = sc.next();
                    System.out.println("Enter course ID: ");
                    String courseId = sc.next();
                    university.registerStudentForCourse(studentId, courseId);
                    break;
                case 4:
                    System.out.println("Enter course ID: ");
                    String cid = sc.next();
                    university.listStudentsByCourse(cid);
                    break;
                case 5:
                    System.out.println("Enter student ID: ");
                    String sid = sc.next();
                    university.listCoursesByStudent(sid);
                    break;
                case 6:
                    sc.close();
                    return;
            }
        }
    }
}
