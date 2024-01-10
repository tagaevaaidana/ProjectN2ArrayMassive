import java.beans.JavaBean;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student1  = new Student(1, "Aidana","Tagaeva",Gender.FEMALE,7,25);
        Student student2  = new Student(2, "Bek","Usonov",Gender.MALE,5,23);
        Student student3  = new Student(3, "Jaza","Beknayz",Gender.FEMALE,7,17);
        Student student4  = new Student(4, "Zuura","Bekova",Gender.FEMALE,6,29);
        Student student5  = new Student(5, "Nyrgazy","Aidarov",Gender.MALE,10,35);
        Student student6  = new Student(6, "Diana","Talasova",Gender.FEMALE,3,27);
        Student student7  = new Student(7, "Yana","Pak",Gender.FEMALE,4,3);
        Student student8  = new Student(8, "Masha","Ondrikova",Gender.FEMALE,6,21);
        Student student9  = new Student(9, "Pasha","Ashuraliev",Gender.MALE,7,25);
        Student student10  = new Student(10, "Alex","Max",Gender.MALE,5,19);

        Student [] students = new Student[]{student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        Course course1 = new Course(1,"JAVA",1000, students);
        Course course2 = new Course(2, "Java+", 1200,students);
        Course course3 = new Course(3,"Python", 3400,students);
        Course course4 = new Course(4,"C++",5000, students);
        Course course5 = new Course(5,"Java screap", 6700,students);



        ServiceImpl service = new ServiceImpl();
//        System.out.println(service.findById(course1,1));
//        System.out.println(service.findByName(course2,"Aidana"));
//        System.out.println(service.averageEstimation(course3));
//        System.out.println(service.countGirlInCourse(course4));
//        System.out.println(service.countBoyInCourse(course1));
//        System.out.println(service.getByAge(course1[]));
        System.out.println(service.maxEstimation(course2));
      


        System.out.println("Hello world!");
    }
}