public class Main {
    public static void main(String[] args) {
        Student s =new Student("Ahmed",12143683,"sdfsdf@hotmail.com");
        Student s1 =new Student("Liam",12345432,"liammm@hotmail.com");
        Course c=new Course(4001,"Adv","Musafa Assaf",2);
        Course c1=new Course(3001,"Softwere","Musafa Assaf",2);
        University u=new University();
        u.addStudent(s);
        u.addStudent(s1);
        u.studentToCoures(c,s);
        u.studentToCoures(c,s1);
        u.addCourse(c);
        u.addCourse(c1);
        u.reportCourses();
        u.reportStudentsForCourse(c);
        u.reportStudentsForCourse(c1);
        u.reportALl(s,c);
        u.reportALl(s1,c1);
    }

}