import java.util.ArrayList;
import java.util.List;
public class Course {
    private int courseCode;
    private String title;
    private String instructor;
    private int maxCapacity;
    private List<Student> studentList;
    public Course(int courseCode,String title,String instructor,int maxCapacity){
        this.title=title;
        this.courseCode=courseCode;
        this.instructor=instructor;
        this.maxCapacity=maxCapacity;
        studentList=new ArrayList<>();
    }

    public int getCourseCode() {
        return courseCode;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Course Code: " + this.courseCode + "\tTitle: " + this.title + "\tInstructor: " + this.instructor;
    }
}
