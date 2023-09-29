# assignment 1 : Quality of classes and OO design
### in class Student :
```java
public class Student {
    private String Sname;
    private int SID;
    private String email;
    private List<Course> enrolledCorse;
}
```
1. I defined String Sname this contains name of student .
2. I defined String email this contains Email of student .
3. I defined int Student ID -> SID this contains the ID of the student.
4. I defined List of course (enrolledCorse) this contains Courses taken by the student and i make it dynamic ArrayList <>().
5. This is a constracter in clsss student : 
```java
public class Student {

    public Student(String Sname, int SID, String email) {
        this.Sname = Sname;
        this.SID = SID;
        this.email = email;
        enrolledCorse = new ArrayList<>();
    }
}
```
6. In this code i defined the getter in class Student ,to give me a private data in class  : 
```java
public class Student {
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
}

```
7. in this code i make a methods to add and delete a course form the list enrolledCorse by function add , and functino remove :
```java
public class Student {
    public void addCourse(Course course) {
        enrolledCorse.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCorse.remove(course);
    }
}

```
8. I make a override for toString to arrange the shape of sentences when printing in a way that suits this class :
```java
public class Student {
    @Override
    public String toString() {
        return "Student ID: " + this.SID + "\tName: " + this.Sname + "\tEmail: " + this.email;
    }
}
```
##   In class Course :
```java
public class Course {
    private int courseCode;
    private String title;
    private String instructor;
    private int maxCapacity;
    private List<Student> studentList;
}
```
1. I defined integer courseCode that have a private number to course.
2. I defined String title .
3. I defined String instructor that contains name
4. I defined integer maxCapacity that contains a max number of students in course.
5. This is a constracter in clsss student : 
```java
public class Course {

    public Course(int courseCode, String title, String instructor, int maxCapacity) {
        this.title = title;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        studentList = new ArrayList<>();
    }
}

```
6. In this code i defined the getter in class Course ,to give me a private data in class  : 
```java
public class Course {
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

}

```
7. I make a override for toString to arrange the shape of sentences when printing in a way that suits this class :

```java
public class Course {
    @Override
    public String toString() {
        return "Course Code: " + this.courseCode + "\tTitle: " + this.title + "\tInstructor: " + this.instructor;
    }
}
```
## In class University : 
in this class I managed student class and course class in one class .
```java
public class University {
    private List<Student> studentList;
    private List<Course> courseList;
}
```
1. I defined list of student that contains all of students in university . 
2. I defined list of course that contains all of courses.
```java
public class University {
    public University() {
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();
    }
}
```
3. In constracter i defined studentList and courseList dynamic of a new Arraylist.
```java
public class University {
    public void  addStudent(Student s){// add student to university
        studentList.add(s);
    }
    public void addCourse(Course c){
        courseList.add(c);
    }
}
```
This methods to add new student and new courses 
```java
public class University {
    public void studentToCoures(Course c,Student s){
        if(c.getStudentList().size()>=c.getMaxCapacity()) {
            System.out.println("The Course is Full");
        }
        else {
            c.getStudentList().add(s);//add student to course
            s.getEnrolledCorse().add(c);//add new course to student
        }
    }
}
```
This method helps me in that if the class is full, it tells the student that the class is full, if not, then it registers him in this course.
```java
public class University {
    public void dropStudentFromCourse(Student s, Course c) {
        c.getStudentList().remove(s);
        s.getEnrolledCorse().remove(c);
    }
}
```
* This method (dropStudentFromCourse) : can remove coruse and student .
```java
public class University {
    public void reportCourses() {
        System.out.println(courseList);
    }
}
```
* This method (reportCourses) : can print all of course .
```java
public class University {
    public void reportCoursesForStudent(Student s) {
        System.out.println(s.getEnrolledCorse());
    }
}
```
* This method (reportCoursesForStudent) : prints all the courses that the student has registered.
```java
public class University {
    public void reportStudentsForCourse(Course c){
        System.out.println(c.getStudentList());
    }
}
```
* This method (reportStudentsForCourse): it is printed by the students in this course.
```java
public class University {
public void reportALl(Student s,Course c) {
    reportCourses();
    reportCoursesForStudent(s);
    reportStudentsForCourse(c);
   }
}
```
* This method (reportALl) : It prints all previous methods together, including students and courses