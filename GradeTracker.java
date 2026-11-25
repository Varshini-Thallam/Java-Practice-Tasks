import java.util.Arrays;

class Student 
{
    String student;
    int age;
    int[] scores;
}

public class GradeTracker {
    public static void main(String a[]) {
        Student s1 = new Student();
        s1.student = "Alice";
        s1.age = 16;
        s1.scores = new int[3];
        s1.scores[0] = 54;
        s1.scores[1] = 97;
        s1.scores[2] = 78;

        Student s2 = new Student();
        s2.student = "Bob";
        s2.age = 18;
        s2.scores = new int[3];
        s2.scores[0] = 92;
        s2.scores[1] = 35;
        s2.scores[2] = 100;

        Student s3 = new Student();
        s3.student = "Charlie";
        s3.age = 17;
        s3.scores = new int[3];
        s3.scores[0] = 98;
        s3.scores[1] = 95;
        s3.scores[2] = 100;
    
        Student[] students = {s1, s2, s3};
        for (Student stud : students)
        {
            System.out.println("Student: " + stud.student + ", Age: " + stud.age + ", Scores: " + Arrays.toString(stud.scores));
        }

        
    }
}
