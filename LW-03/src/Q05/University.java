package Q05;
class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return lecturerName;
    }
    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}


public class University {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Dr. Smith", "Database Management");
        Course course = new Course("Database Systems", "DBS101", lecturer);
        Student student = new Student("Alice Johnson", "Bachelor of ICT", "Database Systems");

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());
    }
}