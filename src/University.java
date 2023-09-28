import java.util.List;
import java.util.ArrayList;
public class University {
    private List<Student> studentList;
    private List<Course> courseList;
    public University(){
        studentList=new ArrayList<>();
        courseList=new ArrayList<>();
    }
    public void  addStudent(Student s){// add student to university
        studentList.add(s);
    }
    public void addCourse(Course c){
        courseList.add(c);

    }
    public void studentToCoures(Course c,Student s){
        if(c.getStudentList().size()>=c.getMaxCapacity()) {
            System.out.println("The Course is Full");
        }
        else {
            c.getStudentList().add(s);//add student to course
            s.getEnrolledCorse().add(c);//add new course to student
        }
    }
    public void dropStudentFromCourse(Student s,Course c){
        c.getStudentList().remove(s);
        s.getEnrolledCorse().remove(c);
    }
    public void reportCourses(){
        System.out.println(courseList);
    }
    public void reportCoursesForStudent(Student s){
        System.out.println(s.getEnrolledCorse());
    }
    public void reportStudentsForCourse(Course c){
        System.out.println(c.getStudentList());
    }
    public void reportALl(Student s,Course c){
        reportCourses();
        reportCoursesForStudent(s);
        reportStudentsForCourse(c);

    }
}
