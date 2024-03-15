package nestech.javacourse.example.baitap;


import nestech.javacourse.example.condition.Student;

public class StudentManagement {
    public static void main(String[] args) {
        Student[] stdArray = new Student[3];

        stdArray[0] = new Student(1,"Nguyen","Le",9);
        stdArray[1] = new Student(1,"Hieu","Nguyen",8);
        stdArray[2] = new Student(1,"Ly","Pham",10);

        for(Student score : stdArray){
            if(score.getScore() > 5){
                System.out.println(score.getFirstName());
            }
        }
    }
}
