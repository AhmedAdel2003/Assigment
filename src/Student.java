import java.util.ArrayList;
import java.util.List;
public class Student {
    private String Sname;
    private int SID;
    private String email;
    private List<Course> enrolledCorse;
    public Student(String Sname,int SID,String email){
        this.Sname=Sname;
        this.SID=SID;
        this.email=email;
        enrolledCorse=new ArrayList<>();
    }

    public String getSname() {
        return Sname;
    }

    public String getEmail() {
        return email;
    }

    public int getSID() {
        return SID;
    }

    public List<Course> getEnrolledCorse() {
        return enrolledCorse;
    }
    public void addCourse(Course course) {
        enrolledCorse.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCorse.remove(course);
    }

    @Override
    public String toString() {
        return "Student ID: " + this.SID + "\tName: " + this.Sname + "\tEmail: " + this.email;
    }
}
