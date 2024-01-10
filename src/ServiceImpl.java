public class ServiceImpl implements Service{
    @Override
    public Student findByName(Course course, String name) {
        for (Student student : course.getStudents()){
            if (course.getCourseName().equals(name)){
                return student;
            }
        }
        throw new RuntimeException("Не найден пользователь по такой name" + course);
    }

    @Override
    public Student findById(Course course, int id) {
        for (Student student : course.getStudents()){
            if (course.getId() == id){
                return student;
            }
        }

        throw new RuntimeException(" Не найден пользователь по такой id " + course);
    }

    @Override
    public int averageEstimation(Course course) {
        int summa = 0;
        for (Student student : course.getStudents()){
            summa+= student.getAge();
        }
        return summa / course.getStudents().length;
    }

    @Override
    public int countGirlInCourse(Course course) {
        int count = 0;
        for (Student student : course.getStudents()){
            if (student.getGender().equals(Gender.FEMALE)){
                count++;
            }
        }
        return count;
    }

    @Override
    public int countBoyInCourse(Course course) {
        int count = 0;
        for (Student student : course.getStudents()){
            if (student.getGender().equals(Gender.MALE)){
                count++;
            }
        }
        return count;
    }

    @Override
    public Student[] getByAge(Course course, int age) {
        Student[] students = new Student[course.getStudents().length];
        int count = 0;
        for (Student student : course.getStudents()){
            if (student.getAge() == age){
                students[count]= student;
            }
            count++;
        }
        return students;
    }

    @Override
    public void updateStudent(Course course, int studentId) {
        for (Student student : course.getStudents()){
            System.out.println(student);
        }

    }

    @Override
    public int maxEstimation(Course course) {
        int max = 0;
        for (Student student : course.getStudents()){
            if (student.getEstimation() > max){
                max = student.getEstimation();
            }
        }
        return max;
    }
}
