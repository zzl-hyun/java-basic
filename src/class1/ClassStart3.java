package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // new 는 인스턴스 생성 후 참조값을 반환
        // student1은 이 참조값을 저장하는 Student형 변수
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

//        for(int i = 0; i < students.length; i++){
//            System.out.println(students[i].name + students[i].age + students[i].grade);
//        }
        for(Student s : students){
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
