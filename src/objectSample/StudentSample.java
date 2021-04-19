package objectSample;

public class StudentSample {
    public static void main(String[] args) {
        Student[] students = {
                new Student("あいざわ",1,1,1),
                new Student("いいだ",2,2,2),
                new Student("うえの",3,3,3)
        };

        for (Student student:students) {
            System.out.println(student);
        }
    }
}